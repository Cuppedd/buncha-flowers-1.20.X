package net.cupped.flowers.world;

import net.cupped.flowers.BunchaFlowers;
import net.cupped.flowers.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Range;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseThresholdBlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {

    //redone
    public static final RegistryKey<ConfiguredFeature<?, ?>> DANDELION_POPPY_KEY = registerKey("dandelion_poppy_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOD_FLOWERS_PLAINS_KEY = registerKey("mod_flowers_plains_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORCHIDS_KEY = registerKey("orchids_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FOREST_ROSES_KEY = registerKey("forest_roses_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FOREST_PEONIES_KEY = registerKey("forest_peonies_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FOREST_LILACS_KEY = registerKey("forest_lilacs_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOD_FLOWER_FOREST_SMALL_KEY = registerKey("mod_flower_forest_small_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOD_FLOWER_FOREST_TALL_KEY = registerKey("mod_flower_forest_tall_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_LOV_KEY = registerKey("pink_lov");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        //new

        register(context, PINK_LOV_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(64, 4, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_LOV)))));

        register(context, DANDELION_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(new NoiseThresholdBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 0.1, new double[0]),
                        0.005F, -0.8F, 0.758F, ModBlocks.WHITE_DANDELION.getDefaultState(), List.of(Blocks.DANDELION.getDefaultState()), List.of(ModBlocks.CORAL_REEF_POPPY.getDefaultState(),
                        ModBlocks.CREAM_POPPY.getDefaultState(), ModBlocks.DARK_NAVY_POPPY.getDefaultState(),  ModBlocks.DARK_WINE_POPPY.getDefaultState(), ModBlocks.HOT_PINK_POPPY.getDefaultState(), ModBlocks.LAVENDER_POPPY.getDefaultState(),
                        ModBlocks.ORANGE_POPPY.getDefaultState(), ModBlocks.PEACH_BELLINI_POPPY.getDefaultState(), ModBlocks.REDDISH_PINK_POPPY.getDefaultState(), ModBlocks.SOFT_YELLOW_POPPY.getDefaultState(),
                        ModBlocks.SPA_AQUA_POPPY.getDefaultState(), ModBlocks.TURQUOISE_POPPY.getDefaultState(), ModBlocks.WHITE_POPPY.getDefaultState(), ModBlocks.WHITE_WITH_NAVY_CENTER_POPPY.getDefaultState(),
                        ModBlocks.WISTERIA_POPPY.getDefaultState(), ModBlocks.PINK_DANDELION.getDefaultState()))))));

        register(context, MOD_FLOWERS_PLAINS_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(new NoiseThresholdBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 0.1, new double[0]),
                        0.005F, -0.8F, 0.758F, ModBlocks.WHITE_DANDELION.getDefaultState(), List.of(ModBlocks.BLACK_TULIP.getDefaultState(), ModBlocks.HOT_PINK_TULIP.getDefaultState(),
                        ModBlocks.PURPLE_TULIP.getDefaultState(), ModBlocks.SOFT_PINK_TULIP.getDefaultState(), ModBlocks.WINE_TULIP.getDefaultState(), ModBlocks.YELLOW_TULIP.getDefaultState()),
                        List.of(ModBlocks.CORAL_REEF_POPPY.getDefaultState(), ModBlocks.CREAM_POPPY.getDefaultState(), ModBlocks.DARK_NAVY_POPPY.getDefaultState(),  ModBlocks.DARK_WINE_POPPY.getDefaultState(),
                                ModBlocks.HOT_PINK_POPPY.getDefaultState(), ModBlocks.LAVENDER_POPPY.getDefaultState(), ModBlocks.ORANGE_POPPY.getDefaultState(), ModBlocks.PEACH_BELLINI_POPPY.getDefaultState(),
                                ModBlocks.REDDISH_PINK_POPPY.getDefaultState(), ModBlocks.SOFT_YELLOW_POPPY.getDefaultState(), ModBlocks.SPA_AQUA_POPPY.getDefaultState(), ModBlocks.TURQUOISE_POPPY.getDefaultState(),
                                ModBlocks.WHITE_POPPY.getDefaultState(), ModBlocks.WHITE_WITH_NAVY_CENTER_POPPY.getDefaultState(), ModBlocks.WISTERIA_POPPY.getDefaultState(), ModBlocks.PINK_DANDELION.getDefaultState(),
                                ModBlocks.LIGHT_BLUE_CORNFLOWER.getDefaultState(), ModBlocks.LIGHT_PINK_CORNFLOWER.getDefaultState(), ModBlocks.PINK_CORNFLOWER.getDefaultState(), ModBlocks.PLUM_CORNFLOWER.getDefaultState(),
                                ModBlocks.PURPLE_CORNFLOWER.getDefaultState(), ModBlocks.WHITE_CORNFLOWER.getDefaultState()))))));

        register(context, ORCHIDS_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(new NoiseThresholdBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 0.1, new double[0]),
                        0.005F, -0.8F, 0.758F, ModBlocks.ORANGE_ORCHID.getDefaultState(), List.of(Blocks.BLUE_ORCHID.getDefaultState()), List.of(ModBlocks.PINK_ORCHID.getDefaultState(),
                        ModBlocks.PURPLE_ORCHID.getDefaultState(), ModBlocks.RED_ORCHID.getDefaultState(),  ModBlocks.WHITE_ORCHID.getDefaultState(), ModBlocks.YELLOW_ORCHID.getDefaultState()))))));

        register(context, FOREST_ROSES_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 4, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(new NoiseThresholdBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 0.1, new double[0]),
                        0.005F, -0.8F, 0.758F, ModBlocks.BLACK_ROSE_BUSH.getDefaultState(), List.of(Blocks.ROSE_BUSH.getDefaultState()), List.of(ModBlocks.BLUE_ROSE_BUSH.getDefaultState(),
                        ModBlocks.BURGUNDY_ROSE_BUSH.getDefaultState(), ModBlocks.CORAL_ROSE_BUSH.getDefaultState(),  ModBlocks.CREAM_ROSE_BUSH.getDefaultState(), ModBlocks.DARK_PINK_ROSE_BUSH.getDefaultState(),
                        ModBlocks.ORANGE_ROSE_BUSH.getDefaultState(), ModBlocks.PEACH_ROSE_BUSH.getDefaultState(), ModBlocks.PINK_ROSE_BUSH.getDefaultState(), ModBlocks.PURPLE_ROSE_BUSH.getDefaultState(),
                        ModBlocks.SALMON_ROSE_BUSH.getDefaultState(), ModBlocks.WHITE_ROSE_BUSH.getDefaultState(), ModBlocks.YELLOW_ROSE_BUSH.getDefaultState()))))));

        register(context, FOREST_PEONIES_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 4, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(new NoiseThresholdBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 0.1, new double[0]),
                        0.005F, -0.8F, 0.758F, ModBlocks.BLACK_PEONY.getDefaultState(), List.of(Blocks.PEONY.getDefaultState()), List.of(ModBlocks.BLUE_PEONY.getDefaultState(),
                        ModBlocks.DARK_PINK_PEONY.getDefaultState(), ModBlocks.FUSCHIA_PEONY.getDefaultState(),  ModBlocks.MAGENTA_PEONY.getDefaultState(), ModBlocks.PASTEL_BLUE_PEONY.getDefaultState(),
                        ModBlocks.PEACH_PEONY.getDefaultState(), ModBlocks.PURPLE_PEONY.getDefaultState(), ModBlocks.RED_PEONY.getDefaultState(), ModBlocks.SPRING_PINK_PEONY.getDefaultState(),
                        ModBlocks.WHITE_PEONY.getDefaultState(), ModBlocks.YELLOW_PEONY.getDefaultState()))))));

        register(context, FOREST_LILACS_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 4, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(new NoiseThresholdBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 0.1, new double[0]),
                        0.005F, -0.8F, 0.758F, ModBlocks.BLUE_LILAC.getDefaultState(), List.of(Blocks.LILAC.getDefaultState()), List.of(ModBlocks.LIGHT_PINK_LILAC.getDefaultState(),
                        ModBlocks.LIGHT_PURPLE_LILAC.getDefaultState(), ModBlocks.PLUM_LILAC.getDefaultState(),  ModBlocks.VIOLET_LILAC.getDefaultState(), ModBlocks.WHITE_LILAC.getDefaultState()))))));

        register(context, MOD_FLOWER_FOREST_SMALL_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(96, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(new NoiseBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0, new double[0]), 0.020833334F,
                        List.of(ModBlocks.PINK_DANDELION.getDefaultState(), ModBlocks.WHITE_DANDELION.getDefaultState(), ModBlocks.BLUSH_POPPY.getDefaultState(), ModBlocks.CORAL_REEF_POPPY.getDefaultState(),
                                ModBlocks.CREAM_POPPY.getDefaultState(), ModBlocks.DARK_NAVY_POPPY.getDefaultState(), ModBlocks.DARK_WINE_POPPY.getDefaultState(), ModBlocks.HOT_PINK_POPPY.getDefaultState(),
                                ModBlocks.LAVENDER_POPPY.getDefaultState(), ModBlocks.ORANGE_POPPY.getDefaultState(), ModBlocks.PEACH_BELLINI_POPPY.getDefaultState(), ModBlocks.REDDISH_PINK_POPPY.getDefaultState(),
                                ModBlocks.SOFT_YELLOW_POPPY.getDefaultState(), ModBlocks.SPA_AQUA_POPPY.getDefaultState(), ModBlocks.TURQUOISE_POPPY.getDefaultState(), ModBlocks.WHITE_POPPY.getDefaultState(),
                                ModBlocks.WHITE_WITH_NAVY_CENTER_POPPY.getDefaultState(), ModBlocks.WISTERIA_POPPY.getDefaultState(), ModBlocks.BLUE_ALLIUM.getDefaultState(), ModBlocks.DRUMBSTICK_ALLIUM.getDefaultState(),
                                ModBlocks.PINK_ALLIUM.getDefaultState(), ModBlocks.WHITE_ALLIUM.getDefaultState(), ModBlocks.YELLOW_ALLIUM.getDefaultState(), ModBlocks.BLACK_TULIP.getDefaultState(),
                                ModBlocks.HOT_PINK_TULIP.getDefaultState(), ModBlocks.PURPLE_TULIP.getDefaultState(), ModBlocks.SOFT_PINK_TULIP.getDefaultState(), ModBlocks.WINE_TULIP.getDefaultState(),
                                ModBlocks.YELLOW_TULIP.getDefaultState(), ModBlocks.LIGHT_BLUE_CORNFLOWER.getDefaultState(), ModBlocks.LIGHT_PINK_CORNFLOWER.getDefaultState(), ModBlocks.PINK_CORNFLOWER.getDefaultState(),
                                ModBlocks.PLUM_CORNFLOWER.getDefaultState(), ModBlocks.PURPLE_CORNFLOWER.getDefaultState(), ModBlocks.WHITE_CORNFLOWER.getDefaultState(), ModBlocks.PINK_LOV.getDefaultState()))))));

        register(context, MOD_FLOWER_FOREST_TALL_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(96, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(new NoiseBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0, new double[0]), 0.020833334F,
                        List.of(ModBlocks.BLACK_ROSE_BUSH.getDefaultState(), ModBlocks.BLUE_ROSE_BUSH.getDefaultState(), ModBlocks.BURGUNDY_ROSE_BUSH.getDefaultState(), ModBlocks.CORAL_ROSE_BUSH.getDefaultState(),
                                ModBlocks.CREAM_ROSE_BUSH.getDefaultState(), ModBlocks.DARK_PINK_ROSE_BUSH.getDefaultState(), ModBlocks.GREEN_ROSE_BUSH.getDefaultState(), ModBlocks.ORANGE_ROSE_BUSH.getDefaultState(),
                                ModBlocks.PEACH_ROSE_BUSH.getDefaultState(), ModBlocks.PINK_ROSE_BUSH.getDefaultState(), ModBlocks.PURPLE_ROSE_BUSH.getDefaultState(), ModBlocks.RAINBOW_ROSE_BUSH.getDefaultState(),
                                ModBlocks.SALMON_ROSE_BUSH.getDefaultState(), ModBlocks.WHITE_ROSE_BUSH.getDefaultState(), ModBlocks.YELLOW_ROSE_BUSH.getDefaultState(), ModBlocks.BLUE_LILAC.getDefaultState(),
                                ModBlocks.LIGHT_PINK_LILAC.getDefaultState(), ModBlocks.LIGHT_PURPLE_LILAC.getDefaultState(), ModBlocks.PLUM_LILAC.getDefaultState(), ModBlocks.VIOLET_LILAC.getDefaultState(),
                                ModBlocks.WHITE_LILAC.getDefaultState(), ModBlocks.BLACK_PEONY.getDefaultState(), ModBlocks.BLUE_PEONY.getDefaultState(), ModBlocks.DARK_PINK_PEONY.getDefaultState(),
                                ModBlocks.FUSCHIA_PEONY.getDefaultState(), ModBlocks.MAGENTA_PEONY.getDefaultState(), ModBlocks.PASTEL_BLUE_PEONY.getDefaultState(), ModBlocks.PEACH_PEONY.getDefaultState(),
                                ModBlocks.PURPLE_PEONY.getDefaultState(), ModBlocks.RED_PEONY.getDefaultState(), ModBlocks.SPRING_PINK_PEONY.getDefaultState(), ModBlocks.WHITE_PEONY.getDefaultState(),
                                ModBlocks.YELLOW_PEONY.getDefaultState()))))));


    }

    //helpers
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BunchaFlowers.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}