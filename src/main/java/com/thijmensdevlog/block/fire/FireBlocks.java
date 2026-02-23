package com.thijmensdevlog.block.fire;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.GrassBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.thijmensdevlog.block.ModBlocks.registerBlock;

public class FireBlocks {
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
}
