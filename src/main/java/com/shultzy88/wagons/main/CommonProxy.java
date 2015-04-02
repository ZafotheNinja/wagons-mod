package com.shultzy88.wagons.main;

import com.shultzy88.wagons.entity.EntityCoveredWagon;
import com.shultzy88.wagons.item.ItemCoveredWagon;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy
{
	// items and blocks
	public static ItemCoveredWagon coveredWagon;

	public void preInit(FMLPreInitializationEvent e)
	{
		coveredWagon = (ItemCoveredWagon) new ItemCoveredWagon(0).setUnlocalizedName("coveredwagon");
		GameRegistry.registerItem(coveredWagon, "coveredwagon");
		EntityRegistry.registerModEntity(EntityCoveredWagon.class, "CoveredWagon",
				EntityRegistry.findGlobalUniqueEntityId(), Main.instance, 80, 3, false);
	}

	public void init(FMLInitializationEvent e)
	{

	}

	public void postInit(FMLPostInitializationEvent e)
	{

	}
}
