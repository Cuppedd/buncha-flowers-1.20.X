package net.cupped.flowers.datagen;

import net.cupped.flowers.block.ModBlocks;
import net.cupped.flowers.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        LootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.OXEYE_DAISY_CROP).properties(StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 5));
        this.addDrop(ModBlocks.OXEYE_DAISY_CROP, this.cropDrops(ModBlocks.OXEYE_DAISY_CROP, Items.OXEYE_DAISY, ModItems.OXEYE_DAISY_SEEDS, builder2));

        builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.AZURE_BLUET_CROP).properties(StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 5));
        this.addDrop(ModBlocks.AZURE_BLUET_CROP, this.cropDrops(ModBlocks.AZURE_BLUET_CROP, Items.AZURE_BLUET, ModItems.AZURE_BLUET_SEEDS, builder2));

    }
}
