package com.idtech.block;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

public class BlockCreepingMold extends QuickBlock {
	{
		name = "Creeping Mold";
		texture = "creepingmold";
		setTickRandomly(true);
	}
	 public void onRandomTick(){
	        BlockPos neighbor = findNeighborBlock();
	        
	        if (world.getBlockState(neighbor) == Blocks.AIR.getDefaultState()){
	            cloneAt(neighbor);
	        }
	       
	   }
	 
}
