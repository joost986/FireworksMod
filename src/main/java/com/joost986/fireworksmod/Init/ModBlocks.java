package com.joost986.fireworksmod.Init;

import com.joost986.fireworksmod.block.BlockBase;
import com.joost986.fireworksmod.block.BlockFireworkDisplay;
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
