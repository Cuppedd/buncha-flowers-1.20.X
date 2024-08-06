package net.cupped.flowers.block;

import net.cupped.flowers.BunchaFlowers;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //poppies
    public static final Block BLUSH_POPPY =registerBlock("blush_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block CORAL_REEF_POPPY =registerBlock("coral_reef_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block CREAM_POPPY =registerBlock("cream_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block DARK_NAVY_POPPY =registerBlock("dark_navy_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block DARK_WINE_POPPY =registerBlock("dark_wine_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block HOT_PINK_POPPY =registerBlock("hot_pink_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block LAVENDER_POPPY =registerBlock("lavender_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block ORANGE_POPPY =registerBlock("orange_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block PEACH_BELLINI_POPPY =registerBlock("peach_bellini_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block REDDISH_PINK_POPPY =registerBlock("reddish_pink_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block SOFT_YELLOW_POPPY =registerBlock("soft_yellow_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block SPA_AQUA_POPPY =registerBlock("spa_aqua_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block TURQUOISE_POPPY =registerBlock("turquoise_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block WHITE_POPPY =registerBlock("white_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block WHITE_WITH_NAVY_CENTER_POPPY =registerBlock("white_with_navy_center_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block WISTERIA_POPPY =registerBlock("wisteria_poppy",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));

    //potted poppies
    public static final Block POTTED_BLUSH_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_blush_poppy"),
            new FlowerPotBlock(BLUSH_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_CORAL_REEF_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_coral_reef_poppy"),
            new FlowerPotBlock(CORAL_REEF_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_CREAM_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_cream_poppy"),
            new FlowerPotBlock(CREAM_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_DARK_NAVY_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_dark_navy_poppy"),
            new FlowerPotBlock(DARK_NAVY_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_DARK_WINE_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_dark_wine_poppy"),
            new FlowerPotBlock(DARK_WINE_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_HOT_PINK_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_hot_pink_poppy"),
            new FlowerPotBlock(HOT_PINK_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_LAVENDER_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_lavender_poppy"),
            new FlowerPotBlock(LAVENDER_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_ORANGE_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_orange_poppy"),
            new FlowerPotBlock(ORANGE_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_PEACH_BELLINI_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_peach_bellini_poppy"),
            new FlowerPotBlock(PEACH_BELLINI_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_REDDISH_PINK_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_reddish_pink_poppy"),
            new FlowerPotBlock(REDDISH_PINK_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_SOFT_YELLOW_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_soft_yellow_poppy"),
            new FlowerPotBlock(SOFT_YELLOW_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_SPA_AQUA_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_spa_aqua_poppy"),
            new FlowerPotBlock(SPA_AQUA_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_TURQUOISE_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_turquoise_poppy"),
            new FlowerPotBlock(TURQUOISE_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_WHITE_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_white_poppy"),
            new FlowerPotBlock(WHITE_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_WHITE_WITH_NAVY_CENTER_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_white_with_navy_center_poppy"),
            new FlowerPotBlock(WHITE_WITH_NAVY_CENTER_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block POTTED_WISTERIA_POPPY =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_wisteria_poppy"),
            new FlowerPotBlock(WISTERIA_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));

    //dandelions
    public static final Block WHITE_DANDELION =registerBlock("white_dandelion",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.DANDELION).nonOpaque().noCollision()));
    public static final Block PINK_DANDELION =registerBlock("pink_dandelion",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.DANDELION).nonOpaque().noCollision()));

    //potted dandelions
    public static final Block POTTED_WHITE_DANDELION =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_white_dandelion"),
            new FlowerPotBlock(WHITE_DANDELION, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION).nonOpaque()));
    public static final Block POTTED_PINK_DANDELION =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_pink_dandelion"),
            new FlowerPotBlock(PINK_DANDELION, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION).nonOpaque()));

    //alliums
    public static final Block BLUE_ALLIUM =registerBlock("blue_allium",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block DRUMBSTICK_ALLIUM =registerBlock("drumbstick_allium",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block PINK_ALLIUM =registerBlock("pink_allium",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block WHITE_ALLIUM =registerBlock("white_allium",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block YELLOW_ALLIUM =registerBlock("yellow_allium",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));

    //potted alliums
    public static final Block POTTED_BLUE_ALLIUM =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_blue_allium"),
            new FlowerPotBlock(BLUE_ALLIUM, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_DRUMBSTICK_ALLIUM =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_drumbstick_allium"),
            new FlowerPotBlock(DRUMBSTICK_ALLIUM, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_PINK_ALLIUM =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_pink_allium"),
            new FlowerPotBlock(PINK_ALLIUM, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_WHITE_ALLIUM =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_white_allium"),
            new FlowerPotBlock(WHITE_ALLIUM, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_YELLOW_ALLIUM =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_yellow_allium"),
            new FlowerPotBlock(YELLOW_ALLIUM, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    //lily of the valleys
    public static final Block PINK_LOV =registerBlock("pink_lov",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));

    //potted lily of the valleys
    public static final Block POTTED_PINK_LOV =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_pink_lov"),
            new FlowerPotBlock(PINK_LOV, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    //orchids
    public static final Block ORANGE_ORCHID =registerBlock("orange_orchid",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block PINK_ORCHID =registerBlock("pink_orchid",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block PURPLE_ORCHID =registerBlock("purple_orchid",
            new FlowerBlock(StatusEffects.LUCK, 1,
                        FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block RED_ORCHID =registerBlock("red_orchid",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block WHITE_ORCHID =registerBlock("white_orchid",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block YELLOW_ORCHID =registerBlock("yellow_orchid",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));

    //potted orchid
    public static final Block POTTED_ORANGE_ORCHID =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_orange_orchid"),
            new FlowerPotBlock(ORANGE_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));
    public static final Block POTTED_PINK_ORCHID =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_pink_orchid"),
            new FlowerPotBlock(PINK_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));
    public static final Block POTTED_PURPLE_ORCHID =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_purple_orchid"),
            new FlowerPotBlock(PURPLE_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));
    public static final Block POTTED_RED_ORCHID =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_red_orchid"),
            new FlowerPotBlock(RED_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));
    public static final Block POTTED_WHITE_ORCHID =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_white_orchid"),
            new FlowerPotBlock(WHITE_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));
    public static final Block POTTED_YELLOW_ORCHID =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_yellow_orchid"),
            new FlowerPotBlock(YELLOW_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));

    //tulips
    public static final Block BLACK_TULIP =registerBlock("black_tulip",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.ORANGE_TULIP).nonOpaque().noCollision()));
    public static final Block HOT_PINK_TULIP =registerBlock("hot_pink_tulip",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.ORANGE_TULIP).nonOpaque().noCollision()));
    public static final Block PURPLE_TULIP =registerBlock("purple_tulip",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.ORANGE_TULIP).nonOpaque().noCollision()));
    public static final Block SOFT_PINK_TULIP =registerBlock("soft_pink_tulip",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.ORANGE_TULIP).nonOpaque().noCollision()));
    public static final Block WINE_TULIP =registerBlock("wine_tulip",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.ORANGE_TULIP).nonOpaque().noCollision()));
    public static final Block YELLOW_TULIP =registerBlock("yellow_tulip",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.ORANGE_TULIP).nonOpaque().noCollision()));

    //potted tulips
    public static final Block POTTED_BLACK_TULIP =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_black_tulip"),
            new FlowerPotBlock(BLACK_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_ORANGE_TULIP).nonOpaque()));
    public static final Block POTTED_HOT_PINK_TULIP =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_hot_pink_tulip"),
            new FlowerPotBlock(HOT_PINK_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_ORANGE_TULIP).nonOpaque()));
    public static final Block POTTED_PURPLE_TULIP =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_purple_tulip"),
            new FlowerPotBlock(PURPLE_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_ORANGE_TULIP).nonOpaque()));
    public static final Block POTTED_SOFT_PINK_TULIP =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_soft_pink_tulip"),
            new FlowerPotBlock(SOFT_PINK_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_ORANGE_TULIP).nonOpaque()));
    public static final Block POTTED_WINE_TULIP =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_wine_tulip"),
            new FlowerPotBlock(WINE_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_ORANGE_TULIP).nonOpaque()));
    public static final Block POTTED_YELLOW_TULIP =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_yellow_tulip"),
            new FlowerPotBlock(YELLOW_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_ORANGE_TULIP).nonOpaque()));

    //cornflowers
    public static final Block LIGHT_BLUE_CORNFLOWER =registerBlock("light_blue_cornflower",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.CORNFLOWER).nonOpaque().noCollision()));
    public static final Block LIGHT_PINK_CORNFLOWER =registerBlock("light_pink_cornflower",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.CORNFLOWER).nonOpaque().noCollision()));
    public static final Block PINK_CORNFLOWER =registerBlock("pink_cornflower",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.CORNFLOWER).nonOpaque().noCollision()));
    public static final Block PLUM_CORNFLOWER =registerBlock("plum_cornflower",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.CORNFLOWER).nonOpaque().noCollision()));
    public static final Block PURPLE_CORNFLOWER =registerBlock("purple_cornflower",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.CORNFLOWER).nonOpaque().noCollision()));
    public static final Block WHITE_CORNFLOWER =registerBlock("white_cornflower",
            new FlowerBlock(StatusEffects.LUCK, 1,
                    FabricBlockSettings.copyOf(Blocks.CORNFLOWER).nonOpaque().noCollision()));

    //potted cornflowers
    public static final Block POTTED_LIGHT_BLUE_CORNFLOWER =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_light_blue_cornflower"),
            new FlowerPotBlock(LIGHT_BLUE_CORNFLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER).nonOpaque()));
    public static final Block POTTED_LIGHT_PINK_CORNFLOWER =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_light_pink_cornflower"),
            new FlowerPotBlock(LIGHT_PINK_CORNFLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER).nonOpaque()));
    public static final Block POTTED_PINK_CORNFLOWER =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_pink_cornflower"),
            new FlowerPotBlock(PINK_CORNFLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER).nonOpaque()));
    public static final Block POTTED_PLUM_CORNFLOWER =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_plum_cornflower"),
            new FlowerPotBlock(PLUM_CORNFLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER).nonOpaque()));
    public static final Block POTTED_PURPLE_CORNFLOWER =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_purple_cornflower"),
            new FlowerPotBlock(PURPLE_CORNFLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER).nonOpaque()));
    public static final Block POTTED_WHITE_CORNFLOWER =Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, "potted_white_cornflower"),
            new FlowerPotBlock(WHITE_CORNFLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER).nonOpaque()));

    //rose
    public static final Block BLACK_ROSE_BUSH =registerBlock("black_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block BLUE_ROSE_BUSH =registerBlock("blue_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block BURGUNDY_ROSE_BUSH =registerBlock("burgundy_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block CORAL_ROSE_BUSH =registerBlock("coral_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block CREAM_ROSE_BUSH =registerBlock("cream_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block DARK_PINK_ROSE_BUSH =registerBlock("dark_pink_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block GREEN_ROSE_BUSH =registerBlock("green_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block ORANGE_ROSE_BUSH =registerBlock("orange_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PEACH_ROSE_BUSH =registerBlock("peach_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PINK_ROSE_BUSH =registerBlock("pink_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PURPLE_ROSE_BUSH =registerBlock("purple_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block RAINBOW_ROSE_BUSH =registerBlock("rainbow_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block SALMON_ROSE_BUSH =registerBlock("salmon_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block WHITE_ROSE_BUSH =registerBlock("white_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block YELLOW_ROSE_BUSH =registerBlock("yellow_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));

    //lilacs
    public static final Block BLUE_LILAC =registerBlock("blue_lilac",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).nonOpaque().noCollision()));
    public static final Block LIGHT_PINK_LILAC =registerBlock("light_pink_lilac",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).nonOpaque().noCollision()));
    public static final Block LIGHT_PURPLE_LILAC =registerBlock("light_purple_lilac",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).nonOpaque().noCollision()));
    public static final Block PLUM_LILAC =registerBlock("plum_lilac",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).nonOpaque().noCollision()));
    public static final Block VIOLET_LILAC =registerBlock("violet_lilac",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).nonOpaque().noCollision()));
    public static final Block WHITE_LILAC =registerBlock("white_lilac",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).nonOpaque().noCollision()));

    //peonies
    public static final Block BLACK_PEONY =registerBlock("black_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));
    public static final Block BLUE_PEONY =registerBlock("blue_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));
    public static final Block DARK_PINK_PEONY =registerBlock("dark_pink_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));
    public static final Block FUSCHIA_PEONY =registerBlock("fuschia_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));
    public static final Block MAGENTA_PEONY =registerBlock("magenta_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));
    public static final Block PASTEL_BLUE_PEONY =registerBlock("pastel_blue_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));
    public static final Block PEACH_PEONY =registerBlock("peach_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));
    public static final Block PURPLE_PEONY =registerBlock("purple_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));
    public static final Block RED_PEONY =registerBlock("red_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));
    public static final Block SPRING_PINK_PEONY =registerBlock("spring_pink_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));
    public static final Block WHITE_PEONY =registerBlock("white_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));
    public static final Block YELLOW_PEONY =registerBlock("yellow_peony",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision()));

    //helpers
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BunchaFlowers.MOD_ID, name), block);
    }

    private static Item registerBlockItem (String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BunchaFlowers.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BunchaFlowers.LOGGER.info("Registering ModBlocks for " + BunchaFlowers.MOD_ID);
    }
}
