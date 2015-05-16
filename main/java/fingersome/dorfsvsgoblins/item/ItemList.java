package fingersome.dorfsvsgoblins.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;

public class ItemList 
{
	//DECLARE ITEMS

	public static Item itemMug;
	public static Item itemBeer;
	public static Item itemDorfSkull;
		
		
		public static void Init()
		{
			//INITIALISE ITEMS
			itemMug = new ItemMug();
			itemBeer = new ItemBeer();
			itemDorfSkull = new ItemDorfSkull();
		}
		
		
}
