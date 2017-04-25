package fingersome.dorfcraft.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import fingersome.dorfcraft.item.*;

public class ItemList 
{
	
	//DECLARE ITEMS

	public static Item itemMug;
	public static Item itemMugAle;
	public static Item itemHopSeeds;
	public static Item itemHops;

	public static Item itemIngotMithril;
	public static Item itemNuggetMithril;
	public static Item itemNuggetIron;

	public static Item itemHammer;
	public static Item itemChisel;
	public static Item itemSaw;
	public static Item itemKnife;
	public static Item itemCan;
	public static Item itemMortar;
	public static Item itemInkwell;

	public static Item itemIronSwordHead;
	public static Item itemIronSwordHilt;
	public static Item itemIronPickHead;
	public static Item itemIronShovelHead;
	public static Item itemIronAxeHead;
	public static Item itemIronHoeHead;

	public static Item itemMithrilSwordHead;
	public static Item itemMithrilSwordHilt;
	public static Item itemMithrilPickHead;
	public static Item itemMithrilShovelHead;
	public static Item itemMithrilAxeHead;
	public static Item itemMithrilHoeHead;

	public static Item itemFlintKnife;
	public static Item itemFlintSpear;
	public static Item itemFlintPickaxe;
	public static Item itemFlintShovel;
	public static Item itemFlintAxe;
	
	public static Item itemSwordMithril;
	public static Item itemPickaxeMithril;
	public static Item itemShovelMithril;
	public static Item itemAxeMithril;
	public static Item itemHoeMithril;

	public static Item itemPlankOak;
	public static Item itemPlankPine;
	public static Item itemPlankBirch;
	public static Item itemPlankJungle;
	public static Item itemPlankAcacia;
	public static Item itemPlankDarkOak;
	
	public static Item itemSalt;
	public static Item itemHide;
	public static Item itemHideCured;
	public static Item itemPlateLeather;
	public static Item itemStrips;
	
	public static Item itemChain;
	public static Item itemPlateIron;
	public static Item itemPlateMithril;
	public static Item itemArrowHead;
	
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
	public static Item itemScepter;
	public static Item itemTome;
	
	public static Item itemMask;
	public static Item itemRod;
	public static Item itemGrimoire;

	public static Item itemDustGood;
	public static Item itemDustEvil;
	
		
		public static void Init()
		{
			//INITIALISE ITEMS
			itemMug 				= new ItemMug();
			itemMugAle 				= new ItemMugBeer();
			itemHopSeeds 			= new ItemHopSeeds();
			itemHops				= new ItemHops();

			itemIngotMithril 		= new ItemIngotMithril();
			itemNuggetMithril 		= new ItemNuggetMithril();				
			itemNuggetIron 			= new ItemNuggetIron();
						
			itemKnife 				= new ItemKnife();
			itemChisel 				= new ItemChisel();	
			itemHammer 				= new ItemHammer();		

			itemIronSwordHead 		= new ItemIronSwordHead();	
			itemIronSwordHilt 		= new ItemIronSwordHilt();	
			itemIronPickHead 		= new ItemIronPickHead();	
			itemIronShovelHead 		= new ItemIronShovelHead();	
			itemIronAxeHead 		= new ItemIronAxeHead();	
			itemIronHoeHead 		= new ItemIronHoeHead();	
		
			itemMithrilSwordHead 	= new ItemMithrilSwordHead();	
			itemMithrilSwordHilt 	= new ItemMithrilSwordHilt();	
			itemMithrilPickHead 	= new ItemMithrilPickHead();	
			itemMithrilShovelHead 	= new ItemMithrilShovelHead();	
			itemMithrilAxeHead 		= new ItemMithrilAxeHead();	
			itemMithrilHoeHead 		= new ItemMithrilHoeHead();	
			
			itemFlintKnife 			= new ItemFlintKnife();
			itemFlintPickaxe 		= new ItemFlintPickaxe();
			itemFlintAxe 			= new ItemFlintAxe();
			
			itemSwordMithril 		= new ItemSwordMithril();
			itemPickaxeMithril 		= new ItemPickaxeMithril();
			itemShovelMithril 		= new ItemShovelMithril();
			itemAxeMithril 			= new ItemAxeMithril();
			itemHoeMithril 			= new ItemHoeMithril();

			itemPlankOak			= new ItemPlankOak();
			itemPlankPine			= new ItemPlankPine();
			itemPlankBirch			= new ItemPlankBirch();
			itemPlankJungle			= new ItemPlankJungle();
			itemPlankAcacia			= new ItemPlankAcacia();
			itemPlankDarkOak		= new ItemPlankDarkOak();

			itemSalt				= new ItemSalt();
			itemHide				= new ItemHide();
			itemHideCured			= new ItemHideCured();
			itemPlateLeather		= new ItemPlateLeather();
			itemStrips				= new ItemStrips();

			itemChain				= new ItemChain();
			itemPlateIron			= new ItemPlateIron();
			itemPlateMithril		= new ItemPlateMithril();
			itemArrowHead 			= new ItemArrowHead();
			
			
		}
		
}
