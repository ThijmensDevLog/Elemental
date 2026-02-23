package com.thijmensdevlog.block;

import com.thijmensdevlog.Elemental;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.GrassBlock;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block FIRE_GRASS_BLOCK = registerBlock("fire_grass_block",
            new GrassBlock(AbstractBlock.Settings
                    .create()
                    .strength(2f)
                    .sounds(BlockSoundGroup.GRASS)));

    public static final Block FIRE_DIRT_BLOCK = registerBlock("fire_dirt_block",
            new Block(AbstractBlock.Settings
                    .create()
                    .strength(2f)
                    .sounds(BlockSoundGroup.GRASS)));

    public static final Block FIRE_STONE_BLOCK = registerBlock("fire_stone_block",
            new Block(AbstractBlock.Settings
                    .create()
                    .strength(4f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    public static final Block FIRE_COBBLESTONE_BLOCK = registerBlock("fire_cobblestone_block",
            new Block(AbstractBlock.Settings
                    .create()
                    .strength(3f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));


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
