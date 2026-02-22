package com.thijmensdevlog;

import com.thijmensdevlog.block.ModBlocks;
import com.thijmensdevlog.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elemental implements ModInitializer {
	public static final String MOD_ID = "elemental";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Load mod
		LOGGER.debug("LOADING ELEMENTAL");

		// Load stuff from the mod
		ModItems.registerModItems();
		ModBlocks.registerModBlock();

		ModCreativeGroups.registerItemGroups();

		//Fuels
		FuelRegistry.INSTANCE.add(ModItems.BLAZE_POWDER_CHIP, 310);
	}
}