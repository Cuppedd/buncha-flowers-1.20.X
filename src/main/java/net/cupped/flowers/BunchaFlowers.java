package net.cupped.flowers;

import net.cupped.flowers.block.ModBlocks;
import net.cupped.flowers.item.ModItemGroups;
import net.cupped.flowers.item.ModItems;
import net.cupped.flowers.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BunchaFlowers implements ModInitializer {
	public static final String MOD_ID = "buncha_flowers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.resgisterItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGeneration();
	}
}