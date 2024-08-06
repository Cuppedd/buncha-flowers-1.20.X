package net.cupped.flowers.world;

import net.cupped.flowers.BunchaFlowers;
import net.cupped.flowers.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_DANDELION_KEY = registerKey("white_dandelion");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_DANDELION_KEY = registerKey("pink_dandelion");

    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUSH_POPPY_KEY = registerKey("blush_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CORAL_REEF_POPPY_KEY = registerKey("coral_reef_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CREAM_POPPY_KEY = registerKey("cream_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_NAVY_POPPY_KEY = registerKey("dark_navy_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_WINE_POPPY_KEY = registerKey("dark_wine_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOT_PINK_POPPY_KEY = registerKey("hot_pink_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAVENDER_POPPY_KEY = registerKey("lavender_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_POPPY_KEY = registerKey("orange_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEACH_BELLINI_POPPY_KEY = registerKey("peach_bellini_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDDISH_PINK_POPPY_KEY = registerKey("reddish_pink_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOFT_YELLOW_POPPY_KEY = registerKey("soft_yellow_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPA_AQUA_POPPY_KEY = registerKey("spa_aqua_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TURQUOISE_POPPY_KEY = registerKey("turquoise_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_POPPY_KEY = registerKey("white_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_NAVY_POPPY_KEY = registerKey("white_navy_poppy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WISTERIA_POPPY_KEY = registerKey("wisteria_poppy");

    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_ALLIUM_KEY = registerKey("blue_allium");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRUMBSTICK_ALLIUM_KEY = registerKey("drumbstick_allium");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_ALLIUM_KEY = registerKey("pink_allium");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_ALLIUM_KEY = registerKey("white_allium");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_ALLIUM_KEY = registerKey("yellow_allium");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_LOV_KEY = registerKey("pink_lov");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_ORCHID_KEY = registerKey("orange_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_ORCHID_KEY = registerKey("pink_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_ORCHID_KEY = registerKey("purple_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_ORCHID_KEY = registerKey("red_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_ORCHID_KEY = registerKey("white_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_ORCHID_KEY = registerKey("yellow_orchid");

    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_TULIP_KEY = registerKey("black_tulip");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOT_PINK_TULIP_KEY = registerKey("hot_pink_tulip");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_TULIP_KEY = registerKey("purple_tulip");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOFT_PINK_TULIP_KEY = registerKey("soft_pink_tulip");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WINE_TULIP_KEY = registerKey("wine_tulip");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_TULIP_KEY = registerKey("yellow_tulip");

    public static final RegistryKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_CORNFLOWER_KEY = registerKey("light_blue_cornflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIGHT_PINK_CORNFLOWER_KEY = registerKey("light_pink_cornflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_CORNFLOWER_KEY = registerKey("pink_cornflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLUM_CORNFLOWER_KEY = registerKey("plum_cornflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_CORNFLOWER_KEY = registerKey("purple_cornflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_CORNFLOWER_KEY = registerKey("white_cornflower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_ROSEBUSH_KEY = registerKey("black_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_ROSEBUSH_KEY = registerKey("blue_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BURGUNDY_ROSEBUSH_KEY = registerKey("burgundy_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CORAL_ROSEBUSH_KEY = registerKey("coral_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CREAM_ROSEBUSH_KEY = registerKey("cream_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_PINK_ROSEBUSH_KEY = registerKey("dark_pink_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_ROSEBUSH_KEY = registerKey("green_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_ROSEBUSH_KEY = registerKey("orange_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEACH_ROSEBUSH_KEY = registerKey("peach_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_ROSEBUSH_KEY = registerKey("pink_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_ROSEBUSH_KEY = registerKey("purple_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RAINBOW_ROSEBUSH_KEY = registerKey("rainbow_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SALMON_ROSEBUSH_KEY = registerKey("salmon_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_ROSEBUSH_KEY = registerKey("white_rosebush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_ROSEBUSH_KEY = registerKey("yellow_rosebush");

    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_LILAC_KEY = registerKey("blue_lilac");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIGHT_PINK_LILAC_KEY = registerKey("light_pink_lilac");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIGHT_PURPLE_LILAC_KEY = registerKey("light_purple_lilac");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLUM_LILAC_KEY = registerKey("plum_lilac");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIOLET_LILAC_KEY = registerKey("violet_lilac");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_LILAC_KEY = registerKey("white_lilac");

    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_PEONY_KEY = registerKey("black_peony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_PEONY_KEY = registerKey("blue_peony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_PINK_PEONY_KEY = registerKey("dark_pink_peony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FUSCHIA_PEONY_KEY = registerKey("fuschia_peony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGENTA_PEONY_KEY = registerKey("magenta_peony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PASTEL_BLUE_PEONY_KEY = registerKey("pastel_blue_peony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEACH_PEONY_KEY = registerKey("peach_peony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_PEONY_KEY = registerKey("purple_peony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_PEONY_KEY = registerKey("red_peony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPRING_PINK_PEONY_KEY = registerKey("spring_pink_peony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_PEONY_KEY = registerKey("white_peony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_PEONY_KEY = registerKey("yellow_peony");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, WHITE_DANDELION_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_DANDELION)))));
        register(context, PINK_DANDELION_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_DANDELION)))));
        
        register(context, BLUSH_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUSH_POPPY)))));
        register(context, CORAL_REEF_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CORAL_REEF_POPPY)))));
        register(context, CREAM_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CREAM_POPPY)))));
        register(context, DARK_NAVY_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.DARK_NAVY_POPPY)))));
        register(context, DARK_WINE_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.DARK_WINE_POPPY)))));
        register(context, HOT_PINK_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.HOT_PINK_POPPY)))));
        register(context, LAVENDER_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LAVENDER_POPPY)))));
        register(context, ORANGE_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ORANGE_POPPY)))));
        register(context, PEACH_BELLINI_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PEACH_BELLINI_POPPY)))));
        register(context, REDDISH_PINK_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.REDDISH_PINK_POPPY)))));
        register(context, SOFT_YELLOW_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SOFT_YELLOW_POPPY)))));
        register(context, SPA_AQUA_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SPA_AQUA_POPPY)))));
        register(context, TURQUOISE_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.TURQUOISE_POPPY)))));
        register(context, WHITE_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_POPPY)))));
        register(context, WHITE_NAVY_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_WITH_NAVY_CENTER_POPPY)))));
        register(context, WISTERIA_POPPY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WISTERIA_POPPY)))));

        register(context, BLUE_ALLIUM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 3, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_ALLIUM)))));
        register(context, DRUMBSTICK_ALLIUM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 3, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.DRUMBSTICK_ALLIUM)))));
        register(context, PINK_ALLIUM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 3, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_ALLIUM)))));
        register(context, WHITE_ALLIUM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 3, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_ALLIUM)))));
        register(context, YELLOW_ALLIUM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 3, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_ALLIUM)))));

        register(context, PINK_LOV_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(8, 3, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_LOV)))));

        register(context, ORANGE_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ORANGE_ORCHID)))));
        register(context, PINK_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_ORCHID)))));
        register(context, PURPLE_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_ORCHID)))));
        register(context, RED_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RED_ORCHID)))));
        register(context, WHITE_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_ORCHID)))));
        register(context, YELLOW_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_ORCHID)))));

        register(context, BLACK_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLACK_TULIP)))));
        register(context, HOT_PINK_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.HOT_PINK_TULIP)))));
        register(context, PURPLE_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_TULIP)))));
        register(context, SOFT_PINK_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SOFT_PINK_TULIP)))));
        register(context, WINE_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WINE_TULIP)))));
        register(context, YELLOW_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_TULIP)))));

        register(context, LIGHT_BLUE_CORNFLOWER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LIGHT_BLUE_CORNFLOWER)))));
        register(context, LIGHT_PINK_CORNFLOWER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LIGHT_PINK_CORNFLOWER)))));
        register(context, PINK_CORNFLOWER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_CORNFLOWER)))));
        register(context, PLUM_CORNFLOWER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PLUM_CORNFLOWER)))));
        register(context, PURPLE_CORNFLOWER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_CORNFLOWER)))));
        register(context, WHITE_CORNFLOWER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_CORNFLOWER)))));

        register(context, BLACK_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLACK_ROSE_BUSH)))));
        register(context, BLUE_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_ROSE_BUSH)))));
        register(context, BURGUNDY_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BURGUNDY_ROSE_BUSH)))));
        register(context, CORAL_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CORAL_ROSE_BUSH)))));
        register(context, CREAM_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CREAM_ROSE_BUSH)))));
        register(context, DARK_PINK_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.DARK_PINK_ROSE_BUSH)))));
        register(context, GREEN_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GREEN_ROSE_BUSH)))));
        register(context, ORANGE_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ORANGE_ROSE_BUSH)))));
        register(context, PEACH_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PEACH_ROSE_BUSH)))));
        register(context, PINK_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_ROSE_BUSH)))));
        register(context, PURPLE_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_ROSE_BUSH)))));
        register(context, RAINBOW_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RAINBOW_ROSE_BUSH)))));
        register(context, SALMON_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SALMON_ROSE_BUSH)))));
        register(context, WHITE_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_ROSE_BUSH)))));
        register(context, YELLOW_ROSEBUSH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_ROSE_BUSH)))));

        register(context, BLUE_LILAC_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_LILAC)))));
        register(context, LIGHT_PINK_LILAC_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LIGHT_PINK_LILAC)))));
        register(context, LIGHT_PURPLE_LILAC_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LIGHT_PURPLE_LILAC)))));
        register(context, PLUM_LILAC_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PLUM_LILAC)))));
        register(context, VIOLET_LILAC_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.VIOLET_LILAC)))));
        register(context, WHITE_LILAC_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 5, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_LILAC)))));

        register(context, BLACK_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLACK_PEONY)))));
        register(context, BLUE_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_PEONY)))));
        register(context, DARK_PINK_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.DARK_PINK_PEONY)))));
        register(context, FUSCHIA_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.FUSCHIA_PEONY)))));
        register(context, MAGENTA_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.MAGENTA_PEONY)))));
        register(context, PASTEL_BLUE_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PASTEL_BLUE_PEONY)))));
        register(context, PEACH_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PEACH_PEONY)))));
        register(context, PURPLE_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_PEONY)))));
        register(context, RED_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RED_PEONY)))));
        register(context, SPRING_PINK_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SPRING_PINK_PEONY)))));
        register(context, WHITE_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_PEONY)))));
        register(context, YELLOW_PEONY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_PEONY)))));


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