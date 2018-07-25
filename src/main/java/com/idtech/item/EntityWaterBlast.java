package com.idtech.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.world.World;

// Extends EntityThrowable which handles a projectile with gravity.
public class EntityWaterBlast extends EntityThrowable{
	
	// Constructors for the entity taking a few different parameters
	public EntityWaterBlast(World worldIn)
    {
        super(worldIn);
    }
	
	public EntityWaterBlast(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }
	
	public EntityWaterBlast(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}

	// This code runs when the throwable entity hits something.
	@Override
	protected void onImpact(RayTraceResult hitLocation) {
		// Check if the water blast actually hit anything, and make sure it's a block
		if(hitLocation != null && hitLocation.typeOfHit == Type.BLOCK ){
			BlockPos blockToChange = hitLocation.getBlockPos().offset(hitLocation.sideHit);

			if(world.getBlockState(blockToChange) == Blocks.AIR.getDefaultState()){
				// We're only changing Air blocks to water with this item
				// Set the block at that location to water with the same flag the buckets use.
				world.setBlockState(blockToChange, Blocks.WATER.getDefaultState(), 3);	
			}
		}
		
	}
}