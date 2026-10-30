#ifdef GL_ES
precision lowp float;
#endif

varying vec4 v_fragmentColor;
varying vec2 v_texCoord;
uniform sampler2D u_texture;
void main()
{
	vec4 color=texture2D(u_texture,v_texCoord);
	if(color.a > 0.0)
	gl_FragColor=vec4(color.r * 2.0,color.r * 2.0, 0.0, color.a * 2.0);
}
