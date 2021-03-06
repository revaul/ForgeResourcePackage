package com.idtech.world;

import com.idtech.block.QuickBlock;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeCustom extends Biome {

	
	
	public BiomeCustom(BiomeProperties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
		this.fillerBlock = QuickBlock.getBlock("Cookie Block").getDefaultState();
        this.topBlock = Blocks.DIRT.getDefaultState();
        properties.setWaterColor(0x11FF11);	
        this.theBiomeDecorator.treesPerChunk = 3;
        this.theBiomeDecorator.bigMushroomsPerChunk = 10;
        this.theBiomeDecorator.flowersPerChunk = 6;
        this.theBiomeDecorator.reedsPerChunk = 15;
        this.theBiomeDecorator.waterlilyPerChunk = 15;
        this.theBiomeDecorator.cactiPerChunk = 8;
        this.theBiomeDecorator.generateLakes = true;
        
        this.spawnableMonsterList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 10, 1, 2));
	}

}
