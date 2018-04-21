package com.hassam.mythocraft.objects.items;

import com.hassam.mythocraft.init.ItemInit;
import com.hassam.mythocraft.proxy.ClientProxy;
import com.hassam.mythocraft.util.IHasModel;
import com.hassam.mythocraft.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabMC);		

		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}