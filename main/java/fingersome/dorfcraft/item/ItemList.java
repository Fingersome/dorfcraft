package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import fingersome.dorfcraft.handlers.MaterialHandler;
import net.minecraft.block.Block;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemList 
{
	
	//DECLARE ITEMS

	public static Item itemHelmetCrown;
	public static Item itemHelmetNecro;
	public static Item itemRodKing;
	public static Item itemRodBone;
	
	public static Item itemChisel;
	public static Item itemCan;
	public static Item itemHammer;
	public static Item itemOrb;
	public static Item itemTome;
	public static Item itemKnife;

		
	    public static void init() {


	        itemHelmetCrown 	= new ItemHelmetCrown	(ItemInfo.ITEM_HELMET_CROWN_UNLOCALIZED, Dorfcraft.tab, MaterialHandler.ARMOR_KING, 0, EntityEquipmentSlot.HEAD);
	        itemHelmetNecro 	= new ItemHelmetNecro	(ItemInfo.ITEM_HELMET_NECRO_UNLOCALIZED, Dorfcraft.tab, MaterialHandler.ARMOR_NECRO, 0, EntityEquipmentSlot.HEAD);
	        itemRodKing			= new ItemRodKing		(ItemInfo.ITEM_ROD_KING_UNLOCALIZED);
	        itemRodBone			= new ItemRodBone		(ItemInfo.ITEM_ROD_BONE_UNLOCALIZED);
	        
	        itemChisel 	= new ItemChisel	(ItemInfo.ITEM_CHISEL_UNLOCALIZED);
	        itemCan		= new ItemCan		(ItemInfo.ITEM_CAN_UNLOCALIZED);
	        itemHammer 	= new ItemHammer	(ItemInfo.ITEM_HAMMER_UNLOCALIZED);
	        itemOrb		= new ItemOrb		(ItemInfo.ITEM_ORB_UNLOCALIZED);
	        itemTome	= new ItemTome		(ItemInfo.ITEM_TOME_UNLOCALIZED);
	        itemKnife	= new ItemKnife		(ItemInfo.ITEM_KNIFE_UNLOCALIZED);
	        
	        
	        registerItems();
	    }

	    public static void registerItems() {

	        GameRegistry.register(itemHelmetCrown);
	        GameRegistry.register(itemHelmetNecro);
	        GameRegistry.register(itemRodKing, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_ROD_KING_UNLOCALIZED));
	        GameRegistry.register(itemRodBone, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_ROD_BONE_UNLOCALIZED));
	        
	        GameRegistry.register(itemChisel, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_CHISEL_UNLOCALIZED));
	        GameRegistry.register(itemCan, 		new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_CAN_UNLOCALIZED));
	        GameRegistry.register(itemHammer, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_HAMMER_UNLOCALIZED));
	        GameRegistry.register(itemOrb, 		new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_ORB_UNLOCALIZED));
	        GameRegistry.register(itemTome, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_TOME_UNLOCALIZED));	
	        GameRegistry.register(itemKnife, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_KNIFE_UNLOCALIZED));	        

	    }
	    

	   
	    public static void registerRenders() {      

	    	ItemHelmetCrown.registerRender	(itemHelmetCrown);
	    	ItemHelmetNecro.registerRender	(itemHelmetNecro);
	    	ItemRodKing.registerRender		(itemRodKing);
	    	ItemRodBone.registerRender		(itemRodBone);
	    	
	    	ItemChisel.registerRender		(itemChisel);
	    	ItemCan.registerRender			(itemCan);
	    	ItemHammer.registerRender		(itemHammer);
	    	ItemOrb.registerRender			(itemOrb);
	    	ItemTome.registerRender			(itemTome);
	    	ItemKnife.registerRender		(itemKnife);

	    	
	    }
		
}
	    
	   

