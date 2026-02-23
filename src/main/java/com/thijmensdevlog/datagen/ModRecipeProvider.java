package com.thijmensdevlog.datagen;

import com.thijmensdevlog.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> BAKED_CARROT_SMELTABLES = List.of(Items.CARROT);

        offerSmelting(recipeExporter, BAKED_CARROT_SMELTABLES,
                RecipeCategory.FOOD,
                ModItems.BAKED_CARROT,
                0.25f,
                200,
                "baked_carrot");

        offerShapelessRecipe(recipeExporter, ModItems.BLAZE_POWDER_CHIP, Items.BLAZE_POWDER, "blaze_powder_chip",4);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.HOT_FOOD)
                .pattern("PC")
                .pattern("BP")
                .input('P', ModItems.BLAZE_POWDER_CHIP)
                .input('C', ModItems.BAKED_CARROT)
                .input('B', Items.BOWL)
                .criterion(hasItem(ModItems.BLAZE_POWDER_CHIP), conditionsFromItem(ModItems.BLAZE_POWDER_CHIP))
                .offerTo(recipeExporter);

    }
}
