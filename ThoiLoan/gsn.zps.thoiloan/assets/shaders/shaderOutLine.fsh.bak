#ifdef GL_ES
precision lowp float;
#endif

varying vec2 v_texCoord;
uniform sampler2D s_texture;

void main()
{
	gl_FragColor=vec4(0.0);

	vec4 baseColor=texture2D(s_texture,v_texCoord);
	gl_FragColor+=baseColor-texture2D(s_texture,top);
	gl_FragColor+=baseColor-texture2D(s_texture,topRight);
	gl_FragColor+=baseColor-texture2D(s_texture,right);
	gl_FragColor+=baseColor-texture2D(s_texture,bottomRight);
	gl_FragColor+=baseColor-texture2D(s_texture,bottom);
	gl_FragColor+=baseColor-texture2D(s_texture,bottomLeft);
	gl_FragColor+=baseColor-texture2D(s_texture,left);
	gl_FragColor+=baseColor-texture2D(s_texture,topLeft);	
}