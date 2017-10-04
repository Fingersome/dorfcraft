package fingersome.dorfcraft;

import fingersome.dorfcraft.block.BlockList;
import fingersome.dorfcraft.command.CommandCheckMoonPhase;
import fingersome.dorfcraft.command.CommandGameNew;
import fingersome.dorfcraft.command.CommandTeamQuery;
import fingersome.dorfcraft.config.ConfigManager;
import fingersome.dorfcraft.entity.capability.CapabilityHandler;
import fingersome.dorfcraft.event.EventManager;
import fingersome.dorfcraft.event.GameManager;
import fingersome.dorfcraft.item.ItemList;
import fingersome.dorfcraft.proxy.CommonProxy;
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
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = ModInfo.MODID, version = ModInfo.VERSION)
public class Dorfcraft
{
    @SidedProxy(clientSide = "fingersome.dorfcraft.proxy.ClientProxy",
    			serverSide = "fingersome.dorfcraft.proxy.ServerProxy")

	public static CommonProxy proxy;
	public static ItemList items;
	public static BlockList blocks;

	@Instance(ModInfo.MODID)
	public static Dorfcraft instance;

	public static CreativeTabs tabCommand = new CreativeTabs("tab_command") {
		@Override
		public String getTabLabel() {
			return "tab_command";
		}
		
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemList.itemHelmetCrown,1);
		}
	};

	public static CreativeTabs tabDorf = new CreativeTabs("tab_dorf") {
		@Override
		public String getTabLabel() {
			return "tab_dorf";
		}
		
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemList.itemHammer,1);
		}
	};
	
	public static CreativeTabs tabZombie = new CreativeTabs("tab_zombie") {
		@Override
		public String getTabLabel() {
			return "tab_zombie";
		}
		
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemList.toolRustyPick,1);
		}
	};
	
	 @EventHandler
	 public void preinit(FMLPreInitializationEvent event) 
	 {    
	     // DEBUG
	     System.out.println("preInit()" + event.getModMetadata().name);
			MinecraftForge.EVENT_BUS.register(new ConfigManager());
			MinecraftForge.EVENT_BUS.register(new EventManager());
	     	MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
	     	MinecraftForge.EVENT_BUS.register(new GameManager());
		
	    ConfigManager.init(event.getSuggestedConfigurationFile());

	 	items.init();
	 	blocks.init();
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
	    //RecipeManager.removeVanillaRecipes();
	
	 	proxy.postInit(event);
	 }
 
	 @EventHandler
	 public void serverLoad(FMLServerStartingEvent event)
	 {
	     // register server commands

		 event.registerServerCommand(new CommandCheckMoonPhase());
		 event.registerServerCommand(new CommandGameNew());
		 event.registerServerCommand(new CommandTeamQuery());
		 
	 }
		
}
