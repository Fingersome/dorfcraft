package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemDorfSkull extends Item
{
	private final String name = ItemInfo.ITEM_SKULL_UNLOCALIZED;

	public ItemDorfSkull()
	{
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_SKULL_UNLOCALIZED);
		setCreativeTab(DorfsVsGoblins.tabDvG);
	}
	
	public String getName()
	{
		return name;
	}
	
}
