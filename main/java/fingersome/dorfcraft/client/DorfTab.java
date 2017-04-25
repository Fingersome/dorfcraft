package fingersome.dorfcraft.client;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.common.items.DorfcraftItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DorfTab extends CreativeTabs {

	public DorfTab() {
		super(Dorfcraft.MODID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(DorfcraftItems.itemCrown);
	}
}