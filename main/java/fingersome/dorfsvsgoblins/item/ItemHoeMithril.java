package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHoeMithril extends Item
{
	private final String name = ItemInfo.ITEM_HOE_MITHRIL_UNLOCALIZED;

	public ItemHoeMithril()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_HOE_MITHRIL_UNLOCALIZED);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
