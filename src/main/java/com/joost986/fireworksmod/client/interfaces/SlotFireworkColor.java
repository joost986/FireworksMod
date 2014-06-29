package com.joost986.fireworksmod.client.interfaces;

import com.joost986.fireworksmod.reference.Names;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotFireworkColor extends Slot
{
	public SlotFireworkColor(IInventory inv, int id, int x, int y) {
		super(inv, id, x, y);
	}
	@Override
	public boolean isItemValid(ItemStack itemStack) {
		return itemStack.getUnlocalizedName().substring(5).equals(Names.Items.FIREWORKCOLORER);
	}
}
