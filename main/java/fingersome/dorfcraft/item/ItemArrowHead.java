package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemArrowHead extends Item
{
	private final String name = ItemInfo.ITEM_ARROW_HEAD_UNLOCALIZED;

	public ItemArrowHead()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_ARROW_HEAD_UNLOCALIZED);
		setCreativeTab(Dorfcraft.tabSmithing);
	}
	
	public String getName()
	{
		return name;
	}
	
}
