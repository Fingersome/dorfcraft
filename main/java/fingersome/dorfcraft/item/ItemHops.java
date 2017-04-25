package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHops extends Item
{
	private final String name = ItemInfo.ITEM_HOPS_UNLOCALIZED;

	public ItemHops()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_HOPS_UNLOCALIZED);

	}
	
	public String getName()
	{
		return name;
	}
	
}
