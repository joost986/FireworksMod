package com.joost986.fireworksmod.block;

import com.joost986.fireworksmod.reference.Names;
import com.joost986.fireworksmod.reference.Reference;
import com.joost986.fireworksmod.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by joost986 on 20-6-2014.
 */
public class BlockFireworkDisplay extends BlockFireworksMod
{
	public IIcon topTexture;
	public IIcon bottomTexture;
	public IIcon[] sideTexture;
	public IIcon icon;

	public BlockFireworkDisplay()
	{
		super(Material.iron);
		this.setHardness(2F);
		this.setBlockName(Names.Blocks.FIREWORKDISPLAY);
	}
	


//	@Override
//	@SideOnly(Side.CLIENT)
//	public void registerBlockIcons(IIconRegister iconRegister) {
//		this.topTexture = iconRegister.registerIcon(Textures.RESOURCE_PREFIX + ":" + Textures.Blocks.FIREWORKDISPLAY_TOP);
//		this.bottomTexture = iconRegister.registerIcon(Textures.RESOURCE_PREFIX + ":" + Textures.Blocks.FIREWORKDISPLAY_BOTTOM);
//		sideTexture = new IIcon[Textures.Blocks.FIREWORKDISPLAY_SIDES.length];
//		for(int i = 0; i<sideTexture.length; i++)
//		{
//			this.sideTexture[i] = iconRegister.registerIcon(Textures.RESOURCE_PREFIX + ":" + Textures.Blocks.FIREWORKDISPLAY_SIDES[i]);
//		}
//	}
//
//	@Override
//	@SideOnly(Side.CLIENT)
//	public IIcon getIcon(int side, int meta) {
//		if (side==0)
//		{
//			return bottomTexture;
//		}
//		else if (side ==1)
//		{
//			return topTexture;
//		}
//		else
//		{
//			return sideTexture[meta];
//		}
//	}
}
