package com.joost986.fireworksmod.blocks;

import com.joost986.fireworksmod.FireworksMod;
import com.joost986.fireworksmod.reference.GuiIDs;
import com.joost986.fireworksmod.reference.Names;
import com.joost986.fireworksmod.reference.Textures;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class BlockFireworkDisplay extends BlockContainerBase
{
	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	@SideOnly(Side.CLIENT)
	private IIcon[] sideIcons;
	@SideOnly(Side.CLIENT)
	private IIcon bottomIcon;

	public BlockFireworkDisplay()
	{
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
	public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
		for (int i = 0; i<Textures.Blocks.FIREWORKDISPLAY_SIDES.length; i++){
			ItemStack itemstack = new ItemStack(item, 1, i);

			list.add(itemstack);
		}
	}

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

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			FMLNetworkHandler.openGui(player, FireworksMod.instance, GuiIDs.FIREWORKDISPLAY, world, x, y, z);
		}
		return true;
	}
}
