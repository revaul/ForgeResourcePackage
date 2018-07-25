package com.idtech.item;

import net.minecraft.init.SoundEvents;

public class ItemSqueakyBall extends QuickItem {
	{
		name = "Squeaky Ball";
		texture = "squeakyball";
	}
public void onRightClick() {
	displayMessage("Squeak!");
	playSound(SoundEvents.ENTITY_BAT_AMBIENT);
}
	

}
