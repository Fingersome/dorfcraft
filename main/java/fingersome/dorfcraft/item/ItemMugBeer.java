package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMugBeer extends Item
{
	private final String name = ItemInfo.ITEM_BEER_UNLOCALIZED;

	public ItemMugBeer()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_BEER_UNLOCALIZED);
		setCreativeTab(Dorfcraft.tabDorf);
		setMaxStackSize(1);
	}
	
	public String getName()
	{
		return name;
	}
	
}
