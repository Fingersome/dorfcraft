package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemNuggetIron extends Item
{
	private final String name = ItemInfo.ITEM_NUGGET_IRON_UNLOCALIZED;

	public ItemNuggetIron()
	{		
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_NUGGET_IRON_UNLOCALIZED);

		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
