package net.mikkelchokolate.arcaneutilities.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.pitan76.mcpitanlib.api.item.v2.CompatItem;
import net.pitan76.mcpitanlib.api.item.v2.CompatibleItemSettings;
import net.mikkelchokolate.arcaneutilities.power.GridPowerNetwork;

public class AngelRingItem extends CompatItem {

    // GP consumed per tick while hovering
    private static final long GP_PER_TICK = 1;

    public AngelRingItem(CompatibleItemSettings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);

        if (world.isClient()) return;
        if (!(entity instanceof ServerPlayerEntity)) return;

        ServerPlayerEntity player = (ServerPlayerEntity) entity;

        // Don't interfere while sneaking, swimming, or in creative/spectator
        if (player.isSneaking() || player.isSwimming()) return;
        if (player.isCreative() || player.isSpectator()) return;

        Vec3d velocity = player.getVelocity();

        // Slow fall: if moving downward faster than a gentle drift, cap it
        if (velocity.y < -0.1 && !player.isOnGround()) {
            if (GridPowerNetwork.consume(world, GP_PER_TICK)) {
                player.setVelocity(velocity.x, Math.max(-0.1, velocity.y), velocity.z);
                player.fallDistance = 0;
            }
        }
    }
}
