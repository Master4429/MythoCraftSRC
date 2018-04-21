package com.hassam.mythocraft.init;

import java.util.ArrayList;
import java.util.List;

import com.hassam.mythocraft.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block ORE_ADAMANT = new BlockBase("ore_adamant", Material.ROCK);
	public static final Block ORE_CELESTIAL_BRONZE = new BlockBase("ore_celestial_bronze", Material.ROCK);
	public static final Block FORGE_OF_THE_GODS = new BlockBase("forge_of_the_gods", Material.ROCK);
	public static final Block ORE_IMPERIAL_GOLD = new BlockBase("ore_imperial_gold", Material.ROCK);
	public static final Block ORE_METEORIC_IRON = new BlockBase("ore_meteoric_iron", Material.ROCK);
	public static final Block ORE_RUBY = new BlockBase("ore_ruby", Material.ROCK);
	public static final Block ORE_SILVER = new BlockBase("ore_silver", Material.ROCK);
	public static final Block ORE_STYGIAN_IRON = new BlockBase("ore_stygian_iron", Material.ROCK);
}