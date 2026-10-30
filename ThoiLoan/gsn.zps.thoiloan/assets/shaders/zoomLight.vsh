attribute vec4 a_position;
attribute vec4 a_color;
attribute vec2 a_texCoord;

uniform sampler2D u_texture;

varying vec4 v_color;
varying vec2 v_texCoord;
//varying vec4 v_position;
varying float time;

void main(void){
    gl_Position = CC_MVPMatrix * a_position;
    v_color = a_color;
    v_texCoord = a_texCoord;
    //v_position = a_position;
    time = CC_Time;
}