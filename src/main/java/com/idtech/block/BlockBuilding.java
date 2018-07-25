package com.idtech.block;

import net.minecraft.init.Items;

public class BlockBuilding extends QuickBlock {

    {
        name = "Castle Wall";
        texture = "castlewall";
        setLightLevel(1.0f);
        setResistance(1.0f);
        setHardness(50.0f);
        setBlockUnbreakable();
        setLightOpacity(0);
        itemDropped = Items.APPLE;
    }
    
}