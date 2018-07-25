package com.idtech.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class GhostBlock extends QuickBlock {

	{
	name = "Ghost Bricks";
	texture = "buildingblock2";
	setHarvestLevel(PICKAXE, STONE);
	tab = CreativeTabs.BUILDING_BLOCKS;
}
@Override
public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
	return null;
}
public boolean renderAsNormalBlock(){
	return false;
}
}