package game;
import java.io.*; import java.util.Vector;
public final class LocalNpcService {
 private LocalNpcService(){}
 public static NpcMenu findForMap(int mapId){
  InputStream in=new LocalNpcService().getClass().getResourceAsStream("/data/npc/menunpc.txt");
  if(in==null)return null;
  InputStreamReader reader=null;
  try {
   reader=new InputStreamReader(in,"UTF-8"); StringBuffer line=new StringBuffer();int c;
   while((c=reader.read())!=-1){
    if(c=='\n'){NpcMenu m=parse(line.toString());if(m!=null&&m.mapId==mapId)return m;line.setLength(0);}
    else if(c!='\r')line.append((char)c);
   }
   NpcMenu last=parse(line.toString());return last!=null&&last.mapId==mapId?last:null;
  }catch(IOException e){return null;}
  finally{try{if(reader!=null)reader.close();else in.close();}catch(IOException ignored){}}
 }
 public static NpcMenu parse(String line) {
  if(line==null||line.length()==0)return null;
  Vector v=new Vector();int from=0;
  while(true){int pos=line.indexOf('|',from);if(pos<0){v.addElement(line.substring(from));break;}v.addElement(line.substring(from,pos));from=pos+1;}
  if(v.size()<4)return null;
  try{
   int mapId=Integer.parseInt((String)v.elementAt(0)),npcId=Integer.parseInt((String)v.elementAt(1));
   String[] options=new String[v.size()-3];for(int i=3;i<v.size();i++)options[i-3]=restore((String)v.elementAt(i));
   return new NpcMenu(mapId,npcId,restore((String)v.elementAt(2)),options);
  }catch(NumberFormatException ex){return null;}
 }
 private static String restore(String s){StringBuffer r=new StringBuffer();int i=0;while(i<s.length()){if(i+1<s.length()&&s.charAt(i)=='<'&&s.charAt(i+1)=='>'){r.append(' ');i+=2;}else r.append(s.charAt(i++));}return r.toString();}
}
