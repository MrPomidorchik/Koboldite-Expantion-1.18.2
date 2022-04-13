package net.mrpomidorchik.kobolditeexpansion.world.gen;


import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.mrpomidorchik.kobolditeexpansion.world.feature.ModPlacedFeatures;

public class ModKobolditeOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_KOBOLDITE_PLACED.getKey().get());
    }
}
