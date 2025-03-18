package net.ceoofgoogle.createclothes.init;

import net.ceoofgoogle.createclothes.model.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = {Dist.CLIENT}
)
public class CreateClothesModModels {
    public CreateClothesModModels() {
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelBucketHat.LAYER_LOCATION, ModelBucketHat::createBodyLayer);
        event.registerLayerDefinition(ModelCap.LAYER_LOCATION, ModelCap::createBodyLayer);
        event.registerLayerDefinition(ModelCoat.LAYER_LOCATION, ModelCoat::createBodyLayer);
        event.registerLayerDefinition(ModelCrown.LAYER_LOCATION, ModelCrown::createBodyLayer);
        event.registerLayerDefinition(ModelHelmet.LAYER_LOCATION, ModelHelmet::createBodyLayer);
        event.registerLayerDefinition(ModelOfficerCap.LAYER_LOCATION, ModelOfficerCap::createBodyLayer);
        event.registerLayerDefinition(ModelTricorn.LAYER_LOCATION, ModelTricorn::createBodyLayer);
        event.registerLayerDefinition(ModelTunic.LAYER_LOCATION, ModelTunic::createBodyLayer);
        event.registerLayerDefinition(ModelVest.LAYER_LOCATION, ModelVest::createBodyLayer);
    }
}