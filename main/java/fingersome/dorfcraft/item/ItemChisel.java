package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemChisel extends Item
{
	private final String name = ItemInfo.ITEM_CHISEL_UNLOCALIZED;

	public ItemChisel()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_CHISEL_UNLOCALIZED);
		setCreativeTab(CreativeTabs.TOOLS);
		setMaxStackSize(1);
	}
	
	public String getName()
	{
		return name;
	}
	
}
