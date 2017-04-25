package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemPlateMithril extends Item
{
	private final String name = ItemInfo.ITEM_PLATE_MITHRIL_UNLOCALIZED;

	public ItemPlateMithril()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_PLATE_MITHRIL_UNLOCALIZED);
		setCreativeTab(Dorfcraft.tabSmithing);
	}
	
	public String getName()
	{
		return name;
	}
	
}
