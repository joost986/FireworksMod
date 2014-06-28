package com.joost986.fireworksmod.client.interfaces;

import com.joost986.fireworksmod.tileentities.TileFireworkDisplay;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerFireworkDisplay extends Container
{
	private TileFireworkDisplay fireworkDisplay;

	public ContainerFireworkDisplay(InventoryPlayer invPlayer, TileFireworkDisplay fireworkDisplay)
	{
		this.fireworkDisplay = fireworkDisplay;

		for(int x = 0; x < 9; x++)
		{
			addSlotToContainer(new Slot(invPlayer, x, 8 + 18 * x, 109));
		}
		for (int y = 0; y < 3; y++)
		{
			for (int x = 0; x < 9; x++)
			{
				addSlotToContainer(new Slot(invPlayer, 9 + x + y * 9, 8 + 18 * x, 51 + y * 18));
			}
		}
		addSlotToContainer(new SlotFirework(fireworkDisplay, 0, 80, 7));
	}
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return fireworkDisplay.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		return null;
	}
}
