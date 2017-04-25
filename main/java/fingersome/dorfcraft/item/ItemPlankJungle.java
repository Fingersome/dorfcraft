package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemPlankJungle extends Item
{
	private final String name = ItemInfo.ITEM_PLANK_JUNGLE_UNLOCALIZED;

	public ItemPlankJungle()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_PLANK_JUNGLE_UNLOCALIZED);
		setCreativeTab(Dorfcraft.tabCarpentry);
	}
	
	public String getName()
	{
		return name;
	}
	
}
