package net.mikkelchokolate.arcaneutilities.block;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import net.pitan76.mcpitanlib.api.block.v2.CompatBlock;
import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.core.serialization.CompatMapCodec;
import net.pitan76.mcpitanlib.core.serialization.codecs.CompatBlockMapCodecUtil;

public class AngelBlock extends CompatBlock {

    protected CompatMapCodec<? extends AngelBlock> CODEC = CompatBlockMapCodecUtil.createCodec(AngelBlock::new);

    public AngelBlock(CompatibleBlockSettings settings) {
        super(settings);
    }

    @Override
    public CompatMapCodec<? extends AngelBlock> getCompatCodec() {
        return CODEC;
    }

    // Allow placement in mid-air - the defining feature of the Angel Block
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return true;
    }
}
