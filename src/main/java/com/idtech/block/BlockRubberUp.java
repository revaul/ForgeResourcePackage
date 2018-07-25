package com.idtech.block;

import net.minecraft.util.math.BlockPos;

public class BlockRubberUp extends QuickBlock {
	{
		name = "Rubber Block Up";
		texture = "rubber";
	}
	public void onEntityWalk(){
		entity.motionY += 5;
		entity.motionZ += 5;
		entity.motionX += 5;
		double xaxis = entity.posX;
		double yaxis = entity.posY;
		double zaxis = entity.posZ;
		BlockPos pos = new BlockPos(xaxis, yaxis , zaxis);
	}
}
