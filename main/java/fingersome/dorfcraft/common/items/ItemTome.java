package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemTome extends Item {

	protected String name;
	 
	 public ItemTome(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}
