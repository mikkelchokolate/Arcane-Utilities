package net.mikkelchokolate.arcaneutilities.blockentity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.world.World;
import net.pitan76.mcpitanlib.api.event.block.TileCreateEvent;
import net.pitan76.mcpitanlib.api.event.tile.TileTickEvent;
import net.pitan76.mcpitanlib.api.tile.CompatBlockEntity;
import net.pitan76.mcpitanlib.api.tile.ExtendBlockEntityTicker;
import net.pitan76.mcpitanlib.api.util.WorldUtil;
import net.mikkelchokolate.arcaneutilities.power.GridPowerNetwork;

public class WindMillBlockEntity extends CompatBlockEntity implements ExtendBlockEntityTicker<WindMillBlockEntity> {

    // Produces GP proportional to height above y=64; at y=96+ gives max 8 GP/tick
    public static final int MAX_PRODUCTION = 8;
    public static final int HEIGHT_THRESHOLD = 96;

    public WindMillBlockEntity(BlockEntityType<?> type, TileCreateEvent e) {
        super(type, e);
    }

    public WindMillBlockEntity(TileCreateEvent e) {
        this(ModBlockEntities.WIND_MILL.getOrNull(), e);
    }

    @Override
    public void tick(TileTickEvent<WindMillBlockEntity> e) {
        World world = e.world;
        if (WorldUtil.isClient(world)) return;

        int y = pos.getY();
        if (y >= HEIGHT_THRESHOLD) {
            GridPowerNetwork.produce(world, MAX_PRODUCTION);
        } else if (y > 64) {
            int production = Math.max(1, (y - 64) * MAX_PRODUCTION / (HEIGHT_THRESHOLD - 64));
            GridPowerNetwork.produce(world, production);
        }
    }
}
