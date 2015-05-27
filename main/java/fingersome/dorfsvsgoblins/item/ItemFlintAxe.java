package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemFlintAxe extends Item
{
	private final String name = ItemInfo.ITEM_FLINT_AXE_UNLOCALIZED;

	public ItemFlintAxe()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_FLINT_AXE_UNLOCALIZED);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
