package com.thijmensdevlog.block;

import com.thijmensdevlog.Elemental;
import com.thijmensdevlog.block.fire.FireBlocks;
import com.thijmensdevlog.block.fire.FireTrees;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // All the blocks

    // Fire
    public static final Block FIRE_GRASS_BLOCK = FireBlocks.FIRE_GRASS_BLOCK;
    public static final Block FIRE_DIRT_BLOCK = FireBlocks.FIRE_DIRT_BLOCK;
    public static final Block FIRE_STONE_BLOCK = FireBlocks.FIRE_STONE_BLOCK;
    public static final Block FIRE_COBBLESTONE_BLOCK = FireBlocks.FIRE_COBBLESTONE_BLOCK;

    public static final Block FIRE_OAK_TREE_LOG = FireTrees.FIRE_OAK_TREE_LOG;
    public static final Block FIRE_OAK_TREE_WOOD = FireTrees.FIRE_OAK_TREE_WOOD;
    public static final Block STRIPPED_FIRE_OAK_TREE_LOG = FireTrees.STRIPPED_FIRE_OAK_TREE_LOG;
    public static final Block STRIPPED_FIRE_OAK_TREE_WOOD = FireTrees.STRIPPED_FIRE_OAK_TREE_WOOD;
    public static final Block FIRE_OAK_TREE_PLANKS = FireTrees.FIRE_OAK_TREE_PLANKS;
    public static final Block FIRE_OAK_TREE_LEAVES = FireTrees.FIRE_OAK_TREE_LEAVES;
    public static final Block FIRE_OAK_TREE_SAPLING = FireTrees.FIRE_OAK_TREE_SAPLING;



    public static Block registerBlock(String name, Block block){
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
