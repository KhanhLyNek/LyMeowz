/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class IO0o {
    public final int _I_1;
    private final ByteArrayOutputStream III = new ByteArrayOutputStream();
    public final DataOutputStream IIII = new DataOutputStream(this.III);

    public IO0o(int n) {
        this._I_1 = n;
    }

    public IO0o II(int n) {
        try {
            this.IIII.writeByte(n);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this;
    }

    public IO0o III(int n) {
        try {
            this.IIII.writeShort(n);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this;
    }

    public IO0o IIII(int n) {
        try {
            this.IIII.writeInt(n);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this;
    }

    public IO0o II(long l) {
        try {
            this.IIII.writeLong(l);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this;
    }

    public IO0o II(boolean bl) {
        try {
            this.IIII.writeBoolean(bl);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this;
    }

    public IO0o II(String string) {
        try {
            this.IIII.writeUTF(string);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this;
    }

    public IO0o II(byte[] byArray) {
        try {
            this.IIII.write(byArray);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this;
    }

    public byte[] III() {
        return this.III.toByteArray();
    }
}

