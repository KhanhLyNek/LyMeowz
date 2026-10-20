package game;
import java.io.*; import javax.microedition.rms.*;
public final class GameSave {
 private static final String STORE="LYMEOWZ_SAVE";private static final int MAGIC=0x4c594d32;
 private GameSave(){}
 public static boolean save(LocalPlayer p){
  RecordStore store=null;
  try{
   ByteArrayOutputStream bytes=new ByteArrayOutputStream(); DataOutputStream out=new DataOutputStream(bytes);
   out.writeInt(MAGIC);out.writeInt(1);out.writeUTF(p.name);out.writeInt(p.mapId);
   out.writeInt(p.x);out.writeInt(p.y);out.writeInt(p.hp);out.writeInt(p.maxHp);
   out.writeInt(p.ki);out.writeInt(p.goldBar);out.writeInt(p.kills);out.flush();
   byte[] data=bytes.toByteArray();out.close();store=RecordStore.openRecordStore(STORE,true);
   RecordEnumeration list=store.enumerateRecords(null,null,false);
   if(list.hasNextElement())store.setRecord(list.nextRecordId(),data,0,data.length);
   else store.addRecord(data,0,data.length);
   list.destroy();return true;
  }catch(Exception ex){return false;}
  finally{if(store!=null)try{store.closeRecordStore();}catch(Exception ignored){}}
 }
 public static boolean load(LocalPlayer p){
  RecordStore store=null;
  try{
   store=RecordStore.openRecordStore(STORE,false);RecordEnumeration list=store.enumerateRecords(null,null,false);
   if(!list.hasNextElement()){list.destroy();return false;}
   byte[] bytes=store.getRecord(list.nextRecordId());list.destroy();
   DataInputStream in=new DataInputStream(new ByteArrayInputStream(bytes));int first=in.readInt();
   if(first!=MAGIC&&bytes.length==12){p.x=first;p.y=in.readInt();p.kills=in.readInt();return true;}
   if(first!=MAGIC||in.readInt()!=1)return false;
   p.name=in.readUTF();p.mapId=in.readInt();p.x=in.readInt();p.y=in.readInt();
   p.hp=in.readInt();p.maxHp=in.readInt();p.ki=in.readInt();p.goldBar=in.readInt();p.kills=in.readInt();return true;
  }catch(Exception ex){return false;}
  finally{if(store!=null)try{store.closeRecordStore();}catch(Exception ignored){}}
 }
}
