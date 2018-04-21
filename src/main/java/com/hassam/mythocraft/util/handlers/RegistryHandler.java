package com.hassam.mythocraft.util.handlers;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Preconditions;
import com.hassam.mythocraft.init.BlockInit;
import com.hassam.mythocraft.init.ItemInit;
import com.hassam.mythocraft.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
		
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerItemModel(item);
			}
		}
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onBlockItemRegister(RegistryEvent.Register<Item> event)
	{
		List<Block> blocks = BlockInit.BLOCKS;
		
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		for(int i = 0; i < blocks.size(); i++) {
			ItemBlock itemBlock = new ItemBlock(blocks.get(i));
			final Block block = itemBlock.getBlock();
			
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerItemModel(itemBlock);	
			}
			
			final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
			registry.register(itemBlock.setRegistryName(registryName));
		}
		
	}
}
