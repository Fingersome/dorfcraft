package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import fingersome.dorfcraft.handlers.MaterialHandler;
import net.minecraft.block.Block;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemList 
{
	
	//DECLARE ITEMS

	public static Item itemTome;
	
	public static Item helmetCrown;
	public static Item itemRodKing;
	public static Item helmetNecro;
	public static Item itemRodBone;

	public static Item itemHandpick;
	public static Item itemChisel;
	public static Item itemCan;
	public static Item itemHammer;
	public static Item itemOrb;
	public static Item itemQuill;

	public static Item toolNecroKnife;
	
	public static Item toolRustyPick;
	public static Item toolRustySword;
	public static Item toolRustyKnife;

		
	    public static void init() {

	        itemTome		= new ItemTome			(ItemInfo.ITEM_TOME_UNLOCALIZED);

	        helmetCrown 	= new ItemHelmetCrown	(ItemInfo.ITEM_HELMET_CROWN_UNLOCALIZED, Dorfcraft.tabCommand, MaterialHandler.ARMOR_KING, 0, EntityEquipmentSlot.HEAD);
	        helmetNecro 	= new ItemHelmetNecro	(ItemInfo.ITEM_HELMET_NECRO_UNLOCALIZED, Dorfcraft.tabCommand, MaterialHandler.ARMOR_NECRO, 0, EntityEquipmentSlot.HEAD);
	        itemRodKing		= new ItemRodKing		(ItemInfo.ITEM_ROD_KING_UNLOCALIZED);
	        itemRodBone		= new ItemRodBone		(ItemInfo.ITEM_ROD_BONE_UNLOCALIZED);

	        itemHandpick 	= new ItemHandpick		(ItemInfo.ITEM_HANDPICK_UNLOCALIZED);
	        itemChisel 		= new ItemChisel		(ItemInfo.ITEM_CHISEL_UNLOCALIZED);
	        itemCan			= new ItemCan			(ItemInfo.ITEM_CAN_UNLOCALIZED);
	        itemHammer	 	= new ItemHammer		(ItemInfo.ITEM_HAMMER_UNLOCALIZED);
	        itemOrb			= new ItemOrb			(ItemInfo.ITEM_ORB_UNLOCALIZED);
	        itemQuill		= new ItemQuill			(ItemInfo.ITEM_QUILL_UNLOCALIZED);

	        toolNecroKnife	= new ToolNecroKnife	(MaterialHandler.NECRO_KNIFE, ItemInfo.TOOL_NECRO_KNIFE_UNLOCALIZED);

	        toolRustyPick	= new ToolRustyPick		(MaterialHandler.RUSTY_PICK, 	ItemInfo.TOOL_RUSTY_PICK_UNLOCALIZED);
	        toolRustySword	= new ToolRustySword	(MaterialHandler.RUSTY_SWORD, 	ItemInfo.TOOL_RUSTY_SWORD_UNLOCALIZED);
	        toolRustyKnife	= new ToolRustyKnife	(MaterialHandler.RUSTY_KNIFE, 	ItemInfo.TOOL_RUSTY_KNIFE_UNLOCALIZED);
	        
	        
	        
	        registerItems();
	    }

	    public static void registerItems() {

	        GameRegistry.register(itemTome, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_TOME_UNLOCALIZED));	
	        
	        GameRegistry.register(helmetCrown);
	        GameRegistry.register(helmetNecro);
	        GameRegistry.register(itemRodKing, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_ROD_KING_UNLOCALIZED));
	        GameRegistry.register(itemRodBone, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_ROD_BONE_UNLOCALIZED));

	        GameRegistry.register(itemHandpick, new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_HANDPICK_UNLOCALIZED));
	        GameRegistry.register(itemChisel, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_CHISEL_UNLOCALIZED));
	        GameRegistry.register(itemCan, 		new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_CAN_UNLOCALIZED));
	        GameRegistry.register(itemHammer, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_HAMMER_UNLOCALIZED));
	        GameRegistry.register(itemOrb, 		new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_ORB_UNLOCALIZED));
	        GameRegistry.register(itemQuill, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_QUILL_UNLOCALIZED));

	        GameRegistry.register(toolNecroKnife, 	new ResourceLocation(ModInfo.MODID, ItemInfo.TOOL_NECRO_KNIFE_UNLOCALIZED));	

	        GameRegistry.register(toolRustyPick, 	new ResourceLocation(ModInfo.MODID, ItemInfo.TOOL_RUSTY_PICK_UNLOCALIZED));    
	        GameRegistry.register(toolRustySword, 	new ResourceLocation(ModInfo.MODID, ItemInfo.TOOL_RUSTY_SWORD_UNLOCALIZED)); 
	        GameRegistry.register(toolRustyKnife, 	new ResourceLocation(ModInfo.MODID, ItemInfo.TOOL_RUSTY_KNIFE_UNLOCALIZED));

	    }
	    

	   
	    public static void registerRenders() {      

	    	ItemTome.registerRender			(itemTome);
	    	
	    	ItemHelmetCrown.registerRender	(helmetCrown);
	    	ItemHelmetNecro.registerRender	(helmetNecro);
	    	ItemRodKing.registerRender		(itemRodKing);
	    	ItemRodBone.registerRender		(itemRodBone);

	    	ItemHandpick.registerRender		(itemHandpick);
	    	ItemChisel.registerRender		(itemChisel);
	    	ItemCan.registerRender			(itemCan);
	    	ItemHammer.registerRender		(itemHammer);
	    	ItemOrb.registerRender			(itemOrb);
	    	ItemQuill.registerRender		(itemQuill);

	    	ToolNecroKnife.registerRender		(toolNecroKnife);
	    	
	    	ToolRustyPick.registerRender		(toolRustyPick);
	    	ToolRustySword.registerRender		(toolRustySword);
	    	ToolRustyKnife.registerRender		(toolRustyKnife);

	    	
	    }
		
}
	    
	   

