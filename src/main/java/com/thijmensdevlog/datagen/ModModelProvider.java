package com.thijmensdevlog.datagen;

import com.thijmensdevlog.block.ModBlocks;
import com.thijmensdevlog.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_DIRT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_STONE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_COBBLESTONE_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.FIRE_OAK_TREE_LOG).log(ModBlocks.FIRE_OAK_TREE_LOG).wood(ModBlocks.FIRE_OAK_TREE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_FIRE_OAK_TREE_LOG).log(ModBlocks.STRIPPED_FIRE_OAK_TREE_LOG).wood(ModBlocks.STRIPPED_FIRE_OAK_TREE_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_OAK_TREE_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.FIRE_OAK_TREE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.FIRE_OAK_TREE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FIRE_CHIP, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAKED_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZE_POWDER_CHIP, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOT_FOOD, Models.GENERATED);
    }


}
