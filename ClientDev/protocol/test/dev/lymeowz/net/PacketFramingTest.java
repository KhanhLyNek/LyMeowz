package dev.lymeowz.net;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/** Framework-free packet framing regression tests. */
public final class PacketFramingTest {
    private PacketFramingTest() {}

    private static void check(boolean value, String message) {
        if (!value) {
            throw new AssertionError(message);
        }
    }

    public static void main(String[] ignored) throws Exception {
        byte[] msg = new byte[] {1, 2, (byte) 255};
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PacketFraming.writeClientPacket(out, new PacketFraming.Packet(4, msg));
        check(Arrays.equals(out.toByteArray(), new byte[] {4, 0, 3, 1, 2, (byte) 255}),
              "short client header");
        PacketFraming.Packet regular = PacketFraming.readClientPacket(
              new ByteArrayInputStream(out.toByteArray()), 20);
        check(regular.command == 4 && Arrays.equals(regular.payload, msg),
              "short client round trip");

        out.reset();
        PacketFraming.writeClientPacket(out, new PacketFraming.Packet(-74, msg));
        check(Arrays.equals(out.toByteArray(),
              new byte[] {(byte) -74, (byte) 131, (byte) 128, (byte) 128, 1, 2, (byte) 255}),
              "extended client header");
        PacketFraming.Packet extended = PacketFraming.readClientPacket(
              new ByteArrayInputStream(out.toByteArray()), 20);
        check(extended.command == -74 && Arrays.equals(extended.payload, msg),
              "extended client round trip");

        byte[] longData = new byte[70000];
        Arrays.fill(longData, (byte) 9);
        out.reset();
        PacketFraming.writeClientPacket(out, new PacketFraming.Packet(-67, longData));
        check(PacketFraming.readClientPacket(
              new ByteArrayInputStream(out.toByteArray()), 70000).payload.length == 70000,
              "extended >65535");

        PacketFraming.Packet server = PacketFraming.readServerPacket(
              new ByteArrayInputStream(new byte[] {(byte) -27, 0, 3, 1, 2, 3}), 10);
        check(server.command == -27 && server.payload.length == 3, "server header");

        boolean rejected = false;
        try {
            PacketFraming.readServerPacket(
                new ByteArrayInputStream(new byte[] {4, 0, 3, 1, 2, 3}), 2);
        } catch (IOException expected) {
            rejected = true;
        }
        check(rejected, "length limit");

        rejected = false;
        try {
            PacketFraming.readServerPacket(
                new ByteArrayInputStream(new byte[] {4, 0, 3, 1}), 10);
        } catch (IOException expected) {
            rejected = true;
        }
        check(rejected, "truncated payload");

        System.out.println("PacketFramingTest PASS");
    }
}
