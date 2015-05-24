package fingersome.dorfsvsgoblins.crafting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.item.ItemList;

public class DorfAnvilCraftingManager
{
    /** The static instance of this class */
    private static final DorfAnvilCraftingManager instance = new DorfAnvilCraftingManager();
    /** A list of all the recipes added */
    private List recipes = Lists.newArrayList();
    private static final String __OBFID = "CL_00000090";

    /**
     * Returns the static instance of this class
     */
    public static DorfAnvilCraftingManager getInstance()
    {
        /** The static instance of this class */
        return instance;
    }

    private DorfAnvilCraftingManager()
    {
    	
    	recipes = new ArrayList();
    	this.addRecipe(new ItemStack(ItemList.itemIronPickHead, 1), new Object[] {	"   ", 
    																				"III",
    																				"   ", 
    																				'I', Items.iron_ingot});
    	
    	
    	Collections.sort(this.recipes, new DorfAnvilRecipeSorter(this));
    }

    /**
     * Adds a shaped recipe to the games recipe list.
     */
    public DorfAnvilShapedRecipes addRecipe(ItemStack stack, Object ... recipeComponents)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (recipeComponents[i] instanceof String[])
        {
            String[] astring = (String[])((String[])recipeComponents[i++]);

            for (int l = 0; l < astring.length; ++l)
            {
                String s1 = astring[l];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }
        else
        {
            while (recipeComponents[i] instanceof String)
            {
                String s2 = (String)recipeComponents[i++];
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }

        HashMap hashmap;

        for (hashmap = Maps.newHashMap(); i < recipeComponents.length; i += 2)
        {
            Character character = (Character)recipeComponents[i];
            ItemStack itemstack1 = null;

            if (recipeComponents[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)recipeComponents[i + 1]);
            }
            else if (recipeComponents[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)recipeComponents[i + 1], 1, 32767);
            }
            else if (recipeComponents[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)recipeComponents[i + 1];
            }

            hashmap.put(character, itemstack1);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int i1 = 0; i1 < j * k; ++i1)
        {
            char c0 = s.charAt(i1);

            if (hashmap.containsKey(Character.valueOf(c0)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }

        DorfAnvilShapedRecipes shapedrecipes = new DorfAnvilShapedRecipes(j, k, aitemstack, stack);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }

    /**
     * Adds a shapeless crafting recipe to the the game.
     *  
     * @param recipeComponents An array of ItemStack's Item's and Block's that make up the recipe.
     */
    public void addShapelessRecipe(ItemStack stack, Object ... recipeComponents)
    {
        ArrayList arraylist = Lists.newArrayList();
        Object[] aobject = recipeComponents;
        int i = recipeComponents.length;

        for (int j = 0; j < i; ++j)
        {
            Object object1 = aobject[j];

            if (object1 instanceof ItemStack)
            {
                arraylist.add(((ItemStack)object1).copy());
            }
            else if (object1 instanceof Item)
            {
                arraylist.add(new ItemStack((Item)object1));
            }
            else
            {
                if (!(object1 instanceof Block))
                {
                    throw new IllegalArgumentException("Invalid shapeless recipe: unknown type " + object1.getClass().getName() + "!");
                }

                arraylist.add(new ItemStack((Block)object1));
            }
        }

        this.recipes.add(new ShapelessRecipes(stack, arraylist));
    }

    /**
     * Adds an IRecipe to the list of crafting recipes.
     *  
     * @param recipe A recipe that will be added to the recipe list.
     */
    public void addRecipe(IRecipe recipe)
    {
        this.recipes.add(recipe);
    }

    /**
     * Retrieves an ItemStack that has multiple recipes for it.
     */
    public ItemStack findMatchingRecipe(InventoryCrafting p_82787_1_, World worldIn)
    {
        Iterator iterator = this.recipes.iterator();
        IRecipe irecipe;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            irecipe = (IRecipe)iterator.next();
        }
        while (!irecipe.matches(p_82787_1_, worldIn));

        return irecipe.getCraftingResult(p_82787_1_);
    }

    public ItemStack[] func_180303_b(InventoryCrafting p_180303_1_, World worldIn)
    {
        Iterator iterator = this.recipes.iterator();

        while (iterator.hasNext())
        {
            IRecipe irecipe = (IRecipe)iterator.next();

            if (irecipe.matches(p_180303_1_, worldIn))
            {
                return irecipe.getRemainingItems(p_180303_1_);
            }
        }

        ItemStack[] aitemstack = new ItemStack[p_180303_1_.getSizeInventory()];

        for (int i = 0; i < aitemstack.length; ++i)
        {
            aitemstack[i] = p_180303_1_.getStackInSlot(i);
        }

        return aitemstack;
    }

    /**
     * returns the List<> of all recipes
     */
    public List getRecipeList()
    {
        return this.recipes;
    }
}