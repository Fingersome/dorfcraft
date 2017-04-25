package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMithrilSwordHilt extends Item
{
	private final String name = ItemInfo.ITEM_MITHRIL_SWORD_HILT_UNLOCALIZED;

	public ItemMithrilSwordHilt()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_MITHRIL_SWORD_HILT_UNLOCALIZED);
		setMaxStackSize(1);
		setCreativeTab(Dorfcraft.tabSmithing);
	}
	
	public String getName()
	{
		return name;
	}
	
}
