package com.joost986.fireworksmod;

import com.joost986.fireworksmod.Init.ModBlocks;
import com.joost986.fireworksmod.creativetab.CreativeTab;
import com.joost986.fireworksmod.proxy.CommonProxy;
import com.joost986.fireworksmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by joost986 on 20-6-2014.
 */

@Mod(
		modid = Reference.MODID
		, name = Reference.NAME
		, version = Reference.VERSION
)
public class FireworksMod
{

	@Mod.Instance(Reference.MODID)
	public static FireworksMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		CreativeTab.init();
		ModBlocks.init();
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{

	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
