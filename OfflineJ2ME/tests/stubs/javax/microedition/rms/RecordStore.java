package javax.microedition.rms;
public class RecordStore {
 private static byte[] saved;
 public static RecordStore openRecordStore(String s,boolean create){if(!create&&saved==null)throw new RuntimeException("Not found");return new RecordStore();}
 public RecordEnumeration enumerateRecords(Object f,Object c,boolean u){return new RecordEnumeration(saved!=null);}
 public int addRecord(byte[] b,int o,int n){saved=new byte[n];System.arraycopy(b,o,saved,0,n);return 1;}
 public void setRecord(int id,byte[] b,int o,int n){addRecord(b,o,n);}
 public byte[] getRecord(int id){return saved;}
 public void closeRecordStore(){}
}
