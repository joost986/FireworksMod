package com.joost986.fireworksmod.Init;

import com.joost986.fireworksmod.reference.Names;
import com.joost986.fireworksmod.tileentities.TileFireworkDisplay;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities
{
	public static void init()
	{
		GameRegistry.registerTileEntity(TileFireworkDisplay.class, Names.TileEntities.FIREWORKDISPLAY);
	}
}
