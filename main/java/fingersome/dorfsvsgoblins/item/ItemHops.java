package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHops extends Item
{
	private final String name = ItemInfo.ITEM_HOPS_UNLOCALIZED;

	public ItemHops()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_HOPS_UNLOCALIZED);
		setCreativeTab(DorfsVsGoblins.tabDvG);

		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
