#ifdef GL_ES
precision lowp float;
#endif

uniform sampler2D u_texture;
uniform float CC_alpha_value;
uniform vec2 resolution;
uniform sampler2D u_texture1;
uniform sampler2D u_mask;

// "in" varying from our vertex shader
varying vec4 vColor;
varying vec2 vTexCoord;

const float RADIUS = 0.7;
const float SOFTNESS = 0.3;

const vec3 SEPIA = vec3(1.2, 1.0, 0.8);

void main()
{
	vec4 texColor = texture2D(u_texture, vTexCoord);
	
	vec4 texColor1 = texture2D(u_texture1, vTexCoord);
	
	float mask = texture2D(u_mask, vTexCoord);
	
	gl_FragColor = vColor * mix(texColor, texColor1, mask);
}