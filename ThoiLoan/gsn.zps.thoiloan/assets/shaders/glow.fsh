#ifdef GL_ES
precision lowp float;
#endif

varying vec4 v_fragmentColor;
varying vec2 v_texCoord;

uniform float u_ctime;
uniform float u_gtime;
uniform float u_radius;
uniform vec4 u_color;
uniform sampler2D u_texture;

void main()
{
    float radius = 4.0;
    
    vec4 accum = vec4(0.0);
    vec4 normal = vec4(0.0);
    
    //normal = texture2D(CC_Texture0, vec2(v_texCoord.x, v_texCoord.y));
    normal = texture2D(u_texture, v_texCoord);
    
	for(float i = 1.0; i <= radius; i += 1.0)
    {
		accum += texture2D(u_texture, vec2(v_texCoord.x - 0.001 * i, v_texCoord.y - 0.001 * i));
		accum += texture2D(u_texture, vec2(v_texCoord.x + 0.001 * i, v_texCoord.y - 0.001 * i));
        accum += texture2D(u_texture, vec2(v_texCoord.x + 0.001 * i, v_texCoord.y + 0.001 * i));
        accum += texture2D(u_texture, vec2(v_texCoord.x - 0.001* i, v_texCoord.y + 0.001 * i));
    }
    accum.a = accum.a/6.0;
    accum.rgb =  accum.rgb * accum.a;
    //float opacity = ((1.0 - normal.a) / radius) * (sin(CC_Time[1])/5.0 / u_gtime);
	if(accum.r + accum.g + accum. b < 0.1)
		discard;	
    normal = (accum) + (normal * normal.a);
    gl_FragColor = v_fragmentColor * normal;
}
