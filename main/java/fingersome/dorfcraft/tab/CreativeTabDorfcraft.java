package fingersome.dorfcraft.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class CreativeTabDorfcraft extends CreativeTabs
{

    public CreativeTabDorfcraft(int id, String name)
    {
        super(id, name);
    }

	@Override
	public ItemStack getTabIconItem() 
	{
		return null;
	}	

}