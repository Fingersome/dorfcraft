package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemKnife extends Item
{
	private final String name = ItemInfo.ITEM_KNIFE_UNLOCALIZED;

	public ItemKnife()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_KNIFE_UNLOCALIZED);
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(1);

		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
