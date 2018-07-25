package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemGelSword extends ItemSword {

	public static final String name = "GelSword";
	
	protected ItemGelSword() {
		super(ItemMod.GEL);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(BaseMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
