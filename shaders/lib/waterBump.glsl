float waterCaustics(vec3 worldPos, vec3 sunVec) {

	vec3 projectedPos = worldPos - (sunVec/sunVec.y*worldPos.y);
	vec2 pos = projectedPos.xz;

	float heightSum = 0.0;
	float movement = frameTimeCounter*0.035 * WATER_WAVE_SPEED;
	// movement = 0.0;

	float radiance = 2.39996;
	mat2 rotationMatrix  = mat2(vec2(cos(radiance),  -sin(radiance)),  vec2(sin(radiance),  cos(radiance)));
	
	vec2 wave_size[3] = vec2[](
		vec2(48.,12.),
		vec2(12.,48.),
		vec2(32.,32.)
	);

	float WavesLarge = max(texture2D(noisetex, pos / 600.0 ).b,0.1);

	for (int i = 0; i < 3; i++){
		pos = rotationMatrix * pos;
		heightSum += pow(abs(abs(texture2D(noisetex, pos / wave_size[i] + WavesLarge*0.5 + movement).b * 2.0 - 1.0) * 2.0 - 1.0), 2.0) ;
	}

	float FinalCaustics = exp((1.0 + 5.0 * pow(WavesLarge,0.5)) * (heightSum / 3.0 - 0.5));

	return FinalCaustics;
}

// ---------------------------------------------------------------------------
// Wave field: layered, wind-driven ripples with sharp ridged crests, in the
// style of SEUS (Sonic Ether's Unbelievable Shaders) water.
// Used by BOTH the normal water pass and the Distant Horizons water pass, so
// the two always match. Keep the signatures of getWaterHeightmap/getWaveNormal
// unchanged: they are called from all_translucent.fsh and DH_translucent.fsh.
// Only noisetex + frameTimeCounter are used (both already declared everywhere
// this file is included).
// ---------------------------------------------------------------------------

// SEUS-style crest profile: 1 at the crest line, rounded instead of a hard V
float waterCrest(float n) {
	float x = abs(n * 2.0 - 1.0);
	if (x < 0.2) {
		float t = x / 0.2;
		x = 0.1 * t * t + 0.1; // rounds the tip: x(0)=0.1, x(0.2)=0.2, continuous
	}
	return 1.0 - x;
}

// one wave layer: rotate into the layer's wind frame, stretch along the wind, drift with time
float waterLayer(vec2 p, vec2 rotCS, vec2 period, float speed, float time) {
	vec2 q = vec2(rotCS.x * p.x + rotCS.y * p.y, -rotCS.y * p.x + rotCS.x * p.y);
	q.x -= speed * time;
	return texture2D(noisetex, q / period).b;
}

float getWaterHeightmap(vec2 posxz) {

	float time = frameTimeCounter * WATER_WAVE_SPEED;
	const float SCALE = 5.0;

	// broad swell + mid ripples, each layer drifting in its own direction
	float h = 0.0;
	h += 1.0 * waterLayer(posxz, vec2(0.939373,  0.342898), vec2(96.0, 40.0) * SCALE,  0.12, time);
	h += 3.0 * waterLayer(posxz, vec2(0.877583, -0.479426), vec2(48.0, 20.0) * SCALE,  0.20, time);
	h += 3.5 * waterLayer(posxz, vec2(0.621610,  0.783327), vec2(25.6, 11.0) * SCALE, -0.28, time);

	// sharp crests
	h += 4.5 * waterCrest(waterLayer(posxz, vec2(0.988771,  0.149438), vec2(22.4, 9.0) * SCALE,  0.35, time));
	h += 3.0 * waterCrest(waterLayer(posxz, vec2(0.621610, -0.783327), vec2(14.4, 6.0) * SCALE, -0.42, time));

	h /= 15.0;

	// slow large-scale gusts: calm patches and choppy patches
	float gust = 0.6 + 0.8 * texture2D(noisetex, posxz / 400.0).b;

	// centred around the old average height so the parallax offset stays the same
	return 0.012 + (h - 0.5) * gust * 0.09;
}

vec3 getWaveNormal(vec3 posxz, bool isLOD){

	// vary the normal's "smooth" factor as distance changes, to avoid noise from too much details.
	// float range = pow(clamp(1.0 - length(posxz - cameraPosition)/(32*4),0.0,1.0),2.0);
	// float deltaPos = mix(0.5, 0.1, range);
	
	float range = min(length(posxz - cameraPosition) / (16*14.0), 3.0);
	float deltaPos = range + 0.15;

	// float normalMult = 1.0 * WATER_WAVE_STRENGTH;

	// if(isLOD){
	// 	deltaPos = mix(0.9, deltaPos, range);
	// }
	// added detail for snells window
	// if(isEyeInWater == 1) deltaPos = 0.025;

	#ifdef HYPER_DETAILED_WAVES
		deltaPos = 0.025;
	#endif
	
	vec2 coord = posxz.xz;

	float h0 = getWaterHeightmap(coord);
	float h1 = getWaterHeightmap(coord + vec2(deltaPos,0.0));
	float h3 = getWaterHeightmap(coord + vec2(0.0,deltaPos));


	// fade the fine ripples with distance so far water (including Distant Horizons LODs) stays calm instead of shimmering
	float distFade = 1.0 / (1.0 + 0.28 * range);

	float xDelta = (h1-h0)/deltaPos * distFade;
	float yDelta = (h3-h0)/deltaPos * distFade;

	vec3 wave = normalize(vec3(xDelta, yDelta,	1.0-pow(abs(xDelta+yDelta),2.0)));

	return wave;
}