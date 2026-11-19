// ---------------------------------------------------------------------------
// LyMeowz night sky
//
// Twinkling coloured stars, phase-lit textured moon, galaxy and aurora.
// Adapted from Photon (https://github.com/sixthsurge/photon) by SixthSurge,
// used under the Photon Shaders License (see LICENSE-Photon.txt).
// The star field itself is based on https://www.shadertoy.com/view/Md2SR3
//
// All helpers are prefixed with ns_ so they never clash with the rest of the pack.
// Everything is in "Photon units" and is multiplied by NS_UNIT by the caller.
// ---------------------------------------------------------------------------

float ns_cube(float x) { return x * x * x; }
float ns_sqr(float x) { return x * x; }
float ns_linstep(float a, float b, float x) { return clamp((x - a) / (b - a), 0.0, 1.0); }
float ns_cubic_smooth(float x) { return x * x * (3.0 - 2.0 * x); }

vec4 ns_hash4(vec2 p) {
	vec4 p4 = fract(vec4(p.xyxy) * vec4(.1031, .1030, .0973, .1099));
	p4 += dot(p4, p4.wzxy + 33.33);
	return fract((p4.xxyz + p4.yzzw) * p4.zywx);
}

////////////////////////////////// STARS //////////////////////////////////

vec3 ns_star_cell(vec2 coord, float threshold) {
	vec4 n = ns_hash4(coord);

	float star = ns_linstep(threshold, 1.0, n.x);
	star *= star; star *= star; star *= star; star *= star; // ^16
	star *= NS_STARS_INTENSITY;

	vec3 color = blackbody(mix(4500.0, 8500.0, n.y));

	// twinkle
	star *= 1.0 - n.z * cos(frameTimeCounter * 2.0 + 6.2831853 * n.w);

	return star * color;
}

vec3 ns_star_field(vec2 coord, float threshold) {
	coord = abs(coord) + 33.3 * step(0.0, coord);
	vec2 i = floor(coord);
	vec2 f = coord - i;
	f = vec2(ns_cubic_smooth(f.x), ns_cubic_smooth(f.y));

	return ns_star_cell(i, threshold) * (1.0 - f.x) * (1.0 - f.y)
	     + ns_star_cell(i + vec2(1.0, 0.0), threshold) * f.x * (1.0 - f.y)
	     + ns_star_cell(i + vec2(0.0, 1.0), threshold) * f.y * (1.0 - f.x)
	     + ns_star_cell(i + vec2(1.0, 1.0), threshold) * f.x * f.y;
}

// dir: direction in the (rotating) celestial frame, nightAmount: 0 = day, 1 = night
vec3 ns_stars(vec3 dir, float galaxyLuminance, float nightAmount) {
	float threshold = 1.0 - 0.05 * NS_STARS_COVERAGE * nightAmount - 0.5 * ns_cube(galaxyLuminance);

	vec2 coord = dir.xy / (abs(dir.z) + length(dir.xy)) + 41.21 * sign(dir.z);
	coord *= 600.0;

	return ns_star_field(coord, threshold);
}

////////////////////////////////// GALAXY /////////////////////////////////

#if defined NS_GALAXY && RESOURCEPACK_SKY == 0
vec3 ns_galaxy(vec3 dir, sampler2D galaxyTex, float nightAmount, out float luminance) {
	float lon = atan(dir.x, dir.z);
	float lat = acos(clamp(-dir.y, -1.0, 1.0));

	vec3 g = texture2D(galaxyTex, vec2(lon / 6.2831853 + 0.5, lat / 3.1415927)).rgb;
	g = pow(g, vec3(2.2)); // sRGB -> linear

	g *= (0.05 + nightAmount) * vec3(0.75, 0.66, 1.0) * NS_GALAXY_INTENSITY;

	luminance = dot(g, vec3(0.2126, 0.7152, 0.0722));
	g = mix(vec3(luminance), g, 2.0); // saturate
	return max(g, vec3(0.0));
}
#endif

////////////////////////////////// MOON ///////////////////////////////////

// returns rgb + coverage in alpha. moonDir = direction to the moon (player space)
vec4 ns_moon(vec3 rayDir, vec3 moonDir, int phase) {
	float radius = radians(NS_MOON_SIZE);

	float MoV = dot(rayDir, moonDir);
	if (MoV < cos(radius)) return vec4(0.0);

	const vec3 litColor  = vec3(0.75, 0.80, 1.0);
	const vec3 glowColor = vec3(0.70, 0.83, 1.0);

	float dist = clamp(acos(clamp(MoV, -1.0, 1.0)) / radius, 0.0, 1.0);

	// tangent frame with z = moonDir
	vec3 tangent = abs(moonDir.y) > 0.999 ? vec3(1.0, 0.0, 0.0) : normalize(cross(vec3(0.0, 1.0, 0.0), moonDir));
	vec3 bitangent = normalize(cross(tangent, moonDir));

	vec3 d = rayDir - moonDir;
	vec2 offset = fract(vec2(dot(d, tangent), dot(d, bitangent)) + 0.5);

	// surface detail from the pack's noise texture
	vec3 n = texture2D(noisetex, 2.0 * offset).bgr;
	float surface = pow(n.x, 1.5) * 0.75 + 0.6 * ns_cube(n.y) - 0.1 * n.z;

	// sphere normal
	vec2 disc = vec2(dot(d, tangent), dot(d, bitangent)) / sin(radius);
	float z = sqrt(max(1.0 - dot(disc, disc), 0.0));
	vec3 normal = normalize(tangent * disc.x + bitangent * disc.y - moonDir * z); // faces the viewer

	// light direction orbits the moon with the phase
	float lightAngle = 0.125 * 6.2831853 * float(phase);
	vec3 leftDir = normalize(cross(vec3(0.0, 1.0, 0.0), rayDir));
	vec3 lightDir = cos(lightAngle) * -rayDir + sin(lightAngle) * leftDir;
	float lit = max(dot(normal, lightDir), 0.0);
	lit = 1.0 - ns_sqr(1.0 - lit); // dampen

	float edgeGlow = ns_sqr(ns_sqr(ns_sqr(dist)));

	vec3 color = max(lit * litColor * (1.0 + 4.0 * edgeGlow), 0.5 * glowColor * (0.1 + 0.1 * edgeGlow))
	           * (0.2 + 0.8 * surface);
	color = 10.0 * color * color;

	return vec4(color * NS_MOON_BRIGHTNESS, 1.0);
}

////////////////////////////////// AURORA /////////////////////////////////

#if NS_AURORA > 0
// two colours (bottom / top) picked once per Minecraft day
void ns_aurora_colors(int idx, out vec3 lo, out vec3 hi) {
	if (idx < 2)       { lo = vec3(0.00, 1.00, 0.25); hi = vec3(0.50, 0.70, 1.00); } // green -> blue
	else if (idx == 2) { lo = vec3(1.00, 0.00, 0.00); hi = vec3(1.00, 0.50, 0.70); } // red -> pink
	else if (idx == 3) { lo = vec3(1.00, 0.25, 1.00); hi = vec3(0.25, 0.25, 1.00); } // magenta -> deep blue
	else if (idx < 6)  { lo = vec3(1.00, 0.50, 1.00); hi = vec3(0.50, 0.70, 1.00); } // purple -> blue
	else if (idx == 6) { lo = vec3(1.00, 0.10, 0.00); hi = vec3(1.00, 1.00, 0.25); } // red -> yellow
	else if (idx == 7) { lo = vec3(1.00, 1.00, 1.00); hi = vec3(1.00, 0.00, 0.00); } // white -> red
	else if (idx == 8) { lo = vec3(1.00, 1.00, 0.00); hi = vec3(0.10, 0.50, 1.00); } // yellow -> blue
	else if (idx == 9) { lo = vec3(1.00, 0.25, 1.00); hi = vec3(0.00, 1.00, 0.25); } // magenta -> green
	else if (idx == 10){ lo = vec3(1.20, 0.84, 1.20); hi = vec3(0.90, 0.30, 0.90); } // pink -> purple
	else if (idx == 11){ lo = vec3(0.00, 1.00, 0.25); hi = vec3(0.90, 0.30, 0.90); } // green -> purple
	else               { lo = vec3(2.00, 0.80, 0.00); hi = vec3(1.00, 0.50, 0.00); } // orange
}

float ns_day_hash(float day) {
	return fract(sin(day * 12.9898 + 4.1414) * 43758.5453);
}

// 0 = no aurora tonight, 1 = full aurora
float ns_aurora_amount(float day, float nightAmount) {
	#if NS_AURORA == 1
		float tonight = float(ns_day_hash(day) < 0.2); // roughly 1 night in 5
	#else
		float tonight = 1.0;
	#endif
	return smoothstep(0.0, 1.0, nightAmount) * tonight;
}

vec3 ns_aurora(vec3 rayDir, float dither, float day, float amount) {
	const int steps = 32;
	const float volBottom = 1000.0;
	const float volTop = 3000.0;
	const float volRadius = 20000.0;

	if (amount < 0.01 || rayDir.y < 0.02) return vec3(0.0);

	float rcpY = 1.0 / rayDir.y;
	float tStart = volBottom * rcpY;
	float tEnd = min(volRadius / length(rayDir.xz), volTop * rcpY);
	if (tStart > tEnd) return vec3(0.0);

	float stepLength = (tEnd - tStart) / float(steps);
	vec3 rayPos = rayDir * (tStart + stepLength * dither);
	vec3 rayStep = rayDir * stepLength;

	vec3 colLo, colHi;
	ns_aurora_colors(int(ns_day_hash(day + 17.0) * 13.0), colLo, colHi);

	const vec2 wind0 = 0.005 * vec2(0.7, 0.1);
	const vec2 wind1 = 0.008 * vec2(-0.1, -0.7);
	float freq = 0.00003 * NS_AURORA_FREQUENCY;

	vec3 emission = vec3(0.0);

	for (int i = 0; i < steps; i++) {
		float alt = ns_linstep(volBottom, volTop, rayPos.y);

		float heightFade = ns_cube(1.0 - alt) * ns_linstep(0.0, 0.025, alt);
		float w0 = texture2D(noisetex, rayPos.xz * freq + wind0 * frameTimeCounter).g;
		float w1 = texture2D(noisetex, rayPos.xz * freq + wind1 * frameTimeCounter).g;
		float shape = ns_linstep(1.0, 2.0, w0 + w1) * heightFade;

		float t = clamp(alt, 0.0, 1.0);
		vec3 color = mix(colLo, colHi, 1.0 - ns_sqr(1.0 - t));

		float d = length(rayPos.xz);
		float distFade = (1.0 - ns_cube(d / volRadius)) * (1.0 - exp2(-0.001 * d));

		emission += color * (shape * distFade * stepLength);
		rayPos += rayStep;
	}

	return (0.001 * NS_AURORA_BRIGHTNESS) * emission * amount;
}
#endif
