package fingersome.dorfcraft;

import java.util.Iterator;
import java.util.List;

import fingersome.dorfcraft.item.ItemArrowHead;
import fingersome.dorfcraft.item.ItemAxeMithril;
import fingersome.dorfcraft.item.ItemChisel;
import fingersome.dorfcraft.item.ItemFlintAxe;
import fingersome.dorfcraft.item.ItemFlintKnife;
import fingersome.dorfcraft.item.ItemFlintPickaxe;
import fingersome.dorfcraft.item.ItemHammer;
import fingersome.dorfcraft.item.ItemHide;
import fingersome.dorfcraft.item.ItemHideCured;
import fingersome.dorfcraft.item.ItemHoeMithril;
import fingersome.dorfcraft.item.ItemHopSeeds;
import fingersome.dorfcraft.item.ItemHops;
import fingersome.dorfcraft.item.ItemIngotMithril;
import fingersome.dorfcraft.item.ItemIronAxeHead;
import fingersome.dorfcraft.item.ItemIronHoeHead;
import fingersome.dorfcraft.item.ItemIronPickHead;
import fingersome.dorfcraft.item.ItemIronShovelHead;
import fingersome.dorfcraft.item.ItemIronSwordHead;
import fingersome.dorfcraft.item.ItemIronSwordHilt;
import fingersome.dorfcraft.item.ItemKnife;
import fingersome.dorfcraft.item.ItemList;
import fingersome.dorfcraft.item.ItemMithrilAxeHead;
import fingersome.dorfcraft.item.ItemMithrilHoeHead;
import fingersome.dorfcraft.item.ItemMithrilPickHead;
import fingersome.dorfcraft.item.ItemMithrilShovelHead;
import fingersome.dorfcraft.item.ItemMithrilSwordHead;
import fingersome.dorfcraft.item.ItemMithrilSwordHilt;
import fingersome.dorfcraft.item.ItemMug;
import fingersome.dorfcraft.item.ItemMugBeer;
import fingersome.dorfcraft.item.ItemNuggetIron;
import fingersome.dorfcraft.item.ItemNuggetMithril;
import fingersome.dorfcraft.item.ItemPickaxeMithril;
import fingersome.dorfcraft.item.ItemPlankAcacia;
import fingersome.dorfcraft.item.ItemPlankBirch;
import fingersome.dorfcraft.item.ItemPlankDarkOak;
import fingersome.dorfcraft.item.ItemPlankJungle;
import fingersome.dorfcraft.item.ItemPlankOak;
import fingersome.dorfcraft.item.ItemPlankPine;
import fingersome.dorfcraft.item.ItemPlateIron;
import fingersome.dorfcraft.item.ItemPlateLeather;
import fingersome.dorfcraft.item.ItemPlateMithril;
import fingersome.dorfcraft.item.ItemSalt;
import fingersome.dorfcraft.item.ItemShovelMithril;
import fingersome.dorfcraft.item.ItemStrips;
import fingersome.dorfcraft.item.ItemSwordMithril;
import fingersome.dorfcraft.proxy.CommonProxy;
import fingersome.dorfcraft.tab.CreativeTabCarpentry;
import fingersome.dorfcraft.tab.CreativeTabDorfcraft;
import fingersome.dorfcraft.tab.CreativeTabEnchanting;
import fingersome.dorfcraft.tab.CreativeTabFarming;
import fingersome.dorfcraft.tab.CreativeTabMasonry;
import fingersome.dorfcraft.tab.CreativeTabMining;
import fingersome.dorfcraft.tab.CreativeTabSmithing;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
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

@Mod(modid = ModInfo.MODID, version = ModInfo.VERSION)
public class Dorfcraft
{
	@SidedProxy(clientSide = "fingersome.dorfcraft.proxy.ClientProxy", 
				serverSide = "fingersome.dorfcraft.proxy.CommonProxy")     
	
	public static CommonProxy proxy;
	public static ItemList items;
	//public static BlockList blocks;

	public static CreativeTabs tabDorf = 		new CreativeTabDorfcraft(CreativeTabs.getNextID(), 	"dorftab");
	public static CreativeTabs tabFarming = 	new CreativeTabFarming(CreativeTabs.getNextID(), 	"farmingtab");
	public static CreativeTabs tabMining = 		new CreativeTabMining(CreativeTabs.getNextID(), 	"miningtab");
	public static CreativeTabs tabSmithing = 	new CreativeTabSmithing(CreativeTabs.getNextID(), 	"smithingtab");
	public static CreativeTabs tabMasonry = 	new CreativeTabMasonry(CreativeTabs.getNextID(), 	"masonrytab");
	public static CreativeTabs tabCarpentry = 	new CreativeTabCarpentry(CreativeTabs.getNextID(), 	"carpentrytab");
	public static CreativeTabs tabEnchanting = 	new CreativeTabEnchanting(CreativeTabs.getNextID(), "enchantingtab");
	
	@Instance(ModInfo.MODID)
	public static Dorfcraft instance;
    
 @EventHandler
 // preInit "Run before anything else. Read your config, create blocks, items, 
 // etc, and register them with the GameRegistry."
 public void preinit(FMLPreInitializationEvent event) 
 {    
     // DEBUG
     System.out.println("preInit()"+event.getModMetadata().name);

  	
 	
 }
 
 @EventHandler
 // load "Do your mod setup. Build whatever data structures you care about. Register recipes."
 public void init(FMLInitializationEvent event) 
 {
     // DEBUG
     System.out.println("init()");

     items.Init();  
     //blocks.Init();  
     
     //RENDER ITEM RENDERS
     if(event.getSide() == Side.CLIENT)
     {
  	    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
  	    	
  	    	//BLOCKS  	    	
  	    	//renderItem.getItemModelMesher().register(Item.getItemFromBlock(blockDorfAnvil), 0, 
  	    	//new ModelResourceLocation(ModInfo.MODID + ":" + ((BlockDorfAnvil) blockDorfAnvil).getName(), "inventory"));
  	    	
  	    	
  	    	//ITEMS
  	    	renderItem.getItemModelMesher().register(items.itemMug, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMug) items.itemMug).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemMugAle, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMugBeer) items.itemMugAle).getName(), "inventory"));
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
  	    	  	    	
  	    	renderItem.getItemModelMesher().register(items.itemKnife, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemKnife) items.itemKnife).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemChisel, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemChisel) items.itemChisel).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemHammer, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemHammer) items.itemHammer).getName(), "inventory"));

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

  	    	renderItem.getItemModelMesher().register(items.itemMithrilSwordHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMithrilSwordHead) items.itemMithrilSwordHead).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemMithrilSwordHilt, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMithrilSwordHilt) items.itemMithrilSwordHilt).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemMithrilPickHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMithrilPickHead) items.itemMithrilPickHead).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemMithrilShovelHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMithrilShovelHead) items.itemMithrilShovelHead).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemMithrilAxeHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMithrilAxeHead) items.itemMithrilAxeHead).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemMithrilHoeHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMithrilHoeHead) items.itemMithrilHoeHead).getName(), "inventory"));
  	    	
  	    	renderItem.getItemModelMesher().register(items.itemFlintKnife, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemFlintKnife) items.itemFlintKnife).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemFlintPickaxe, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemFlintPickaxe) items.itemFlintPickaxe).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemFlintAxe, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemFlintAxe) items.itemFlintAxe).getName(), "inventory"));

  	    	renderItem.getItemModelMesher().register(items.itemSwordMithril, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemSwordMithril) items.itemSwordMithril).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemPickaxeMithril, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemPickaxeMithril) items.itemPickaxeMithril).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemShovelMithril, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemShovelMithril) items.itemShovelMithril).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemAxeMithril, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemAxeMithril) items.itemAxeMithril).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemHoeMithril, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemHoeMithril) items.itemHoeMithril).getName(), "inventory"));

  	    	renderItem.getItemModelMesher().register(items.itemPlankOak, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemPlankOak) items.itemPlankOak).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemPlankPine, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemPlankPine) items.itemPlankPine).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemPlankBirch, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemPlankBirch) items.itemPlankBirch).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemPlankJungle, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemPlankJungle) items.itemPlankJungle).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemPlankAcacia, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemPlankAcacia) items.itemPlankAcacia).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemPlankDarkOak, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemPlankDarkOak) items.itemPlankDarkOak).getName(), "inventory"));

  	    	renderItem.getItemModelMesher().register(items.itemSalt, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemSalt) items.itemSalt).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemHide, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemHide) items.itemHide).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemHideCured, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemHideCured) items.itemHideCured).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemPlateLeather, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemPlateLeather) items.itemPlateLeather).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemStrips, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemStrips) items.itemStrips).getName(), "inventory"));

  	    	renderItem.getItemModelMesher().register(items.itemArrowHead, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemArrowHead) items.itemArrowHead).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemPlateIron, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemPlateIron) items.itemPlateIron).getName(), "inventory"));
  	    	renderItem.getItemModelMesher().register(items.itemPlateMithril, 0, 
  	    	new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemPlateMithril) items.itemPlateMithril).getName(), "inventory"));
  	    	
  	}
     
     //REGISTER EVENT LISTENERS
     proxy.registerEventListeners();	
     
     
     //REGISTER CRAFTING RECIPES
     
     
     //REGISTER ANVIL RECIPES
     
     
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
 		if (stack != null && stack.getItem() 		== Items.WOODEN_SWORD)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.WOODEN_PICKAXE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.WOODEN_SHOVEL)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.WOODEN_AXE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.WOODEN_HOE)
 		itemstoremove.remove();

 		if (stack != null && stack.getItem() 		== Items.STONE_SWORD)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.STONE_PICKAXE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.STONE_SHOVEL)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.STONE_AXE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.STONE_HOE)
 		itemstoremove.remove();
 		
 		if (stack != null && stack.getItem() 		== Items.GOLDEN_SWORD)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.GOLDEN_PICKAXE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.GOLDEN_SHOVEL)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.GOLDEN_AXE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.GOLDEN_HOE)
 		itemstoremove.remove();

 		else if (stack != null && stack.getItem()	== Items.SHEARS)
 		itemstoremove.remove();
 		
 		if (stack != null && stack.getItem() 		== Items.DIAMOND_SWORD)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.DIAMOND_PICKAXE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.DIAMOND_SHOVEL)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.DIAMOND_AXE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.DIAMOND_HOE)
 		itemstoremove.remove();

 		if (stack != null && stack.getItem() 		== Items.LEATHER_BOOTS)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.LEATHER_LEGGINGS)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.LEATHER_CHESTPLATE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.LEATHER_HELMET)
 		itemstoremove.remove();
 		
 		/**ARMOR RECIPES**/
 		if (stack != null && stack.getItem() 		== Items.CHAINMAIL_BOOTS)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.CHAINMAIL_LEGGINGS)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.CHAINMAIL_CHESTPLATE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.CHAINMAIL_HELMET)
 		itemstoremove.remove();

 		if (stack != null && stack.getItem() 		== Items.GOLDEN_BOOTS)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.GOLDEN_LEGGINGS)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.GOLDEN_CHESTPLATE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.GOLDEN_HELMET)
 		itemstoremove.remove();
 		
 		if (stack != null && stack.getItem() 		== Items.IRON_BOOTS)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.IRON_LEGGINGS)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.IRON_CHESTPLATE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.IRON_HELMET)
 		itemstoremove.remove();
 		
 		if (stack != null && stack.getItem() 		== Items.DIAMOND_BOOTS)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.DIAMOND_LEGGINGS)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.DIAMOND_CHESTPLATE)
 		itemstoremove.remove();
 		else if (stack != null && stack.getItem()	== Items.DIAMOND_HELMET)
 		itemstoremove.remove();
 		
 		/**BLOCK RECIPES**/
 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.PLANKS))
 	 	itemstoremove.remove();
 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.CRAFTING_TABLE))
 	 	itemstoremove.remove();
 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.ANVIL))
 	 	itemstoremove.remove();

 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.STONEBRICK))
 	 	itemstoremove.remove();
     	};
	
	
	//REMOVE VANILLA SMELTING RECIPES
     
    //REMOVE VANILLA ITEMS FROM CREATIVE
    Items.WOODEN_SWORD.setCreativeTab(null);
    Items.WOODEN_PICKAXE.setCreativeTab(null);
    Items.WOODEN_SHOVEL.setCreativeTab(null);
    Items.WOODEN_AXE.setCreativeTab(null);
    Items.WOODEN_HOE.setCreativeTab(null);

    Items.STONE_SWORD.setCreativeTab(null);
    Items.STONE_PICKAXE.setCreativeTab(null);
    Items.STONE_SHOVEL.setCreativeTab(null);
    Items.STONE_AXE.setCreativeTab(null);
    Items.STONE_HOE.setCreativeTab(null);
    
    Items.GOLDEN_SWORD.setCreativeTab(null);
    Items.GOLDEN_PICKAXE.setCreativeTab(null);
    Items.GOLDEN_SHOVEL.setCreativeTab(null);
    Items.GOLDEN_AXE.setCreativeTab(null);
    Items.GOLDEN_HOE.setCreativeTab(null);
         	
    Items.DIAMOND_SWORD.setCreativeTab(null);
    Items.DIAMOND_PICKAXE.setCreativeTab(null);
    Items.DIAMOND_SHOVEL.setCreativeTab(null);
    Items.DIAMOND_AXE.setCreativeTab(null);
    Items.DIAMOND_HOE.setCreativeTab(null);

    Items.LEATHER_BOOTS.setCreativeTab(null);
    Items.LEATHER_LEGGINGS.setCreativeTab(null);
    Items.LEATHER_CHESTPLATE.setCreativeTab(null);
    Items.LEATHER_HELMET.setCreativeTab(null);
    
    Items.CHAINMAIL_BOOTS.setCreativeTab(null);
    Items.CHAINMAIL_LEGGINGS.setCreativeTab(null);
    Items.CHAINMAIL_CHESTPLATE.setCreativeTab(null);
    Items.CHAINMAIL_HELMET.setCreativeTab(null);

    Items.GOLDEN_BOOTS.setCreativeTab(null);
    Items.GOLDEN_LEGGINGS.setCreativeTab(null);
    Items.GOLDEN_CHESTPLATE.setCreativeTab(null);
    Items.GOLDEN_HELMET.setCreativeTab(null);
    Items.GOLDEN_HORSE_ARMOR.setCreativeTab(null);
    
    Items.IRON_BOOTS.setCreativeTab(null);
    Items.IRON_LEGGINGS.setCreativeTab(null);
    Items.IRON_CHESTPLATE.setCreativeTab(null);
    Items.IRON_HELMET.setCreativeTab(null);
    Items.IRON_HORSE_ARMOR.setCreativeTab(null);
    
    Items.DIAMOND_BOOTS.setCreativeTab(null);
    Items.DIAMOND_LEGGINGS.setCreativeTab(null);
    Items.DIAMOND_CHESTPLATE.setCreativeTab(null);
    Items.DIAMOND_HELMET.setCreativeTab(null);
    Items.DIAMOND_HORSE_ARMOR.setCreativeTab(null);
    
    //SORT ITEMS INTO CREAIVETABS
    //FARMING
    Items.WHEAT_SEEDS.setCreativeTab(tabFarming);
    Items.WHEAT.setCreativeTab(tabFarming);
    Items.PUMPKIN_SEEDS.setCreativeTab(tabFarming);
    Items.MELON_SEEDS.setCreativeTab(tabFarming);
    Items.MELON.setCreativeTab(tabFarming);
    Items.POTATO.setCreativeTab(tabFarming);
    Items.POISONOUS_POTATO.setCreativeTab(tabFarming);
    Items.CARROT.setCreativeTab(tabFarming);
    Items.REEDS.setCreativeTab(tabFarming);
    items.itemHopSeeds.setCreativeTab(tabFarming);
    items.itemHops.setCreativeTab(tabFarming);
    
    //MINING
    Items.COAL.setCreativeTab(tabMining);
    Items.REDSTONE.setCreativeTab(tabMining);
    Items.EMERALD.setCreativeTab(tabMining);
    Items.DIAMOND.setCreativeTab(tabMining);
    
    //SMITHING
    Items.IRON_INGOT.setCreativeTab(tabSmithing);
    items.itemNuggetIron.setCreativeTab(tabSmithing);
    Items.GOLD_INGOT.setCreativeTab(tabSmithing);
    Items.GOLD_NUGGET.setCreativeTab(tabSmithing);
    items.itemIngotMithril.setCreativeTab(tabSmithing);
    items.itemNuggetMithril.setCreativeTab(tabSmithing);
    items.itemIronSwordHead.setCreativeTab(tabSmithing);
    items.itemIronSwordHilt.setCreativeTab(tabSmithing);
    items.itemIronPickHead.setCreativeTab(tabSmithing);
    items.itemIronShovelHead.setCreativeTab(tabSmithing);
    items.itemIronAxeHead.setCreativeTab(tabSmithing);
    items.itemIronHoeHead.setCreativeTab(tabSmithing);
    items.itemMithrilSwordHead.setCreativeTab(tabSmithing);
    items.itemMithrilSwordHilt.setCreativeTab(tabSmithing);
    items.itemMithrilPickHead.setCreativeTab(tabSmithing);
    items.itemMithrilShovelHead.setCreativeTab(tabSmithing);
    items.itemMithrilAxeHead.setCreativeTab(tabSmithing);
    items.itemMithrilHoeHead.setCreativeTab(tabSmithing);
    items.itemArrowHead.setCreativeTab(tabSmithing);
    
    //ENCHANTING
    Items.EXPERIENCE_BOTTLE.setCreativeTab(tabEnchanting);
    Items.BOOK.setCreativeTab(tabEnchanting);
    Items.DYE.setCreativeTab(tabEnchanting);
    
    //REMOVE VANILLA BLOCKS FROM CREATIVE TABS
	Blocks.ANVIL.setCreativeTab(null);
	
    //SORT BLOCKS INTO CREAIVETABS

	//FARMING
	Blocks.BROWN_MUSHROOM.setCreativeTab(tabFarming);
	Blocks.RED_MUSHROOM.setCreativeTab(tabFarming);
	
	//MINING
	Blocks.COAL_ORE.setCreativeTab(tabMining);
	Blocks.REDSTONE_ORE.setCreativeTab(tabMining);
	Blocks.LAPIS_ORE.setCreativeTab(tabMining);
	Blocks.IRON_ORE.setCreativeTab(tabMining);
	Blocks.GOLD_ORE.setCreativeTab(tabMining);
	Blocks.EMERALD_ORE.setCreativeTab(tabMining);
	Blocks.DIAMOND_ORE.setCreativeTab(tabMining);
	
    
	//SMITHING
	Blocks.FURNACE.setCreativeTab(Dorfcraft.tabSmithing);
	Blocks.ANVIL.setCreativeTab(Dorfcraft.tabSmithing);
	
	//MASONRY
	Blocks.STONEBRICK.setCreativeTab(tabMasonry);
	Blocks.STONE_BRICK_STAIRS.setCreativeTab(tabMasonry);
	Blocks.DOUBLE_STONE_SLAB.setCreativeTab(tabMasonry);
	Blocks.DOUBLE_STONE_SLAB2.setCreativeTab(tabMasonry);
	Blocks.STONE_SLAB.setCreativeTab(tabMasonry);
	Blocks.STONE_SLAB2.setCreativeTab(tabMasonry);
	Blocks.SANDSTONE.setCreativeTab(tabMasonry);
	Blocks.SANDSTONE_STAIRS.setCreativeTab(tabMasonry);
	Blocks.RED_SANDSTONE.setCreativeTab(tabMasonry);
	Blocks.RED_SANDSTONE_STAIRS.setCreativeTab(tabMasonry);

	//CARPENTRY
	Blocks.PLANKS.setCreativeTab(tabCarpentry);
	Blocks.ACACIA_DOOR.setCreativeTab(tabCarpentry);
	Blocks.ACACIA_FENCE.setCreativeTab(tabCarpentry);
	Blocks.ACACIA_FENCE_GATE.setCreativeTab(tabCarpentry);
	Blocks.ACACIA_STAIRS.setCreativeTab(tabCarpentry);
	Blocks.SPRUCE_DOOR.setCreativeTab(tabCarpentry);
	Blocks.SPRUCE_FENCE.setCreativeTab(tabCarpentry);
	Blocks.SPRUCE_FENCE_GATE.setCreativeTab(tabCarpentry);
	Blocks.SPRUCE_STAIRS.setCreativeTab(tabCarpentry);
	Blocks.OAK_DOOR.setCreativeTab(tabCarpentry);
	Blocks.OAK_FENCE.setCreativeTab(tabCarpentry);
	Blocks.OAK_FENCE_GATE.setCreativeTab(tabCarpentry);
	Blocks.OAK_STAIRS.setCreativeTab(tabCarpentry);
	Blocks.DARK_OAK_DOOR.setCreativeTab(tabCarpentry);
	Blocks.DARK_OAK_FENCE.setCreativeTab(tabCarpentry);
	Blocks.DARK_OAK_FENCE_GATE.setCreativeTab(tabCarpentry);
	Blocks.DARK_OAK_STAIRS.setCreativeTab(tabCarpentry);
	Blocks.JUNGLE_DOOR.setCreativeTab(tabCarpentry);
	Blocks.JUNGLE_FENCE.setCreativeTab(tabCarpentry);
	Blocks.JUNGLE_FENCE_GATE.setCreativeTab(tabCarpentry);
	Blocks.JUNGLE_STAIRS.setCreativeTab(tabCarpentry);
	Blocks.BIRCH_DOOR.setCreativeTab(tabCarpentry);
	Blocks.BIRCH_FENCE.setCreativeTab(tabCarpentry);
	Blocks.BIRCH_FENCE_GATE.setCreativeTab(tabCarpentry);
	Blocks.BIRCH_STAIRS.setCreativeTab(tabCarpentry);
	
	//ENCHANTING
    Blocks.ENCHANTING_TABLE.setCreativeTab(tabEnchanting);
    Blocks.BOOKSHELF.setCreativeTab(tabEnchanting);
    
	
	//MODIFY VANILLA BLOCK ATTRIBUTES
	Blocks.COBBLESTONE.setHardness(1.5F);
	Blocks.STONE.setHardness(2.0F);
	Blocks.STONEBRICK.setHardness(4.0F);
	Blocks.SANDSTONE.setHardness(3.0F);
	Blocks.RED_SANDSTONE.setHardness(3.0F);
	
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
