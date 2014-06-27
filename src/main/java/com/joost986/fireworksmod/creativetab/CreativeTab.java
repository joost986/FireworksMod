package com.joost986.fireworksmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTab
{
	public static CreativeTabs tabFireworksMod;

	public static void init(){
		tabFireworksMod = new CreativeTabs("tabFireworksMod")
		{
			@Override
			public Item getTabIconItem()
			{
				return Items.fire_charge;
			}
		};
	}


}
