package com.hassam.mythocraft.init;

import java.util.ArrayList;
import java.util.List;

import com.hassam.mythocraft.objects.items.ItemBase;

import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item INGOT_STYGIAN_IRON = new ItemBase("ingot_stygian_iron");
	public static final Item INGOT_CELESTIAL_BRONZE = new ItemBase("ingot_celestial_bronze");
	public static final Item INGOT_IMPERIAL_GOLD = new ItemBase("ingot_imperial_gold");
	public static final Item INGOT_BONE_STEEL = new ItemBase("ingot_bone_steel");
	public static final Item INGOT_SILVER = new ItemBase("ingot_silver");
	public static final Item INGOT_METEORIC_IRON = new ItemBase("ingot_meteoric_iron");
	public static final Item ADAMANT = new ItemBase("adamant");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item CHARRED_BONE = new ItemBase("charred_bone");
	public static final Item COAL_OLYMPIAN = new ItemBase("coal_olympian");
}