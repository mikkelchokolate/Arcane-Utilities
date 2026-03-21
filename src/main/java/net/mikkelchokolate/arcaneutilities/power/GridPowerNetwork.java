package net.mikkelchokolate.arcaneutilities.power;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

/**
 * Grid Power (GP) is a passive energy system where producers add GP to a
 * per-world pool each tick, and consumers drain from that pool.
 *
 * The pool resets at the END of each server tick so that every tick starts
 * fresh — GP is a flow, not a store.
 */
public class GridPowerNetwork {

    // Keyed by world's registry key string (e.g. "minecraft:overworld")
    private static final Map<String, Long> gpPool = new HashMap<>();

    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(server -> resetPools());
    }

    /** Called by producer block entities each tick to add GP to the world pool. */
    public static void produce(World world, long amount) {
        String key = worldKey(world);
        gpPool.merge(key, amount, Long::sum);
    }

    /**
     * Attempt to consume {@code amount} GP from the world pool.
     * Returns {@code true} if enough GP was available and has been consumed.
     */
    public static boolean consume(World world, long amount) {
        String key = worldKey(world);
        long available = gpPool.getOrDefault(key, 0L);
        if (available >= amount) {
            gpPool.put(key, available - amount);
            return true;
        }
        return false;
    }

    /** Returns available GP in the given world's pool without consuming it. */
    public static long available(World world) {
        return gpPool.getOrDefault(worldKey(world), 0L);
    }

    private static void resetPools() {
        gpPool.clear();
    }

    private static String worldKey(World world) {
        return world.getRegistryKey().getValue().toString();
    }
}
