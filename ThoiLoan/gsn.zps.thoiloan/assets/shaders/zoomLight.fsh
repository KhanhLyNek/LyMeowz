#ifdef GL_ES
precision lowp float;
#endif

uniform sampler2D u_texture;

varying vec4 v_color;
varying vec2 v_texCoord;
//varying vec4 v_position;
varying float time;

const vec2 amp = vec2(0.02, 0.03);

vec3 rgb2hsv(vec3 c){
    vec4 K = vec4(0., -1./3., 2./3., -1.);
    vec4 p = mix(vec4(c.bg, K.wz), vec4(c.gb, K.xy), step(c.b, c.g));
    vec4 q = mix(vec4(p.xyw, c.r), vec4(c.r, p.yzx), step(p.x, c.r));

    float d = q.x - min(q.w, q.y);
    float e = 1.0e-10;
    return vec3(abs(q.z + (q.w - q.y) / (6. * d + e)), d / (q.x + e), q.x);
}

vec3 hsv2rgb(vec3 c){
    vec3 rgb = clamp( abs(mod(c.x * 6. + vec3(0.,4.,2.),6.)-3.)-1., 0.,1.);
    return c.z*mix(vec3(1.),rgb,c.y);
}

vec3 highLight(vec3 c, float b){
    vec3 hsv = rgb2hsv(c);
//    hsv.x -= 0.0234375 * b;
    hsv.z += 0.078125 * b;
	hsv.y += 0.078125 * b;
//    hsv.xyz = vec3(0.,0.,1. * b);
    return hsv2rgb(hsv);
}

void main(void)
{
    vec2 posi = vec2(v_texCoord);
    float rate = cos(time * 40) * 0.025 + 1.025;
    posi *= rate;
    posi -= (rate-1.)/2.;
    //posi -= vec2(cos(time * 10. + posi.y *4.) * amp.x, sin(time * 10. + posi.x *8.) * amp.y);
    if(posi.x > 1. || posi.y >1. || posi.x <0. || posi.y< 0.){
        //gl_FragColor = vec4(1.);
        return;
    }
    vec4 color =  texture2D(u_texture, posi);
    if(color.a > 0.9){
        vec2 pos= posi;
        rate = (1.06 - rate) * 12.5;
        pos -= 0.5;
        pos *= 2;
        float alpha = pos.x * pos.x + pos.y * pos.y;
        alpha = 1-alpha;
        //alpha = 1/ alpha;
        if(alpha <0.136) alpha = 0.136;
        if(alpha >0.932) alpha = 0.932;
        alpha = pow(alpha, 1.5);
        alpha *= rate;
        //if(alpha <0.05) alpha = 0.05;
        //if(alpha >1.) alpha = 1.;
        color.rgb = highLight(color.rgb, alpha*2);
    }
    gl_FragColor = color;

}
