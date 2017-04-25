package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemSaw extends Item {

	protected String name;
	 
	 public ItemSaw(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}
