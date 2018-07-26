package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

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
//This override it not part of the curriculum but I thought it was cool...
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		// TODO Auto-generated method stub
		super.onArmorTick(world, player, itemStack);
		player.heal(10);
		
		//ID Numbers -> https://minecraft.gamepedia.com/Status_effect
		
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),100,2));
		
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(3),5,1));
		/**
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(5),100,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(8),100,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(12),100,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(13),100,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(14),100,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(16),100,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(23),5,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(25),100,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(26),100,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(28),100,1));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(30),100,1));
		**/
	}
}