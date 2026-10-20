package javax.microedition.rms;
public class RecordEnumeration {
 private final boolean has;private boolean used;
 RecordEnumeration(boolean h){has=h;}
 public boolean hasNextElement(){return has&&!used;}
 public int nextRecordId(){used=true;return 1;}
 public void destroy(){}
}
