package net.ceoofgoogle.createclothes.init;

import net.ceoofgoogle.createclothes.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CreateClothesModItems {
    public static final DeferredRegister<Item> REGISTRY;
    public static final RegistryObject<Item> CROWN;
    public static final RegistryObject<Item> BUCKET_HAT;
    public static final RegistryObject<Item> CAP;
    public static final RegistryObject<Item> OFFICER_CAP;
    public static final RegistryObject<Item> OFFICER_TUNIC;
    public static final RegistryObject<Item> REDCOAT;
    public static final RegistryObject<Item> TRICORN;
    public static final RegistryObject<Item> BLACK_BOOTS;
    public static final RegistryObject<Item> GRAY_BOOTS;
    public static final RegistryObject<Item> BROWN_BOOTS;
    public static final RegistryObject<Item> GREEN_BOOTS;
    public static final RegistryObject<Item> PLAINS_HELMET;
    public static final RegistryObject<Item> PLAINS_TUNIC;
    public static final RegistryObject<Item> PLAINS_PANTS;
    public static final RegistryObject<Item> PLAINS_BOOTS;
    public static final RegistryObject<Item> FOREST_HELMET;
    public static final RegistryObject<Item> FOREST_VEST;
    public static final RegistryObject<Item> FOREST_PANTS;
    public static final RegistryObject<Item> FOREST_BOOTS;
    public static final RegistryObject<Item> TAIGA_HELMET;
    public static final RegistryObject<Item> TAIGA_TUNIC;
    public static final RegistryObject<Item> TAIGA_PANTS;
    public static final RegistryObject<Item> TAIGA_BOOTS;
    public static final RegistryObject<Item> SAVANNA_HELMET;
    public static final RegistryObject<Item> SAVANNA_TUNIC;
    public static final RegistryObject<Item> SAVANNA_PANTS;
    public static final RegistryObject<Item> SAVANNA_BOOTS;
    public static final RegistryObject<Item> DESERT_HELMET;
    public static final RegistryObject<Item> DESERT_TUNIC;
    public static final RegistryObject<Item> DESERT_PANTS;
    public static final RegistryObject<Item> DESERT_BOOTS;
    public static final RegistryObject<Item> SNOW_HELMET;
    public static final RegistryObject<Item> SNOW_COAT;
    public static final RegistryObject<Item> SNOW_PANTS;
    public static final RegistryObject<Item> SNOW_BOOTS;
    public static final RegistryObject<Item> WATER_HELMET;
    public static final RegistryObject<Item> WATER_TUNIC;
    public static final RegistryObject<Item> WATER_PANTS;
    public static final RegistryObject<Item> WATER_BOOTS;
    public static final RegistryObject<Item> MESA_HELMET;
    public static final RegistryObject<Item> MESA_TUNIC;
    public static final RegistryObject<Item> MESA_PANTS;
    public static final RegistryObject<Item> MESA_BOOTS;
    public static final RegistryObject<Item> DIRT_HELMET;
    public static final RegistryObject<Item> DIRT_TUNIC;
    public static final RegistryObject<Item> DIRT_PANTS;
    public static final RegistryObject<Item> DIRT_BOOTS;

    public CreateClothesModItems() {
    }

    private static RegistryObject<Item> block (RegistryObject < Block > block) {
        return REGISTRY.register(block.getId().getPath(), () -> {
            return new BlockItem((Block) block.get(), new Item.Properties());
        });
    }

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "createclothes");
        CROWN = REGISTRY.register("crown", () -> {return new CrownItem.Helmet();});
        BUCKET_HAT = REGISTRY.register("bucket_hat", () -> {return new BucketHatItem.Helmet();});
        CAP = REGISTRY.register("cap", () -> {return new CapItem.Helmet();});
        OFFICER_CAP = REGISTRY.register("officer_cap", () -> {return new OfficerItem.Helmet();});
        OFFICER_TUNIC = REGISTRY.register("officer_tunic", () -> {return new OfficerItem.Chestplate();});
        TRICORN = REGISTRY.register("tricorn", () -> {return new TricornItem.Helmet();});
        REDCOAT = REGISTRY.register("redcoat", () -> {return new RedcoatItem.Chestplate();});
        BLACK_BOOTS = REGISTRY.register("black_boots", () -> {return new BlackBootsItem.Boots();});
        GRAY_BOOTS = REGISTRY.register("gray_boots", () -> {return new GrayBootsItem.Boots();});
        BROWN_BOOTS = REGISTRY.register("brown_boots", () -> {return new BrownBootsItem.Boots();});
        GREEN_BOOTS = REGISTRY.register("green_boots", () -> {return new GreenBootsItem.Boots();});
        PLAINS_HELMET = REGISTRY.register("plains_helmet", () -> {return new PlainsCamoItem.Helmet();});
        PLAINS_TUNIC = REGISTRY.register("plains_tunic", () -> {return new PlainsCamoItem.Chestplate();});
        PLAINS_PANTS = REGISTRY.register("plains_pants", () -> {return new PlainsCamoItem.Leggings();});
        PLAINS_BOOTS = REGISTRY.register("plains_boots", () -> {return new PlainsCamoItem.Boots();});
        FOREST_HELMET = REGISTRY.register("forest_helmet", () -> {return new ForestCamoItem.Helmet();});
        FOREST_VEST = REGISTRY.register("forest_vest", () -> {return new ForestCamoItem.Chestplate();});
        FOREST_PANTS = REGISTRY.register("forest_pants", () -> {return new ForestCamoItem.Leggings();});
        FOREST_BOOTS = REGISTRY.register("forest_boots", () -> {return new ForestCamoItem.Boots();});
        TAIGA_HELMET = REGISTRY.register("taiga_helmet", () -> {return new TaigaCamoItem.Helmet();});
        TAIGA_TUNIC = REGISTRY.register("taiga_tunic", () -> {return new TaigaCamoItem.Chestplate();});
        TAIGA_PANTS = REGISTRY.register("taiga_pants", () -> {return new TaigaCamoItem.Leggings();});
        TAIGA_BOOTS = REGISTRY.register("taiga_boots", () -> {return new TaigaCamoItem.Boots();});
        SAVANNA_HELMET = REGISTRY.register("savanna_helmet", () -> {return new SavannaCamoItem.Helmet();});
        SAVANNA_TUNIC = REGISTRY.register("savanna_tunic", () -> {return new SavannaCamoItem.Chestplate();});
        SAVANNA_PANTS = REGISTRY.register("savanna_pants", () -> {return new SavannaCamoItem.Leggings();});
        SAVANNA_BOOTS = REGISTRY.register("savanna_boots", () -> {return new SavannaCamoItem.Boots();});
        DESERT_HELMET = REGISTRY.register("desert_helmet", () -> {return new DesertCamoItem.Helmet();});
        DESERT_TUNIC = REGISTRY.register("desert_tunic", () -> {return new DesertCamoItem.Chestplate();});
        DESERT_PANTS = REGISTRY.register("desert_pants", () -> {return new DesertCamoItem.Leggings();});
        DESERT_BOOTS = REGISTRY.register("desert_boots", () -> {return new DesertCamoItem.Boots();});
        SNOW_HELMET = REGISTRY.register("snow_helmet", () -> {return new SnowCamoItem.Helmet();});
        SNOW_COAT = REGISTRY.register("snow_coat", () -> {return new SnowCamoItem.Chestplate();});
        SNOW_PANTS = REGISTRY.register("snow_pants", () -> {return new SnowCamoItem.Leggings();});
        SNOW_BOOTS = REGISTRY.register("snow_boots", () -> {return new SnowCamoItem.Boots();});
        WATER_HELMET = REGISTRY.register("water_helmet", () -> {return new WaterCamoItem.Helmet();});
        WATER_TUNIC = REGISTRY.register("water_tunic", () -> {return new WaterCamoItem.Chestplate();});
        WATER_PANTS = REGISTRY.register("water_pants", () -> {return new WaterCamoItem.Leggings();});
        WATER_BOOTS = REGISTRY.register("water_boots", () -> {return new WaterCamoItem.Boots();});
        MESA_HELMET = REGISTRY.register("mesa_helmet", () -> {return new MesaCamoItem.Helmet();});
        MESA_TUNIC = REGISTRY.register("mesa_tunic", () -> {return new MesaCamoItem.Chestplate();});
        MESA_PANTS = REGISTRY.register("mesa_pants", () -> {return new MesaCamoItem.Leggings();});
        MESA_BOOTS = REGISTRY.register("mesa_boots", () -> {return new MesaCamoItem.Boots();});
        DIRT_HELMET = REGISTRY.register("dirt_helmet", () -> {return new DirtCamoItem.Helmet();});
        DIRT_TUNIC = REGISTRY.register("dirt_tunic", () -> {return new DirtCamoItem.Chestplate();});
        DIRT_PANTS = REGISTRY.register("dirt_pants", () -> {return new DirtCamoItem.Leggings();});
        DIRT_BOOTS = REGISTRY.register("dirt_boots", () -> {return new DirtCamoItem.Boots();});
    }
}
