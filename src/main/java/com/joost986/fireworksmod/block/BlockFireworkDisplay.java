package com.joost986.fireworksmod.block;

import com.joost986.fireworksmod.reference.Names;
import com.joost986.fireworksmod.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockFireworkDisplay extends BlockBase
{
	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	@SideOnly(Side.CLIENT)
	private IIcon[] sideIcons;
	@SideOnly(Side.CLIENT)
	private IIcon bottomIcon;

	public BlockFireworkDisplay()
	{
		super(Material.iron);
		this.setHardness(2F);
		this.setBlockName(Names.Blocks.FIREWORKDISPLAY);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		topIcon = register.registerIcon(Textures.RESOURCE_PREFIX + ":"
				+ Textures.Blocks.FIREWORKDISPLAY_TOP);
		sideIcons = new IIcon[Textures.Blocks.FIREWORKDISPLAY_SIDES.length];
		for (int i = 0; i < sideIcons.length; i++) {
			sideIcons[i] = register.registerIcon(Textures.RESOURCE_PREFIX
					+ ":" + Textures.Blocks.FIREWORKDISPLAY_SIDES[i]);
		}
		bottomIcon = register.registerIcon(Textures.RESOURCE_PREFIX + ":"
				+ Textures.Blocks.FIREWORKDISPLAY_BOTTOM);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		if (side == 0) {
			return bottomIcon;
		} else if (side == 1) {
			return topIcon;
		} else {
			return sideIcons[meta];
		}
	}
}
