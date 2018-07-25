package com.idtech.block;

import net.minecraft.init.Items;

public class BlockHotCoals extends QuickBlock {
	{
		name = "Hot Coals";
		texture = "hotcoals";
		itemDropped = Items.COAL;
		setHarvestLevel(PICKAXE, WOOD);
		setHardness(10);
		setLightLevel(0.5f);
	}
}
