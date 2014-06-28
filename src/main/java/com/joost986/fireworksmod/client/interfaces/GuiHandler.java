package com.joost986.fireworksmod.client.interfaces;

import com.joost986.fireworksmod.FireworksMod;
import com.joost986.fireworksmod.reference.GuiIDs;
import com.joost986.fireworksmod.tileentities.TileFireworkDisplay;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{
	public GuiHandler()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(FireworksMod.instance, this);

	}
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID)
		{
			case GuiIDs.FIREWORKDISPLAY:
				TileEntity te = world.getTileEntity(x, y, z);
				if (te != null && te instanceof TileFireworkDisplay)
				{
					return new ContainerFireworkDisplay(player.inventory, (TileFireworkDisplay)te);
				}
				break;
		}
		return null;
	}
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID)
		{
			case GuiIDs.FIREWORKDISPLAY:
				TileEntity te = world.getTileEntity(x, y, z);
				if (te != null && te instanceof TileFireworkDisplay)
				{
					return new GuiFireworkDisplay(player.inventory, (TileFireworkDisplay)te);
				}
				break;
		}
		return null;
	}
}
