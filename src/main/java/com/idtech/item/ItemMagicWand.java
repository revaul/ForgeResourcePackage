package com.idtech.item;

import com.idtech.block.QuickBlock;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

public class ItemMagicWand extends QuickItem {
	{
		name = "Magic Wand";
		texture = "magicwand";
		
	}
	public void onRightClick(){
		BlockPos target = findBlockAtCursor(500);

		if (target!= null){

			BlockPos pos = target;
			IBlockState empty = Blocks.AIR.getDefaultState();
//You could do the line below. However, I like to do it this way so that if the kids want to expand the amount of blocks deleted they could do some easy vector math.
//world.setBlockState(pos, empty); 
			double x = pos.getX();
			double y = pos.getY();
			double z = pos.getZ();
			

			
			BlockPos replacement = new BlockPos(x, y, z);
			
			world.setBlockState(replacement, empty);
		
		}
	}
	
}
