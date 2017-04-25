package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemCrown extends Item {

	protected String name;
	 
	 public ItemCrown(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}
