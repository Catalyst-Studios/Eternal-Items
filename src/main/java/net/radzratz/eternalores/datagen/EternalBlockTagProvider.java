package net.radzratz.eternalores.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.ModBlocks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EternalBlockTagProvider extends BlockTagsProvider {
    public EternalBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EternalOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
            //PICKAXE
            tag(BlockTags.MINEABLE_WITH_PICKAXE)
                    //ORE BLOCKS
                    .add(ModBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(ModBlocks.AMBER_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get())
                    .add(ModBlocks.APATITE_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get())
                    .add(ModBlocks.CINNABAR_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get())
                    .add(ModBlocks.COBALT_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(ModBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(ModBlocks.LEAD_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(ModBlocks.NICKEL_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(ModBlocks.NITER_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_NITER_ORE_BLOCK.get())
                    .add(ModBlocks.ONYX_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get())
                    .add(ModBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(ModBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(ModBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())
                    .add(ModBlocks.RUBY_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get())
                    .add(ModBlocks.SAPPHIRE_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get())
                    .add(ModBlocks.SULFUR_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get())
                    .add(ModBlocks.TIN_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(ModBlocks.URANIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get())
                    .add(ModBlocks.SILVER_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    .add(ModBlocks.ZINC_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get())
                    .add(ModBlocks.GALLIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get())
                    .add(ModBlocks.PERIDOT_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get())
                    .add(ModBlocks.OBSIDIAN_ORE_BLOCK.get())

                    //METAL BLOCKS
                    .add(ModBlocks.ALUMINUM_BLOCK.get())
                    .add(ModBlocks.BRONZE_BLOCK.get())
                    .add(ModBlocks.COBALT_BLOCK.get())
                    .add(ModBlocks.ELECTRUM_BLOCK.get())
                    .add(ModBlocks.ENDERIUM_BLOCK.get())
                    .add(ModBlocks.INVAR_BLOCK.get())
                    .add(ModBlocks.LEAD_BLOCK.get())
                    .add(ModBlocks.LUMIUM_BLOCK.get())
                    .add(ModBlocks.NICKEL_BLOCK.get())
                    .add(ModBlocks.OSMIUM_BLOCK.get())
                    .add(ModBlocks.PLATINUM_BLOCK.get())
                    .add(ModBlocks.PLUTONIUM_BLOCK.get())
                    .add(ModBlocks.TIN_BLOCK.get())
                    .add(ModBlocks.SIGNALUM_BLOCK.get())
                    .add(ModBlocks.ULTIMATITANIUM_BLOCK.get())
                    .add(ModBlocks.URANIUM_BLOCK.get())
                    .add(ModBlocks.SILVER_BLOCK.get())
                    .add(ModBlocks.GRAPHITE_BLOCK.get())
                    .add(ModBlocks.CONSTANTAN_BLOCK.get())
                    .add(ModBlocks.BRASS_BLOCK.get())
                    .add(ModBlocks.ZINC_BLOCK.get())
                    .add(ModBlocks.STEEL_BLOCK.get())
                    .add(ModBlocks.BLUE_STEEL_BLOCK.get())
                    .add(ModBlocks.GALLIUM_BLOCK.get())
                    .add(ModBlocks.TITANIUM_BLOCK.get())
                    .add(ModBlocks.PEWTER_BLOCK.get())
                    .add(ModBlocks.ROSE_GOLD_BLOCK.get())
                    .add(ModBlocks.BRITANNIA_SILVER_BLOCK.get())

                    //GEM BLOCKS
                    .add(ModBlocks.SAPPHIRE_BLOCK.get())
                    .add(ModBlocks.FLUORITE_BLOCK.get())
                    .add(ModBlocks.APATITE_BLOCK.get())
                    .add(ModBlocks.CINNABAR_BLOCK.get())
                    .add(ModBlocks.AMBER_BLOCK.get())
                    .add(ModBlocks.ONYX_BLOCK.get())
                    .add(ModBlocks.NITER_BLOCK.get())
                    .add(ModBlocks.RUBY_BLOCK.get())
                    .add(ModBlocks.PERIDOT_BLOCK.get())

                    //RAW ORE BLOCKS
                    .add(ModBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(ModBlocks.RAW_COBALT_BLOCK.get())
                    .add(ModBlocks.RAW_LEAD_BLOCK.get())
                    .add(ModBlocks.RAW_NICKEL_BLOCK.get())
                    .add(ModBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(ModBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(ModBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(ModBlocks.RAW_SILVER_BLOCK.get())
                    .add(ModBlocks.SULFUR_BLOCK.get())
                    .add(ModBlocks.RAW_TIN_BLOCK.get())
                    .add(ModBlocks.RAW_URANIUM_BLOCK.get())
                    .add(ModBlocks.RAW_ZINC_BLOCK.get())
                    .add(ModBlocks.RAW_GALLIUM_BLOCK.get());

            tag(BlockTags.NEEDS_STONE_TOOL)
                    .add(ModBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(ModBlocks.TIN_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(ModBlocks.SULFUR_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get());

            tag(BlockTags.NEEDS_IRON_TOOL)
                    //ORE BLOCKS
                    .add(ModBlocks.AMBER_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get())
                    .add(ModBlocks.APATITE_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get())
                    .add(ModBlocks.CINNABAR_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get())
                    .add(ModBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(ModBlocks.LEAD_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(ModBlocks.NICKEL_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(ModBlocks.NITER_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_NITER_ORE_BLOCK.get())
                    .add(ModBlocks.ONYX_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get())
                    .add(ModBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(ModBlocks.RUBY_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get())
                    .add(ModBlocks.SAPPHIRE_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get())
                    .add(ModBlocks.SILVER_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    .add(ModBlocks.ZINC_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get())
                    .add(ModBlocks.GALLIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get())
                    .add(ModBlocks.PERIDOT_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get())
                    .add(ModBlocks.URANIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get())
                    .add(ModBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())

                    //METAL BLOCKS
                    .add(ModBlocks.ALUMINUM_BLOCK.get())
                    .add(ModBlocks.BRONZE_BLOCK.get())
                    .add(ModBlocks.COBALT_BLOCK.get())
                    .add(ModBlocks.ELECTRUM_BLOCK.get())
                    .add(ModBlocks.ENDERIUM_BLOCK.get())
                    .add(ModBlocks.INVAR_BLOCK.get())
                    .add(ModBlocks.LEAD_BLOCK.get())
                    .add(ModBlocks.LUMIUM_BLOCK.get())
                    .add(ModBlocks.NICKEL_BLOCK.get())
                    .add(ModBlocks.OSMIUM_BLOCK.get())
                    .add(ModBlocks.PLATINUM_BLOCK.get())
                    .add(ModBlocks.PLUTONIUM_BLOCK.get())
                    .add(ModBlocks.TIN_BLOCK.get())
                    .add(ModBlocks.SIGNALUM_BLOCK.get())
                    .add(ModBlocks.ULTIMATITANIUM_BLOCK.get())
                    .add(ModBlocks.URANIUM_BLOCK.get())
                    .add(ModBlocks.SILVER_BLOCK.get())
                    .add(ModBlocks.GRAPHITE_BLOCK.get())
                    .add(ModBlocks.CONSTANTAN_BLOCK.get())
                    .add(ModBlocks.BRASS_BLOCK.get())
                    .add(ModBlocks.ZINC_BLOCK.get())
                    .add(ModBlocks.STEEL_BLOCK.get())
                    .add(ModBlocks.BLUE_STEEL_BLOCK.get())
                    .add(ModBlocks.GALLIUM_BLOCK.get())
                    .add(ModBlocks.TITANIUM_BLOCK.get())
                    .add(ModBlocks.PEWTER_BLOCK.get())
                    .add(ModBlocks.ROSE_GOLD_BLOCK.get())
                    .add(ModBlocks.BRITANNIA_SILVER_BLOCK.get())

                    //GEM BLOCKS
                    .add(ModBlocks.SAPPHIRE_BLOCK.get())
                    .add(ModBlocks.FLUORITE_BLOCK.get())
                    .add(ModBlocks.APATITE_BLOCK.get())
                    .add(ModBlocks.CINNABAR_BLOCK.get())
                    .add(ModBlocks.AMBER_BLOCK.get())
                    .add(ModBlocks.ONYX_BLOCK.get())
                    .add(ModBlocks.NITER_BLOCK.get())
                    .add(ModBlocks.RUBY_BLOCK.get())
                    .add(ModBlocks.PERIDOT_BLOCK.get())

                    //RAW ORE BLOCKS
                    .add(ModBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(ModBlocks.RAW_COBALT_BLOCK.get())
                    .add(ModBlocks.RAW_LEAD_BLOCK.get())
                    .add(ModBlocks.RAW_NICKEL_BLOCK.get())
                    .add(ModBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(ModBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(ModBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(ModBlocks.RAW_SILVER_BLOCK.get())
                    .add(ModBlocks.SULFUR_BLOCK.get())
                    .add(ModBlocks.RAW_TIN_BLOCK.get())
                    .add(ModBlocks.RAW_URANIUM_BLOCK.get())
                    .add(ModBlocks.RAW_GALLIUM_BLOCK.get())
                    .add(ModBlocks.RAW_ZINC_BLOCK.get());

            tag(BlockTags.NEEDS_DIAMOND_TOOL)
                    .add(ModBlocks.COBALT_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(ModBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(ModBlocks.OBSIDIAN_ORE_BLOCK.get());

    }
}
