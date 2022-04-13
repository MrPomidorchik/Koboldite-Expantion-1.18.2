package net.mrpomidorchik.kobolditeexpansion;

import net.fabricmc.api.ModInitializer;
import net.mrpomidorchik.kobolditeexpansion.block.ModBlocks;
import net.mrpomidorchik.kobolditeexpansion.item.ModItems;
import net.mrpomidorchik.kobolditeexpansion.world.feature.ModConfiguredFeatures;
import net.mrpomidorchik.kobolditeexpansion.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiscellaneousMod implements ModInitializer {
	public static final String MOD_ID = "koboldite_expansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGen.generateModWorldGen();
	}
}
