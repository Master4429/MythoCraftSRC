package com.hassam.mythocraft;

import com.hassam.mythocraft.init.ItemInit;
import com.hassam.mythocraft.init.CommandInit;
import com.hassam.mythocraft.proxy.CommonProxy;
import com.hassam.mythocraft.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID,  name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance(Reference.MODID)
	public static Main instance;
	
	public static final CreativeTabs tabMC = new CreativeTabs("MythoCraft") {
		@Override
		public ItemStack getTabIconItem() {
			return ItemInit.ADAMANT.getDefaultInstance();
		}
	};

	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		CommandInit.registerCommands(event);
	}
}