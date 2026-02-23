package com.thijmensdevlog.block.fire;

import com.thijmensdevlog.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;

import static com.thijmensdevlog.block.ModBlocks.registerBlock;

public class FireTrees {
    public static final Block FIRE_OAK_TREE_LOG = registerBlock("fire_oak_tree_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block FIRE_OAK_TREE_WOOD = registerBlock("fire_oak_tree_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_FIRE_OAK_TREE_LOG = registerBlock("stripped_fire_oak_tree_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_FIRE_OAK_TREE_WOOD = registerBlock("stripped_fire_oak_tree_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block FIRE_OAK_TREE_PLANKS = registerBlock("fire_oak_tree_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block FIRE_OAK_TREE_LEAVES = registerBlock("fire_oak_tree_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

    public static final Block FIRE_OAK_TREE_SAPLING = registerBlock("fire_oak_tree_sapling",
            new SaplingBlock(ModSaplingGenerators.FIRE_OAK_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
}
