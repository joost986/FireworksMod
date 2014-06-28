package com.joost986.fireworksmod.client.interfaces;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotFirework extends Slot
{
	public SlotFirework(IInventory inv, int id, int x, int y) {
		super(inv, id, x, y);
	}

	@Override
	public boolean isItemValid(ItemStack itemStack) {
		return itemStack.getUnlocalizedName().equals(Items.fireworks.getUnlocalizedName());
	}
}
