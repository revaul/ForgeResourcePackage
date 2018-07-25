package com.idtech.item;

import net.minecraft.util.math.BlockPos;

public class ItemTeleportRod extends QuickItem {
	{
        name = "Teleport Rod";
        texture = "teleportrod";
    }
 
    public void onRightClick() {
    	BlockPos block = findBlockAtCursor(1000);
    	
        moveToBlock(block);
    }
}
