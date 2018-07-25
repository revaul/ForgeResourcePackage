package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod {
	
	// Material
	public static ToolMaterial GEL;

	// Tools
	public static ItemGelAxe itemGelAxe;
	public static ItemGelPickaxe itemGelPickaxe;
	public static ItemGelSpade itemGelSpade;
	public static ItemGelSword itemGelSword;
	
	//Random
	public static ItemSnowyBall itemSnowyBall;
	public static ItemWaterGun itemWaterGun;
	
	public static void preInit(){

		// Materials		
		GEL = EnumHelper.addToolMaterial("GEL", 3, 100, 4, 50, 0);
		
		
		itemSnowyBall = new ItemSnowyBall("SnowyBall");
		itemWaterGun = new ItemWaterGun("WaterGun");
		
		// Tools
		 itemGelAxe = new ItemGelAxe();
		 itemGelPickaxe = new ItemGelPickaxe();
		 itemGelSpade = new ItemGelSpade();
		 itemGelSword = new ItemGelSword();
		 
		 //Registers
		 GameRegistry.register(itemGelAxe.setRegistryName(itemGelAxe.name));
	        GameRegistry.register(itemGelPickaxe.setRegistryName(itemGelPickaxe.name));
	        GameRegistry.register(itemGelSpade.setRegistryName(itemGelSpade.name));
	        GameRegistry.register(itemGelSword.setRegistryName(itemGelSword.name));
	        
	        //Random Registers
	        GameRegistry.register(itemSnowyBall.setRegistryName(itemSnowyBall.name));
	        GameRegistry.register(itemWaterGun.setRegistryName(itemWaterGun.name));
	}

	public static void init(){

		// Items
		BaseMod.proxy.registerItemInventoryRender(itemGelAxe, itemGelAxe.name);
		 BaseMod.proxy.registerItemInventoryRender(itemGelPickaxe, itemGelPickaxe.name);
		 BaseMod.proxy.registerItemInventoryRender(itemGelSpade, itemGelSpade.name);
		 BaseMod.proxy.registerItemInventoryRender(itemGelSword, itemGelSword.name);
		 
		 //Random init
		 BaseMod.proxy.registerItemInventoryRender(itemSnowyBall, itemSnowyBall.name);
		 BaseMod.proxy.registerItemInventoryRender(itemWaterGun, itemWaterGun.name);
	}
}