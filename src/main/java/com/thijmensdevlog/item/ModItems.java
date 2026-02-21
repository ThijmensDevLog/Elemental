package com.thijmensdevlog.item;

import com.thijmensdevlog.Elemental;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FIRE_CHIP = registerItem("fire_chip", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Elemental.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Elemental.LOGGER.info("ELEMENTAL: Loaded mod items.");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FIRE_CHIP);
        });
    }

}
