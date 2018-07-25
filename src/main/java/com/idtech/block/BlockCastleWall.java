package com.idtech.block;

import net.minecraft.util.math.BlockPos;

public class BlockCastleWall extends QuickBlock {
	{
		name = "Cookie Block";
		texture = "cookie";
		setLightLevel(0.5f);
		setTickRandomly(true);
		setHarvestLevel(PICKAXE, WOOD);
		setHardness(25);
	}
	public void onRandomTick(){
		BlockPos neighbor = findNeighborBlock();
		cloneAt(neighbor);
	}
}
