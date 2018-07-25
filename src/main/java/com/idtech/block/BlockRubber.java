package com.idtech.block;

import net.minecraft.init.Items;

public class BlockRubber extends QuickBlock {
	{
        name = "Rubber";
        texture = "rubber";
    }
     
    public void onEntityWalk(){
        entity.motionY += 1;
    }
}