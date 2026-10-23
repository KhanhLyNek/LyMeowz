package main;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class I_Il {
    public byte II00;
    private ByteArrayOutputStream var_java_io_ByteArrayOutputStream_II = null;
    private DataOutputStream var_java_io_DataOutputStream_II = null;
    private DataInputStream var_java_io_DataInputStream_II = null;

    public I_Il() {
    }

    public I_Il(byte by) {
        this.II00 = by;
        this.var_java_io_ByteArrayOutputStream_II = new ByteArrayOutputStream(1024);
        this.var_java_io_DataOutputStream_II = new DataOutputStream(this.var_java_io_ByteArrayOutputStream_II);
    }

    public I_Il(byte by, byte[] byArray) {
        this.II00 = by;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        this.var_java_io_DataInputStream_II = new DataInputStream(byteArrayInputStream);
    }

    public byte[] byte_arr_II() {
        return this.var_java_io_ByteArrayOutputStream_II.toByteArray();
    }

    public int II_I() throws IOException {
        return this.var_java_io_DataInputStream_II.readInt();
    }

    public DataInputStream java_io_DataInputStream_II() {
        return this.var_java_io_DataInputStream_II;
    }

    public DataOutputStream java_io_DataOutputStream_II() {
        return this.var_java_io_DataOutputStream_II;
    }

    public void I0Oo() {
        try {
            if (this.var_java_io_DataInputStream_II != null) {
                this.var_java_io_DataInputStream_II.close();
            }
            if (this.var_java_io_DataOutputStream_II != null) {
                this.var_java_io_DataOutputStream_II.close();
            }
        }
        catch (IOException iOException) {
            I_Ol.IIIo(iOException.getMessage());
        }
    }
}

