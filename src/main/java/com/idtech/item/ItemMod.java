package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMod {

	// Material
	public static ToolMaterial GEL;

	// Tools
	public static ItemGelHoe itemGelHoe;
	public static ItemGelPickaxe itemGelPickaxe;
	public static ItemGelSpade itemGelSpade;
	public static ItemGelSword itemGelSword;

	// Random
	public static ItemSnowyBall itemSnowyBall;
	public static ItemWaterGun itemWaterGun;

	// Armor
	public static ItemCustomArmor customHelm;
	public static ItemCustomArmor customLegs;
	public static ItemCustomArmor customChest;
	public static ItemCustomArmor customFeet;
	public static ArmorMaterial customArmorMaterial;
	
	//Food
	public static ItemDeliciousFood itemDeliciousFood;

	public static void preInit() {

		// Materials
		GEL = EnumHelper.addToolMaterial("GEL", 3, 100, 4, 50, 0);

		itemSnowyBall = new ItemSnowyBall("SnowyBall");
		itemWaterGun = new ItemWaterGun("WaterGun");

		// Tools
		itemGelHoe = new ItemGelHoe();
		itemGelPickaxe = new ItemGelPickaxe();
		itemGelSpade = new ItemGelSpade();
		itemGelSword = new ItemGelSword();

		// Registers
		GameRegistry.register(itemGelHoe.setRegistryName(itemGelHoe.name));
		GameRegistry.register(itemGelPickaxe.setRegistryName(itemGelPickaxe.name));
		GameRegistry.register(itemGelSpade.setRegistryName(itemGelSpade.name));
		GameRegistry.register(itemGelSword.setRegistryName(itemGelSword.name));

		// Random Registers
		GameRegistry.register(itemSnowyBall.setRegistryName(itemSnowyBall.name));
		GameRegistry.register(itemWaterGun.setRegistryName(itemWaterGun.name));

		// Armor
		customArmorMaterial = EnumHelper.addArmorMaterial("CUSTOM", "custom_armor", 200, new int[] { 10, 10, 10, 10 }, 4, SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_iron")), 0.0f);
		
		customHelm = new ItemCustomArmor(ItemMod.customArmorMaterial, 0, EntityEquipmentSlot.HEAD, "CustomHelm");
		GameRegistry.register(customHelm.setRegistryName(customHelm.name));

		customLegs = new ItemCustomArmor(ItemMod.customArmorMaterial, 0, EntityEquipmentSlot.LEGS, "CustomLegs");
		GameRegistry.register(customLegs.setRegistryName(customLegs.name));

		customChest = new ItemCustomArmor(ItemMod.customArmorMaterial, 0, EntityEquipmentSlot.CHEST, "CustomChest");
		GameRegistry.register(customChest.setRegistryName(customChest.name));

		customFeet = new ItemCustomArmor(ItemMod.customArmorMaterial, 0, EntityEquipmentSlot.FEET, "CustomFeet");
		GameRegistry.register(customFeet.setRegistryName(customFeet.name));
	
		//Food
		   itemDeliciousFood = new ItemDeliciousFood(8,0.6f, false);
		   GameRegistry.register(itemDeliciousFood.setRegistryName(itemDeliciousFood.name));
		
	}

	public static void init() {

		// Items
		BaseMod.proxy.registerItemInventoryRender(itemGelHoe, itemGelHoe.name);
		BaseMod.proxy.registerItemInventoryRender(itemGelPickaxe, itemGelPickaxe.name);
		BaseMod.proxy.registerItemInventoryRender(itemGelSpade, itemGelSpade.name);
		BaseMod.proxy.registerItemInventoryRender(itemGelSword, itemGelSword.name);

		// Random init
		BaseMod.proxy.registerItemInventoryRender(itemSnowyBall, itemSnowyBall.name);
		BaseMod.proxy.registerItemInventoryRender(itemWaterGun, itemWaterGun.name);

		// Armor init
		BaseMod.proxy.registerItemInventoryRender(customHelm, customHelm.name);
		BaseMod.proxy.registerItemInventoryRender(customLegs, customLegs.name);
		BaseMod.proxy.registerItemInventoryRender(customChest, customChest.name);
		BaseMod.proxy.registerItemInventoryRender(customFeet, customFeet.name);
	
		//Food
		 BaseMod.proxy.registerItemInventoryRender(itemDeliciousFood, itemDeliciousFood.name);
	}
}