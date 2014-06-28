package com.joost986.fireworksmod.client.interfaces;

import com.joost986.fireworksmod.tileentities.TileFireworkDisplay;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiFireworkDisplay extends GuiContainer
{
	public GuiFireworkDisplay(InventoryPlayer invPlayer, TileFireworkDisplay fireworkDisplay)
	{
		super(new ContainerFireworkDisplay(invPlayer, fireworkDisplay));

		xSize = 176;
		ySize = 133;
	}
	private static final ResourceLocation texture = new ResourceLocation("fireworksmod", "textures/gui/fireworkdisplay.png");
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1,1,1,1);

		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
}
