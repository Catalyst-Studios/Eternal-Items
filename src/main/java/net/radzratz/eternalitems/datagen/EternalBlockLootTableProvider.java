package net.radzratz.eternalitems.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.fml.common.Mod;
import net.radzratz.eternalitems.block.ModBlocks;
import net.radzratz.eternalitems.item.Moditems;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class EternalBlockLootTableProvider extends BlockLootSubProvider {
    protected EternalBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //METAL BLOCKS
        dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
        dropSelf(ModBlocks.COBALT_BLOCK.get());
        dropSelf(ModBlocks.LEAD_BLOCK.get());
        dropSelf(ModBlocks.OSMIUM_BLOCK.get());
        dropSelf(ModBlocks.URANIUM_BLOCK.get());
        dropSelf(ModBlocks.ULTIMATITANIUM_BLOCK.get());
        dropSelf(ModBlocks.TIN_BLOCK.get());
        dropSelf(ModBlocks.PLATINUM_BLOCK.get());
        dropSelf(ModBlocks.NICKEL_BLOCK.get());
        //RAW ORE BLOCKS
        dropSelf(ModBlocks.RAW_ALUMINUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_COBALT_BLOCK.get());
        dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        dropSelf(ModBlocks.RAW_NICKEL_BLOCK.get());
        dropSelf(ModBlocks.RAW_OSMIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());
        dropSelf(ModBlocks.SULFUR_BLOCK.get());
        dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        dropSelf(ModBlocks.RAW_URANIUM_BLOCK.get());

        //ORE BLOCK TO RAW ORE
        //ALUMINUM ORE BLOCKS
        add(ModBlocks.ALUMINUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.ALUMINUM_ORE_BLOCK.get(), Moditems.RAW_ALUMINUM.get(),2,5));
        //add(ModBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get(), block -> createMultipleOreDrop(ModBlocks.ALUMINUM_ORE_BLOCK.get(), Moditems.RAW_ALUMINUM.get(),2,5));
        //COBALT ORE BLOCKS
        add(ModBlocks.COBALT_ORE_BLOCK.get(), block -> createOreDrop(ModBlocks.COBALT_ORE_BLOCK.get(), Moditems.RAW_COBALT.get()));
        add(ModBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get(), block -> createOreDrop(ModBlocks.COBALT_ORE_BLOCK.get(), Moditems.RAW_COBALT.get()));
        //LEAD ORE BLOCKS
        add(ModBlocks.LEAD_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.LEAD_ORE_BLOCK.get(), Moditems.RAW_LEAD.get(),1,3));
        add(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get(), Moditems.RAW_LEAD.get(),1,3));
        //NICKEL ORE BLOCKS
        add(ModBlocks.NICKEL_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.NICKEL_ORE_BLOCK.get(), Moditems.RAW_NICKEL.get(),2,5));
        add(ModBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get(), Moditems.RAW_NICKEL.get(),2,5));
        //OSMIUM ORE BLOCKS
        add(ModBlocks.OSMIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.OSMIUM_ORE_BLOCK.get(), Moditems.RAW_OSMIUM.get(), 2, 4));
        add(ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get(), Moditems.RAW_OSMIUM.get(), 2,4));
        //PLATINUM ORE BLOCKS
        add(ModBlocks.PLATINUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.PLATINUM_ORE_BLOCK.get(), Moditems.RAW_PLATINUM.get(),1,5));
        add(ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get(), Moditems.RAW_PLATINUM.get(),1,5));
        //SULFUR
        add(ModBlocks.SULFUR_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.SULFUR_ORE_BLOCK.get(), Moditems.SULFUR.get(),3,7));
        add(ModBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get(), Moditems.SULFUR.get(),3,7));
        //TIN ORE BLOCKS
        add(ModBlocks.TIN_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.TIN_ORE_BLOCK.get(), Moditems.RAW_TIN.get(),2,6));
        add(ModBlocks.DEEPSLATE_TIN_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_TIN_ORE_BLOCK.get(), Moditems.RAW_TIN.get(),2,6));
        //URANIUM ORE BLOCKS
        add(ModBlocks.URANIUM_ORE_BLOCK.get(), block -> createOreDrop(ModBlocks.URANIUM_ORE_BLOCK.get(), Moditems.RAW_URANIUM.get()));
        add(ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get(), Moditems.RAW_URANIUM.get()));

        //GEMS
        //FLUORITE TO GEM
        add(ModBlocks.FLUORITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.FLUORITE_ORE_BLOCK.get(), Moditems.FLUORITE.get(), 1,5));
        add(ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get(), Moditems.FLUORITE.get(),1,5));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, LootItem.lootTableItem(item)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE))));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
