package com.joost986.fireworksmod.Init;

import com.joost986.fireworksmod.block.BlockFireworkDisplay;
import com.joost986.fireworksmod.block.BlockFireworksMod;
import com.joost986.fireworksmod.reference.Names;
import com.joost986.fireworksmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import java.rmi.registry.Registry;

/**
 * Created by joost986 on 21-6-2014.
 */
public class ModBlocks
{
	public static void init()
	{
		BlockFireworksMod FireworkDisplayBlock = new BlockFireworkDisplay();

		GameRegistry.registerBlock(FireworkDisplayBlock, Names.Blocks.FIREWORKDISPLAY);
	}
}
