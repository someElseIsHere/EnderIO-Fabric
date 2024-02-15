package net.pseudoforge.server;

import net.minecraft.server.MinecraftServer;

public class ServerLifecycleHooks {
    public static MinecraftServer SERVER;

    public static MinecraftServer getCurrentServer() {
        return SERVER;
    }
}
