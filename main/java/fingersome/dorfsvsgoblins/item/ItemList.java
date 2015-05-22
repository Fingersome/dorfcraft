package fingersome.dorfsvsgoblins.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import fingersome.dorfsvsgoblins.item.*;

public class ItemList 
{
	
	//DECLARE ITEMS

	public static Item itemMug;
	public static Item itemMugBeer;
	public static Item itemHopSeeds;
	public static Item itemHops;

	public static Item itemIngotMithril;
	public static Item itemNuggetMithril;
	public static Item itemNuggetIron;

	public static Item itemKnifeHead;	
	public static Item itemChiselHead;
	public static Item itemArrowHead;
	
	public static Item itemKnife;
	public static Item itemChisel;

	public static Item itemHammerStone;
	public static Item itemHammerIron;
	public static Item itemHammerMithril;
	
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
	public static Item itemMithrilhoeHead;

	public static Item itemFlintKnife;
	public static Item itemFlintPickaxe;
	public static Item itemFlintAxe;
	
	public static Item itemSwordMithril;
	public static Item itemPickaxeMithril;
	public static Item itemShoveMithril;
	public static Item itemAxeMithril;
	public static Item itemHoeMithril;

	public static Item itemSalt;
	public static Item itemHide;
	public static Item itemCuredHide;
	public static Item itemPlateLeather;
	public static Item itemStrips;
	
	public static Item itemChain;
	public static Item itemPlateIron;
	public static Item itemPlateMithril;
	
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
	public static Item itemAlchemyOrb;
	
	public static Item itemDorfSkullCrown;
	public static Item itemDorfSkull;
	public static Item itemDorfTooth;
		
		public static void Init()
		{
			//INITIALISE ITEMS
			itemMug 		= new ItemMug();
			itemMugBeer 	= new ItemMugBeer();
			itemHopSeeds 	= new ItemHopSeeds();
			itemHops		= new ItemHops();

			itemIngotMithril 	= new ItemIngotMithril();
			itemNuggetMithril 	= new ItemNuggetMithril();				
			itemNuggetIron 		= new ItemNuggetIron();

			itemKnifeHead 	= new ItemKnifeHead();
			itemChiselHead 	= new ItemChiselHead();		
			itemArrowHead 	= new ItemArrowHead();

			itemKnife 	= new ItemKnife();
			itemChisel 	= new ItemChisel();	

			itemHammerStone 	= new ItemHammerStone();	
			itemHammerIron 		= new ItemHammerIron();	
			itemHammerMithril 	= new ItemHammerMithril();	
			
			itemIronSwordHead 	= new ItemIronSwordHead();	
			itemIronSwordHilt 	= new ItemIronSwordHilt();	
			itemIronPickHead 	= new ItemIronPickHead();	
			itemIronShovelHead 	= new ItemIronShovelHead();	
			itemIronAxeHead 	= new ItemIronAxeHead();	
			itemIronHoeHead 	= new ItemIronHoeHead();	
			
			itemDorfSkull = new ItemDorfSkull();
			
		}
		
}
