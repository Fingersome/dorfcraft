package fingersome.dorfsvsgoblins;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
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
import fingersome.dorfsvsgoblins.block.BlockDorfAnvil;
import fingersome.dorfsvsgoblins.item.ItemArrowHead;
import fingersome.dorfsvsgoblins.item.ItemChisel;
import fingersome.dorfsvsgoblins.item.ItemChiselHead;
import fingersome.dorfsvsgoblins.item.ItemDorfSkull;
import fingersome.dorfsvsgoblins.item.ItemHammerIron;
import fingersome.dorfsvsgoblins.item.ItemHammerMithril;
import fingersome.dorfsvsgoblins.item.ItemHammerStone;
import fingersome.dorfsvsgoblins.item.ItemHopSeeds;
import fingersome.dorfsvsgoblins.item.ItemHops;
import fingersome.dorfsvsgoblins.item.ItemIngotMithril;
import fingersome.dorfsvsgoblins.item.ItemIronAxeHead;
import fingersome.dorfsvsgoblins.item.ItemIronHoeHead;
import fingersome.dorfsvsgoblins.item.ItemIronPickHead;
import fingersome.dorfsvsgoblins.item.ItemIronShovelHead;
import fingersome.dorfsvsgoblins.item.ItemIronSwordHead;
import fingersome.dorfsvsgoblins.item.ItemIronSwordHilt;
import fingersome.dorfsvsgoblins.item.ItemKnife;
import fingersome.dorfsvsgoblins.item.ItemKnifeHead;
import fingersome.dorfsvsgoblins.item.ItemList;
import fingersome.dorfsvsgoblins.item.ItemMug;
import fingersome.dorfsvsgoblins.item.ItemMugBeer;
import fingersome.dorfsvsgoblins.item.ItemNuggetIron;
import fingersome.dorfsvsgoblins.item.ItemNuggetMithril;
import fingersome.dorfsvsgoblins.item.ItemNuggetMithril;
import fingersome.dorfsvsgoblins.proxy.CommonProxy;

@Mod(modid = ModInfo.MODID, version = ModInfo.VERSION)
public class DorfsVsGoblins
{
	@SidedProxy(clientSide = "fingersome.dorfsvsgoblins.proxy.ClientProxy", 
				serverSide = "fingersome.dorfsvsgoblins.proxy.CommonProxy")     
	
	public static CommonProxy proxy;
	public static ItemList items;

	public static Block blockAugTable;
	public static Block blockDorfAltar;
	public static Block blockDorfAnvil;
	public static Block blockBarrel;
	
	
	public static CreativeTabs tabDvG = new CreativeTabDvG(CreativeTabs.getNextID(), "dvgtab");
    
    
 @EventHandler
 // preInit "Run before anything else. Read your config, create blocks, items, 
 // etc, and register them with the GameRegistry."
 public void preinit(FMLPreInitializationEvent event) 
 {    
     // DEBUG
     System.out.println("preInit()"+event.getModMetadata().name);

  	blockAugTable 	= new BlockAugTable();
  	//blockDorfAltar 	= new BlockDorfAltar();
  	blockDorfAnvil	= new BlockDorfAnvil();
  	//blockBarrel 	= new BlockBarrel();
 	
 }

 @EventHandler
 // load "Do your mod setup. Build whatever data structures you care about. Register recipes."
 public void init(FMLInitializationEvent event) 
 {
     // DEBUG
     System.out.println("init()");

     items.Init();  
     
     //RENDER ITEM RENDERS
     if(event.getSide() == Side.CLIENT)
     {
  	    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
  	    	//BLOCKS
  	    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(blockAugTable), 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((BlockAugTable) blockAugTable).getName(), "inventory"));
  	    	
  	    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(blockDorfAnvil), 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((BlockDorfAnvil) blockDorfAnvil).getName(), "inventory"));
  	    	
  	    	
  	    	//ITEMS
  	    	renderItem.getItemModelMesher().register(items.itemMug, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMug) items.itemMug).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemMugBeer, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMugBeer) items.itemMugBeer).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemHopSeeds, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemHopSeeds) items.itemHopSeeds).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemHops, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemHops) items.itemHops).getName(), "inventory"));

  	    	renderItem.getItemModelMesher().register(items.itemIngotMithril, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemIngotMithril) items.itemIngotMithril).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemNuggetMithril, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemNuggetMithril) items.itemNuggetMithril).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemNuggetIron, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemNuggetIron) items.itemNuggetIron).getName(), "inventory"));
  	    	
  	    	renderItem.getItemModelMesher().register(items.itemKnifeHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemKnifeHead) items.itemKnifeHead).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemChiselHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemChiselHead) items.itemChiselHead).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemArrowHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemArrowHead) items.itemArrowHead).getName(), "inventory"));
  	    	
  	    	renderItem.getItemModelMesher().register(items.itemKnife, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemKnife) items.itemKnife).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemChisel, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemChisel) items.itemChisel).getName(), "inventory"));

  	    	renderItem.getItemModelMesher().register(items.itemHammerStone, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemHammerStone) items.itemHammerStone).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemHammerIron, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemHammerIron) items.itemHammerIron).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemHammerMithril, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemHammerMithril) items.itemHammerMithril).getName(), "inventory"));

  	    	renderItem.getItemModelMesher().register(items.itemIronSwordHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemIronSwordHead) items.itemIronSwordHead).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemIronSwordHilt, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemIronSwordHilt) items.itemIronSwordHilt).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemIronPickHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemIronPickHead) items.itemIronPickHead).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemIronShovelHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemIronShovelHead) items.itemIronShovelHead).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemIronAxeHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemIronAxeHead) items.itemIronAxeHead).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemIronHoeHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemIronHoeHead) items.itemIronHoeHead).getName(), "inventory"));
  	    	
  	    	renderItem.getItemModelMesher().register(items.itemDorfSkull, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemDorfSkull) items.itemDorfSkull).getName(), "inventory"));	
  	}
     
     //REGISTER EVENT LISTENERS
     proxy.registerEventListeners();	
     
     
     //REGISTER CRAFTING RECIPES
     
     
     //REGISTER DWARVEN ANVIL RECIPES
     
     
 }

 @EventHandler
 // postInit "Handle interaction with other mods, complete your setup based on this."
 public void postinit(FMLPostInitializationEvent event)
 {
     // DEBUG
     System.out.println("postInit()");
         
 	
	//REMOVE VANILLA CRAFTING RECIPES
    List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
    Iterator<IRecipe> itemstoremove = recipes.iterator();
     		          
     	while (itemstoremove.hasNext()) 
     	{	ItemStack stack = itemstoremove.next().getRecipeOutput();
     	
     	/**TOOL RECIPES**/
 		if (stack != null && stack.getItem() 		== Items.wooden_sword)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.wooden_pickaxe)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.wooden_shovel)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.wooden_axe)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.wooden_hoe)
 		itemstoremove.remove();

 		if (stack != null && stack.getItem() 		== Items.stone_sword)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.stone_pickaxe)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.stone_shovel)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.stone_axe)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.stone_hoe)
 		itemstoremove.remove();
 		
 		if (stack != null && stack.getItem() 		== Items.golden_sword)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.golden_pickaxe)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.golden_shovel)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.golden_axe)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.golden_hoe)
 		itemstoremove.remove();

 		else if (stack != null && stack.getItem()	== Items.shears)
 		itemstoremove.remove();
 		
 		if (stack != null && stack.getItem() 		== Items.diamond_sword)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.diamond_pickaxe)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.diamond_shovel)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.diamond_axe)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.diamond_hoe)
 		itemstoremove.remove();

 		if (stack != null && stack.getItem() 		== Items.leather_boots)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.leather_leggings)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.leather_chestplate)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.leather_helmet)
 		itemstoremove.remove();
 		
 		/**ARMOR RECIPES**/
 		if (stack != null && stack.getItem() 		== Items.chainmail_boots)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.chainmail_leggings)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.chainmail_chestplate)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.chainmail_helmet)
 		itemstoremove.remove();

 		if (stack != null && stack.getItem() 		== Items.golden_boots)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.golden_leggings)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.golden_chestplate)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.golden_helmet)
 		itemstoremove.remove();
 		
 		if (stack != null && stack.getItem() 		== Items.iron_boots)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.iron_leggings)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.iron_chestplate)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.iron_helmet)
 		itemstoremove.remove();
 		
 		if (stack != null && stack.getItem() 		== Items.diamond_boots)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.diamond_leggings)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.diamond_chestplate)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.diamond_helmet)
 		itemstoremove.remove();
 		
 		/**BLOCK RECIPES**/
 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.crafting_table))
 	 	 	itemstoremove.remove();
 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.anvil))
 	 	itemstoremove.remove();

 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.stonebrick))
 	 	itemstoremove.remove();
     	};
	
	
	//REMOVE VANILLA SMELTING RECIPES
     
    //REMOVE VANILLA ITEMS FROM CREATIVE
    Items.wooden_sword.setCreativeTab(null);
    Items.wooden_pickaxe.setCreativeTab(null);
    Items.wooden_shovel.setCreativeTab(null);
    Items.wooden_axe.setCreativeTab(null);
    Items.wooden_hoe.setCreativeTab(null);

    Items.stone_sword.setCreativeTab(null);
    Items.stone_pickaxe.setCreativeTab(null);
    Items.stone_shovel.setCreativeTab(null);
    Items.stone_axe.setCreativeTab(null);
    Items.stone_hoe.setCreativeTab(null);
    
    Items.golden_sword.setCreativeTab(null);
    Items.golden_pickaxe.setCreativeTab(null);
    Items.golden_shovel.setCreativeTab(null);
    Items.golden_axe.setCreativeTab(null);
    Items.golden_hoe.setCreativeTab(null);
         	
    Items.diamond_sword.setCreativeTab(null);
    Items.diamond_pickaxe.setCreativeTab(null);
    Items.diamond_shovel.setCreativeTab(null);
    Items.diamond_axe.setCreativeTab(null);
    Items.diamond_hoe.setCreativeTab(null);

    Items.leather_boots.setCreativeTab(null);
    Items.leather_leggings.setCreativeTab(null);
    Items.leather_chestplate.setCreativeTab(null);
    Items.leather_helmet.setCreativeTab(null);
    
    Items.chainmail_boots.setCreativeTab(null);
    Items.chainmail_leggings.setCreativeTab(null);
    Items.chainmail_chestplate.setCreativeTab(null);
    Items.chainmail_helmet.setCreativeTab(null);

    Items.golden_boots.setCreativeTab(null);
    Items.golden_leggings.setCreativeTab(null);
    Items.golden_chestplate.setCreativeTab(null);
    Items.golden_helmet.setCreativeTab(null);
    Items.golden_horse_armor.setCreativeTab(null);
    
    Items.iron_boots.setCreativeTab(null);
    Items.iron_leggings.setCreativeTab(null);
    Items.iron_chestplate.setCreativeTab(null);
    Items.iron_helmet.setCreativeTab(null);
    Items.iron_horse_armor.setCreativeTab(null);
    
    Items.diamond_boots.setCreativeTab(null);
    Items.diamond_leggings.setCreativeTab(null);
    Items.diamond_chestplate.setCreativeTab(null);
    Items.diamond_helmet.setCreativeTab(null);
    Items.diamond_horse_armor.setCreativeTab(null);
     
    //REMOVE VANILLA BLOCKS FROM CREAIVE
	Blocks.anvil.setCreativeTab(null);

	Blocks.stonebrick.setCreativeTab(null);
	
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
