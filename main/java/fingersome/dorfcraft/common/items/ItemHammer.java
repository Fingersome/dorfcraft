package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemHammer extends Item {

	protected String name;
	 
	 public ItemHammer(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}
