package net.mrpomidorchik.miscellaneous.world.feature;


import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.mrpomidorchik.miscellaneous.MiscellaneousMod;
import net.mrpomidorchik.miscellaneous.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_RUBY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.RUBY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_RUBY =
            ConfiguredFeatures.register("ruby_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_RUBY_ORES, 3));


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
