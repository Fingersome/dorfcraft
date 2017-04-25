package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemTrowel extends Item {

	protected String name;
	 
	 public ItemTrowel(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}
