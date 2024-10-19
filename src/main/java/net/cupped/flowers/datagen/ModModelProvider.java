package net.cupped.flowers.datagen;

import net.cupped.flowers.block.ModBlocks;
import net.cupped.flowers.block.custom.FlowerCropBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerCrop(ModBlocks.OXEYE_DAISY_CROP, FlowerCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.AZURE_BLUET_CROP, FlowerCropBlock.AGE, 0, 1, 2, 3, 4, 5);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
