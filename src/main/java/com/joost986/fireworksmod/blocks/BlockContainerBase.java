package com.joost986.fireworksmod.blocks;

import com.joost986.fireworksmod.tileentities.TileFireworkDisplay;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class BlockContainerBase extends BlockBase implements ITileEntityProvider{

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {

	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileFireworkDisplay();
	}
}
