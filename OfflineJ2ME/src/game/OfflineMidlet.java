package game;
import javax.microedition.lcdui.*;import javax.microedition.midlet.MIDlet;
public final class OfflineMidlet extends MIDlet implements CommandListener {
 private LocalGameService game;private GameScreen screen;private Form npcForm;private ChoiceGroup choices;private NpcMenu activeMenu;
 private final Command choose=new Command("Chọn",Command.OK,1),back=new Command("Quay lại",Command.BACK,2);
 protected void startApp(){
  if(game==null){game=new LocalGameService();game.load();screen=new GameScreen(this,game);}
  Display.getDisplay(this).setCurrent(screen);
 }
 protected void pauseApp(){if(game!=null)game.save();}
 protected void destroyApp(boolean unconditional){if(game!=null)game.save();}
 public void openNpcMenu(){
  activeMenu=game.talkToNpc();if(activeMenu==null){screen.repaint();return;}
  npcForm=new Form("NPC "+activeMenu.npcId);npcForm.append(activeMenu.speech);
  choices=new ChoiceGroup("Lựa chọn",ChoiceGroup.EXCLUSIVE);
  for(int i=0;i<activeMenu.options.length;i++)choices.append(activeMenu.options[i],null);
  npcForm.append(choices);npcForm.addCommand(choose);npcForm.addCommand(back);npcForm.setCommandListener(this);
  Display.getDisplay(this).setCurrent(npcForm);
 }
 public void commandAction(Command c,Displayable current){
  if(c==choose&&activeMenu!=null)game.chooseNpcOption(activeMenu,choices.getSelectedIndex());
  Display.getDisplay(this).setCurrent(screen);screen.repaint();
 }
 public void exitGame(){destroyApp(true);notifyDestroyed();}
}
