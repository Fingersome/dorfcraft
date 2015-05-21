package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMugBeer extends Item
{
	private final String name = ItemInfo.ITEM_BEER_UNLOCALIZED;

	public ItemMugBeer()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_BEER_UNLOCALIZED);
		setCreativeTab(DorfsVsGoblins.tabDvG);
		setMaxStackSize(1);

		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
