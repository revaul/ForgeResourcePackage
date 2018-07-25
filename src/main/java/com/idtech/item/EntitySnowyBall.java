package com.idtech.item;

import net.minecraft.client.audio.Sound;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.world.World;

// Extends EntityThrowable which handles a projectile with gravity.
public class EntitySnowyBall extends EntityThrowable {

    // Constructors for the entity taking a few different parameters
    public EntitySnowyBall(World worldIn) {
        super(worldIn);
    }

    public EntitySnowyBall(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
    }

    public EntitySnowyBall(World worldIn, EntityLivingBase throwerIn) {
        super(worldIn, throwerIn);
    }

    // This code runs when the throwable entity hits something.
    @Override
    protected void onImpact(RayTraceResult hitLocation) {
    	// Check if the snow ball hit something
    	if (hitLocation == null) {
    		return;
    	}
    	
        if (hitLocation.typeOfHit == Type.BLOCK) {
        	makeSnowPile(hitLocation);
        } else if (hitLocation.typeOfHit == Type.ENTITY) {
        	attackTarget(hitLocation);
        }
    }
    
    private void makeSnowPile(RayTraceResult hitLocation) {
        BlockPos blockToChange = hitLocation.getBlockPos().offset(hitLocation.sideHit);

        if (world.getBlockState(blockToChange) == Blocks.AIR.getDefaultState()) {
            world.setBlockState(blockToChange, Blocks.SNOW.getDefaultState(), 3);
        }
    }

    private void attackTarget(RayTraceResult hitLocation) {
    	if (!(hitLocation.entityHit instanceof EntityLiving)) {
    		return;
    	}

    	EntityLiving target = (EntityLiving)hitLocation.entityHit;
    	target.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("slowness"), 60, 100));    	
    }
}