package net.mikkelchokolate.arcaneutilities;

import net.fabricmc.api.ModInitializer;

public class FabricMain implements ModInitializer {
    @Override
    public void onInitialize() {
        new ArcaneUtilities();
    }
}
