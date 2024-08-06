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
    public static final Item BLUSH_POPPY_ITEM = registerItem("blush_poppy_item", new Item(new FabricItemSettings()));

    private static void addItemsToTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(BLUSH_POPPY_ITEM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BunchaFlowers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BunchaFlowers.LOGGER.info("Registering Mod Items for " + BunchaFlowers.MOD_ID);
    }
}
