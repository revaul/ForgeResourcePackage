package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemGelPickaxe extends ItemPickaxe {

	public static final String name = "GelPickaxe";
	
	protected ItemGelPickaxe() {
		super(ToolMaterial.IRON);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(BaseMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
