package com.thijmensdevlog.block;

import com.thijmensdevlog.Elemental;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //public static final Block FIRE_CHIP_BLOCK = registerBlock("fire_chip_block",
    //        new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    //
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Elemental.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Elemental.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlock() {
        Elemental.LOGGER.info("ELEMENTAL: Loaded mod items.");


    }

}
