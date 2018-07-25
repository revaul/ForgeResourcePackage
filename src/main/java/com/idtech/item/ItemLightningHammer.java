package com.idtech.item;

import net.minecraft.util.math.BlockPos;

public class ItemLightningHammer extends QuickItem {
	{
        name = "Lightning Hammer";
        texture = "lightninghammer";
    }
 
    public void onRightClick() {
        BlockPos block = findBlockAtCursor(20);
        createLightningBolt(block);
         
        float explosionSize = 5;
        boolean destroysBlocks = true;
        
        BlockPos pos = block;
        double cx = pos.getX();
		double cy = pos.getY();
		double cz = pos.getZ();
		double dy = cy - 40;
		BlockPos newloc = new BlockPos(cx, dy, cz);
		createExplosion(newloc, explosionSize, destroysBlocks);
    }
}
