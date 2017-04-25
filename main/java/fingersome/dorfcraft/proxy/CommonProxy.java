package fingersome.dorfcraft.proxy;

import fingersome.dorfcraft.ModInfo;
import fingersome.dorfcraft.item.ItemList;
import fingersome.dorfcraft.item.ItemMug;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;
import net.minecraftforge.fml.relauncher.Side;

public class CommonProxy 
{
	public void registerEventListeners()
	{
	    // DEBUG
	    System.out.println("Registering event listeners");

	    
	}

	
	public void registerDorfRecipes()
	{
		 //REGISTER RECIPES
	    System.out.println("Registering recipes");

		
	}
}
