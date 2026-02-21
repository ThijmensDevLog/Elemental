package com.thijmensdevlog;

import com.thijmensdevlog.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elemental implements ModInitializer {
	public static final String MOD_ID = "elemental";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Load mod
		LOGGER.debug("LOADING ELEMENTAL");
		ModItems.registerModItems();
	}
}