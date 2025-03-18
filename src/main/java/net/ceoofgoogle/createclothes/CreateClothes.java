package net.ceoofgoogle.createclothes;

import net.ceoofgoogle.createclothes.init.CreateClothesModItems;
import net.ceoofgoogle.createclothes.init.CreateClothesModTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateClothes.MOD_ID)
public class CreateClothes
{
    public static final String MOD_ID = "createclothes";

    public CreateClothes()
    {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        CreateClothesModItems.REGISTRY.register(bus);
        CreateClothesModTabs.REGISTRY.register(bus);
    }
}