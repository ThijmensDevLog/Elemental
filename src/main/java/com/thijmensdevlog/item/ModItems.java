package com.thijmensdevlog.item;

import com.thijmensdevlog.Elemental;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BLAZE_POWDER_CHIP = registerItem("blaze_powder_chip", new Item(new Item.Settings()));
    public static final Item FIRE_CHIP = registerItem("fire_chip", new Item(new Item.Settings()));

    public static final Item BAKED_CARROT = registerItem("baked_carrot", new Item(new Item.Settings().food(ModFoodComponents.BAKED_CARROT)));
    public static final Item HOT_FOOD = registerItem("hot_food", new Item(new Item.Settings().food(ModFoodComponents.HOT_FOOD)));

    public static final Item FIRE_SWORD = registerItem("fire_sword",
            new SwordItem(ModToolMaterials.FIRE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.FIRE, 5, -2f))));
    public static final Item FIRE_AXE = registerItem("fire_axe",
            new AxeItem(ModToolMaterials.FIRE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.FIRE, 7, -2.4f))));
    public static final Item FIRE_PICKAXE = registerItem("fire_pickaxe",
            new PickaxeItem(ModToolMaterials.FIRE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FIRE, 4, -3f))));
    public static final Item FIRE_SHOVEL = registerItem("fire_shovel",
            new ShovelItem(ModToolMaterials.FIRE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.FIRE, 3, -2.8f))));
    public static final Item FIRE_HOE = registerItem("fire_hoe",
            new HoeItem(ModToolMaterials.FIRE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.FIRE, 1, -3f))));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Elemental.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Elemental.LOGGER.info("ELEMENTAL: Loaded mod items.");
    }

}
