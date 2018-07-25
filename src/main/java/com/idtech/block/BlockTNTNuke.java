package com.idtech.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockTNTNuke extends QuickBlock {
	{
		name = "Nuke";
		texture = "nuke";
	}
	
	@Override
	public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
		// TODO Auto-generated method stub
		super.onBlockClicked(worldIn, pos, playerIn);
		float explosionSize = 20;
        boolean destroysBlocks = true;
		createExplosion(playerIn, pos, explosionSize, destroysBlocks);
	}


	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		// TODO Auto-generated method stub
		super.onBlockHarvested(worldIn, pos, state, player);
		float explosionSize = 20;
        boolean destroysBlocks = true;
		createExplosion(player, pos, explosionSize, destroysBlocks);
	}
	
}
