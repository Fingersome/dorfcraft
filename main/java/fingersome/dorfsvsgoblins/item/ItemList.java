package fingersome.dorfsvsgoblins.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;

public class ItemList 
{
	//DECLARE ITEMS

	public static Item itemMug;
	public static Item itemMugBeer;
	public static Item itemHopSeeds;
	public static Item itemHops;
	
	public static Item itemHammerStone;
	public static Item itemHammerIron;
	public static Item itemHammerMithril;
	
	public static Item itemSwordMithril;

	public static Item itemLeatherCap;
	public static Item itemLeatherChest;
	public static Item itemLeatherLegs;
	public static Item itemLeatherShoes;

	public static Item itemChainCap;
	public static Item itemChainChest;
	public static Item itemChainLegs;
	public static Item itemChainShoes;

	public static Item itemIronCap;
	public static Item itemIronChest;
	public static Item itemIronLegs;
	public static Item itemIronShoes;

	public static Item itemMithrilCap;
	public static Item itemMithrilChest;
	public static Item itemMithrilLegs;
	public static Item itemMithrilShoes;
	
	public static Item itemCrown;
	
	public static Item itemDorfSkullCrown;
	public static Item itemDorfSkull;
	public static Item itemDorfTooth;
		
		public static void Init()
		{
			//INITIALISE ITEMS
			itemMug = new ItemMug();
			itemMugBeer = new ItemMugBeer();
			itemHopSeeds = new ItemHopSeeds();
			itemHops = new ItemHops();
			
			itemDorfSkull = new ItemDorfSkull();
		}
		
		
}
