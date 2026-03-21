package net.mikkelchokolate.arcaneutilities.item;

import net.pitan76.mcpitanlib.api.item.CreativeTabBuilder;
import net.pitan76.mcpitanlib.api.util.ItemStackUtil;

import static net.mikkelchokolate.arcaneutilities.ArcaneUtilities._id;
import static net.mikkelchokolate.arcaneutilities.ArcaneUtilities.registry;

public class ModItemGroups {
    public static CreativeTabBuilder ARCANE_UTILITIES = CreativeTabBuilder.create(_id("arcane_utilities"))
            .setIcon(() -> ItemStackUtil.create(ModItems.ANGEL_RING.getOrNull(), 1));

    public static void init() {
        registry.registerItemGroup(ARCANE_UTILITIES);
    }
}
