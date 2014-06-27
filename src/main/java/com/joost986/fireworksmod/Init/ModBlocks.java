package com.joost986.fireworksmod.Init;

import com.joost986.fireworksmod.blocks.BlockBase;
import com.joost986.fireworksmod.blocks.BlockFireworkDisplay;
import com.joost986.fireworksmod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	public static void init()
	{
		BlockBase FireworkDisplayBlock = new BlockFireworkDisplay();

		GameRegistry.registerBlock(FireworkDisplayBlock, Names.Blocks.FIREWORKDISPLAY);
	}
}
