package game;
public final class LocalGameService {
 private final LocalPlayer player=new LocalPlayer();private final LocalMap map=new LocalMap();
 private int monsterX=8,monsterY=6,monsterHp=3;
 private String status="Offline ready";
 public void load(){if(GameSave.load(player)){if(map.isWall(player.x,player.y)){player.x=1;player.y=1;}status="Loaded RMS save";}}
 public LocalPlayer getPlayer(){return player;}
 public LocalMap getMap(){return map;}
 public String getStatus(){return status;}
 public int getMonsterX(){return monsterX;}
 public int getMonsterY(){return monsterY;}
 public int getMonsterHp(){return monsterHp;}
 public void move(int dx,int dy){int x=player.x+dx,y=player.y+dy;if(!map.isWall(x,y)){player.x=x;player.y=y;status="Moved locally";}else status="Blocked";}
 // New sample mechanics, NOT recovered from Server.jar.
 public void attack(){
  int dx=player.x-monsterX,dy=player.y-monsterY;
  if(dx*dx+dy*dy>2){status="Move closer to mob";return;}
  monsterHp--;if(monsterHp<=0){monsterHp=3;player.kills++;player.goldBar++;status="Mob defeated +1 gold";}
  else status="Attack! Mob HP "+monsterHp;
 }
 public boolean changeMap(int mapId){
  if(mapId!=24&&mapId!=25&&mapId!=26){status="Map not implemented";return false;}
  player.mapId=mapId;player.x=1;player.y=1;status="Map "+mapId+" local";return true;
 }
 public NpcMenu talkToNpc(){return LocalNpcService.findForMap(player.mapId);}
 public void chooseNpcOption(NpcMenu menu,int option){
  if(menu==null||option<0||option>=menu.options.length)return;
  String choice=menu.options[option];
  if(menu.npcId==10||menu.npcId==11||menu.npcId==12){
   if(choice.indexOf("Namếc")>=0){changeMap(25);return;}
   if(choice.indexOf("Xayda")>=0){changeMap(26);return;}
   if(choice.indexOf("Trái Đất")>=0){changeMap(24);return;}
  }
  status="Menu not implemented";
 }
 public boolean save(){boolean ok=GameSave.save(player);status=ok?"Saved to RMS":"RMS save failed";return ok;}
}
