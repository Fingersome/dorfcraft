package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemIronHoeHead extends Item
{
	private final String name = ItemInfo.ITEM_IRON_HOE_HEAD_UNLOCALIZED;

	public ItemIronHoeHead()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_IRON_HOE_HEAD_UNLOCALIZED);
		setCreativeTab(DorfsVsGoblins.tabDvG);
		setMaxStackSize(1);

		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
