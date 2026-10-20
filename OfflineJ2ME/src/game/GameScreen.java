package game;
import javax.microedition.lcdui.*;
public final class GameScreen extends Canvas {
 private final OfflineMidlet midlet;private final LocalGameService game;
 public GameScreen(OfflineMidlet m,LocalGameService g){midlet=m;game=g;setFullScreenMode(true);}
 protected void keyPressed(int code){
  if(code==KEY_NUM0){midlet.exitGame();return;}
  if(code==KEY_STAR){game.save();repaint();return;}
  if(code==KEY_POUND){midlet.openNpcMenu();return;}
  int action=0;try{action=getGameAction(code);}catch(IllegalArgumentException ignored){}
  if(code==KEY_NUM2||action==UP)game.move(0,-1);
  else if(code==KEY_NUM8||action==DOWN)game.move(0,1);
  else if(code==KEY_NUM4||action==LEFT)game.move(-1,0);
  else if(code==KEY_NUM6||action==RIGHT)game.move(1,0);
  else if(code==KEY_NUM5||action==FIRE)game.attack();
  repaint();
 }
 protected void paint(Graphics g){
  int w=getWidth(),h=getHeight();LocalPlayer p=game.getPlayer();
  g.setColor(12,21,30);g.fillRect(0,0,w,h);g.setColor(255,255,255);
  g.drawString("LyMeowz Offline  Map "+p.mapId,4,1,Graphics.TOP|Graphics.LEFT);
  g.drawString("HP "+p.hp+" Gold "+p.goldBar+" KOs "+p.kills,4,19,Graphics.TOP|Graphics.LEFT);
  int cell=(w-8)/LocalMap.WIDTH,bh=(h-96)/LocalMap.HEIGHT;
  if(bh<cell)cell=bh;if(cell<4)cell=4;
  LocalMap map=game.getMap();
  for(int y=0;y<LocalMap.HEIGHT;y++)for(int x=0;x<LocalMap.WIDTH;x++){
   if(map.isWall(x,y))g.setColor(84,93,114);else g.setColor(50,78,56);
   g.fillRect(4+x*cell,40+y*cell,cell-1,cell-1);
  }
  g.setColor(221,62,62);g.fillRect(4+game.getMonsterX()*cell+1,40+game.getMonsterY()*cell+1,cell-2,cell-2);
  g.setColor(255,222,60);g.fillRect(4+p.x*cell+1,40+p.y*cell+1,cell-2,cell-2);
  g.setColor(255,255,255);
  g.drawString(game.getStatus(),3,h-48,Graphics.TOP|Graphics.LEFT);
  g.drawString("2/4/6/8 move  5 attack  # NPC",3,h-32,Graphics.TOP|Graphics.LEFT);
  g.drawString("* save   0 exit",3,h-16,Graphics.TOP|Graphics.LEFT);
 }
}
