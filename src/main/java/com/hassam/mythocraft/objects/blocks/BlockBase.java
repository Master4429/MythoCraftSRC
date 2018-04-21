package com.hassam.mythocraft.objects.blocks;

import com.hassam.mythocraft.Main;
import com.hassam.mythocraft.init.BlockInit;
import com.hassam.mythocraft.init.ItemInit;
import com.hassam.mythocraft.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	public BlockBase(String Name, Material material)
	{
		super(material);
		setUnlocalizedName(Name);
		setRegistryName(Name);
		setCreativeTab(Main.tabMC);		

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(item, 0, "inventory");
	}
	
}
