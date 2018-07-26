package com.idtech.entity;

	import com.idtech.item.ItemMod;
import com.idtech.item.QuickItem;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;
	 
	public class EntityCookieMonster extends EntityMob {

		@Override
		public void dropFewItems(boolean recentlyHit, int lootLevel) {
	        int quantity = this.rand.nextInt(4) + 1;
	 
	        for (int i = 0; i < quantity; i++) {
	            if (this.isBurning()) {
	                this.dropItem(QuickItem.getItem("Lightnight Hammer"), 1);
	            }
	            else {
	                this.dropItem(Items.DIAMOND, 1);
	            }
	        }
	 
	    }
		public EntityCookieMonster(World worldIn) {
			super(worldIn);
			// TODO Auto-generated constructor stub
		}
	    @Override
	    protected void applyEntityAttributes() {
	    	 // Apply base attributes
	        super.applyEntityAttributes();
	        // Change any attributes we want to be different
	        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
	    }
	        
	        @Override
	        protected void initEntityAI()
	        {
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAITempt(this, 1.0D, Items.COOKIE, true));
	       // this.tasks.addTask(6, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
	        //this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
	        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true, new Class[0]));
	        this.tasks.addTask(4, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(6, new EntityAILookIdle(this));
	       

	        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	        }
	}