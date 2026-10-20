package game;
import java.io.*;
public final class LocalMap {
 public static final int WIDTH=12,HEIGHT=10;
 private final char[][] tiles=new char[HEIGHT][WIDTH];
 public LocalMap(){for(int y=0;y<HEIGHT;y++)for(int x=0;x<WIDTH;x++)tiles[y][x]='.';loadFromJar("/data/maps/1.txt");}
 private void loadFromJar(String path){
  InputStream in=getClass().getResourceAsStream(path);if(in==null)return;int x=0,y=0;
  try {int c;while((c=in.read())!=-1&&y<HEIGHT){if(c=='\r')continue;if(c=='\n'){x=0;y++;continue;}if(x<WIDTH)tiles[y][x++]=(char)c;}}
  catch(IOException ignored){}finally{try{in.close();}catch(IOException ignored){}}
 }
 public boolean isWall(int x,int y){return x<0||y<0||x>=WIDTH||y>=HEIGHT||tiles[y][x]=='#';}
}
