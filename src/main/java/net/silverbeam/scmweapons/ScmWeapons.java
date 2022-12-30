package net.silverbeam.scmweapons;

import net.fabricmc.api.ModInitializer;
import net.silverbeam.scmweapons.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScmWeapons implements ModInitializer {
	public static final String MOD_ID = "scmweapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
