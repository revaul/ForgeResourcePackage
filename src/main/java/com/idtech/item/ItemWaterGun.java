package com.idtech.item;
import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemWaterGun extends Item {

	public final String name;

	public ItemWaterGun(String name){
		super();
		this.name = name;
		setUnlocalizedName(BaseMod.MODID + "_" + this.name);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		// Play a sound when you fire
		worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.NEUTRAL, 0.5f,  0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		spawnParticles(worldIn, playerIn, EnumParticleTypes.DRIP_WATER, 20);

		if (!worldIn.isRemote)
		{
			// Spawn our water blast projectile (Check the file EntityWaterBlast for more!)
			EntityWaterBlast entityWaterBlast = new EntityWaterBlast(worldIn, playerIn);
			entityWaterBlast.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
			worldIn.spawnEntity(entityWaterBlast);
		}
		return new ActionResult(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}


	// Allows you to spawn particle effects the same way as with QuickItem.
	private void spawnParticles(World worldIn, Entity target, EnumParticleTypes type, int intensity) {
		for (int i = 0; i < intensity; i++) {
			double x = target.posX + (Math.random() - 0.5) * target.width;
			double y = target.posY + Math.random() * target.height - target.getYOffset();
			double z = target.posZ + (Math.random() - 0.5) * target.width;
			worldIn.spawnParticle(type, x, y, z, 0, 0, 0);
		}

	}
}