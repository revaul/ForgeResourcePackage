
package com.idtech.item;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
 
import com.idtech.BaseMod;
 
public class ItemDeliciousFood extends ItemFood {
     
    public final String name = "DeliciousFood";
     
    public ItemDeliciousFood(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        // TODO Auto-generated constructor stub
        setUnlocalizedName(BaseMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.FOOD);
         
        this.setAlwaysEdible();
    }
     
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn,
            EntityPlayer player) {
        // TODO Auto-generated method stub
        super.onFoodEaten(stack, worldIn, player);
         
        player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("speed"), 100, 2));
         
    }
 
}