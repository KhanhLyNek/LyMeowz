import game.*;
public final class OfflineLogicTest {
 private static void check(boolean v,String d){if(!v)throw new RuntimeException("FAIL "+d);}
 public static void main(String[] a){
  NpcMenu r=LocalNpcService.findForMap(24);
  check(r!=null&&r.npcId==10,"NPC map 24");
  check(r.options.length==3,"3 options");
  LocalGameService g=new LocalGameService();
  check(g.getPlayer().mapId==24,"initial map");
  g.chooseNpcOption(r,0);check(g.getPlayer().mapId==25,"Namek");
  NpcMenu n=g.talkToNpc();check(n!=null&&n.npcId==11,"NPC 25");
  g.chooseNpcOption(n,1);check(g.getPlayer().mapId==26,"Xayda");
  NpcMenu v=g.talkToNpc();g.chooseNpcOption(v,0);check(g.getPlayer().mapId==24,"Earth");
  check(g.save(),"RMS saved");
  LocalGameService reopened=new LocalGameService();reopened.load();check(reopened.getPlayer().mapId==24,"RMS loaded");
  g.chooseNpcOption(r,2);check(g.getPlayer().mapId==24&&g.getStatus().indexOf("not implemented")>=0,"safe unsupported");
  System.out.println("PASS: NPC map travel, save/load and safe placeholder");
 }
}
