package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMithrilAxeHead extends Item
{
	private final String name = ItemInfo.ITEM_MITHRIL_AXE_HEAD_UNLOCALIZED;

	public ItemMithrilAxeHead()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_MITHRIL_AXE_HEAD_UNLOCALIZED);
		setMaxStackSize(1);
		setCreativeTab(Dorfcraft.tabSmithing);

	}
	
	public String getName()
	{
		return name;
	}
	
}
