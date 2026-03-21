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
import net.mikkelchokolate.arcaneutilities.blockentity.WindMillBlockEntity;
import org.jetbrains.annotations.Nullable;

public class WindMillBlock extends CompatBlock implements ExtendBlockEntityProvider {

    protected CompatMapCodec<? extends WindMillBlock> CODEC = CompatBlockMapCodecUtil.createCodec(WindMillBlock::new);

    public WindMillBlock(CompatibleBlockSettings settings) {
        super(settings);
    }

    @Override
    public CompatMapCodec<? extends WindMillBlock> getCompatCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(TileCreateEvent event) {
        return new WindMillBlockEntity(event);
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityType<T> getBlockEntityType() {
        return (BlockEntityType<T>) ModBlockEntities.WIND_MILL.getOrNull();
    }

    @Override
    public boolean isTick() {
        return true;
    }
}
