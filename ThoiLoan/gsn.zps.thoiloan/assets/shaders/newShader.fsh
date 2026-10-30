#ifdef GL_ES
precision lowp float;
#endif

varying vec2 v_texCoord;
uniform sampler2D u_texture;
uniform sampler2D u_texture1;
varying vec4 v_fragmentColor;
uniform float CC_alpha_value;

void main()
{	
	vec4 color=vec4(texture2D(u_texture,v_texCoord).rgb, texture2D(u_texture1,v_texCoord).a);
	//if ( color.a <= CC_alpha_value)
	//	discard;
	color.rgb *= color.a;
	gl_FragColor = color * v_fragmentColor;
}
