package net.ceoofgoogle.createclothes.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class GrayBootsItem extends ArmorItem {
    public GrayBootsItem(Type type, Properties properties) {
        super(new ArmorMaterial() {
            public int getDurabilityForType(Type type) {
                return (new int[]{13, 15, 16, 11})[type.getSlot().getIndex()] * 80;
            }

            public int getDefenseForType(Type type) {
                return (new int[]{3, 6, 7, 8})[type.getSlot().getIndex()];
            }

            public int getEnchantmentValue() {
                return 9;
            }

            public SoundEvent getEquipSound() {
                return (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }

            public String getName() {
                return "gray";
            }

            public float getToughness() {
                return 0.0F;
            }

            public float getKnockbackResistance() {
                return 0.0F;
            }
        }, type, properties);
    }

    public static class Boots extends DesertCamoItem {
        public Boots() {
            super(Type.BOOTS, new Properties());
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "createclothes:textures/models/armor/gray_boots.png";
        }
    }
}