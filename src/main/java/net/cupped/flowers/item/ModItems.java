package net.cupped.flowers.item;

import net.cupped.flowers.BunchaFlowers;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item POPPY_SEEDS = registerItem("poppy_seeds", new Item(new FabricItemSettings()));
    public static final Item DANDELION_SEEDS = registerItem("dandelion_seeds", new Item(new FabricItemSettings()));
    public static final Item ALLIUM_SEEDS = registerItem("allium_seeds", new Item(new FabricItemSettings()));
    public static final Item LOV_SEEDS = registerItem("lov_seeds", new Item(new FabricItemSettings()));
    public static final Item ORCHID_SEEDS = registerItem("orchid_seeds", new Item(new FabricItemSettings()));
    public static final Item TULIP_SEEDS = registerItem("tulip_seeds", new Item(new FabricItemSettings()));
    public static final Item CORNFLOWER_SEEDS = registerItem("cornflower_seeds", new Item(new FabricItemSettings()));
    public static final Item ROSE_SEEDS = registerItem("rose_seeds", new Item(new FabricItemSettings()));
    public static final Item LILAC_SEEDS = registerItem("lilac_seeds", new Item(new FabricItemSettings()));
    public static final Item PEONY_SEEDS = registerItem("peony_seeds", new Item(new FabricItemSettings()));

    private static void addItemsToTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(POPPY_SEEDS);
        entries.add(DANDELION_SEEDS);
        entries.add(ALLIUM_SEEDS);
        entries.add(LOV_SEEDS);
        entries.add(ORCHID_SEEDS);
        entries.add(TULIP_SEEDS);
        entries.add(CORNFLOWER_SEEDS);
        entries.add(ROSE_SEEDS);
        entries.add(LILAC_SEEDS);
        entries.add(PEONY_SEEDS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BunchaFlowers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BunchaFlowers.LOGGER.info("Registering Mod Items for " + BunchaFlowers.MOD_ID);
    }
}
