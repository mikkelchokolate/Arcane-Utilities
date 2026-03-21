package net.mikkelchokolate.arcaneutilities.blockentity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.world.World;
import net.pitan76.mcpitanlib.api.event.block.TileCreateEvent;
import net.pitan76.mcpitanlib.api.event.tile.TileTickEvent;
import net.pitan76.mcpitanlib.api.tile.CompatBlockEntity;
import net.pitan76.mcpitanlib.api.tile.ExtendBlockEntityTicker;
import net.pitan76.mcpitanlib.api.util.WorldUtil;
import net.mikkelchokolate.arcaneutilities.power.GridPowerNetwork;

public class SolarPanelBlockEntity extends CompatBlockEntity implements ExtendBlockEntityTicker<SolarPanelBlockEntity> {

    public static final int PRODUCTION = 4;

    public SolarPanelBlockEntity(BlockEntityType<?> type, TileCreateEvent e) {
        super(type, e);
    }

    public SolarPanelBlockEntity(TileCreateEvent e) {
        this(ModBlockEntities.SOLAR_PANEL.getOrNull(), e);
    }

    @Override
    public void tick(TileTickEvent<SolarPanelBlockEntity> e) {
        World world = e.world;
        if (WorldUtil.isClient(world)) return;

        long time = world.getTimeOfDay() % 24000L;
        boolean isDay = time < 12000L;

        if (isDay && !WorldUtil.isRaining(world) && WorldUtil.isSkyVisible(world, pos.up())) {
            GridPowerNetwork.produce(world, PRODUCTION);
        }
    }
}
