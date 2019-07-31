package com.Arro.MoreOreMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Arro.MoreOreMod.Main;
import com.Arro.MoreOreMod.blocks.BlockBase;
import com.Arro.MoreOreMod.blocks.RubyBlock;
import com.Arro.MoreOreMod.blocks.RubyOre;
import com.Arro.MoreOreMod.blocks.machines.blastfurnace.BlastFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	
	//Machines
	public static final Block BLAST_FURNACE_OFF = new BlastFurnace("blast_furnace_off", false).setCreativeTab(Main.moreoretab);
    public static final Block BLAST_FURNACE_ON = new BlastFurnace("blast_furnace_on", true);
	
}
