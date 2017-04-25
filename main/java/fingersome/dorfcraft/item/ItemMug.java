package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMug extends Item
{
	private final String name = ItemInfo.ITEM_MUG_UNLOCALIZED;

	public ItemMug()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_MUG_UNLOCALIZED);
		setCreativeTab(Dorfcraft.tabDorf);
		setMaxStackSize(1);
	}
	
	public String getName()
	{
		return name;
	}
	
}
