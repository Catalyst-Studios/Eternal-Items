package net.radzratz.eternalores.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.ModBlocks;

import java.util.List;

public class EternalConfiguredFeatures {
    //Aluminum
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINUM_ORE_KEY = registerKey("aluminum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ALUMINUM_ORE_KEY = registerKey("nether_aluminum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ALUMINUM_ORE_KEY = registerKey("end_aluminum_ore");
    //Amber
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AMBER_ORE_KEY = registerKey("amber_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_AMBER_ORE_KEY = registerKey("nether_amber_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_AMBER_ORE_KEY = registerKey("end_amber_ore");
    //Apatite
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_APATITE_ORE_KEY = registerKey("apatite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_APATITE_ORE_KEY = registerKey("nether_apatite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_APATITE_ORE_KEY = registerKey("end_apatite_ore");
    //Cinnabar
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CINNABAR_ORE_KEY = registerKey("cinnabar_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CINNABAR_ORE_KEY = registerKey("nether_cinnabar_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_CINNABAR_ORE_KEY = registerKey("end_cinnabar_ore");
    //Cobalt
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COBALT_ORE_KEY = registerKey("nether_cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_COBALT_ORE_KEY = registerKey("end_cobalt_ore");
    //Fluorite
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FLUORITE_ORE_KEY = registerKey("fluorite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_FLUORITE_ORE_KEY = registerKey("nether_fluorite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_FLUORITE_ORE_KEY = registerKey("end_fluorite_ore");
    //Gallium
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GALLIUM_ORE_KEY = registerKey("gallium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GALLIUM_ORE_KEY = registerKey("nether_gallium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_GALLIUM_ORE_KEY = registerKey("end_gallium_ore");
    //Lead
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LEAD_ORE_KEY = registerKey("nether_lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LEAD_ORE_KEY = registerKey("end_lead_ore");
    //Nickel
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NICKEL_ORE_KEY = registerKey("nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_NICKEL_ORE_KEY = registerKey("nether_nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_NICKEL_ORE_KEY = registerKey("end_nickel_ore");
    //Niter
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NITER_ORE_KEY = registerKey("niter_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_NITER_ORE_KEY = registerKey("nether_niter_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_NITER_ORE_KEY = registerKey("end_niter_ore");
    //Onyx
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ONYX_ORE_KEY = registerKey("onyx_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ONYX_ORE_KEY = registerKey("nether_onyx_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ONYX_ORE_KEY = registerKey("end_onyx_ore");
    //Osmium
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OSMIUM_ORE_KEY = registerKey("osmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_OSMIUM_ORE_KEY = registerKey("nether_osmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_OSMIUM_ORE_KEY = registerKey("end_osmium_ore");
    //Peridot
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PERIDOT_ORE_KEY = registerKey("peridot_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PERIDOT_ORE_KEY = registerKey("nether_peridot_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PERIDOT_ORE_KEY = registerKey("end_peridot_ore");
    //Platinum
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PLATINUM_ORE_KEY = registerKey("nether_platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PLATINUM_ORE_KEY = registerKey("end_platinum_ore");
    //Plutonium
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLUTONIUM_ORE_KEY = registerKey("plutonium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PLUTONIUM_ORE_KEY = registerKey("nether_plutonium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PLUTONIUM_ORE_KEY = registerKey("end_plutonium_ore");
    //Ruby
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RUBY_ORE_KEY = registerKey("end_ruby_ore");
    //Sapphire
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY = registerKey("nether_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAPPHIRE_ORE_KEY = registerKey("end_sapphire_ore");
    //Silver
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE_KEY = registerKey("nether_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SILVER_ORE_KEY = registerKey("end_silver_ore");
    //Sulfur
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SULFUR_ORE_KEY = registerKey("sulfur_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SULFUR_ORE_KEY = registerKey("nether_sulfur_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SULFUR_ORE_KEY = registerKey("end_sulfur_ore");
    //Tin
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TIN_ORE_KEY = registerKey("nether_tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_TIN_ORE_KEY = registerKey("end_tin_ore");
    //Uranium
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_URANIUM_ORE_KEY = registerKey("uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_URANIUM_ORE_KEY = registerKey("nether_uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_URANIUM_ORE_KEY = registerKey("end_uranium_ore");
    //Zinc
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZINC_ORE_KEY = registerKey("zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ZINC_ORE_KEY = registerKey("nether_zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ZINC_ORE_KEY = registerKey("end_zinc_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        //RuleTest netherReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        //RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        //ALUMINUM ORES
        List<OreConfiguration.TargetBlockState> overworldAluminumOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.ALUMINUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                ModBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAluminumOres,12));
        //register(context, NETHER_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_ALUMINUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_ALUMINUM_ORE_BLOCK.get().defaultBlockState(9)));

        //AMBER
        List<OreConfiguration.TargetBlockState> overworldAmberOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.AMBER_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAmberOres,12));
        //register(context, NETHER_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_AMBER_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_AMBER_ORE_BLOCK.get().defaultBlockState(9)));

        //APATITE ORES
        List<OreConfiguration.TargetBlockState> overworldApatiteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.APATITE_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldApatiteOres,12));
        //register(context, NETHER_APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_APATITE_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_APATITE_ORE_BLOCK.get().defaultBlockState(9)));

        //CINNABAR ORES
        List<OreConfiguration.TargetBlockState> overworldCinnabarOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.CINNABAR_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCinnabarOres,12));
        //register(context, NETHER_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_CINNABAR_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_CINNABAR_ORE_BLOCK.get().defaultBlockState(9)));

        //COBALT ORES
        List<OreConfiguration.TargetBlockState> overworldCobaltOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.COBALT_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres,12));
        //register(context, NETHER_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_COBALT_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_COBALT_ORE_BLOCK.get().defaultBlockState(9)));

        //FLUORITE ORES
        List<OreConfiguration.TargetBlockState> overworldFluoriteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.FLUORITE_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldFluoriteOres,12));
        //register(context, NETHER_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_FLUORITE_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_FLUORITE_ORE_BLOCK.get().defaultBlockState(9)));

        //GALLIUM ORES
        List<OreConfiguration.TargetBlockState> overworldGalliumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.GALLIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_GALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGalliumOres,12));
        //register(context, NETHER_GALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_GALLIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_GALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_GALLIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Lead
        List<OreConfiguration.TargetBlockState> overworldLeadOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.LEAD_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLeadOres,12));
        //register(context, NETHER_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_LEAD_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_LEAD_ORE_BLOCK.get().defaultBlockState(9)));

        //Nickel
        List<OreConfiguration.TargetBlockState> overworldNickelOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.NICKEL_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNickelOres,12));
        //register(context, NETHER_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_NICKEL_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_NICKEL_ORE_BLOCK.get().defaultBlockState(9)));

        //Niter
        List<OreConfiguration.TargetBlockState> overworldNiterOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.NITER_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_NITER_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_NITER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNiterOres,12));
        //register(context, NETHER_NITER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_NITER_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_NITER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_NITER_ORE_BLOCK.get().defaultBlockState(9)));

        //Onyx
        List<OreConfiguration.TargetBlockState> overworldOnyxOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.ONYX_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_ONYX_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOnyxOres,12));
        //register(context, NETHER_ONYX_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_ONYX_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_ONYX_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_ONYX_ORE_BLOCK.get().defaultBlockState(9)));

        //Osmium
        List<OreConfiguration.TargetBlockState> overworldOsmiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.OSMIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOsmiumOres,12));
        //register(context, NETHER_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_OSMIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_OSMIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Peridot
        List<OreConfiguration.TargetBlockState> overworldPeridotOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.PERIDOT_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPeridotOres,12));
        //register(context, NETHER_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_PERIDOT_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_PERIDOT_ORE_BLOCK.get().defaultBlockState(9)));

        //Platinum
        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.PLATINUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres,12));
        //register(context, NETHER_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_PLATINUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_PLATINUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Plutonium
        List<OreConfiguration.TargetBlockState> overworldPlutoniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.PLUTONIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_PLUTONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlutoniumOres,12));
        //register(context, NETHER_PLUTONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_PLUTONIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_PLUTONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_PLUTONIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Ruby
        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.RUBY_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres,12));
        //register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_RUBY_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_RUBY_ORE_BLOCK.get().defaultBlockState(9)));

        //Sapphire
        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SAPPHIRE_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres,12));
        //register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_SAPPHIRE_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_SAPPHIRE_ORE_BLOCK.get().defaultBlockState(9)));

        //Silver
        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SILVER_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres,12));
        //register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_SILVER_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_SILVER_ORE_BLOCK.get().defaultBlockState(9)));

        //Sulfur
        List<OreConfiguration.TargetBlockState> overworldSulfurOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SULFUR_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSulfurOres,12));
        //register(context, NETHER_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_SULFUR_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_SULFUR_ORE_BLOCK.get().defaultBlockState(9)));

        //Tin
        List<OreConfiguration.TargetBlockState> overworldTinOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.TIN_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_TIN_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres,12));
        //register(context, NETHER_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_TIN_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_TIN_ORE_BLOCK.get().defaultBlockState(9)));

        //Uranium
        List<OreConfiguration.TargetBlockState> overworldUraniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.URANIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUraniumOres,12));
        //register(context, NETHER_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_URANIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_URANIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Zinc
        List<OreConfiguration.TargetBlockState> overworldZincOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.ZINC_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(overworldZincOres,12));
        //register(context, NETHER_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_ZINC_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_ZINC_ORE_BLOCK.get().defaultBlockState(9)));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(EternalOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register
            (BootstrapContext<ConfiguredFeature<?, ?>> context,
             ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}