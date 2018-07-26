package com.idtech.item;

import net.minecraft.entity.Entity;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCustomArmor extends ItemArmor {

	public final String name;

	public ItemCustomArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType, String name) {
		super(material, renderIndex, armorType);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.setUnlocalizedName(BaseMod.MODID +"_"+ name);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {

		if (slot == EntityEquipmentSlot.LEGS) {
			return "examplemod:textures/models/armor/custom_armor_layer_2.png";
		}
		return "examplemod:textures/models/armor/custom_armor_layer_1.png";
	}
}