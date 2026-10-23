package dev.lymeowz.build;

import main.GameMidlet;

/** Runs only a benign synthetic GameMidlet, NEVER the original game. */
public final class FixtureRunner {
    private FixtureRunner() {}

    public static void main(String[] args) throws Exception {
        java.io.PrintStream original = System.out;
        java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
        try {
            System.setOut(new java.io.PrintStream(output, true, "UTF-8"));
            new GameMidlet().startApp();
        } finally {
            System.setOut(original);
        }
        String msg = output.toString("UTF-8").replace("\r\n", "\n").trim();
        String expected = "[ClientDev] Bytecode overlay loaded\n[Fixture] startApp";
        if (!expected.equals(msg)) {
            throw new AssertionError("Unexpected fixture execution sequence: " + msg);
        }
        System.out.println("PASS: injected startup hook executes exactly once before original fixture method");
    }
}
