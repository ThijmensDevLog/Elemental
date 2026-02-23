package com.thijmensdevlog.item.fire;

import com.thijmensdevlog.item.ModFoodComponents;
import net.minecraft.item.Item;

import static com.thijmensdevlog.item.ModItems.registerItem;

public class FireFood {
    public static final Item BAKED_CARROT = registerItem("baked_carrot", new Item(new Item.Settings().food(ModFoodComponents.BAKED_CARROT)));
    public static final Item HOT_FOOD = registerItem("hot_food", new Item(new Item.Settings().food(ModFoodComponents.HOT_FOOD)));

}
