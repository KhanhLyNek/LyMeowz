package dev.lymeowz.client;

/**
 * Minimal extension point for controlled LyMeowz client development.
 *
 * This class is deliberately dependency-free: it does not access account
 * information, files, network sockets, secrets, or internal NRO classes.
 */
public final class BuildHook {
    private BuildHook() {
    }

    public static void announce() {
        System.out.println("[ClientDev] Bytecode overlay loaded");
    }
}
