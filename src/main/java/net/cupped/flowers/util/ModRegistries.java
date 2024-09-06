package net.cupped.flowers.util;

import net.cupped.flowers.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class ModRegistries {

    public static void registerModStuffs() {
        registerCustomTrades();
    }

    private static void registerCustomTrades() {
        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.BLUSH_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.CORAL_REEF_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.CREAM_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.DARK_NAVY_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.DARK_WINE_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.HOT_PINK_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.LAVENDER_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.ORANGE_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.PEACH_BELLINI_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.REDDISH_PINK_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.SOFT_YELLOW_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.SPA_AQUA_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.TURQUOISE_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.WHITE_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.WHITE_WITH_NAVY_CENTER_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.WISTERIA_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.PINK_DANDELION, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.WHITE_DANDELION, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.BLUE_ALLIUM, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.DRUMBSTICK_ALLIUM, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.PINK_ALLIUM, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.WHITE_ALLIUM, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.YELLOW_ALLIUM, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.PINK_LOV, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.ORANGE_ORCHID, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.PINK_ORCHID, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.PURPLE_ORCHID, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.RED_ORCHID, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.WHITE_ORCHID, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.YELLOW_ORCHID, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.BLACK_TULIP, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.HOT_PINK_POPPY, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.PURPLE_TULIP, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.SOFT_PINK_TULIP, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.WINE_TULIP, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.YELLOW_TULIP, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.LIGHT_BLUE_CORNFLOWER, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.LIGHT_PINK_CORNFLOWER, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.PINK_CORNFLOWER, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.PLUM_CORNFLOWER, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.PURPLE_CORNFLOWER, 1), 12, 2, 0.02f
            ));
        });

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModBlocks.WHITE_CORNFLOWER, 1), 12, 2, 0.02f
            ));
        });

    }

}
