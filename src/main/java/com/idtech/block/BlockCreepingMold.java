package com.idtech.block;

import net.minecraft.util.math.BlockPos;

public class BlockCreepingMold extends QuickBlock {
	{
		name = "Creeping Mold";
		texture = "creepingmold";
		setTickRandomly(true);
	}
	 public void onRandomTick(){
	        BlockPos neighbor = findNeighborBlock();
	        cloneAt(neighbor);
	   }
	 
}
