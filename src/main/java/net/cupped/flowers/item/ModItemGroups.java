package net.cupped.flowers.item;

import net.cupped.flowers.BunchaFlowers;
import net.cupped.flowers.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BUNCHA_FLOWERS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(BunchaFlowers.MOD_ID, "buncha_flowers"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.buncha_flowers"))
                    .icon(() -> new ItemStack(ModBlocks.SOFT_PINK_TULIP)).entries((displayContext, entries) -> {

                        //dandelions
                        entries.add(ModBlocks.WHITE_DANDELION);
                        entries.add(ModBlocks.PINK_DANDELION);

                        //poppies
                        entries.add(ModBlocks.BLUSH_POPPY);
                        entries.add(ModBlocks.CORAL_REEF_POPPY);
                        entries.add(ModBlocks.CREAM_POPPY);
                        entries.add(ModBlocks.DARK_NAVY_POPPY);
                        entries.add(ModBlocks.DARK_WINE_POPPY);
                        entries.add(ModBlocks.HOT_PINK_POPPY);
                        entries.add(ModBlocks.LAVENDER_POPPY);
                        entries.add(ModBlocks.ORANGE_POPPY);
                        entries.add(ModBlocks.PEACH_BELLINI_POPPY);
                        entries.add(ModBlocks.REDDISH_PINK_POPPY);
                        entries.add(ModBlocks.SOFT_YELLOW_POPPY);
                        entries.add(ModBlocks.SPA_AQUA_POPPY);
                        entries.add(ModBlocks.TURQUOISE_POPPY);
                        entries.add(ModBlocks.WHITE_POPPY);
                        entries.add(ModBlocks.WHITE_WITH_NAVY_CENTER_POPPY);
                        entries.add(ModBlocks.WISTERIA_POPPY);

                        //orchids
                        entries.add(ModBlocks.ORANGE_ORCHID);
                        entries.add(ModBlocks.PINK_ORCHID);
                        entries.add(ModBlocks.PURPLE_ORCHID);
                        entries.add(ModBlocks.RED_ORCHID);
                        entries.add(ModBlocks.WHITE_ORCHID);
                        entries.add(ModBlocks.YELLOW_ORCHID);

                        //alliums
                        entries.add(ModBlocks.BLUE_ALLIUM);
                        entries.add(ModBlocks.DRUMBSTICK_ALLIUM);
                        entries.add(ModBlocks.PINK_ALLIUM);
                        entries.add(ModBlocks.WHITE_ALLIUM);
                        entries.add(ModBlocks.YELLOW_ALLIUM);

                        //tulips
                        entries.add(ModBlocks.BLACK_TULIP);
                        entries.add(ModBlocks.HOT_PINK_TULIP);
                        entries.add(ModBlocks.PURPLE_TULIP);
                        entries.add(ModBlocks.SOFT_PINK_TULIP);
                        entries.add(ModBlocks.WINE_TULIP);
                        entries.add(ModBlocks.YELLOW_TULIP);

                        //cornflowers
                        entries.add(ModBlocks.LIGHT_BLUE_CORNFLOWER);
                        entries.add(ModBlocks.LIGHT_PINK_CORNFLOWER);
                        entries.add(ModBlocks.PINK_CORNFLOWER);
                        entries.add(ModBlocks.PLUM_CORNFLOWER);
                        entries.add(ModBlocks.PURPLE_CORNFLOWER);
                        entries.add(ModBlocks.WHITE_CORNFLOWER);

                        //lov
                        entries.add(ModBlocks.PINK_LOV);

                        //lilacs
                        entries.add(ModBlocks.BLUE_LILAC);
                        entries.add(ModBlocks.LIGHT_PINK_LILAC);
                        entries.add(ModBlocks.LIGHT_PURPLE_LILAC);
                        entries.add(ModBlocks.PLUM_LILAC);
                        entries.add(ModBlocks.VIOLET_LILAC);
                        entries.add(ModBlocks.WHITE_LILAC);

                        //rosebushes
                        entries.add(ModBlocks.BLACK_ROSE_BUSH);
                        entries.add(ModBlocks.BLUE_ROSE_BUSH);
                        entries.add(ModBlocks.BURGUNDY_ROSE_BUSH);
                        entries.add(ModBlocks.CORAL_ROSE_BUSH);
                        entries.add(ModBlocks.CREAM_ROSE_BUSH);
                        entries.add(ModBlocks.DARK_PINK_ROSE_BUSH);
                        entries.add(ModBlocks.GREEN_ROSE_BUSH);
                        entries.add(ModBlocks.ORANGE_ROSE_BUSH);
                        entries.add(ModBlocks.PEACH_ROSE_BUSH);
                        entries.add(ModBlocks.PINK_ROSE_BUSH);
                        entries.add(ModBlocks.PURPLE_ROSE_BUSH);
                        entries.add(ModBlocks.RAINBOW_ROSE_BUSH);
                        entries.add(ModBlocks.SALMON_ROSE_BUSH);
                        entries.add(ModBlocks.WHITE_ROSE_BUSH);
                        entries.add(ModBlocks.YELLOW_ROSE_BUSH);

                        //peonies
                        entries.add(ModBlocks.BLACK_PEONY);
                        entries.add(ModBlocks.BLUE_PEONY);
                        entries.add(ModBlocks.DARK_PINK_PEONY);
                        entries.add(ModBlocks.FUSCHIA_PEONY);
                        entries.add(ModBlocks.MAGENTA_PEONY);
                        entries.add(ModBlocks.PASTEL_BLUE_PEONY);
                        entries.add(ModBlocks.PEACH_PEONY);
                        entries.add(ModBlocks.PURPLE_PEONY);
                        entries.add(ModBlocks.RED_PEONY);
                        entries.add(ModBlocks.SPRING_PINK_PEONY);
                        entries.add(ModBlocks.WHITE_PEONY);
                        entries.add(ModBlocks.YELLOW_PEONY);



                    }).build());

    public static final ItemGroup BUNCHA_SEEDS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(BunchaFlowers.MOD_ID, "buncha_seeds"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.buncha_seeds"))
                    .icon(() -> new ItemStack(ModItems.TULIP_SEEDS)).entries((displayContext, entries) -> {

                        //seeds
                        entries.add(ModItems.POPPY_SEEDS);
                        entries.add(ModItems.DANDELION_SEEDS);
                        entries.add(ModItems.ALLIUM_SEEDS);
                        entries.add(ModItems.LOV_SEEDS);
                        entries.add(ModItems.ORCHID_SEEDS);
                        entries.add(ModItems.TULIP_SEEDS);
                        entries.add(ModItems.CORNFLOWER_SEEDS);
                        entries.add(ModItems.ROSE_SEEDS);
                        entries.add(ModItems.LILAC_SEEDS);
                        entries.add(ModItems.PEONY_SEEDS);

                    }).build());

    public static void resgisterItemGroups() {
        BunchaFlowers.LOGGER.info("Registering Item Groups for " + BunchaFlowers.MOD_ID);
    }
}
