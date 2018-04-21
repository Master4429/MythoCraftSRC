package com.hassam.mythocraft.proxy;

import com.hassam.mythocraft.events.CommonEventHandler;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
	}
	
	public void init(FMLInitializationEvent e) {
		
	}

	public void postInit(FMLPostInitializationEvent e) {
	
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {}
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {} 
}