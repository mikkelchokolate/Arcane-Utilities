package net.mikkelchokolate.arcaneutilities.blockentity;

import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;
import net.pitan76.mcpitanlib.api.tile.BlockEntityTypeBuilder;
import net.mikkelchokolate.arcaneutilities.block.ModBlocks;

import static net.mikkelchokolate.arcaneutilities.ArcaneUtilities._id;
import static net.mikkelchokolate.arcaneutilities.ArcaneUtilities.registry;

public class ModBlockEntities {
    public static RegistryResult<BlockEntityType<?>> SOLAR_PANEL;
    public static RegistryResult<BlockEntityType<?>> WIND_MILL;

    public static void init() {
        SOLAR_PANEL = registry.registerBlockEntityType(_id("solar_panel"),
                () -> create(SolarPanelBlockEntity::new, ModBlocks.SOLAR_PANEL.getOrNull()));
        WIND_MILL   = registry.registerBlockEntityType(_id("wind_mill"),
                () -> create(WindMillBlockEntity::new,   ModBlocks.WIND_MILL.getOrNull()));
    }

    private static <T extends BlockEntity> BlockEntityType<T> create(BlockEntityTypeBuilder.Factory<T> supplier, Block... blocks) {
        return BlockEntityTypeBuilder.create(supplier, blocks).build();
    }
}
