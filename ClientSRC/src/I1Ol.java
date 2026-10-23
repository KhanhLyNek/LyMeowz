/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class I1Ol {
    private byte II1O;
    public String IIoo;
    public static I_lO IIO_ = new I_lO("");
    private static I_lO II_I = new I_lO("");

    public I1Ol(String string, byte by) {
        this.IIoo = string;
        this.II1O = by;
    }

    public static void IIl1() {
        I_lO i_lO = new I_lO("");
        byte[] byArray = I_O1.II(I1Ol.Ill1("\u4cb3\u4d74\u4d59\u4d30\u4d13\u4dc6\u4ddb\u4da6\u4d80\u4e72\u4e55", 19706));
        if (byArray == null) {
            I_0_.II().III(i_lO);
        } else {
            II_I = new I_lO("");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            try {
                int n = dataInputStream.readShort();
                String[] stringArray = new String[n];
                byte[] byArray2 = new byte[n];
                for (int i = 0; i < n; ++i) {
                    stringArray[i] = dataInputStream.readUTF();
                    byArray2[i] = dataInputStream.readByte();
                    II_I.addElement(new I1Ol(stringArray[i], byArray2[i]));
                }
                dataInputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            I_Ol.II__(I1Ol.Ill1("\u4c8c\u4d4a\u4d18\u4d24\u4d1f\u4def\u4dd1\u4dee\u4dd2", 19706) + IIO_.size() + I1Ol.Ill1("\u4cda\u4d6f\u4d6a\u4d1a\u4d25\u4db5\u4dc7\u4dba\u4d88\u4e74\u4e0d\u4e6f", 19706) + II_I.size());
            I_0_.II().III(i_lO);
        }
    }

    public static void IOlI() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(IIO_.size());
            for (int i = 0; i < IIO_.size(); ++i) {
                dataOutputStream.writeUTF(((I1Ol)I1Ol.IIO_.elementAt((int)i)).IIoo);
                dataOutputStream.writeByte(((I1Ol)I1Ol.IIO_.elementAt((int)i)).II1O);
            }
            I_O1.II(I1Ol.Ill1("\u4cb3\u4d74\u4d59\u4d30\u4d13\u4dc6\u4ddb\u4da6\u4d80\u4e72\u4e55", 19706), byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static /* synthetic */ String Ill1(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

