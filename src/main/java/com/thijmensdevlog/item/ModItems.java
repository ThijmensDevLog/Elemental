package com.thijmensdevlog.item;

import com.thijmensdevlog.Elemental;
import com.thijmensdevlog.item.fire.FireFood;
import com.thijmensdevlog.item.fire.FireItems;
import com.thijmensdevlog.item.fire.FireToolsArmor;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // All the items

    //Fire
    public static final Item FIRE_SWORD = FireToolsArmor.FIRE_SWORD;
    public static final Item FIRE_AXE = FireToolsArmor.FIRE_AXE;
    public static final Item FIRE_PICKAXE = FireToolsArmor.FIRE_PICKAXE;
    public static final Item FIRE_SHOVEL = FireToolsArmor.FIRE_SHOVEL;
    public static final Item FIRE_HOE = FireToolsArmor.FIRE_HOE;

    public static final Item BLAZE_POWDER_CHIP = FireItems.BLAZE_POWDER_CHIP;
    public static final Item FIRE_CHIP = FireItems.FIRE_CHIP;

    public static final Item BAKED_CARROT = FireFood.BAKED_CARROT;
    public static final Item HOT_FOOD = FireFood.HOT_FOOD;

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Elemental.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Elemental.LOGGER.info("ELEMENTAL: Loaded mod items.");
    }

}
