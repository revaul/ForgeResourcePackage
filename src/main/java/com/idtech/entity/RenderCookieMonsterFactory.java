package com.idtech.entity;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraftforge.fml.client.registry.IRenderFactory;
 
public class RenderCookieMonsterFactory implements IRenderFactory<EntityLiving> {
 
    public static final RenderCookieMonsterFactory INSTANCE = new RenderCookieMonsterFactory();
     
    @Override
    public Render<? super EntityLiving> createRenderFor(RenderManager manager) {
        return new RenderCookieMonster(manager, new ModelZombie(), 0.5f);
    }
    
}