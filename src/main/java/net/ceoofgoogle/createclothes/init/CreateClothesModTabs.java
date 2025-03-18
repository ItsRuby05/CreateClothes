package net.ceoofgoogle.createclothes.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreateClothesModTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;
    public static final RegistryObject<CreativeModeTab> CREATECLOTHES;

    public CreateClothesModTabs() {
    }

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "createclothes");
        CREATECLOTHES = REGISTRY.register("create_clothes", () -> {
            return CreativeModeTab.builder().title(Component.translatable("item_group.createclothes.createclothes")).icon(() -> {
                return new ItemStack((ItemLike) CreateClothesModItems.CROWN.get());
            }).displayItems((parameters, tabData) -> {
                tabData.accept((ItemLike) CreateClothesModItems.CROWN.get());
                tabData.accept((ItemLike) CreateClothesModItems.CAP.get());
                tabData.accept((ItemLike) CreateClothesModItems.BUCKET_HAT.get());
                tabData.accept((ItemLike) CreateClothesModItems.OFFICER_CAP.get());
                tabData.accept((ItemLike) CreateClothesModItems.OFFICER_TUNIC.get());
                tabData.accept((ItemLike) CreateClothesModItems.TRICORN.get());
                tabData.accept((ItemLike) CreateClothesModItems.REDCOAT.get());
                tabData.accept((ItemLike) CreateClothesModItems.BLACK_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.GRAY_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.BROWN_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.GREEN_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.PLAINS_HELMET.get());
                tabData.accept((ItemLike) CreateClothesModItems.PLAINS_TUNIC.get());
                tabData.accept((ItemLike) CreateClothesModItems.PLAINS_PANTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.PLAINS_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.FOREST_HELMET.get());
                tabData.accept((ItemLike) CreateClothesModItems.FOREST_VEST.get());
                tabData.accept((ItemLike) CreateClothesModItems.FOREST_PANTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.FOREST_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.TAIGA_HELMET.get());
                tabData.accept((ItemLike) CreateClothesModItems.TAIGA_TUNIC.get());
                tabData.accept((ItemLike) CreateClothesModItems.TAIGA_PANTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.TAIGA_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.DESERT_HELMET.get());
                tabData.accept((ItemLike) CreateClothesModItems.DESERT_TUNIC.get());
                tabData.accept((ItemLike) CreateClothesModItems.DESERT_PANTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.DESERT_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.SNOW_HELMET.get());
                tabData.accept((ItemLike) CreateClothesModItems.SNOW_COAT.get());
                tabData.accept((ItemLike) CreateClothesModItems.SNOW_PANTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.SNOW_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.SAVANNA_HELMET.get());
                tabData.accept((ItemLike) CreateClothesModItems.SAVANNA_TUNIC.get());
                tabData.accept((ItemLike) CreateClothesModItems.SAVANNA_PANTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.SAVANNA_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.WATER_HELMET.get());
                tabData.accept((ItemLike) CreateClothesModItems.WATER_TUNIC.get());
                tabData.accept((ItemLike) CreateClothesModItems.WATER_PANTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.WATER_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.MESA_HELMET.get());
                tabData.accept((ItemLike) CreateClothesModItems.MESA_TUNIC.get());
                tabData.accept((ItemLike) CreateClothesModItems.MESA_PANTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.MESA_BOOTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.DIRT_HELMET.get());
                tabData.accept((ItemLike) CreateClothesModItems.DIRT_TUNIC.get());
                tabData.accept((ItemLike) CreateClothesModItems.DIRT_PANTS.get());
                tabData.accept((ItemLike) CreateClothesModItems.DIRT_BOOTS.get());
            }).build();
        });
    }
}
