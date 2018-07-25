package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemGelSpade extends ItemSpade {

	public static final String name = "GelSpade";
	
	protected ItemGelSpade() {
		super(ItemMod.GEL);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(BaseMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
