package com.hassam.mythocraft.proxy;

import com.hassam.mythocraft.events.ClientEventHandler;
import com.hassam.mythocraft.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
	}
	
	@Override
	public void init(FMLInitializationEvent e) {
		
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) {
	
	}
	
	@Override
    public void registerItemRenderer(Item item, int meta, String id) {
    	 ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MODID + ":" + id, "inventory"));
    }

	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), id));
	}
}