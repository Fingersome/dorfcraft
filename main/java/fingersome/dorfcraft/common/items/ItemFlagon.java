package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemFlagon extends Item {

	protected String name;
	 
	 public ItemFlagon(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}
