package fingersome.dorfsvsgoblins.tab;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.block.BlockInfo;
import fingersome.dorfsvsgoblins.item.ItemList;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public final class CreativeTabSmithing extends CreativeTabs
{

    public CreativeTabSmithing(int id, String name)
    {
        super(id, name);
    }

	@Override
	public Item getTabIconItem() 
	{
		return ItemList.itemHammerIron;
	}	

}