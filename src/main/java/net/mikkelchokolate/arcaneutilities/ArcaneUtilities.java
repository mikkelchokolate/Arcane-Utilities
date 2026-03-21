package net.mikkelchokolate.arcaneutilities;

import net.mikkelchokolate.arcaneutilities.block.ModBlocks;
import net.mikkelchokolate.arcaneutilities.blockentity.ModBlockEntities;
import net.mikkelchokolate.arcaneutilities.item.ModItemGroups;
import net.mikkelchokolate.arcaneutilities.item.ModItems;
import net.mikkelchokolate.arcaneutilities.power.GridPowerNetwork;
import net.pitan76.mcpitanlib.api.CommonModInitializer;
import net.pitan76.mcpitanlib.api.registry.v2.CompatRegistryV2;
import net.pitan76.mcpitanlib.api.util.CompatIdentifier;

public class ArcaneUtilities extends CommonModInitializer {

    public static final String MOD_ID = "arcaneutilities";

    public static ArcaneUtilities INSTANCE;
    public static CompatRegistryV2 registry;

    @Override
    public void init() {
        INSTANCE = this;
        registry = super.registry;

        ModItemGroups.init();
        ModBlocks.init();
        ModItems.init();
        ModBlockEntities.init();

        GridPowerNetwork.register();
    }

    @Override
    public String getId() {
        return MOD_ID;
    }

    @Override
    public String getName() {
        return "Arcane Utilities";
    }

    public static CompatIdentifier _id(String path) {
        return INSTANCE.compatId(path);
    }
}
