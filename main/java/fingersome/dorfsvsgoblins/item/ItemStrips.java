package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemStrips extends Item
{
	private final String name = ItemInfo.ITEM_STRIPS_UNLOCALIZED;

	public ItemStrips()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_STRIPS_UNLOCALIZED);
		setCreativeTab(CreativeTabs.tabMaterials);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
