package fingersome.dorfcraft.common.items;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.client.DorfTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DorfcraftItems {

	public static final CreativeTabs dorfTab = new DorfTab();
	
	public static Item itemCrown;
	public static Item itemScepter;
	public static Item itemTome;
	public static Item itemDustGood;
	public static Item itemMask;
	public static Item itemRod;
	public static Item itemGrimoire;
	public static Item itemDustEvil;
	public static Item itemHammer;
	public static Item itemChisel;
	public static Item itemMortar;
	public static Item itemTrowel;
	public static Item itemSaw;
	public static Item itemCan;
	public static Item itemFlagon;
	public static Item itemFlagonAle;
	 
	 public static void init() {
			//spooky items
			itemMask 		= new ItemMask("itemMask").setCreativeTab(CreativeTabs.TOOLS);
			itemRod			= new ItemRod("itemRod").setCreativeTab(dorfTab);
			itemGrimoire	= new ItemGrimoire("itemGrimoire").setCreativeTab(dorfTab);
			
			//kingly items
			itemCrown 		= new ItemCrown("itemCrown").setCreativeTab(dorfTab);
			itemScepter 	= new ItemScepter("itemScepter").setCreativeTab(dorfTab);
			itemTome 		= new ItemTome("itemTome").setCreativeTab(dorfTab);
			
			//dorfy items
			itemHammer 		= new ItemHammer("itemHammer").setCreativeTab(dorfTab);
			itemChisel		= new ItemChisel("itemChisel").setCreativeTab(dorfTab);
			itemMortar		= new ItemMortar("itemMortar").setCreativeTab(dorfTab);
			itemTrowel 		= new ItemTrowel("itemTrowel").setCreativeTab(dorfTab);
			itemSaw 		= new ItemSaw("itemSaw").setCreativeTab(dorfTab);
			itemCan			= new ItemCan("itemCan").setCreativeTab(dorfTab);
			itemFlagon 		= new ItemFlagonAle("itemFlagonAle").setCreativeTab(dorfTab);
			itemFlagonAle 	= new ItemFlagon("itemFlagon").setCreativeTab(dorfTab);
			
			//crafty items
			itemDustGood	= new ItemCrafting("itemDustGood").setCreativeTab(dorfTab);
			itemDustEvil	= new ItemCrafting("itemDustEvil").setCreativeTab(dorfTab);
					
	 };
	 
	 public static void registerItems() {
		 //spooky items
		 GameRegistry.register(itemMask);
		 GameRegistry.register(itemRod);
		 GameRegistry.register(itemGrimoire);
		 
		 //kingly items
		 GameRegistry.register(itemCrown);
		 GameRegistry.register(itemScepter);
		 GameRegistry.register(itemTome);

		 //dorfy items
		 GameRegistry.register(itemHammer);
		 GameRegistry.register(itemChisel);
		 GameRegistry.register(itemMortar);
		 GameRegistry.register(itemTrowel);
		 GameRegistry.register(itemSaw);
		 GameRegistry.register(itemCan);
		 GameRegistry.register(itemFlagon);
		 GameRegistry.register(itemFlagonAle);
	 }
	
}
