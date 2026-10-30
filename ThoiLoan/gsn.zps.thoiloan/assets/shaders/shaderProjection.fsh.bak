#ifdef GL_ES
precision lowp float;
#endif

varying vec2 v_texCoord;
uniform sampler2D u_texture;

void main()
{
	vec4 color=texture2D(u_texture,v_texCoord);

	float gray= 0.8*color.r+0.1*color.g+0.1*color.b;
	gl_FragColor=vec4(gray,gray,gray,color.a);
}