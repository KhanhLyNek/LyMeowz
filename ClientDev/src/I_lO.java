package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public class I_lO
extends Vector {
    private String IIoo;

    public I_lO(String string) {
        this.IIoo = string;
    }

    public I_lO() {
    }

    @Override
    public synchronized void removeAllElements() {
        super.removeAllElements();
    }

    @Override
    public synchronized boolean removeElement(Object object) {
        return super.removeElement(object);
    }

    @Override
    public synchronized void removeElementAt(int n) {
        super.removeElementAt(n);
    }

    public synchronized void addElement(Object object) {
        if (this.size() > 1000) {
            System.out.println(I_lO.Il_0("\u8eef\u8ece\u8ead\u8e8c\u8f73\u8f52\u8f31\u8f10\u8ff7\u8fd6\u8fb5\u8f94\u907b\u905a\u9039\u9018\u90ff\u90de\u90bd\u909c\u9083\u9162\u9141\u9120\u9107\u91e6\u91c5\u91a4\u918b\u926a\u9249\u9228\u920f\u92ee\u92cd\u92ac\u9293\u9372\u9351\u9330\u9317\u93f6\u93d5\u93b4", 36499) + this.IIoo + I_lO.Il_0("\u8eb3\u8edc\u8ea4\u8e9d\u8f32\u8f0e", 36499) + this.size());
        }
        super.addElement(object);
    }

    public synchronized void insertElementAt(Object object, int n) {
        if (this.size() > 1000) {
            System.out.println(I_lO.Il_0("\u8eef\u8ece\u8ead\u8e8c\u8f73\u8f52\u8f31\u8f10\u8ff7\u8fd6\u8fb5\u8f94\u907b\u905a\u9039\u9018\u90ff\u90de\u90bd\u909c\u9083\u9162\u9141\u9120\u9107\u91e6\u91c5\u91a4\u918b\u926a\u9249\u9228\u920f\u92ee\u92cd\u92ac\u9293\u9372\u9351\u9330\u9317\u93f6\u93d5\u93b4", 36499) + this.IIoo + I_lO.Il_0("\u8eb3\u8edc\u8ea4\u8e9d\u8f32\u8f0e", 36499) + this.size());
        }
        super.insertElementAt(object, n);
    }

    private static /* synthetic */ String Il_0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

