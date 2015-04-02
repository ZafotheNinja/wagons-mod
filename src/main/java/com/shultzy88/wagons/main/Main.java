package com.shultzy88.wagons.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
	// The instance of this mod that Forge uses
	@Mod.Instance(Main.MODID)
	public static Main instance;
	
	
	@SidedProxy(clientSide = "com.shultzy88.wagons.main.CombinedClientProxy",
			serverSide = "com.shultzy88.wagons.main.DedicatedServerProxy")
	public static CommonProxy proxy;
	
	// Mod characterization data
    public static final String MODID = "steveswagons";
    public static final String NAME = "Steve's Wagons";
    public static final String VERSION = "1.0.0";
    
    /**
     * Called before Minecraft Forge loads mod
     * @param preEvent
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
    	proxy.preInit(e);
    }
    /**
     * Called when Minecraft Forge begins loading the mod
     * @param event
     */
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
		proxy.init(e);
    }
    
    /**
     * Called after Minecraft Forge finishes loading the mod
     * @param postEvent
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
		proxy.postInit(e);
	}
}
