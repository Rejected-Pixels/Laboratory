package com.rejectedpixels.laboratory.common.registries;

import com.rejectedpixels.laboratory.Laboratory;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Laboratory.MOD_ID);

    public static final DeferredItem<Item> GEM = ITEMS.register("gem", () -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
