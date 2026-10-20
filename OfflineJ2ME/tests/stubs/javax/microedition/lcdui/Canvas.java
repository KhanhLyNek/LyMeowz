package javax.microedition.lcdui;
public abstract class Canvas extends Displayable {
 public static final int KEY_NUM0=48,KEY_STAR=42,KEY_POUND=35,KEY_NUM2=50,KEY_NUM4=52,KEY_NUM5=53,KEY_NUM6=54,KEY_NUM8=56;
 public static final int UP=1,DOWN=6,LEFT=2,RIGHT=5,FIRE=8;
 protected abstract void paint(Graphics g);protected void keyPressed(int k){}
 public int getGameAction(int k){return 0;}public void setFullScreenMode(boolean b){}
 public int getWidth(){return 240;}public int getHeight(){return 320;}public void repaint(){}
}
