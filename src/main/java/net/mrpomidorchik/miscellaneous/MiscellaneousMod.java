package net.mrpomidorchik.miscellaneous;

import net.fabricmc.api.ModInitializer;
import net.mrpomidorchik.miscellaneous.block.ModBlocks;
import net.mrpomidorchik.miscellaneous.item.ModItems;
import net.mrpomidorchik.miscellaneous.world.feature.ModConfiguredFeatures;
import net.mrpomidorchik.miscellaneous.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiscellaneousMod implements ModInitializer {
	public static final String MOD_ID = "miscellaneous";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGen.generateModWorldGen();
	}
}
