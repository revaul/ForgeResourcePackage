package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemGelAxe extends ItemAxe {

	public static final String name = "GelAxe";
	
	protected ItemGelAxe() {
		super(ItemMod.GEL);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(BaseMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
