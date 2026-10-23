/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class I_Il {
    public byte II00;
    private ByteArrayOutputStream II;
    private DataOutputStream II;
    private DataInputStream II = null;

    public I_Il() {
    }

    public I_Il(byte by) {
        this.II00 = by;
        this.II = new ByteArrayOutputStream(1024);
        this.II = new DataOutputStream(this.II);
    }

    public I_Il(byte by, byte[] byArray) {
        this.II00 = by;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        this.II = new DataInputStream(byteArrayInputStream);
    }

    public byte[] II() {
        return this.II.toByteArray();
    }

    public int II_I() throws IOException {
        return this.II.readInt();
    }

    public DataInputStream II() {
        return this.II;
    }

    public DataOutputStream II() {
        return this.II;
    }

    public void I0Oo() {
        try {
            if (this.II != null) {
                this.II.close();
            }
            if (this.II != null) {
                this.II.close();
            }
        }
        catch (IOException iOException) {
            I_Ol.IIIo(iOException.getMessage());
        }
    }
}

