package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod {
	
	// Material
	public static ToolMaterial GEL;

	// Tools
	public static ItemGelPickaxe itemGelPickaxe;
	public static ItemSnowyBall itemSnowyBall;
	public static ItemWaterGun itemWaterGun;
	
	public static void preInit(){

		// Materials		
		GEL = EnumHelper.addToolMaterial("GEL", 3, 100, 4, 50, 0);
		
		
		itemSnowyBall = new ItemSnowyBall("SnowyBall");
		itemWaterGun = new ItemWaterGun("WaterGun");
		// Tools
		 itemGelPickaxe = new ItemGelPickaxe();
	        GameRegistry.register(itemGelPickaxe.setRegistryName(itemGelPickaxe.name));
	        GameRegistry.register(itemSnowyBall.setRegistryName(itemSnowyBall.name));
	        GameRegistry.register(itemWaterGun.setRegistryName(itemWaterGun.name));
	}

	public static void init(){

		// Items
		 BaseMod.proxy.registerItemInventoryRender(itemGelPickaxe, itemGelPickaxe.name);
		 BaseMod.proxy.registerItemInventoryRender(itemSnowyBall, itemSnowyBall.name);
		 BaseMod.proxy.registerItemInventoryRender(itemWaterGun, itemWaterGun.name);
	}
}