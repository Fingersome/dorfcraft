package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import fingersome.dorfcraft.handlers.MaterialHandler;
import fingersome.dorfcraft.handlers.TabHandler;
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

	public static Item itemHelmetCrown;
	public static Item itemRodKing;
	public static Item itemHelmetNecro;
	public static Item itemRodBone;
	
	public static Item itemChisel;
	public static Item itemCan;
	public static Item itemHammer;
	public static Item itemOrb;
	public static Item itemTome;

	public static Item toolNecroKnife;
	
	public static Item toolRustyPick;
	public static Item toolRustySword;
	public static Item toolRustyKnife;

		
	    public static void init() {


	        itemHelmetCrown 	= new ItemHelmetCrown	(ItemInfo.ITEM_HELMET_CROWN_UNLOCALIZED, Dorfcraft.tabCommand, MaterialHandler.ARMOR_KING, 0, EntityEquipmentSlot.HEAD);
	        itemRodKing			= new ItemRodKing		(ItemInfo.ITEM_ROD_KING_UNLOCALIZED);
	        itemHelmetNecro 	= new ItemHelmetNecro	(ItemInfo.ITEM_HELMET_NECRO_UNLOCALIZED, Dorfcraft.tabCommand, MaterialHandler.ARMOR_NECRO, 0, EntityEquipmentSlot.HEAD);
	        itemRodBone			= new ItemRodBone		(ItemInfo.ITEM_ROD_BONE_UNLOCALIZED);
	        
	        itemChisel 		= new ItemChisel		(ItemInfo.ITEM_CHISEL_UNLOCALIZED);
	        itemCan			= new ItemCan			(ItemInfo.ITEM_CAN_UNLOCALIZED);
	        itemHammer	 	= new ItemHammer		(ItemInfo.ITEM_HAMMER_UNLOCALIZED);
	        itemOrb			= new ItemOrb			(ItemInfo.ITEM_ORB_UNLOCALIZED);
	        itemTome		= new ItemTome			(ItemInfo.ITEM_TOME_UNLOCALIZED);

	        toolNecroKnife	= new ToolNecroKnife	(MaterialHandler.NECRO_KNIFE, ItemInfo.TOOL_NECRO_KNIFE_UNLOCALIZED);

	        toolRustyPick	= new ToolRustyPick		(MaterialHandler.RUSTY_PICK, 	ItemInfo.TOOL_RUSTY_PICK_UNLOCALIZED);
	        toolRustySword	= new ToolRustySword	(MaterialHandler.RUSTY_SWORD, 	ItemInfo.TOOL_RUSTY_SWORD_UNLOCALIZED);
	        toolRustyKnife	= new ToolRustyKnife	(MaterialHandler.RUSTY_KNIFE, 	ItemInfo.TOOL_RUSTY_KNIFE_UNLOCALIZED);
	        
	        
	        
	        registerItems();
	    }

	    public static void registerItems() {

	        GameRegistry.register(itemHelmetCrown);
	        GameRegistry.register(itemRodKing, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_ROD_KING_UNLOCALIZED));
	        GameRegistry.register(itemHelmetNecro);
	        GameRegistry.register(itemRodBone, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_ROD_BONE_UNLOCALIZED));
	        
	        GameRegistry.register(itemChisel, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_CHISEL_UNLOCALIZED));
	        GameRegistry.register(itemCan, 		new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_CAN_UNLOCALIZED));
	        GameRegistry.register(itemHammer, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_HAMMER_UNLOCALIZED));
	        GameRegistry.register(itemOrb, 		new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_ORB_UNLOCALIZED));
	        GameRegistry.register(itemTome, 	new ResourceLocation(ModInfo.MODID, ItemInfo.ITEM_TOME_UNLOCALIZED));	

	        GameRegistry.register(toolNecroKnife, 	new ResourceLocation(ModInfo.MODID, ItemInfo.TOOL_NECRO_KNIFE_UNLOCALIZED));	

	        GameRegistry.register(toolRustyPick, 	new ResourceLocation(ModInfo.MODID, ItemInfo.TOOL_RUSTY_PICK_UNLOCALIZED));    
	        GameRegistry.register(toolRustySword, 	new ResourceLocation(ModInfo.MODID, ItemInfo.TOOL_RUSTY_SWORD_UNLOCALIZED)); 
	        GameRegistry.register(toolRustyKnife, 	new ResourceLocation(ModInfo.MODID, ItemInfo.TOOL_RUSTY_KNIFE_UNLOCALIZED));

	    }
	    

	   
	    public static void registerRenders() {      

	    	ItemHelmetCrown.registerRender	(itemHelmetCrown);
	    	ItemRodKing.registerRender		(itemRodKing);
	    	ItemHelmetNecro.registerRender	(itemHelmetNecro);
	    	ItemRodBone.registerRender		(itemRodBone);
	    	
	    	ItemChisel.registerRender		(itemChisel);
	    	ItemCan.registerRender			(itemCan);
	    	ItemHammer.registerRender		(itemHammer);
	    	ItemOrb.registerRender			(itemOrb);
	    	ItemTome.registerRender			(itemTome);

	    	ToolNecroKnife.registerRender		(toolNecroKnife);
	    	
	    	ToolRustyPick.registerRender		(toolRustyPick);
	    	ToolRustySword.registerRender		(toolRustySword);
	    	ToolRustyKnife.registerRender		(toolRustyKnife);

	    	
	    }
		
}
	    
	   

