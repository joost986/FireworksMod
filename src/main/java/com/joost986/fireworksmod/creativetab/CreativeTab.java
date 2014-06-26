package com.joost986.fireworksmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by joost986 on 25-6-2014.
 */
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
