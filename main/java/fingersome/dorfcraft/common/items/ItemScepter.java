package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemScepter extends Item {

	protected String name;
	 
	 public ItemScepter(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}
