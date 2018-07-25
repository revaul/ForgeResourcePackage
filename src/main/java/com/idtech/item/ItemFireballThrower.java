package com.idtech.item;

import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.util.math.Vec3d;

public class ItemFireballThrower extends QuickItem {
	{
		name = "Fireball Thrower";
		texture = "fireballthrower";
	}
	public void onRightClick() {
		Vec3d look = player.getLookVec();
		EntityLargeFireball fireball2 = new EntityLargeFireball(world, player, 1, 1, 1);
		fireball2.setPosition(
				player.posX + look.xCoord * 5,
				player.posY + look.yCoord * 5,
				player.posZ + look.zCoord * 5);
		fireball2.accelerationX = look.xCoord * 0.1;
		fireball2.accelerationY = look.yCoord * 0.1;
		fireball2.accelerationZ = look.zCoord * 0.1;
		world.spawnEntity(fireball2);
	}
}
