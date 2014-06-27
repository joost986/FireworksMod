package com.joost986.fireworksmod;

import com.joost986.fireworksmod.Init.ModBlocks;
import com.joost986.fireworksmod.Init.ModItems;
import com.joost986.fireworksmod.creativetab.CreativeTab;
import com.joost986.fireworksmod.proxy.CommonProxy;
import com.joost986.fireworksmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
		modid = Reference.MODID
		, name = Reference.NAME
		, version = Reference.VERSION
)
public class FireworksMod
{
	@Mod.Instance(Reference.MODID)
	public static FireworksMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@SuppressWarnings("unused")
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		CreativeTab.init();
		ModBlocks.init();
		ModItems.init();
	}
	@SuppressWarnings("unused")
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{

	}
	@SuppressWarnings("unused")
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
