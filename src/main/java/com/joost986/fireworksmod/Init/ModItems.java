package com.joost986.fireworksmod.Init;

import com.joost986.fireworksmod.items.ItemBase;
import com.joost986.fireworksmod.items.ItemFireworkColorer;
import com.joost986.fireworksmod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	public static void init()
	{
		ItemBase FireworkColorerItem = new ItemFireworkColorer();

		GameRegistry.registerItem(FireworkColorerItem, Names.Items.FIREWORKCOLORER);
	}
}
