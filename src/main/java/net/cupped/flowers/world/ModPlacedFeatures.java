package net.cupped.flowers.world;

import net.cupped.flowers.BunchaFlowers;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> WHITE_DANDELION_PLACED_KEY = registerKey("white_dandelion_placed");
    public static final RegistryKey<PlacedFeature> PINK_DANDELION_PLACED_KEY = registerKey("pink_dandelion_placed");

    public static final RegistryKey<PlacedFeature> BLUSH_POPPY_PLACED_KEY = registerKey("blush_poppy_placed");
    public static final RegistryKey<PlacedFeature> CORAL_REEF_POPPY_PLACED_KEY = registerKey("coral_reef_poppy_placed");
    public static final RegistryKey<PlacedFeature> CREAM_POPPY_PLACED_KEY = registerKey("cream_poppy_placed");
    public static final RegistryKey<PlacedFeature> DARK_NAVY_POPPY_PLACED_KEY = registerKey("dark_navy_poppy_placed");
    public static final RegistryKey<PlacedFeature> DARK_WINE_POPPY_PLACED_KEY = registerKey("dark_wine_poppy_placed");
    public static final RegistryKey<PlacedFeature> HOT_PINK_POPPY_PLACED_KEY = registerKey("hot_pink_poppy_placed");
    public static final RegistryKey<PlacedFeature> LAVENDER_POPPY_PLACED_KEY = registerKey("lavender_poppy_placed");
    public static final RegistryKey<PlacedFeature> ORANGE_POPPY_PLACED_KEY = registerKey("orange_poppy_placed");
    public static final RegistryKey<PlacedFeature> PEACH_BELLINI_POPPY_PLACED_KEY = registerKey("peach_bellini_poppy_placed");
    public static final RegistryKey<PlacedFeature> REDDISH_PINK_POPPY_PLACED_KEY = registerKey("reddish_pink_poppy_placed");
    public static final RegistryKey<PlacedFeature> SOFT_YELLOW_POPPY_PLACED_KEY = registerKey("soft_yellow_poppy_placed");
    public static final RegistryKey<PlacedFeature> SPA_AQUA_POPPY_PLACED_KEY = registerKey("spa_aqua_poppy_placed");
    public static final RegistryKey<PlacedFeature> TURQUOISE_POPPY_PLACED_KEY = registerKey("turquoise_poppy_placed");
    public static final RegistryKey<PlacedFeature> WHITE_POPPY_PLACED_KEY = registerKey("white_poppy_placed");
    public static final RegistryKey<PlacedFeature> WHITE_NAVY_POPPY_PLACED_KEY = registerKey("white_navy_poppy_placed");
    public static final RegistryKey<PlacedFeature> WISTERIA_POPPY_PLACED_KEY = registerKey("wisteria_poppy_placed");

    public static final RegistryKey<PlacedFeature> BLUE_ALLIUM_PLACED_KEY = registerKey("blue_allium_placed");
    public static final RegistryKey<PlacedFeature> DRUMBSTICK_ALLIUM_PLACED_KEY = registerKey("drumbstick_allium_placed");
    public static final RegistryKey<PlacedFeature> PINK_ALLIUM_PLACED_KEY = registerKey("pink_allium_placed");
    public static final RegistryKey<PlacedFeature> WHITE_ALLIUM_PLACED_KEY = registerKey("white_allium_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_ALLIUM_PLACED_KEY = registerKey("yellow_allium_placed");

    public static final RegistryKey<PlacedFeature> PINK_LOV_PLACED_KEY = registerKey("pink_lov_placed");

    public static final RegistryKey<PlacedFeature> ORANGE_ORCHID_PLACED_KEY = registerKey("orange_orchid_placed");
    public static final RegistryKey<PlacedFeature> PINK_ORCHID_PLACED_KEY = registerKey("pink_orchid_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_ORCHID_PLACED_KEY = registerKey("purple_orchid_placed");
    public static final RegistryKey<PlacedFeature> RED_ORCHID_PLACED_KEY = registerKey("red_orchid_placed");
    public static final RegistryKey<PlacedFeature> WHITE_ORCHID_PLACED_KEY = registerKey("white_orchid_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_ORCHID_PLACED_KEY = registerKey("yellow_orchid_placed");

    public static final RegistryKey<PlacedFeature> BLACK_TULIP_PLACED_KEY = registerKey("black_tulip_placed");
    public static final RegistryKey<PlacedFeature> HOT_PINK_TULIP_PLACED_KEY = registerKey("hot_pink_tulip_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_TULIP_PLACED_KEY = registerKey("purple_tulip_placed");
    public static final RegistryKey<PlacedFeature> SOFT_PINK_TULIP_PLACED_KEY = registerKey("soft_pink_tulip_placed");
    public static final RegistryKey<PlacedFeature> WINE_TULIP_PLACED_KEY = registerKey("wine_tulip_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_TULIP_PLACED_KEY = registerKey("yellow_tulip_placed");

    public static final RegistryKey<PlacedFeature> LIGHT_BLUE_CORNFLOWER_PLACED_KEY = registerKey("light_blue_cornflower_placed");
    public static final RegistryKey<PlacedFeature> LIGHT_PINK_CORNFLOWER_PLACED_KEY = registerKey("light_pink_cornflower_placed");
    public static final RegistryKey<PlacedFeature> PINK_CORNFLOWER_PLACED_KEY = registerKey("pink_cornflower_placed");
    public static final RegistryKey<PlacedFeature> PLUM_CORNFLOWER_PLACED_KEY = registerKey("plum_cornflower_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_CORNFLOWER_PLACED_KEY = registerKey("purple_cornflower_placed");
    public static final RegistryKey<PlacedFeature> WHITE_CORNFLOWER_PLACED_KEY = registerKey("white_cornflower_placed");

    public static final RegistryKey<PlacedFeature> BLACK_ROSEBUSH_PLACED_KEY = registerKey("black_rosebush_placed");
    public static final RegistryKey<PlacedFeature> BLUE_ROSEBUSH_PLACED_KEY = registerKey("blue_rosebush_placed");
    public static final RegistryKey<PlacedFeature> BURGUNDY_ROSEBUSH_PLACED_KEY = registerKey("burgundy_rosebush_placed");
    public static final RegistryKey<PlacedFeature> CORAL_ROSEBUSH_PLACED_KEY = registerKey("coral_rosebush_placed");
    public static final RegistryKey<PlacedFeature> CREAM_ROSEBUSH_PLACED_KEY = registerKey("cream_rosebush_placed");
    public static final RegistryKey<PlacedFeature> DARK_PINK_ROSEBUSH_PLACED_KEY = registerKey("dark_pink_rosebush_placed");
    public static final RegistryKey<PlacedFeature> GREEN_ROSEBUSH_PLACED_KEY = registerKey("green_rosebush_placed");
    public static final RegistryKey<PlacedFeature> ORANGE_ROSEBUSH_PLACED_KEY = registerKey("orange_rosebush_placed");
    public static final RegistryKey<PlacedFeature> PEACH_ROSEBUSH_PLACED_KEY = registerKey("peach_rosebush_placed");
    public static final RegistryKey<PlacedFeature> PINK_ROSEBUSH_PLACED_KEY = registerKey("pink_rosebush_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_ROSEBUSH_PLACED_KEY = registerKey("purple_rosebush_placed");
    public static final RegistryKey<PlacedFeature> RAINBOW_ROSEBUSH_PLACED_KEY = registerKey("rainbow_rosebush_placed");
    public static final RegistryKey<PlacedFeature> SALMON_ROSEBUSH_PLACED_KEY = registerKey("salmon_rosebush_placed");
    public static final RegistryKey<PlacedFeature> WHITE_ROSEBUSH_PLACED_KEY = registerKey("white_rosebush_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_ROSEBUSH_PLACED_KEY = registerKey("yellow_rosebush_placed");

    public static final RegistryKey<PlacedFeature> BLUE_LILAC_PLACED_KEY = registerKey("blue_lilac_placed");
    public static final RegistryKey<PlacedFeature> LIGHT_PINK_LILAC_PLACED_KEY = registerKey("light_pink_lilac_placed");
    public static final RegistryKey<PlacedFeature> LIGHT_PURPLE_LILAC_PLACED_KEY = registerKey("light_purple_lilac_placed");
    public static final RegistryKey<PlacedFeature> PLUM_LILAC_PLACED_KEY = registerKey("plum_lilac_placed");
    public static final RegistryKey<PlacedFeature> VIOLET_LILAC_PLACED_KEY = registerKey("violet_lilac_placed");
    public static final RegistryKey<PlacedFeature> WHITE_LILAC_PLACED_KEY = registerKey("white_lilac_placed");

    public static final RegistryKey<PlacedFeature> BLACK_PEONY_PLACED_KEY = registerKey("black_peony_placed");
    public static final RegistryKey<PlacedFeature> BLUE_PEONY_PLACED_KEY = registerKey("blue_peony_placed");
    public static final RegistryKey<PlacedFeature> DARK_PINK_PEONY_PLACED_KEY = registerKey("dark_pink_peony_placed");
    public static final RegistryKey<PlacedFeature> FUSCHIA_PEONY_PLACED_KEY = registerKey("fuschia_peony_placed");
    public static final RegistryKey<PlacedFeature> MAGENTA_PEONY_PLACED_KEY = registerKey("magenta_peony_placed");
    public static final RegistryKey<PlacedFeature> PASTEL_BLUE_PEONY_PLACED_KEY = registerKey("pastel_blue_peony_placed");
    public static final RegistryKey<PlacedFeature> PEACH_PEONY_PLACED_KEY = registerKey("peach_peony_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_PEONY_PLACED_KEY = registerKey("purple_peony_placed");
    public static final RegistryKey<PlacedFeature> RED_PEONY_PLACED_KEY = registerKey("red_peony_placed");
    public static final RegistryKey<PlacedFeature> SPRING_PINK_PEONY_PLACED_KEY = registerKey("spring_pink_peony_placed");
    public static final RegistryKey<PlacedFeature> WHITE_PEONY_PLACED_KEY = registerKey("white_peony_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_PEONY_PLACED_KEY = registerKey("yellow_peony_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, WHITE_DANDELION_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_DANDELION_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PINK_DANDELION_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_DANDELION_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, BLUSH_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUSH_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CORAL_REEF_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CORAL_REEF_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CREAM_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CREAM_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, DARK_NAVY_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DARK_NAVY_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, DARK_WINE_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DARK_WINE_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, HOT_PINK_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HOT_PINK_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, LAVENDER_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LAVENDER_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, ORANGE_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORANGE_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PEACH_BELLINI_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PEACH_BELLINI_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, REDDISH_PINK_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.REDDISH_PINK_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SOFT_YELLOW_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SOFT_YELLOW_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SPA_AQUA_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SPA_AQUA_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, TURQUOISE_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TURQUOISE_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_NAVY_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_NAVY_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WISTERIA_POPPY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WISTERIA_POPPY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, BLUE_ALLIUM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_ALLIUM_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, DRUMBSTICK_ALLIUM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DRUMBSTICK_ALLIUM_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PINK_ALLIUM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_ALLIUM_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_ALLIUM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_ALLIUM_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, YELLOW_ALLIUM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_ALLIUM_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, PINK_LOV_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_LOV_KEY),
                RarityFilterPlacementModifier.of(2), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, ORANGE_ORCHID_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORANGE_ORCHID_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PINK_ORCHID_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_ORCHID_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PURPLE_ORCHID_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_ORCHID_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, RED_ORCHID_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_ORCHID_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_ORCHID_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_ORCHID_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, YELLOW_ORCHID_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_ORCHID_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, BLACK_TULIP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLACK_TULIP_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, HOT_PINK_TULIP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HOT_PINK_TULIP_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PURPLE_TULIP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_TULIP_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SOFT_PINK_TULIP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SOFT_PINK_TULIP_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WINE_TULIP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WINE_TULIP_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, YELLOW_TULIP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_TULIP_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, LIGHT_BLUE_CORNFLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LIGHT_BLUE_CORNFLOWER_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, LIGHT_PINK_CORNFLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LIGHT_PINK_CORNFLOWER_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PINK_CORNFLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_CORNFLOWER_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PLUM_CORNFLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PLUM_CORNFLOWER_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PURPLE_CORNFLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_CORNFLOWER_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_CORNFLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_CORNFLOWER_KEY),
                RarityFilterPlacementModifier.of(15), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, BLACK_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLACK_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BLUE_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BURGUNDY_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BURGUNDY_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CORAL_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CORAL_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CREAM_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CREAM_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, DARK_PINK_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DARK_PINK_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, GREEN_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GREEN_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(20), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, ORANGE_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORANGE_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PEACH_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PEACH_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PINK_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PURPLE_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, RAINBOW_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RAINBOW_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(20), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SALMON_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SALMON_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, YELLOW_ROSEBUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_ROSEBUSH_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, BLUE_LILAC_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_LILAC_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, LIGHT_PINK_LILAC_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LIGHT_PINK_LILAC_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, LIGHT_PURPLE_LILAC_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LIGHT_PURPLE_LILAC_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PLUM_LILAC_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PLUM_LILAC_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, VIOLET_LILAC_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VIOLET_LILAC_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_LILAC_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_LILAC_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, BLACK_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLACK_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BLUE_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, DARK_PINK_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DARK_PINK_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, FUSCHIA_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FUSCHIA_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, MAGENTA_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAGENTA_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PASTEL_BLUE_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PASTEL_BLUE_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PEACH_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PEACH_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PURPLE_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, RED_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SPRING_PINK_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SPRING_PINK_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, YELLOW_PEONY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_PEONY_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

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
