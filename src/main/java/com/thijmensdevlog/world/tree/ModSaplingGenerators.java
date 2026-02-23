package com.thijmensdevlog.world.tree;

import com.thijmensdevlog.Elemental;
import com.thijmensdevlog.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator FIRE_OAK_TREE = new SaplingGenerator(
            Elemental.MOD_ID + ":fire_oak_tree",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.FIRE_OAK_TREE_KEY),
            Optional.empty());
}
