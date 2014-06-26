package com.joost986.fireworksmod.block;

import com.joost986.fireworksmod.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

/**
 * Created by joost986 on 24-6-2014.
 */
public class BlockFireworksMod extends Block
{
	public BlockFireworksMod()
	{
		this(Material.iron);
	}
	public BlockFireworksMod(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTab.tabFireworksMod);
	}
}
