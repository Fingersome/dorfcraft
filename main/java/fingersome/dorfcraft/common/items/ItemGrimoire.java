package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemGrimoire extends Item {

	protected String name;
	 
	 public ItemGrimoire(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}
