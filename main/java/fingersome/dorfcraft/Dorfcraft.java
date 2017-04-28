package fingersome.dorfcraft;

import fingersome.dorfcraft.config.ConfigManager;
import fingersome.dorfcraft.event.EventManager;
import fingersome.dorfcraft.item.ItemHammer;
import fingersome.dorfcraft.item.ItemInfo;
import fingersome.dorfcraft.item.ItemList;
import fingersome.dorfcraft.proxy.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
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
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = ModInfo.MODID, version = ModInfo.VERSION)
public class Dorfcraft
{
    @SidedProxy(clientSide = "fingersome.dorfcraft.proxy.ClientProxy",
    			serverSide = "fingersome.dorfcraft.proxy.ServerProxy")

	public static CommonProxy proxy;
	public static ItemList items;

	@Instance(ModInfo.MODID)
	public static Dorfcraft instance;

	public static CreativeTabs tab = new CreativeTabs("dorfcraft") {
    	@Override
    	public String getTabLabel(){
    		return "dorfcraft";
    	}
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem(){
			return new ItemStack(ItemList.itemMaskKing,1);
		}
	};
	
	 @EventHandler
	 public void preinit(FMLPreInitializationEvent event) 
	 {    
	     // DEBUG
	     System.out.println("preInit()" + event.getModMetadata().name);
	     
	 	MinecraftForge.EVENT_BUS.register(new EventManager());
		MinecraftForge.EVENT_BUS.register(new ConfigManager());
		
	    ConfigManager.init(event.getSuggestedConfigurationFile());
	   
	 	items.init();
	 	//items.retextureVanillaItems();

		proxy.preInit(event);
	     
	 }
	 

	@EventHandler
	 public void init(FMLInitializationEvent event) 
	 {
	     // DEBUG
	     System.out.println("init()");
	
	 	proxy.init(event);
	
	         
	 }
	
	 @EventHandler
	 public void postinit(FMLPostInitializationEvent event)
	 {
	     // DEBUG
	     System.out.println("postInit()");
	       
		//REMOVE VANILLA CRAFTING RECIPES
	    RecipeManager.removeVanillaRecipes();
	
	 	proxy.postInit(event);
	 }
 
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event){
		//event.registerServerCommand(new ServerCommand());
	}
}
