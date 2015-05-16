package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMug extends Item
{
	private final String name = ItemInfo.ITEM_MUG_UNLOCALIZED;

	public ItemMug()
	{
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_MUG_UNLOCALIZED);
		setCreativeTab(DorfsVsGoblins.tabDvG);
		setMaxStackSize(1);
	}
	
	public String getName()
	{
		return name;
	}
	
}
