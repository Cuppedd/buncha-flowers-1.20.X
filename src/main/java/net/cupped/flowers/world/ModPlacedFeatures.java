package net.cupped.flowers.world;

import net.cupped.flowers.BunchaFlowers;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ClampedIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    //revamped
    public static final RegistryKey<PlacedFeature> DANDELION_POPPY_PLACED_KEY = registerKey("dandelion_poppy_placed");
    public static final RegistryKey<PlacedFeature> MOD_FLOWERS_PLAINS_PLACED_KEY = registerKey("mod_flowers_plains_placed");
    public static final RegistryKey<PlacedFeature> ORCHIDS_PLACED_KEY = registerKey("orchids_placed");
    public static final RegistryKey<PlacedFeature> FOREST_ROSES_PLACED_KEY = registerKey("forest_roses_placed");
    public static final RegistryKey<PlacedFeature> FOREST_PEONIES_PLACED_KEY = registerKey("forest_peonies_placed");
    public static final RegistryKey<PlacedFeature> FOREST_LILACS_PLACED_KEY = registerKey("forest_lilacs_placed");
    public static final RegistryKey<PlacedFeature> MOD_FLOWER_FOREST_SMALL_PLACED_KEY = registerKey("mod_flower_forest_small_placed");
    public static final RegistryKey<PlacedFeature> MOD_FLOWER_FOREST_TALL_PLACED_KEY = registerKey("mod_flower_forest_tall_placed");
    public static final RegistryKey<PlacedFeature> PINK_LOV_PLACED_KEY = registerKey("pink_lov_placed");



    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        //new
        register(context, PINK_LOV_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_LOV_KEY), RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, DANDELION_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DANDELION_POPPY_KEY),
                NoiseThresholdCountPlacementModifier.of(-0.2, 15, 4), RarityFilterPlacementModifier.of(32),
                SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, MOD_FLOWERS_PLAINS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOD_FLOWERS_PLAINS_KEY),
                NoiseThresholdCountPlacementModifier.of(-0.2, 15, 4), RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, ORCHIDS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORCHIDS_KEY),
                NoiseThresholdCountPlacementModifier.of(-0.2, 15, 4), RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, FOREST_ROSES_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FOREST_ROSES_KEY),
                NoiseThresholdCountPlacementModifier.of(-0.2, 15, 4), RarityFilterPlacementModifier.of(32),
                SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, FOREST_PEONIES_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FOREST_PEONIES_KEY),
                NoiseThresholdCountPlacementModifier.of(-0.2, 15, 4), RarityFilterPlacementModifier.of(32),
                SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, FOREST_LILACS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FOREST_LILACS_KEY),
                NoiseThresholdCountPlacementModifier.of(-0.2, 15, 4), RarityFilterPlacementModifier.of(32),
                SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, MOD_FLOWER_FOREST_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOD_FLOWER_FOREST_SMALL_KEY), CountPlacementModifier.of(3),
                RarityFilterPlacementModifier.of(2), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, MOD_FLOWER_FOREST_TALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MOD_FLOWER_FOREST_TALL_KEY), RarityFilterPlacementModifier.of(7), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, CountPlacementModifier.of(ClampedIntProvider.create(UniformIntProvider.create(-1, 3), 0, 3)), BiomePlacementModifier.of());



    }

    //helpers
    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BunchaFlowers.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
