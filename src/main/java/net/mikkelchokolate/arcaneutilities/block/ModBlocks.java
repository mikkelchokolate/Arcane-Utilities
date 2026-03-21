package net.mikkelchokolate.arcaneutilities.block;

import net.minecraft.block.Block;
import net.pitan76.mcpitanlib.api.block.CompatibleMaterial;
import net.pitan76.mcpitanlib.api.block.v2.CompatBlock;
import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;

import static net.mikkelchokolate.arcaneutilities.ArcaneUtilities._id;
import static net.mikkelchokolate.arcaneutilities.ArcaneUtilities.registry;

public class ModBlocks {

    // ─── Compressed Cobblestone ───────────────────────────────────────────────
    public static RegistryResult<Block> COMPRESSED_COBBLESTONE;
    public static RegistryResult<Block> DOUBLE_COMPRESSED_COBBLESTONE;
    public static RegistryResult<Block> TRIPLE_COMPRESSED_COBBLESTONE;

    // ─── Compressed Dirt ─────────────────────────────────────────────────────
    public static RegistryResult<Block> COMPRESSED_DIRT;
    public static RegistryResult<Block> DOUBLE_COMPRESSED_DIRT;
    public static RegistryResult<Block> TRIPLE_COMPRESSED_DIRT;

    // ─── Compressed Gravel ───────────────────────────────────────────────────
    public static RegistryResult<Block> COMPRESSED_GRAVEL;
    public static RegistryResult<Block> DOUBLE_COMPRESSED_GRAVEL;
    public static RegistryResult<Block> TRIPLE_COMPRESSED_GRAVEL;

    // ─── Compressed Sand ─────────────────────────────────────────────────────
    public static RegistryResult<Block> COMPRESSED_SAND;
    public static RegistryResult<Block> DOUBLE_COMPRESSED_SAND;
    public static RegistryResult<Block> TRIPLE_COMPRESSED_SAND;

    // ─── Compressed Netherrack ───────────────────────────────────────────────
    public static RegistryResult<Block> COMPRESSED_NETHERRACK;
    public static RegistryResult<Block> DOUBLE_COMPRESSED_NETHERRACK;
    public static RegistryResult<Block> TRIPLE_COMPRESSED_NETHERRACK;

    // ─── Special ─────────────────────────────────────────────────────────────
    public static RegistryResult<Block> ANGEL_BLOCK;
    public static RegistryResult<Block> SOLAR_PANEL;
    public static RegistryResult<Block> WIND_MILL;

    public static void init() {
        // Compressed Cobblestone
        COMPRESSED_COBBLESTONE        = registry.registerBlock(_id("compressed_cobblestone"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("compressed_cobblestone"), CompatibleMaterial.STONE).strength(2.0f, 5.0f)));
        DOUBLE_COMPRESSED_COBBLESTONE = registry.registerBlock(_id("double_compressed_cobblestone"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("double_compressed_cobblestone"), CompatibleMaterial.STONE).strength(3.0f, 10.0f)));
        TRIPLE_COMPRESSED_COBBLESTONE = registry.registerBlock(_id("triple_compressed_cobblestone"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("triple_compressed_cobblestone"), CompatibleMaterial.STONE).strength(5.0f, 20.0f)));

        // Compressed Dirt
        COMPRESSED_DIRT        = registry.registerBlock(_id("compressed_dirt"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("compressed_dirt"), CompatibleMaterial.EARTH).strength(1.0f, 2.0f)));
        DOUBLE_COMPRESSED_DIRT = registry.registerBlock(_id("double_compressed_dirt"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("double_compressed_dirt"), CompatibleMaterial.EARTH).strength(1.5f, 4.0f)));
        TRIPLE_COMPRESSED_DIRT = registry.registerBlock(_id("triple_compressed_dirt"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("triple_compressed_dirt"), CompatibleMaterial.EARTH).strength(2.0f, 6.0f)));

        // Compressed Gravel
        COMPRESSED_GRAVEL        = registry.registerBlock(_id("compressed_gravel"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("compressed_gravel"), CompatibleMaterial.AGGREGATE).strength(1.5f, 4.0f)));
        DOUBLE_COMPRESSED_GRAVEL = registry.registerBlock(_id("double_compressed_gravel"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("double_compressed_gravel"), CompatibleMaterial.AGGREGATE).strength(2.0f, 6.0f)));
        TRIPLE_COMPRESSED_GRAVEL = registry.registerBlock(_id("triple_compressed_gravel"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("triple_compressed_gravel"), CompatibleMaterial.AGGREGATE).strength(3.0f, 8.0f)));

        // Compressed Sand
        COMPRESSED_SAND        = registry.registerBlock(_id("compressed_sand"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("compressed_sand"), CompatibleMaterial.AGGREGATE).strength(1.0f, 2.0f)));
        DOUBLE_COMPRESSED_SAND = registry.registerBlock(_id("double_compressed_sand"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("double_compressed_sand"), CompatibleMaterial.AGGREGATE).strength(1.5f, 4.0f)));
        TRIPLE_COMPRESSED_SAND = registry.registerBlock(_id("triple_compressed_sand"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("triple_compressed_sand"), CompatibleMaterial.AGGREGATE).strength(2.0f, 6.0f)));

        // Compressed Netherrack
        COMPRESSED_NETHERRACK        = registry.registerBlock(_id("compressed_netherrack"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("compressed_netherrack"), CompatibleMaterial.STONE).strength(1.5f, 4.0f)));
        DOUBLE_COMPRESSED_NETHERRACK = registry.registerBlock(_id("double_compressed_netherrack"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("double_compressed_netherrack"), CompatibleMaterial.STONE).strength(2.5f, 8.0f)));
        TRIPLE_COMPRESSED_NETHERRACK = registry.registerBlock(_id("triple_compressed_netherrack"),
                () -> new CompatBlock(CompatibleBlockSettings.of(_id("triple_compressed_netherrack"), CompatibleMaterial.STONE).strength(4.0f, 15.0f)));

        // Angel Block
        ANGEL_BLOCK = registry.registerBlock(_id("angel_block"),
                () -> new AngelBlock(CompatibleBlockSettings.of(_id("angel_block"), CompatibleMaterial.GLASS).strength(0.3f)));

        // Machines
        SOLAR_PANEL = registry.registerBlock(_id("solar_panel"),
                () -> new SolarPanelBlock(CompatibleBlockSettings.of(_id("solar_panel"), CompatibleMaterial.METAL).strength(3.5f)));
        WIND_MILL   = registry.registerBlock(_id("wind_mill"),
                () -> new WindMillBlock(CompatibleBlockSettings.of(_id("wind_mill"), CompatibleMaterial.METAL).strength(3.5f)));
    }
}
