package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
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

		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
