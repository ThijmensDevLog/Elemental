package com.thijmensdevlog;

import com.thijmensdevlog.block.ModBlocks;
import com.thijmensdevlog.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModCreativeGroups {
    public static final ItemGroup ELEMENTAL_CREATIVE_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Elemental.MOD_ID, "elemental_creative_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FIRE_CHIP))
                    .displayName(Text.translatable("itemgroup.elemental.elemental_creative_tab"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FIRE_CHIP);
                        entries.add(ModItems.BLAZE_POWDER_CHIP);


                        entries.add(ModItems.FIRE_AXE);
                        entries.add(ModItems.FIRE_SWORD);
                        entries.add(ModItems.FIRE_PICKAXE);
                        entries.add(ModItems.FIRE_SHOVEL);
                        entries.add(ModItems.FIRE_HOE);

                        entries.add(ModItems.BAKED_CARROT);
                        entries.add(ModItems.HOT_FOOD);

                        entries.add(ModBlocks.FIRE_GRASS_BLOCK);
                        entries.add(ModBlocks.FIRE_DIRT_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        Elemental.LOGGER.info("ELEMENTAL: Item groups loaded");
    }
}
