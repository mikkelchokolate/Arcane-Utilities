package net.mikkelchokolate.arcaneutilities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.pitan76.mcpitanlib.api.block.ExtendBlockEntityProvider;
import net.pitan76.mcpitanlib.api.block.v2.CompatBlock;
import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.event.block.TileCreateEvent;
import net.pitan76.mcpitanlib.core.serialization.CompatMapCodec;
import net.pitan76.mcpitanlib.core.serialization.codecs.CompatBlockMapCodecUtil;
import net.mikkelchokolate.arcaneutilities.blockentity.ModBlockEntities;
import net.mikkelchokolate.arcaneutilities.blockentity.SolarPanelBlockEntity;
import org.jetbrains.annotations.Nullable;

public class SolarPanelBlock extends CompatBlock implements ExtendBlockEntityProvider {

    protected CompatMapCodec<? extends SolarPanelBlock> CODEC = CompatBlockMapCodecUtil.createCodec(SolarPanelBlock::new);

    public SolarPanelBlock(CompatibleBlockSettings settings) {
        super(settings);
    }

    @Override
    public CompatMapCodec<? extends SolarPanelBlock> getCompatCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(TileCreateEvent event) {
        return new SolarPanelBlockEntity(event);
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityType<T> getBlockEntityType() {
        return (BlockEntityType<T>) ModBlockEntities.SOLAR_PANEL.getOrNull();
    }

    @Override
    public boolean isTick() {
        return true;
    }
}
