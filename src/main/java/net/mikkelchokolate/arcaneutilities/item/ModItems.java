package net.mikkelchokolate.arcaneutilities.item;

import net.minecraft.item.Item;
import net.pitan76.mcpitanlib.api.item.v2.CompatItem;
import net.pitan76.mcpitanlib.api.item.v2.CompatibleItemSettings;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.util.item.ItemUtil;
import net.mikkelchokolate.arcaneutilities.block.ModBlocks;

import static net.mikkelchokolate.arcaneutilities.ArcaneUtilities._id;
import static net.mikkelchokolate.arcaneutilities.ArcaneUtilities.registry;
import static net.mikkelchokolate.arcaneutilities.item.ModItemGroups.ARCANE_UTILITIES;

public class ModItems {

    // ─── Compressed Cobblestone Items ─────────────────────────────────────────
    public static RegistryResult<Item> COMPRESSED_COBBLESTONE;
    public static RegistryResult<Item> DOUBLE_COMPRESSED_COBBLESTONE;
    public static RegistryResult<Item> TRIPLE_COMPRESSED_COBBLESTONE;

    // ─── Compressed Dirt Items ────────────────────────────────────────────────
    public static RegistryResult<Item> COMPRESSED_DIRT;
    public static RegistryResult<Item> DOUBLE_COMPRESSED_DIRT;
    public static RegistryResult<Item> TRIPLE_COMPRESSED_DIRT;

    // ─── Compressed Gravel Items ──────────────────────────────────────────────
    public static RegistryResult<Item> COMPRESSED_GRAVEL;
    public static RegistryResult<Item> DOUBLE_COMPRESSED_GRAVEL;
    public static RegistryResult<Item> TRIPLE_COMPRESSED_GRAVEL;

    // ─── Compressed Sand Items ────────────────────────────────────────────────
    public static RegistryResult<Item> COMPRESSED_SAND;
    public static RegistryResult<Item> DOUBLE_COMPRESSED_SAND;
    public static RegistryResult<Item> TRIPLE_COMPRESSED_SAND;

    // ─── Compressed Netherrack Items ──────────────────────────────────────────
    public static RegistryResult<Item> COMPRESSED_NETHERRACK;
    public static RegistryResult<Item> DOUBLE_COMPRESSED_NETHERRACK;
    public static RegistryResult<Item> TRIPLE_COMPRESSED_NETHERRACK;

    // ─── Special Items ────────────────────────────────────────────────────────
    public static RegistryResult<Item> ANGEL_BLOCK;
    public static RegistryResult<Item> SOLAR_PANEL;
    public static RegistryResult<Item> WIND_MILL;
    public static RegistryResult<Item> ANGEL_RING;

    public static void init() {
        COMPRESSED_COBBLESTONE        = registry.registerItem(_id("compressed_cobblestone"),
                () -> ItemUtil.create(ModBlocks.COMPRESSED_COBBLESTONE.getOrNull(),        CompatibleItemSettings.of(_id("compressed_cobblestone")).addGroup(ARCANE_UTILITIES)));
        DOUBLE_COMPRESSED_COBBLESTONE = registry.registerItem(_id("double_compressed_cobblestone"),
                () -> ItemUtil.create(ModBlocks.DOUBLE_COMPRESSED_COBBLESTONE.getOrNull(), CompatibleItemSettings.of(_id("double_compressed_cobblestone")).addGroup(ARCANE_UTILITIES)));
        TRIPLE_COMPRESSED_COBBLESTONE = registry.registerItem(_id("triple_compressed_cobblestone"),
                () -> ItemUtil.create(ModBlocks.TRIPLE_COMPRESSED_COBBLESTONE.getOrNull(), CompatibleItemSettings.of(_id("triple_compressed_cobblestone")).addGroup(ARCANE_UTILITIES)));

        COMPRESSED_DIRT        = registry.registerItem(_id("compressed_dirt"),
                () -> ItemUtil.create(ModBlocks.COMPRESSED_DIRT.getOrNull(),        CompatibleItemSettings.of(_id("compressed_dirt")).addGroup(ARCANE_UTILITIES)));
        DOUBLE_COMPRESSED_DIRT = registry.registerItem(_id("double_compressed_dirt"),
                () -> ItemUtil.create(ModBlocks.DOUBLE_COMPRESSED_DIRT.getOrNull(), CompatibleItemSettings.of(_id("double_compressed_dirt")).addGroup(ARCANE_UTILITIES)));
        TRIPLE_COMPRESSED_DIRT = registry.registerItem(_id("triple_compressed_dirt"),
                () -> ItemUtil.create(ModBlocks.TRIPLE_COMPRESSED_DIRT.getOrNull(), CompatibleItemSettings.of(_id("triple_compressed_dirt")).addGroup(ARCANE_UTILITIES)));

        COMPRESSED_GRAVEL        = registry.registerItem(_id("compressed_gravel"),
                () -> ItemUtil.create(ModBlocks.COMPRESSED_GRAVEL.getOrNull(),        CompatibleItemSettings.of(_id("compressed_gravel")).addGroup(ARCANE_UTILITIES)));
        DOUBLE_COMPRESSED_GRAVEL = registry.registerItem(_id("double_compressed_gravel"),
                () -> ItemUtil.create(ModBlocks.DOUBLE_COMPRESSED_GRAVEL.getOrNull(), CompatibleItemSettings.of(_id("double_compressed_gravel")).addGroup(ARCANE_UTILITIES)));
        TRIPLE_COMPRESSED_GRAVEL = registry.registerItem(_id("triple_compressed_gravel"),
                () -> ItemUtil.create(ModBlocks.TRIPLE_COMPRESSED_GRAVEL.getOrNull(), CompatibleItemSettings.of(_id("triple_compressed_gravel")).addGroup(ARCANE_UTILITIES)));

        COMPRESSED_SAND        = registry.registerItem(_id("compressed_sand"),
                () -> ItemUtil.create(ModBlocks.COMPRESSED_SAND.getOrNull(),        CompatibleItemSettings.of(_id("compressed_sand")).addGroup(ARCANE_UTILITIES)));
        DOUBLE_COMPRESSED_SAND = registry.registerItem(_id("double_compressed_sand"),
                () -> ItemUtil.create(ModBlocks.DOUBLE_COMPRESSED_SAND.getOrNull(), CompatibleItemSettings.of(_id("double_compressed_sand")).addGroup(ARCANE_UTILITIES)));
        TRIPLE_COMPRESSED_SAND = registry.registerItem(_id("triple_compressed_sand"),
                () -> ItemUtil.create(ModBlocks.TRIPLE_COMPRESSED_SAND.getOrNull(), CompatibleItemSettings.of(_id("triple_compressed_sand")).addGroup(ARCANE_UTILITIES)));

        COMPRESSED_NETHERRACK        = registry.registerItem(_id("compressed_netherrack"),
                () -> ItemUtil.create(ModBlocks.COMPRESSED_NETHERRACK.getOrNull(),        CompatibleItemSettings.of(_id("compressed_netherrack")).addGroup(ARCANE_UTILITIES)));
        DOUBLE_COMPRESSED_NETHERRACK = registry.registerItem(_id("double_compressed_netherrack"),
                () -> ItemUtil.create(ModBlocks.DOUBLE_COMPRESSED_NETHERRACK.getOrNull(), CompatibleItemSettings.of(_id("double_compressed_netherrack")).addGroup(ARCANE_UTILITIES)));
        TRIPLE_COMPRESSED_NETHERRACK = registry.registerItem(_id("triple_compressed_netherrack"),
                () -> ItemUtil.create(ModBlocks.TRIPLE_COMPRESSED_NETHERRACK.getOrNull(), CompatibleItemSettings.of(_id("triple_compressed_netherrack")).addGroup(ARCANE_UTILITIES)));

        ANGEL_BLOCK  = registry.registerItem(_id("angel_block"),
                () -> ItemUtil.create(ModBlocks.ANGEL_BLOCK.getOrNull(),  CompatibleItemSettings.of(_id("angel_block")).addGroup(ARCANE_UTILITIES)));
        SOLAR_PANEL  = registry.registerItem(_id("solar_panel"),
                () -> ItemUtil.create(ModBlocks.SOLAR_PANEL.getOrNull(),  CompatibleItemSettings.of(_id("solar_panel")).addGroup(ARCANE_UTILITIES)));
        WIND_MILL    = registry.registerItem(_id("wind_mill"),
                () -> ItemUtil.create(ModBlocks.WIND_MILL.getOrNull(),    CompatibleItemSettings.of(_id("wind_mill")).addGroup(ARCANE_UTILITIES)));

        ANGEL_RING   = registry.registerItem(_id("angel_ring"),
                () -> new AngelRingItem(CompatibleItemSettings.of(_id("angel_ring")).addGroup(ARCANE_UTILITIES).maxCount(1)));
    }
}
