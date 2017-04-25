package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemRod extends Item {

	protected String name;
	 
	 public ItemRod(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}
