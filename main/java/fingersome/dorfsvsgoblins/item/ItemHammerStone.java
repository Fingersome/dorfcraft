package fingersome.dorfsvsgoblins.item;

import java.util.Random;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemHammerStone extends Item
{
	private final String name = ItemInfo.ITEM_HAMMER_STONE_UNLOCALIZED;

	public ItemHammerStone()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_HAMMER_STONE_UNLOCALIZED);
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(1);

		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
	/*
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
	   //plays anvil sound when hammer is rightclicked
	   world.playSoundAtEntity(player, "minecraft:random.anvil_land", 1.0F, 1.0F);
		   
	   return stack; 
	}
	*/
}
