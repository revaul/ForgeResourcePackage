package com.idtech.block;

import java.util.Random;

import net.minecraft.init.Items;

public class LuckyBlock extends QuickBlock {
	{
		name = "Lucky Block";
		texture = "luckyblock";
		
		
		Random generator = new Random();
		int rn;
        rn = generator.nextInt(2);
        System.out.println(rn);
        if(rn == 0 ) {
        	itemDropped = Items.DIAMOND;
        }
        else if (rn ==  1) {
        	itemDropped = Items.STICK;
        }
        else if (rn == 2) {
        	itemDropped = Items.GOLDEN_APPLE;
        }
	}
}
