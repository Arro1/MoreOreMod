package com.Arro.MoreOreMod.blocks;

import java.util.Random;

import com.Arro.MoreOreMod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase
{
	
	public RubyOre(String name, Material material) 
	{
		
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.RUBY;
	}
	
}
