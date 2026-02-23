package com.thijmensdevlog.item.fire;

import com.thijmensdevlog.item.ModToolMaterials;
import net.minecraft.item.*;

import static com.thijmensdevlog.item.ModItems.registerItem;

public class FireToolsArmor {
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

}
