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

	float gray= 1.2*color.r+1.02*color.g+1.02*color.b;

	gl_FragColor=vec4(color.r,color.g,color.b,color.a);
	if ( color.a <0.9 )
		gl_FragColor=vec4(0.2,1.0,0.2,color.a);
}