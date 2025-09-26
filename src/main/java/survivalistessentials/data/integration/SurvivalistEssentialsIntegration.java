package survivalistessentials.data.integration;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import net.minecraft.world.item.Items;
import net.minecraftforge.registries.RegisterEvent;

public final class SurvivalistEssentialsIntegration {

    public static final String AYCE_MODID = "allyoucaneat";
    public static final String BMO_MODID = "biomemakeover";
    public static final String BOP_MODID = "biomesoplenty";
    public static final String BOTANIA_MODID = "botania";
    public static final String FT_MODID = "fruitfulfun";
    public static final String IE_MODID = "immersiveengineering";
    public static final String QUARK_MODID = "quark";
    public static final String SGC_MODID = "sushigocrafting";
    public static final String TCON_MODID = "tconstruct";
    public static final String WS_MODID = "watersource";
    public static final String AN_MODID = "ars_nouveau";
    public static final String EXNIHILO_MODID = "exnihilosequentia";
    public static final String UNDERGARDEN_MODID = "undergarden";
    public static final String DYNAMICTREES_MODID = "dynamictrees";
    public static final String BYG_MODID = "biomeswevegone";
    public static final String TF_MODID = "twilightforest";
    public static final String ECO_MODID = "ecologics";
    public static final String AQUA_MODID = "aquaculture";
    public static final String BAP_MODID = "betteranimalsplus";
    public static final String ALEX_MODID = "alexsmobs";
    public static final String PATCHOULI_MODID = "patchouli";
    public static final String MALUM_MODID = "malum";
    public static final String IFD_MODID = "iceandfire";
    public static final String TS_MODID = "tinkersurvival";
    public static final String REGIONS_MODID = "regions_unexplored";
    public static final String TETRA_MODID = "tetra";
    public static final String MINECRAFT_MODID = "minecraft";
    public static final String CREATE_MODID = "create";
    public static final String CARRYON_MODID = "carryon";

    public static Item AQUA_DRIFTWOOD;
    public static Item CHERRY_PLANKS;
    public static Item CITRUS_PLANKS;
    public static Item BMO_ANCIENT_OAK_PLANKS;
    public static Item BMO_BLIGHTED_BALSA_PLANKS;
    public static Item BMO_SWAMP_CYPRESS_PLANKS;
    public static Item BMO_WILLOW_PLANKS;
    public static Item BOP_DEAD_PLANKS;
    public static Item BOP_FIR_PLANKS;
    public static Item BOP_HELLBARK_PLANKS;
    public static Item BOP_JACARANDA_PLANKS;
    public static Item BOP_MAGIC_PLANKS;
    public static Item BOP_MAHOGANY_PLANKS;
    public static Item BOP_PALM_PLANKS;
    public static Item BOP_REDWOOD_PLANKS;
    public static Item BOP_UMBRAN_PLANKS;
    public static Item BOP_WILLOW_PLANKS;
    public static Item BOTANIA_DREAMWOOD_PLANKS;
    public static Item BOTANIA_LIVINGWOOD_PLANKS;
    public static Item IE_STICK_TREATED;
    public static Item QUARK_AZALEA_PLANKS;
    public static Item QUARK_BLOSSOM_PLANKS;
    public static Item AYCE_HAZEL_PLANKS;
    public static Item TCON_BLOODSHROOM_PLANKS;
    public static Item TCON_GREENHEART_PLANKS;
    public static Item TCON_SKYROOT_PLANKS;
    public static Item WS_PALM_TREE_PLANKS;
    public static Item AN_ARCHWOOD_PLANKS;
    public static Item UNDERGARDEN_SMOGSTEM_PLANKS;
    public static Item UNDERGARDEN_WIGGLEWOOD_PLANKS;
    public static Item UNDERGARDEN_GRONGLE_PLANKS;
    public static Item BYG_WHITE_MANGROVE_PLANKS;
    public static Item BYG_REDWOOD_PLANKS;
    public static Item BYG_BLUE_ENCHANTED_PLANKS;
    public static Item BYG_GREEN_ENCHANTED_PLANKS;
    public static Item BYG_MAHOGANY_PLANKS;
    public static Item BYG_BAOBAB_PLANKS;
    public static Item BYG_JACARANDA_PLANKS;
    public static Item BYG_CYPRESS_PLANKS;
    public static Item BYG_PALM_PLANKS;
    public static Item BYG_EBONY_PLANKS;
    public static Item BYG_RAINBOW_EUCALYPTUS_PLANKS;
    public static Item BYG_ASPEN_PLANKS;
    public static Item BYG_FIR_PLANKS;
    public static Item BYG_SKYRIS_PLANKS;
    public static Item BYG_CIKA_PLANKS;
    public static Item BYG_HOLLY_PLANKS;
    public static Item BYG_MAPLE_PLANKS;
    public static Item BYG_PINE_PLANKS;
    public static Item BYG_WILLOW_PLANKS;
    public static Item BYG_WITCH_HAZEL_PLANKS;
    public static Item BYG_ZELKOVA_PLANKS;
    public static Item BYG_IRONWOOD_PLANKS;
    public static Item BYG_SAKURA_PLANKS;
    public static Item BYG_PALO_VERDE_PLANKS;
    public static Item BYG_FLORUS_STEM;
    public static Item ECO_COCONUT_PLANKS;
    public static Item ECO_WALNUT_PLANKS;
    public static Item ECO_AZALEA_PLANKS;
    public static Item ECO_FLOWERING_AZALEA_PLANKS;
    public static Item TF_CANOPY_PLANKS;
    public static Item TF_DARK_PLANKS;
    public static Item TF_MANGROVE_PLANKS;
    public static Item TF_MINING_PLANKS;
    public static Item TF_SORTING_PLANKS;
    public static Item TF_TIME_PLANKS;
    public static Item TF_TRANSFORMATION_PLANKS;
    public static Item TF_TWILIGHT_OAK_PLANKS;
    public static Item MALUM_RUNEWOOD_PLANKS;
    public static Item MALUM_SOULWOOD_PLANKS;
    public static Item IFD_DREADWOOD_PLANKS;
    public static Item RU_ALPHA_PLANKS;
    public static Item RU_ACACIA_BRANCH;
    public static Item RU_BAOBAB_PLANKS;
    public static Item RU_BAOBAB_BRANCH;
    public static Item RU_BIRCH_BRANCH;
    public static Item RU_BLACKWOOD_PLANKS;
    public static Item RU_BLACKWOOD_BRANCH;
    public static Item RU_BIOSHROOM_PLANKS;
    public static Item RU_BLUE_BIOSHROOM_PLANKS;
    public static Item RU_BRIMWOOD_PLANKS;
    public static Item RU_BRIMWOOD_BRANCH;
    public static Item RU_COBALT_PLANKS;
    public static Item RU_COBALT_BRANCH;
    public static Item RU_CYPRESS_PLANKS;
    public static Item RU_CYPRESS_BRANCH;
    public static Item RU_DARK_OAK_BRANCH;
    public static Item RU_DEAD_PLANKS;
    public static Item RU_DEAD_BRANCH;
    public static Item RU_EUCALYPTUS_PLANKS;
    public static Item RU_EUCALYPTUS_BRANCH;
    public static Item RU_GREEN_BIOSHROOM_PLANKS;
    public static Item RU_JOSHUA_PLANKS;
    public static Item RU_JOSHUA_BRANCH;
    public static Item RU_JUNGLE_BRANCH;
    public static Item RU_KAPOK_PLANKS;
    public static Item RU_KAPOK_BRANCH;
    public static Item RU_LARCH_PLANKS;
    public static Item RU_LARCH_BRANCH;
    public static Item RU_MANGROVE_BRANCH;
    public static Item RU_MAGNOLIA_PLANKS;
    public static Item RU_MAGNOLIA_BRANCH;
    public static Item RU_MAPLE_PLANKS;
    public static Item RU_MAPLE_BRANCH;
    public static Item RU_MAUVE_PLANKS;
    public static Item RU_MAUVE_BRANCH;
    public static Item RU_OAK_BRANCH;
    public static Item RU_PALM_PLANKS;
    public static Item RU_PALM_BRANCH;
    public static Item RU_PINE_PLANKS;
    public static Item RU_PINE_BRANCH;
    public static Item RU_PINK_BIOSHROOM_PLANKS;
    public static Item RU_REDWOOD_PLANKS;
    public static Item RU_REDWOOD_BRANCH;
    public static Item RU_SILVER_BIRCH_BRANCH;
    public static Item RU_SOCOTRA_PLANKS;
    public static Item RU_SOCOTRA_BRANCH;
    public static Item RU_SPRUCE_BRANCH;
    public static Item RU_WILLOW_PLANKS;
    public static Item RU_WILLOW_BRANCH;
    public static Item RU_YELLOW_BIOSHROOM_PLANKS;

    // TF Messed up log/wood crap
    public static ResourceLocation TF_CANOPY_LOG;
    public static ResourceLocation TF_CANOPY_STRIPPED_LOG;
    public static ResourceLocation TF_CANOPY_WOOD;
    public static ResourceLocation TF_CANOPY_STRIPPED_WOOD;
    public static ResourceLocation TF_DARK_LOG;
    public static ResourceLocation TF_DARK_STRIPPED_LOG;
    public static ResourceLocation TF_DARK_WOOD;
    public static ResourceLocation TF_DARK_STRIPPED_WOOD;
    public static ResourceLocation TF_MANGROVE_LOG;
    public static ResourceLocation TF_MANGROVE_STRIPPED_LOG;
    public static ResourceLocation TF_MANGROVE_WOOD;
    public static ResourceLocation TF_MANGROVE_STRIPPED_WOOD;
    public static ResourceLocation TF_MINING_LOG;
    public static ResourceLocation TF_MINING_STRIPPED_LOG;
    public static ResourceLocation TF_MINING_WOOD;
    public static ResourceLocation TF_MINING_STRIPPED_WOOD;
    public static ResourceLocation TF_SORTING_LOG;
    public static ResourceLocation TF_SORTING_STRIPPED_LOG;
    public static ResourceLocation TF_SORTING_WOOD;
    public static ResourceLocation TF_SORTING_STRIPPED_WOOD;
    public static ResourceLocation TF_TIME_LOG;
    public static ResourceLocation TF_TIME_STRIPPED_LOG;
    public static ResourceLocation TF_TIME_WOOD;
    public static ResourceLocation TF_TIME_STRIPPED_WOOD;
    public static ResourceLocation TF_TRANSFORMATION_LOG;
    public static ResourceLocation TF_TRANSFORMATION_STRIPPED_LOG;
    public static ResourceLocation TF_TRANSFORMATION_WOOD;
    public static ResourceLocation TF_TRANSFORMATION_STRIPPED_WOOD;
    public static ResourceLocation TF_TWILIGHT_OAK_LOG;
    public static ResourceLocation TF_TWILIGHT_OAK_STRIPPED_LOG;
    public static ResourceLocation TF_TWILIGHT_OAK_WOOD;
    public static ResourceLocation TF_TWILIGHT_OAK_STRIPPED_WOOD;

    // And now Biome Makeover messed up crap
    public static ResourceLocation BMO_ANCIENT_OAK_LOG;
    public static ResourceLocation BMO_STRIPPED_ANCIENT_OAK_LOG;
    public static ResourceLocation BMO_ANCIENT_OAK_WOOD;
    public static ResourceLocation BMO_STRIPPED_ANCIENT_OAK_WOOD;
    public static ResourceLocation BMO_BLIGHTED_BALSA_LOG;
    public static ResourceLocation BMO_STRIPPED_BLIGHTED_BALSA_LOG;
    public static ResourceLocation BMO_BLIGHTED_BALSA_WOOD;
    public static ResourceLocation BMO_STRIPPED_BLIGHTED_BALSA_WOOD;
    public static ResourceLocation BMO_SWAMP_CYPRESS_LOG;
    public static ResourceLocation BMO_STRIPPED_SWAMP_CYPRESS_LOG;
    public static ResourceLocation BMO_SWAMP_CYPRESS_WOOD;
    public static ResourceLocation BMO_STRIPPED_SWAMP_CYPRESS_WOOD;
    public static ResourceLocation BMO_WILLOW_LOG;
    public static ResourceLocation BMO_STRIPPED_WILLOW_LOG;
    public static ResourceLocation BMO_WILLOW_WOOD;
    public static ResourceLocation BMO_STRIPPED_WILLOW_WOOD;

    public static RegisterEvent.RegisterHelper<Item> ITEM_REGISTRY;

    public static void init(RegisterEvent.RegisterHelper<Item> registry) {
        ITEM_REGISTRY = registry;

        String dataGen = System.getenv("DATA_GEN");
        if (dataGen != null && dataGen.contains("all")) {
            AQUA_DRIFTWOOD = registerItem(aquaLoc("driftwood"));
            CHERRY_PLANKS = registerItem(ftLoc("cherry_planks"));
            CITRUS_PLANKS = registerItem(ftLoc("citrus_planks"));
            BMO_ANCIENT_OAK_PLANKS = registerItem(bmoLoc("ancient_oak_planks"));
            BMO_BLIGHTED_BALSA_PLANKS = registerItem(bmoLoc("blighted_balsa_planks"));
            BMO_SWAMP_CYPRESS_PLANKS = registerItem(bmoLoc("swamp_cypress_planks"));
            BMO_WILLOW_PLANKS = registerItem(bmoLoc("willow_planks"));
            BOP_DEAD_PLANKS = registerItem(bopLoc("dead_planks"));
            BOP_FIR_PLANKS = registerItem(bopLoc("fir_planks"));
            BOP_HELLBARK_PLANKS = registerItem(bopLoc("hellbark_planks"));
            BOP_JACARANDA_PLANKS = registerItem(bopLoc("jacaranda_planks"));
            BOP_MAGIC_PLANKS = registerItem(bopLoc("magic_planks"));
            BOP_MAHOGANY_PLANKS = registerItem(bopLoc("mahogany_planks"));
            BOP_PALM_PLANKS = registerItem(bopLoc("palm_planks"));
            BOP_REDWOOD_PLANKS = registerItem(bopLoc("redwood_planks"));
            BOP_UMBRAN_PLANKS = registerItem(bopLoc("umbran_planks"));
            BOP_WILLOW_PLANKS = registerItem(bopLoc("willow_planks"));
            BOTANIA_DREAMWOOD_PLANKS = registerItem(botaniaLoc("dreamwood_planks"));
            BOTANIA_LIVINGWOOD_PLANKS = registerItem(botaniaLoc("livingwood_planks"));
            IE_STICK_TREATED = registerItem(ieLoc("stick_treated"));
            QUARK_AZALEA_PLANKS = registerItem(qLoc("azalea_planks"));
            QUARK_BLOSSOM_PLANKS = registerItem(qLoc("blossom_planks"));
            AYCE_HAZEL_PLANKS = registerItem(ayceLoc("hazel_planks"));
            TCON_BLOODSHROOM_PLANKS = registerItem(tconLoc("bloodshroom_planks"));
            TCON_GREENHEART_PLANKS = registerItem(tconLoc("greenheart_planks"));
            TCON_SKYROOT_PLANKS = registerItem(tconLoc("skyroot_planks"));
            WS_PALM_TREE_PLANKS = registerItem(wsLoc("palm_tree_planks"));
            AN_ARCHWOOD_PLANKS = registerItem(anLoc("archwood_planks"));
            UNDERGARDEN_GRONGLE_PLANKS = registerItem(undergardenLoc("grongle_planks"));
            UNDERGARDEN_SMOGSTEM_PLANKS = registerItem(undergardenLoc("smogstem_planks"));
            UNDERGARDEN_WIGGLEWOOD_PLANKS = registerItem(undergardenLoc("wigglewood_planks"));
            BYG_WHITE_MANGROVE_PLANKS = registerItem(bygLoc("white_mangrove_planks"));
            BYG_REDWOOD_PLANKS = registerItem(bygLoc("redwood_planks"));
            BYG_BLUE_ENCHANTED_PLANKS = registerItem(bygLoc("blue_enchanted_planks"));
            BYG_GREEN_ENCHANTED_PLANKS = registerItem(bygLoc("green_enchanted_planks"));
            BYG_MAHOGANY_PLANKS = registerItem(bygLoc("mahogany_planks"));
            BYG_BAOBAB_PLANKS = registerItem(bygLoc("baobab_planks"));
            BYG_JACARANDA_PLANKS = registerItem(bygLoc("jacaranda_planks"));
            BYG_CYPRESS_PLANKS = registerItem(bygLoc("cypress_planks"));
            BYG_PALM_PLANKS = registerItem(bygLoc("palm_planks"));
            BYG_EBONY_PLANKS = registerItem(bygLoc("ebony_planks"));
            BYG_RAINBOW_EUCALYPTUS_PLANKS = registerItem(bygLoc("rainbow_eucalyptus_planks"));
            BYG_ASPEN_PLANKS = registerItem(bygLoc("aspen_planks"));
            BYG_FIR_PLANKS = registerItem(bygLoc("fir_planks"));
            BYG_SKYRIS_PLANKS = registerItem(bygLoc("skyris_planks"));
            BYG_CIKA_PLANKS = registerItem(bygLoc("cika_planks"));
            BYG_HOLLY_PLANKS = registerItem(bygLoc("holly_planks"));
            BYG_MAPLE_PLANKS = registerItem(bygLoc("maple_planks"));
            BYG_PINE_PLANKS = registerItem(bygLoc("pine_planks"));
            BYG_WILLOW_PLANKS = registerItem(bygLoc("willow_planks"));
            BYG_WITCH_HAZEL_PLANKS = registerItem(bygLoc("witch_hazel_planks"));
            BYG_ZELKOVA_PLANKS = registerItem(bygLoc("zelkova_planks"));
            BYG_IRONWOOD_PLANKS = registerItem(bygLoc("ironwood_planks"));
            BYG_SAKURA_PLANKS = registerItem(bygLoc("sakura_planks"));
            BYG_PALO_VERDE_PLANKS = Items.BIRCH_PLANKS.asItem();
            BYG_FLORUS_STEM = registerItem(bygLoc("florus_planks"));
            TF_CANOPY_PLANKS = registerItem(tfLoc("canopy_planks"));
            TF_DARK_PLANKS = registerItem(tfLoc("dark_planks"));
            TF_MANGROVE_PLANKS = registerItem(tfLoc("mangrove_planks"));
            TF_MINING_PLANKS = registerItem(tfLoc("mining_planks"));
            TF_SORTING_PLANKS = registerItem(tfLoc("sorting_planks"));
            TF_TIME_PLANKS = registerItem(tfLoc("time_planks"));
            TF_TRANSFORMATION_PLANKS = registerItem(tfLoc("transformation_planks"));
            TF_TWILIGHT_OAK_PLANKS = registerItem(tfLoc("twilight_oak_planks"));
            ECO_COCONUT_PLANKS = registerItem(ecoLoc("coconut_planks"));
            ECO_WALNUT_PLANKS = registerItem(ecoLoc("walnut_planks"));
            ECO_AZALEA_PLANKS = registerItem(ecoLoc("azalea_planks"));
            ECO_FLOWERING_AZALEA_PLANKS = registerItem(ecoLoc("flowering_azalea_planks"));
            RU_ALPHA_PLANKS = registerItem(regionsLoc("alpha_planks"));
            RU_ACACIA_BRANCH = registerItem(regionsLoc("acacia_branch"));
            RU_BAOBAB_PLANKS = registerItem(regionsLoc("baobab_planks"));
            RU_BAOBAB_BRANCH = registerItem(regionsLoc("baobab_branch"));
            RU_BIRCH_BRANCH = registerItem(regionsLoc("birch_branch"));
            RU_BLACKWOOD_PLANKS = registerItem(regionsLoc("blackwood_planks"));
            RU_BLACKWOOD_BRANCH = registerItem(regionsLoc("blackwood_branch"));
            RU_BIOSHROOM_PLANKS = registerItem(regionsLoc("bioshroom_planks"));
            RU_BLUE_BIOSHROOM_PLANKS = registerItem(regionsLoc("blue_bioshroom_planks"));
            RU_BRIMWOOD_PLANKS = registerItem(regionsLoc("brimwood_planks"));
            RU_BRIMWOOD_BRANCH = registerItem(regionsLoc("brimwood_branch"));
            RU_COBALT_PLANKS = registerItem(regionsLoc("cobalt_planks"));
            RU_COBALT_BRANCH = registerItem(regionsLoc("cobalt_branch"));
            RU_CYPRESS_PLANKS = registerItem(regionsLoc("cypress_planks"));
            RU_CYPRESS_BRANCH = registerItem(regionsLoc("cypress_branch"));
            RU_DARK_OAK_BRANCH = registerItem(regionsLoc("dark_oak_branch"));
            RU_DEAD_PLANKS = registerItem(regionsLoc("dead_planks"));
            RU_DEAD_BRANCH = registerItem(regionsLoc("dead_branch"));
            RU_EUCALYPTUS_PLANKS = registerItem(regionsLoc("eucalyptus_planks"));
            RU_EUCALYPTUS_BRANCH = registerItem(regionsLoc("eucalyptus_branch"));
            RU_GREEN_BIOSHROOM_PLANKS = registerItem(regionsLoc("green_bioshroom_planks"));
            RU_JOSHUA_PLANKS = registerItem(regionsLoc("joshua_planks"));
            RU_JOSHUA_BRANCH = registerItem(regionsLoc("joshua_branch"));
            RU_JUNGLE_BRANCH = registerItem(regionsLoc("jungle_branch"));
            RU_KAPOK_PLANKS = registerItem(regionsLoc("kapok_planks"));
            RU_KAPOK_BRANCH = registerItem(regionsLoc("kapok_branch"));
            RU_LARCH_PLANKS = registerItem(regionsLoc("larch_planks"));
            RU_LARCH_BRANCH = registerItem(regionsLoc("larch_branch"));
            RU_MANGROVE_BRANCH = registerItem(regionsLoc("mangrove_branch"));
            RU_MAGNOLIA_PLANKS = registerItem(regionsLoc("magnolia_planks"));
            RU_MAGNOLIA_BRANCH = registerItem(regionsLoc("magnolia_branch"));
            RU_MAPLE_PLANKS = registerItem(regionsLoc("maple_planks"));
            RU_MAPLE_BRANCH = registerItem(regionsLoc("maple_branch"));
            RU_MAUVE_PLANKS = registerItem(regionsLoc("mauve_planks"));
            RU_MAUVE_BRANCH = registerItem(regionsLoc("mauve_branch"));
            RU_OAK_BRANCH = registerItem(regionsLoc("oak_branch"));
            RU_PALM_PLANKS = registerItem(regionsLoc("palm_planks"));
            RU_PALM_BRANCH = registerItem(regionsLoc("palm_branch"));
            RU_PINE_PLANKS = registerItem(regionsLoc("pine_planks"));
            RU_PINE_BRANCH = registerItem(regionsLoc("pine_branch"));
            RU_PINK_BIOSHROOM_PLANKS = registerItem(regionsLoc("pink_bioshroom_planks"));
            RU_REDWOOD_PLANKS = registerItem(regionsLoc("redwood_planks"));
            RU_REDWOOD_BRANCH = registerItem(regionsLoc("redwood_branch"));
            RU_SILVER_BIRCH_BRANCH = registerItem(regionsLoc("silver_birch_branch"));
            RU_SOCOTRA_PLANKS = registerItem(regionsLoc("socotra_planks"));
            RU_SOCOTRA_BRANCH = registerItem(regionsLoc("socotra_branch"));
            RU_SPRUCE_BRANCH = registerItem(regionsLoc("spruce_branch"));
            RU_WILLOW_PLANKS = registerItem(regionsLoc("willow_planks"));
            RU_WILLOW_BRANCH = registerItem(regionsLoc("willow_branch"));
            RU_YELLOW_BIOSHROOM_PLANKS = registerItem(regionsLoc("yellow_bioshroom_planks"));

            // TF Messed up log/wood crap
            TF_CANOPY_LOG = tfLoc("canopy_log");
            TF_CANOPY_STRIPPED_LOG = tfLoc("stripped_canopy_log");
            TF_CANOPY_WOOD = tfLoc("canopy_wood");
            TF_CANOPY_STRIPPED_WOOD = tfLoc("stripped_canopy_wood");
            TF_DARK_LOG = tfLoc("dark_log");
            TF_DARK_STRIPPED_LOG = tfLoc("stripped_dark_log");
            TF_DARK_WOOD = tfLoc("dark_wood");
            TF_DARK_STRIPPED_WOOD = tfLoc("stripped_dark_wood");
            TF_MANGROVE_LOG = tfLoc("mangrove_log");
            TF_MANGROVE_STRIPPED_LOG = tfLoc("stripped_mangrove_log");
            TF_MANGROVE_WOOD = tfLoc("mangrove_wood");
            TF_MANGROVE_STRIPPED_WOOD = tfLoc("stripped_mangrove_wood");
            TF_MINING_LOG = tfLoc("mining_log");
            TF_MINING_STRIPPED_LOG = tfLoc("stripped_mining_log");
            TF_MINING_WOOD = tfLoc("mining_wood");
            TF_MINING_STRIPPED_WOOD = tfLoc("stripped_mining_wood");
            TF_SORTING_LOG = tfLoc("sorting_log");
            TF_SORTING_STRIPPED_LOG = tfLoc("stripped_sorting_log");
            TF_SORTING_WOOD = tfLoc("sorting_wood");
            TF_SORTING_STRIPPED_WOOD = tfLoc("stripped_sorting_wood");
            TF_TIME_LOG = tfLoc("time_log");
            TF_TIME_STRIPPED_LOG = tfLoc("stripped_time_log");
            TF_TIME_WOOD = tfLoc("time_wood");
            TF_TIME_STRIPPED_WOOD = tfLoc("stripped_time_wood");
            TF_TRANSFORMATION_LOG = tfLoc("transformation_log");
            TF_TRANSFORMATION_STRIPPED_LOG = tfLoc("stripped_transformation_log");
            TF_TRANSFORMATION_WOOD = tfLoc("transformation_wood");
            TF_TRANSFORMATION_STRIPPED_WOOD = tfLoc("stripped_transformation_wood");
            TF_TWILIGHT_OAK_LOG = tfLoc("twilight_oak_log");
            TF_TWILIGHT_OAK_STRIPPED_LOG = tfLoc("stripped_twilight_oak_log");
            TF_TWILIGHT_OAK_WOOD = tfLoc("twilight_oak_wood");
            TF_TWILIGHT_OAK_STRIPPED_WOOD = tfLoc("stripped_twilight_oak_wood");

            /*
             * And now Biome Makeover is doing stupid things ... tags were
             * added for a reason, this is a pattern with multiloader mods that
             * is just getting stupid. Either quit supporting Fabric loader, or
             * figure this shit out, it is going back to 1.12 stupidity.
             */
            BMO_ANCIENT_OAK_LOG = bmoLoc("ancient_oak_log");
            BMO_STRIPPED_ANCIENT_OAK_LOG = bmoLoc("stripped_ancient_oak_log");
            BMO_ANCIENT_OAK_WOOD = bmoLoc("ancient_oak_wood");
            BMO_STRIPPED_ANCIENT_OAK_WOOD = bmoLoc("stripped_ancient_oak_wood");
            BMO_BLIGHTED_BALSA_LOG = bmoLoc("blighted_balsa_log");
            BMO_STRIPPED_BLIGHTED_BALSA_LOG = bmoLoc("stripped_blighted_balsa_log");
            BMO_BLIGHTED_BALSA_WOOD = bmoLoc("blighted_balsa_wood");
            BMO_STRIPPED_BLIGHTED_BALSA_WOOD = bmoLoc("stripped_blighted_balsa_wood");
            BMO_SWAMP_CYPRESS_LOG = bmoLoc("swamp_cypress_log");
            BMO_STRIPPED_SWAMP_CYPRESS_LOG = bmoLoc("stripped_swamp_cypress_log");
            BMO_SWAMP_CYPRESS_WOOD = bmoLoc("swamp_cypress_wood");
            BMO_STRIPPED_SWAMP_CYPRESS_WOOD = bmoLoc("stripped_swamp_cypress_wood");
            BMO_WILLOW_LOG = bmoLoc("willow_log");
            BMO_STRIPPED_WILLOW_LOG = bmoLoc("stripped_willow_log");
            BMO_WILLOW_WOOD = bmoLoc("willow_wood");
            BMO_STRIPPED_WILLOW_WOOD = bmoLoc("stripped_willow_wood");
            MALUM_RUNEWOOD_PLANKS = registerItem(malumLoc("runewood_planks"));
            MALUM_SOULWOOD_PLANKS = registerItem(malumLoc("soulwood_planks"));
            IFD_DREADWOOD_PLANKS = registerItem(ifdLoc("dreadwood_planks"));
        }
    }

    private static Item registerItem(ResourceLocation loc) {
        Item item = (new Item(new Item.Properties()));

        ITEM_REGISTRY.register(loc, item);

        return item;
    }

    public static ResourceLocation bmoLoc(String name) {
        return getLoc(BMO_MODID, name);
    }

    public static ResourceLocation tconLoc(String name) {
        return getLoc(TCON_MODID, name);
    }

    public static ResourceLocation ayceLoc(String name) {
        return getLoc(AYCE_MODID, name);
    }

    public static ResourceLocation qLoc(String name) {
        return getLoc(QUARK_MODID, name);
    }

    public static ResourceLocation bopLoc(String name) {
        return getLoc(BOP_MODID, name);
    }

    public static ResourceLocation botaniaLoc(String name) {
        return getLoc(BOTANIA_MODID, name);
    }

    public static ResourceLocation ftLoc(String name) {
        return getLoc(FT_MODID, name);
    }

    public static ResourceLocation ieLoc(String name) {
        return getLoc(IE_MODID, name);
    }

    public static ResourceLocation sgcLoc(String name) {
        return getLoc(SGC_MODID, name);
    }

    public static ResourceLocation wsLoc(String name) {
        return getLoc(WS_MODID, name);
    }

    public static ResourceLocation anLoc(String name) {
        return getLoc(AN_MODID, name);
    }

    public static ResourceLocation exnihiloLoc(String name) {
        return getLoc(EXNIHILO_MODID, name);
    }

    public static ResourceLocation undergardenLoc(String name) {
        return getLoc(UNDERGARDEN_MODID, name);
    }

    public static ResourceLocation dynamictreesLoc(String name) {
        return getLoc(DYNAMICTREES_MODID, name);
    }

    public static ResourceLocation bygLoc(String name) {
        return getLoc(BYG_MODID, name);
    }

    public static ResourceLocation tfLoc(String name) {
        return getLoc(TF_MODID, name);
    }

    public static ResourceLocation ecoLoc(String name) {
        return getLoc(ECO_MODID, name);
    }

    public static ResourceLocation aquaLoc(String name) {
        return getLoc(AQUA_MODID, name);
    }

    public static ResourceLocation bapLoc(String name) {
        return getLoc(BAP_MODID, name);
    }

    public static ResourceLocation alexLoc(String name) {
        return getLoc(ALEX_MODID, name);
    }

    public static ResourceLocation malumLoc(String name) {
        return getLoc(MALUM_MODID, name);
    }

    public static ResourceLocation ifdLoc(String name) {
        return getLoc(IFD_MODID, name);
    }

    public static ResourceLocation tsLoc(String name) {
        return getLoc(TS_MODID, name);
    }

    public static ResourceLocation regionsLoc(String name) {
        return getLoc(REGIONS_MODID, name);
    }

    public static ResourceLocation tetraLoc(String name) {
        return getLoc(TETRA_MODID, name);
    }

    public static ResourceLocation mcLoc(String name) {
        return getLoc(MINECRAFT_MODID, name);
    }

    private static ResourceLocation getLoc(String modid, String name) {
        return new ResourceLocation(modid, name);
    }

}
