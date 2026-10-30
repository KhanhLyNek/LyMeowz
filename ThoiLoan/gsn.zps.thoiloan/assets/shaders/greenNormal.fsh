#ifdef GL_ES
precision lowp float;
#endif

varying vec2 v_texCoord;
uniform sampler2D u_texture;
varying vec4 v_fragmentColor;
uniform float CC_alpha_value;

vec3 rgb2hsv(vec3 c){
    vec4 K = vec4(0.0, -1.0/3.0, 2.0/3.0, -1.0);
    vec4 p = mix(vec4(c.bg, K.wz), vec4(c.gb, K.xy), step(c.b, c.g));
    vec4 q = mix(vec4(p.xyw, c.r), vec4(c.r, p.yzx), step(p.x, c.r));

    float d = q.x - min(q.w, q.y);
    float e = 1.0e-10;
    return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);
}

vec3 hsv2rgb(vec3 c){
	vec4 K = vec4(1.0 , 2.0/30., 1.0/3.0, 3.0);
    vec3 rgb = abs(fract(c.xxx + K.xzy) *vec3(6.0) - K.www);
    return c.zzz * mix(K.xxx, clamp(rgb - K.xxx, 0.0, 1.0),c.y);
}

vec3 changeToGreen(vec3 c, float b){
    vec3 hsvColor = rgb2hsv(c);
    hsvColor.x = 240.0/360.0;
    return hsv2rgb(hsvColor);
}

void main()
{
	vec4 color=texture2D(u_texture,v_texCoord);
	vec3 rgbColor = color.rgb;
	vec3 greenColor = changeToGreen(rgbColor, 1.);
	gl_FragColor=vec4(greenColor, color.a);
}

