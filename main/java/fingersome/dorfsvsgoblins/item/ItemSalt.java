package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSalt extends Item
{
	private final String name = ItemInfo.ITEM_SALT_UNLOCALIZED;

	public ItemSalt()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_SALT_UNLOCALIZED);
		setCreativeTab(CreativeTabs.tabMaterials);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}