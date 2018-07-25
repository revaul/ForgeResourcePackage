package com.idtech.item;

import net.minecraft.util.EnumParticleTypes;

public class ItemMug extends QuickItem {
	{
		name = "Mug of Healing";
		texture = "mug";
	}
	public void onRightClick(){
		player.heal(10);
		spawnParticles(player, EnumParticleTypes.REDSTONE, 10);
	}
}
