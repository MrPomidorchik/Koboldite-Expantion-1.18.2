package net.mrpomidorchik.kobolditeexpansion.world.feature;


import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.mrpomidorchik.kobolditeexpansion.MiscellaneousMod;
import net.mrpomidorchik.kobolditeexpansion.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {


    public static final List<OreFeatureConfig.Target> OVERWORLD_KOBOLDITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_KOBOLDITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_KOBOLDITE =
            ConfiguredFeatures.register("koboldite_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_KOBOLDITE_ORES, 3));


    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + MiscellaneousMod.MOD_ID);
    }
}
