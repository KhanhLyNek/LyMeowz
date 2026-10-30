attribute vec2 Position;
attribute vec2 a_texCoord;
attribute vec4 a_color;

//"out" varying to our fragment shader
#ifdef GL_ES
varying lowp vec4 vColor;
varying mediump vec2 vTexCoord;

#else
varying vec4 vColor;
varying vec2 vTexCoord;
#endif

void main()
{
    gl_Position = CC_MVPMatrix * vec4(Position, 0.0, 1.0);
	
	vTexCoord = a_texCoord;
	vColor = a_color;
}