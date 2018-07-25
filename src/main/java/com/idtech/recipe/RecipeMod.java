package com.idtech.recipe;

import com.idtech.block.QuickBlock;
import com.idtech.item.QuickItem;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeMod {
	
	public static void init(){
		// Add your crafting recipes here.
		GameRegistry.addShapelessRecipe(new ItemStack(QuickBlock.getBlock("Hot Coals")), Items.COAL, Blocks.TORCH);
		ItemStack dirtStack = new ItemStack(Blocks.DIRT);
		ItemStack sandStack = new ItemStack(Blocks.SAND);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.EMERALD, 64), dirtStack, dirtStack, dirtStack, dirtStack, sandStack, sandStack);
		GameRegistry.addShapedRecipe(
				  new ItemStack(Items.BOOK),  // Specify the result
				  "xy",  // Specify the top row
				  "yx",  // Specify the bottom row
				  'x', Blocks.STONE,  // Specify the block for 'x'
				  'y', Blocks.GRAVEL); // Specify the block for 'y'
		GameRegistry.addShapedRecipe(new ItemStack(QuickItem.getItem("Lightning Hammer"),100), 
                "xxx", 
                " y ", 
                " y ", 
                'x', Items.REPEATER, 
                'y', Items.STICK);
		GameRegistry.addSmelting(new ItemStack(Items.COAL), new ItemStack(QuickBlock.getBlock("Hot Coals"),2), 0.1f);
	}
	
}
