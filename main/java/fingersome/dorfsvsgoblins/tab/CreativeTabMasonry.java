package fingersome.dorfsvsgoblins.tab;

import fingersome.dorfsvsgoblins.item.ItemList;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public final class CreativeTabMasonry extends CreativeTabs
{

    public CreativeTabMasonry(int id, String name)
    {
        super(id, name);
    }

	@Override
	public Item getTabIconItem() 
	{
		return Item.getItemFromBlock(Blocks.stonebrick);
	}	

}