package fingersome.dorfcraft.item;

import fingersome.dorfcraft.ModInfo;
import fingersome.dorfcraft.item.baubles.ItemMaskKing;
import fingersome.dorfcraft.item.baubles.ItemMaskNecro;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemList 
{
	
	//DECLARE ITEMS

	public static Item itemMaskKing;
	public static Item itemMaskNecro;
	
	public static Item itemHammer;
	public static Item itemChisel;
	public static Item itemSaw;
	public static Item itemKnife;
	public static Item itemCan;
	public static Item itemMortar;
	public static Item itemTome;

	
	    public static void init() {


	        itemMaskKing 	= new ItemMaskKing	(ItemInfo.ITEM_MASK_KING_UNLOCALIZED, true);
	        itemMaskNecro 	= new ItemMaskNecro	(ItemInfo.ITEM_MASK_NECRO_UNLOCALIZED, true);
	    	
	        itemHammer 	= new ItemHammer	(ItemInfo.ITEM_HAMMER_UNLOCALIZED);
	        itemChisel 	= new ItemChisel	(ItemInfo.ITEM_CHISEL_UNLOCALIZED);
	        itemSaw 	= new ItemSaw		(ItemInfo.ITEM_SAW_UNLOCALIZED);
	        itemCan		= new ItemCan		(ItemInfo.ITEM_CAN_UNLOCALIZED);
	        itemMortar	= new ItemMortar	(ItemInfo.ITEM_MORTAR_UNLOCALIZED);
	        itemTome	= new ItemTome		(ItemInfo.ITEM_TOME_UNLOCALIZED);

	        registerItems();
	    }

	    public static void registerItems() {

	        GameRegistry.register(itemMaskKing, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_MASK_KING_UNLOCALIZED));
	        GameRegistry.register(itemMaskNecro, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_MASK_NECRO_UNLOCALIZED));
	    	
	        GameRegistry.register(itemHammer, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_HAMMER_UNLOCALIZED));
	        GameRegistry.register(itemChisel, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_CHISEL_UNLOCALIZED));
	        GameRegistry.register(itemSaw, 		new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_SAW_UNLOCALIZED));
	        GameRegistry.register(itemCan, 		new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_CAN_UNLOCALIZED));
	        GameRegistry.register(itemMortar, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_MORTAR_UNLOCALIZED));
	        GameRegistry.register(itemTome, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_TOME_UNLOCALIZED));
	    }
	    
	    public static void registerRenders() {      

	    	ItemMaskKing.registerRender	(itemMaskKing);
	    	ItemMaskNecro.registerRender	(itemMaskNecro);
	    	
	    	ItemHammer.registerRender	(itemHammer);
	    	ItemChisel.registerRender	(itemChisel);
	    	ItemSaw.registerRender		(itemSaw);
	    	ItemCan.registerRender		(itemCan);
	    	ItemMortar.registerRender	(itemMortar);
	    	ItemTome.registerRender		(itemTome);
	    	
	    }

	  

		public void retextureVanillaItems() {
			//todo
		   
		}
		
}
	    
	   

