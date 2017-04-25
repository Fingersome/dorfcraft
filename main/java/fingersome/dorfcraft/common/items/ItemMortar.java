package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemMortar extends Item {

	protected String name;
	 
	 public ItemMortar(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}
