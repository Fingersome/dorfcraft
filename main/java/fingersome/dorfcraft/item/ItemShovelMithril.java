package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
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
		setCreativeTab(CreativeTabs.TOOLS);
	}
	
	public String getName()
	{
		return name;
	}
	
}
