package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHammer extends Item
{
	private final String name = ItemInfo.ITEM_HAMMER_UNLOCALIZED;

	public ItemHammer()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_HAMMER_UNLOCALIZED);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.TOOLS);
	}
	
	public String getName()
	{
		return name;
	}
	
}
