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

	gl_FragColor=vec4(0.954*color.r,1.11*color.g,0.974*color.b,color.a);
}