package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemPlankBirch extends Item
{
	private final String name = ItemInfo.ITEM_PLANK_BIRCH_UNLOCALIZED;

	public ItemPlankBirch()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_PLANK_BIRCH_UNLOCALIZED);
		setMaxStackSize(64);
		setCreativeTab(DorfsVsGoblins.tabCarpentry);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
