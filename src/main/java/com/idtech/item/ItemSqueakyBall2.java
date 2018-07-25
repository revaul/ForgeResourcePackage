package com.idtech.item;

import net.minecraft.init.SoundEvents;

public class ItemSqueakyBall2 extends QuickItem {
	{
		name = "Squeaky Ball2";
		texture = "squeakyball";
	}
	public void onRightClick() {
		displayMessage("Squeak!");
        playSound(SoundEvents.ENTITY_BAT_AMBIENT);
	}
}
