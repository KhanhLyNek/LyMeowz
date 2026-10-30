#ifdef GL_ES
precision lowp float;
#endif

varying vec2 v_texCoord;
uniform sampler2D u_texture;
varying vec4 v_fragmentColor;
uniform float CC_alpha_value;

void main()
{
	vec4 color=texture2D(u_texture,v_texCoord);
	float sum = (color.g + color.r + color.b)*0.333;
	gl_FragColor=vec4(sum * 0.8,0.8*color.g, sum * 1.5,color.a*1.2);
}