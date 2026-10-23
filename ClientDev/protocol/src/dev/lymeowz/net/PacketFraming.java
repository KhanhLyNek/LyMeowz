package dev.lymeowz.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Packet boundaries observed in ClientSRC/src/IOo_.java.
 *
 * This does NOT implement login, cryptography, handshake, or server transport.
 * No network connection is opened by this class.
 */
public final class PacketFraming {
    private PacketFraming() {}

    public static final class Packet {
        public final int command;
        public final byte[] payload;

        public Packet(int command, byte[] payload) {
            if (command < -128 || command > 127) {
                throw new IllegalArgumentException("command must fit in signed byte");
            }
            if (payload == null) {
                throw new NullPointerException("payload");
            }
            this.command = command;
            this.payload = payload.clone();
        }
    }

    /** Outbound: signed command, 2-byte BE length or special shifted 3-byte length. */
    public static void writeClientPacket(OutputStream stream, Packet packet) throws IOException {
        if (stream == null || packet == null) {
            throw new NullPointerException();
        }
        DataOutputStream output = new DataOutputStream(stream);
        final int size = packet.payload.length;
        final boolean extended = hasExtendedLength(packet.command);
        if (size > (extended ? 0xFFFFFF : 0xFFFF)) {
            throw new IOException("packet length exceeds format limit");
        }
        output.writeByte(packet.command);
        if (extended) {
            output.writeByte((size & 0xFF) - 128);
            output.writeByte(((size >>> 8) & 0xFF) - 128);
            output.writeByte(((size >>> 16) & 0xFF) - 128);
        } else {
            output.writeShort(size);
        }
        output.write(packet.payload);
        output.flush();
    }

    /** Inbound server packet: signed command + two-byte big-endian payload length. */
    public static Packet readServerPacket(InputStream stream, int maxPayloadBytes) throws IOException {
        if (stream == null) {
            throw new NullPointerException("stream");
        }
        if (maxPayloadBytes < 0 || maxPayloadBytes > 0xFFFF) {
            throw new IllegalArgumentException("bad maxPayloadBytes");
        }
        DataInputStream input = new DataInputStream(stream);
        int command = input.readByte();
        int size = input.readUnsignedShort();
        if (size > maxPayloadBytes) {
            throw new IOException("server packet exceeds configured size limit");
        }
        byte[] payload = new byte[size];
        input.readFully(payload);
        return new Packet(command, payload);
    }

    /** Diagnostic helper for parsing client-origin packets in an authorized test server. */
    public static Packet readClientPacket(InputStream stream, int maxPayloadBytes) throws IOException {
        if (stream == null) {
            throw new NullPointerException("stream");
        }
        if (maxPayloadBytes < 0 || maxPayloadBytes > 0xFFFFFF) {
            throw new IllegalArgumentException("bad maxPayloadBytes");
        }
        DataInputStream input = new DataInputStream(stream);
        int command = input.readByte();
        int size;
        if (hasExtendedLength(command)) {
            size = (input.readUnsignedByte() + 128) & 0xFF;
            size |= ((input.readUnsignedByte() + 128) & 0xFF) << 8;
            size |= ((input.readUnsignedByte() + 128) & 0xFF) << 16;
        } else {
            size = input.readUnsignedShort();
        }
        if (size > maxPayloadBytes) {
            throw new IOException("client packet exceeds configured size limit");
        }
        byte[] payload = new byte[size];
        input.readFully(payload);
        return new Packet(command, payload);
    }

    public static boolean hasExtendedLength(int command) {
        switch (command) {
            case -32:
            case -66:
            case -74:
            case 11:
            case -67:
            case -87:
            case 66:
            case 12:
                return true;
            default:
                return false;
        }
    }
}
