package net.radzratz.eternalitems.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalitems.EternalItems;
import net.radzratz.eternalitems.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EternalItems.MOD_ID);

    public static final Supplier<CreativeModeTab> ETERNAL_ITEMS_TAB = CREATIVE_MODE_TAB.register("eternal_items_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.RATZ_HEAD.get()))
                    .title(Component.translatable("creativetab.eternalitems.eternal_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ANTIMATTER_FUSE);
                        output.accept(Moditems.ANGELS_STRING);
                        output.accept(Moditems.BLACK_HOLE);
                        output.accept(Moditems.CAPACITOR);
                        output.accept(Moditems.COMET_SHARD);
                        output.accept(Moditems.DEMONIC_HEART);
                        output.accept(Moditems.DEVILS_TOOTH);
                        output.accept(Moditems.ETERNAL_VORTEX);
                        output.accept(Moditems.FORGOTTEN_SEA_COIN);
                        output.accept(Moditems.GODS_TEAR);
                        output.accept(Moditems.GREGTASTIC_ATOMIC_PHD);
                        output.accept(Moditems.MULTIPRESS);
                        output.accept(Moditems.RATZ_HEAD);
                        output.accept(Moditems.SILICON);
                        output.accept(Moditems.SERAPHIMS_FEATHER);
                        output.accept(Moditems.SOURCE_MANIFESTATION);
                        output.accept(Moditems.UNDEAD_HAND);
                    }).build());

//Swords
public static final Supplier<CreativeModeTab> ETERNAL_SWORDS_TAB = CREATIVE_MODE_TAB.register("eternal_swords_tab",
        ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.ETERNAL_DARK_SWORD.get()))
                .title(Component.translatable("creativetab.eternalitems.eternal_swords"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(Moditems.COPPER_SWORD);
                    output.accept(Moditems.ETERNAL_DARK_SWORD);
                }).build());

//Pickaxes
public static final Supplier<CreativeModeTab> ETERNAL_PICKAXES_TAB = CREATIVE_MODE_TAB.register("eternal_pickaxe_tab",
        ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.ETERNAL_DARK_PICKAXE.get()))
                .title(Component.translatable("creativetab.eternalitems.eternal_pickaxes"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(Moditems.ETERNAL_DARK_PICKAXE);
                }).build());

//INGOTS
    public static final Supplier<CreativeModeTab> ETERNAL_INGOTS_TAB = CREATIVE_MODE_TAB.register("eternal_ingots_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.STEEL_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_ingots"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ALUMINUM_INGOT);
                        output.accept(Moditems.ETERNAL_DARK_INGOT);
                        output.accept(Moditems.ETERNAL_LIGHT_INGOT);
                        output.accept(Moditems.GRAPHITE_INGOT);
                        output.accept(Moditems.LEAD_INGOT);
                        output.accept(Moditems.STEEL_INGOT);
                        output.accept(Moditems.OSMIUM_INGOT);
                        output.accept(Moditems.PLATINUM_INGOT);
                        output.accept(Moditems.URANIUM_INGOT);
                    }).build());
//NUGGETS
    public static final Supplier<CreativeModeTab> ETERNAL_NUGGETS_TAB = CREATIVE_MODE_TAB.register("eternal_nuggets_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.OSMIUM_NUGGET.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_nuggets"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ALUMINUM_NUGGET);
                        output.accept(Moditems.COPPER_NUGGET);
                        output.accept(Moditems.LEAD_NUGGET);
                        output.accept(Moditems.OSMIUM_NUGGET);
                        output.accept(Moditems.PLATINUM_NUGGET);
                        output.accept(Moditems.URANIUM_NUGGET);
                    }).build());
//RODS
    public static final Supplier<CreativeModeTab> ETERNAL_RODS_TAB = CREATIVE_MODE_TAB.register("eternal_rods_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.ROD_OSMIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_rods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ROD_ALUMINUM);
                        output.accept(Moditems.ROD_COPPER);
                        output.accept(Moditems.ROD_GOLD);
                        output.accept(Moditems.ROD_IRON);
                        output.accept(Moditems.ROD_LEAD);
                        output.accept(Moditems.ROD_OSMIUM);
                        output.accept(Moditems.ROD_PLATINUM);
                        output.accept(Moditems.ROD_URANIUM);
                    }).build());
//PLATES
    public static final Supplier<CreativeModeTab> ETERNAL_PLATES_TAB = CREATIVE_MODE_TAB.register("eternal_plates_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.PLATE_OSMIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_plates"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.PLATE_ALUMINUM);
                        output.accept(Moditems.PLATE_COPPER);
                        output.accept(Moditems.PLATE_GOLD);
                        output.accept(Moditems.PLATE_IRON);
                        output.accept(Moditems.PLATE_LEAD);
                        output.accept(Moditems.PLATE_OSMIUM);
                        output.accept(Moditems.PLATE_PLATINUM);
                        output.accept(Moditems.PLATE_URANIUM);
                    }).build());
//GEARS
    public static final Supplier<CreativeModeTab> ETERNAL_GEARS_TAB = CREATIVE_MODE_TAB.register("eternal_gears_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.ULTIMATE_GEAR.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_gears"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ULTIMATE_GEAR);
                    }).build());
//RAW ORES
    public static final Supplier<CreativeModeTab> ETERNAL_RAW_ORES_TAB = CREATIVE_MODE_TAB.register("eternal_raw_ores_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.RAW_URANIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_raw_ores"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.RAW_ALUMINUM);
                        output.accept(Moditems.RAW_LEAD);
                        output.accept(Moditems.RAW_NICKEL);
                        output.accept(Moditems.RAW_OSMIUM);
                        output.accept(Moditems.RAW_PLATINUM);
                        output.accept(Moditems.RAW_SILVER);
                        output.accept(Moditems.RAW_TIN);
                        output.accept(Moditems.RAW_URANIUM);
                    }).build());
//ORE DUST
    public static final Supplier<CreativeModeTab> ETERNAL_ORE_DUST_TAB = CREATIVE_MODE_TAB.register("eternal_ore_dust_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.OSMIUM_DUST.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_ore_dust"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ALUMINUM_DUST);
                        output.accept(Moditems.COPPER_DUST);
                        output.accept(Moditems.GOLD_DUST);
                        output.accept(Moditems.IRON_DUST);
                        output.accept(Moditems.LEAD_DUST);
                        output.accept(Moditems.OSMIUM_DUST);
                        output.accept(Moditems.PLATINUM_DUST);
                        output.accept(Moditems.URANIUM_DUST);
                    }).build());
//GEMS
    public static final Supplier<CreativeModeTab> ETERNAL_GEMS = CREATIVE_MODE_TAB.register("eternal_gems_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.GEM_SAPPHIRE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tabs"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_gems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.GEM_OBSIDIAN_SHARD);
                        output.accept(Moditems.GEM_ONYX);
                        output.accept(Moditems.GEM_RUBY);
                        output.accept(Moditems.GEM_PERIDOT);
                        output.accept(Moditems.GEM_SAPPHIRE);
                    }).build());
////BLOCKS
//ORE BLOCKS
    public static final Supplier<CreativeModeTab> ETERNAL_ORE_BLOCKS = CREATIVE_MODE_TAB.register("eternal_ore_blocks",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.URANIUM_ORE_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_ore_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ALUMINUM_ORE_BLOCK);
                        output.accept(ModBlocks.LEAD_ORE_BLOCK);
                        output.accept(ModBlocks.URANIUM_ORE_BLOCK);
                        output.accept(ModBlocks.OSMIUM_ORE_BLOCK);
                        output.accept(ModBlocks.PLATINUM_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK);
                    }).build());
//METAL BLOCKS
public static final Supplier<CreativeModeTab> ETERNAL_BLOCKS = CREATIVE_MODE_TAB.register("eternal_blocks",
        ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.OSMIUM_BLOCK.get()))
                .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                .title(Component.translatable("creativetab.eternalitems.eternal_blocks"))
                .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ALUMINUM_BLOCK);
                        output.accept(ModBlocks.LEAD_BLOCK);
                        output.accept(ModBlocks.OSMIUM_BLOCK);
                        output.accept(ModBlocks.PLATINUM_BLOCK);
                        output.accept(ModBlocks.URANIUM_BLOCK);
                }).build());
//RAW ORE BLOCKS
    public static final Supplier<CreativeModeTab> ETERNAL_RAW_ORE_BLOCKS = CREATIVE_MODE_TAB.register("eternal_raw_ore_blocks",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.RAW_OSMIUM_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_raw_ore_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RAW_ALUMINUM_BLOCK);
                        output.accept(ModBlocks.RAW_LEAD_BLOCK);
                        output.accept(ModBlocks.RAW_OSMIUM_BLOCK);
                        output.accept(ModBlocks.RAW_PLATINUM_BLOCK);
                        output.accept(ModBlocks.RAW_URANIUM_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
