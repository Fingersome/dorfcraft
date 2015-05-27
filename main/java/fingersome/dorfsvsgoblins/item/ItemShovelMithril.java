package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemShovelMithril extends Item
{
	private final String name = ItemInfo.ITEM_SHOVEL_MITHRIL_UNLOCALIZED;

	public ItemShovelMithril()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_SHOVEL_MITHRIL_UNLOCALIZED);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
