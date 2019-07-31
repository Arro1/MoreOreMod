package com.Arro.MoreOreMod.util.handlers;

import com.Arro.MoreOreMod.blocks.machines.blastfurnace.TileEntityBlastFurnace;
import com.Arro.MoreOreMod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityBlastFurnace.class, new ResourceLocation(Reference.MOD_ID + ":blast_furnace"));
	}
}
