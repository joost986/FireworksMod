package com.joost986.fireworksmod.block;

import com.joost986.fireworksmod.creativetab.CreativeTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by joost986 on 24-6-2014.
 */
public abstract class BlockBase extends Block
{
	private IIcon blockIcon;

	public BlockBase()
	{
		this(Material.iron);
	}
	public BlockBase(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTab.tabFireworksMod);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public abstract void registerBlockIcons(IIconRegister iconRegister);

	public IIcon getIcon(int side, int meta)
	{
		return blockIcon;
	}
}
