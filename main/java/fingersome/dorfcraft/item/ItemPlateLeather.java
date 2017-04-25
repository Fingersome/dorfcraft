package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemPlateLeather extends Item
{
	private final String name = ItemInfo.ITEM_PLATE_LEATHER_UNLOCALIZED;

	public ItemPlateLeather()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_PLATE_LEATHER_UNLOCALIZED);
		setCreativeTab(Dorfcraft.tabSmithing);
	}
	
	public String getName()
	{
		return name;
	}
	
}
