package com.Arro.MoreOreMod.tabs;

import com.Arro.MoreOreMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoreOreTab extends CreativeTabs
{
	public MoreOreTab(String label) { super("moreoretab");
	
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.RUBY);
	}
}
