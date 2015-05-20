package fingersome.dorfsvsgoblins.proxy;

import fingersome.dorfsvsgoblins.ModInfo;
import fingersome.dorfsvsgoblins.event.DvGEventHandler;
import fingersome.dorfsvsgoblins.item.ItemDorfSkull;
import fingersome.dorfsvsgoblins.item.ItemList;
import fingersome.dorfsvsgoblins.item.ItemMug;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
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

	    MinecraftForge.EVENT_BUS.register(new DvGEventHandler());
	    //MinecraftForge.TERRAIN_GEN_BUS.register(new DvGTerrainGenEventHandler());
	    //MinecraftForge.ORE_GEN_BUS.register(new DvGOreGenEventHandler());        

	    // some events, especially tick, are handled on FML bus
	    FMLCommonHandler.instance().bus().register(new DvGEventHandler());
	}
	
}
