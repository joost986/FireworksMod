package com.joost986.fireworksmod.Init;

import com.joost986.fireworksmod.block.BlockBase;
import com.joost986.fireworksmod.block.BlockFireworkDisplay;
import com.joost986.fireworksmod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by joost986 on 21-6-2014.
 */
public class ModBlocks
{
	public static void init()
	{
		BlockBase FireworkDisplayBlock = new BlockFireworkDisplay();

		GameRegistry.registerBlock(FireworkDisplayBlock, Names.Blocks.FIREWORKDISPLAY);
	}
}
