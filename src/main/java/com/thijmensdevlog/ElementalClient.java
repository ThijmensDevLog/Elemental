package com.thijmensdevlog;

import com.thijmensdevlog.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ElementalClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FIRE_OAK_TREE_SAPLING, RenderLayer.getCutout());
    }
}
