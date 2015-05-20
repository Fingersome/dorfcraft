package fingersome.dorfsvsgoblins;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;
import net.minecraftforge.fml.relauncher.Side;
import fingersome.dorfsvsgoblins.block.BlockAugTable;
import fingersome.dorfsvsgoblins.item.ItemMugBeer;
import fingersome.dorfsvsgoblins.item.ItemDorfSkull;
import fingersome.dorfsvsgoblins.item.ItemList;
import fingersome.dorfsvsgoblins.item.ItemMug;
import fingersome.dorfsvsgoblins.proxy.CommonProxy;

@Mod(modid = ModInfo.MODID, version = ModInfo.VERSION)
public class DorfsVsGoblins
{
	@SidedProxy(clientSide = "fingersome.dorfsvsgoblins.proxy.ClientProxy", 
				serverSide = "fingersome.dorfsvsgoblins.proxy.CommonProxy")     
	
	public static CommonProxy proxy;
	public static ItemList items;
	
	public static Block blockAugTable;
	
	public static CreativeTabs tabDvG = new CreativeTabDvG(CreativeTabs.getNextID(), "dvgtab");
    
    
 @EventHandler
 // preInit "Run before anything else. Read your config, create blocks, items, 
 // etc, and register them with the GameRegistry."
 public void preinit(FMLPreInitializationEvent event) 
 {    
     // DEBUG
     System.out.println("preInit()"+event.getModMetadata().name);
    
     //blocks.Init();
 	blockAugTable = new BlockAugTable();
 	
 }

 @EventHandler
 // load "Do your mod setup. Build whatever data structures you care about. Register recipes."
 public void init(FMLInitializationEvent event) 
 {
     // DEBUG
     System.out.println("init()");

     items.Init();  
     
     //Render item renders
     if(event.getSide() == Side.CLIENT)
     {
  	    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
  	    
  	    	renderItem.getItemModelMesher().register(items.itemMug, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMug) items.itemMug).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemMugBeer, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMugBeer) items.itemMugBeer).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemDorfSkull, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemDorfSkull) items.itemDorfSkull).getName(), "inventory"));	
  	 }
     
     proxy.registerEventListeners();	
     
 }

 @EventHandler
 // postInit "Handle interaction with other mods, complete your setup based on this."
 public void postinit(FMLPostInitializationEvent event)
 {
     // DEBUG
     System.out.println("postInit()");
         
 }

 @EventHandler
 public void serverprestart(FMLServerAboutToStartEvent event)
 {
     // DEBUG
     System.out.println("Server about to start");
         
 }

 @EventHandler
 // register server commands in this event handler
 public void serverstarting(FMLServerStartingEvent event)
 {
     // DEBUG
     System.out.println("Server starting");
         
 }

 @EventHandler
 public void serverstarted(FMLServerStartedEvent event)
 {
     // DEBUG
     System.out.println("Server started");
         
 }

 @EventHandler
 public void serverstopping(FMLServerStoppingEvent event)
 {
     // DEBUG
     System.out.println("Server stopping");
         
 }

 @EventHandler
 public void serverstopped(FMLServerStoppedEvent event)
 {
     // DEBUG
     System.out.println("Server stopped");
         
 }
}
