package fingersome.dorfsvsgoblins;

import fingersome.dorfsvsgoblins.item.ItemList;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public final class CreativeTabDvG extends CreativeTabs
{

    public CreativeTabDvG(int id, String name)
    {
        super(id, name);
    }

	@Override
	public Item getTabIconItem() 
	{
		return ItemList.itemBeer;
	}	

}