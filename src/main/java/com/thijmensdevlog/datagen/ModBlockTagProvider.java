package com.thijmensdevlog.datagen;

import com.thijmensdevlog.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.FIRE_STONE_BLOCK)
                .add(ModBlocks.FIRE_COBBLESTONE_BLOCK);

        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.FIRE_GRASS_BLOCK)
                .add(ModBlocks.FIRE_DIRT_BLOCK);
    }
}
