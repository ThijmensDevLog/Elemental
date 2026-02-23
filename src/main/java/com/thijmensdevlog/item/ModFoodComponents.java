package com.thijmensdevlog.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {

    public static final FoodComponent BAKED_CARROT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.75f)
            .build();

    public static final FoodComponent HOT_FOOD = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(2)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 1), 0.1f)
            .build();
}
