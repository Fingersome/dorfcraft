package fingersome.dorfcraft;

import java.util.Iterator;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RecipeManager {

	//REMOVE VANILLA CRAFTING RECIPES
	public static void removeVanillaRecipes() {

		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
	    Iterator<IRecipe> itemstoremove = recipes.iterator();
		     		          
		     	while (itemstoremove.hasNext()) 
		     	{	ItemStack stack = itemstoremove.next().getRecipeOutput();
		     	
		     	/**TOOL RECIPES**/
		 		if (stack != null && stack.getItem()		== Items.SHEARS)
		 		itemstoremove.remove();
		 		
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

		 		/**ARMOR RECIPES**/
		 		
		 		if (stack != null && stack.getItem() 		== Items.LEATHER_BOOTS)
		 		itemstoremove.remove();
		 		else if (stack != null && stack.getItem()	== Items.LEATHER_LEGGINGS)
		 		itemstoremove.remove();
		 		else if (stack != null && stack.getItem()	== Items.LEATHER_CHESTPLATE)
		 		itemstoremove.remove();
		 		else if (stack != null && stack.getItem()	== Items.LEATHER_HELMET)
		 		itemstoremove.remove();
		 		
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

		     	/**MISC RECIPES**/
		 		if (stack != null && stack.getItem()		== Items.STICK)
		 		itemstoremove.remove();
		 		
		 		
		 		/**BLOCK RECIPES**/
		 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.PLANKS))
		 			itemstoremove.remove();
		 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.CRAFTING_TABLE))
			 	 	itemstoremove.remove();
		 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.CHEST))
			 	 	itemstoremove.remove();
		 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.FURNACE))
			 	 	itemstoremove.remove();
		 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.STONEBRICK))
		 			itemstoremove.remove();
		 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.TORCH))
		 			itemstoremove.remove();
		 		if (stack != null && stack.getItem() ==Item.getItemFromBlock(Blocks.REDSTONE_TORCH))
		 			itemstoremove.remove();
	 			
		 		
		     	}
 		}
}
