package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemFlintPickaxe extends Item
{
	private final String name = ItemInfo.ITEM_FLINT_PICK_UNLOCALIZED;

	public ItemFlintPickaxe()
	{
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_FLINT_PICK_UNLOCALIZED);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.TOOLS);
	}
	
	public String getName()
	{
		return name;
	}
	
}
