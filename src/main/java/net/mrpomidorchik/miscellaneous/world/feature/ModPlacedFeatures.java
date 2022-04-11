package net.mrpomidorchik.miscellaneous.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> ORE_RUBY_PLACED = PlacedFeatures.register("ruby_ore_placed",
            ModConfiguredFeatures.ORE_RUBY, ModOreFeatures.modifiersWithCount(100,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(64))));

    public static final RegistryEntry<PlacedFeature> ORE_KOBOLDITE_PLACED = PlacedFeatures.register("koboldite_ore_placed",
            ModConfiguredFeatures.ORE_KOBOLDITE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-48), YOffset.fixed(-32))));
}
