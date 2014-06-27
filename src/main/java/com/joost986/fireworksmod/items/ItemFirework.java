package com.joost986.fireworksmod.items;

import com.joost986.fireworksmod.reference.Names;
import com.joost986.fireworksmod.reference.Textures;
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


public class ItemFirework extends ItemBase
{
	private IIcon[] icons;

	public ItemFirework()
	{
		this.setUnlocalizedName(Names.Items.FIREWORK);
		this.hasSubtypes = true;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		icons = new IIcon[Textures.Items.FIREWORK.length];
		for (int i = 0; i < icons.length; i++)
		{
			icons[i] = iconRegister.registerIcon(Textures.RESOURCE_PREFIX + ":" + Textures.Items.FIREWORK[i]);
		}
	}
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int dmg)
	{
		return icons[dmg];
	}
	@SuppressWarnings("unchecked ")
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tabs, List list)
	{
		for (int i = 0; i<Textures.Items.FIREWORK.length; i++)
		{
			ItemStack itemstack = new ItemStack(item, 1, i);

			list.add(itemstack);
		}
	}

	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote && (world.getBlock(x, y, z).getUnlocalizedName().contains(Names.Blocks.FIREWORKDISPLAY)) && stack.getItemDamage() != world.getBlockMetadata(x, y, z))
		{
			world.setBlockMetadataWithNotify(x, y, z, stack.getItemDamage(), 3);
			stack.stackSize--;
			return true;
		}
		return false;
	}
}
