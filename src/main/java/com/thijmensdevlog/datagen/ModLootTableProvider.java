package com.thijmensdevlog.datagen;

import com.thijmensdevlog.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // BELOW ARE EXAMPLES
        // MORE LOOT
        // addDrop(ORIGINAL_BLOCK, multipleOreDrops(ORIGINAL_BLOCK, DROPPING_ITEM, MIN, MAX),

        // BLOCK DROPS ITSELF
        addDrop(ModBlocks.FIRE_DIRT_BLOCK);
        addDrop(ModBlocks.FIRE_COBBLESTONE_BLOCK);

        addDrop(ModBlocks.FIRE_OAK_TREE_LOG);
        addDrop(ModBlocks.FIRE_OAK_TREE_WOOD);
        addDrop(ModBlocks.STRIPPED_FIRE_OAK_TREE_LOG);
        addDrop(ModBlocks.STRIPPED_FIRE_OAK_TREE_WOOD);
        addDrop(ModBlocks.FIRE_OAK_TREE_PLANKS);
        addDrop(ModBlocks.FIRE_OAK_TREE_SAPLING);

        addDrop(ModBlocks.FIRE_OAK_TREE_LEAVES, leavesDrops(ModBlocks.FIRE_OAK_TREE_LEAVES, ModBlocks.FIRE_OAK_TREE_SAPLING, 0.0625f));

        // BLOCK DROPS SOMETHING ELSE, CAN BE ITEM OR BLOCK (FOR BLOCKS USE `Item.fromBlock(ITEM HERE)`
        addDrop(ModBlocks.FIRE_GRASS_BLOCK, oreDrops(ModBlocks.FIRE_GRASS_BLOCK, Item.fromBlock(ModBlocks.FIRE_DIRT_BLOCK)));
        addDrop(ModBlocks.FIRE_STONE_BLOCK, oreDrops(ModBlocks.FIRE_STONE_BLOCK, Item.fromBlock(ModBlocks.FIRE_COBBLESTONE_BLOCK)));
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }

}
