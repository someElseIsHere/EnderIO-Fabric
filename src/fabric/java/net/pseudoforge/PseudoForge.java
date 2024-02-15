package net.pseudoforge;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.pseudoforge.server.ServerLifecycleHooks;

public class PseudoForge implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            ServerLifecycleHooks.SERVER = server;
        });
    }
}
