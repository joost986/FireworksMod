package com.joost986.fireworksmod.Init;

import com.joost986.fireworksmod.items.ItemBase;
import com.joost986.fireworksmod.items.ItemFirework;
import com.joost986.fireworksmod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	public static void init()
	{
		ItemBase FireworkItem = new ItemFirework();

		GameRegistry.registerItem(FireworkItem, Names.Items.FIREWORK);
	}
}
