package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemChisel extends Item {

	protected String name;
	 
	 public ItemChisel(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}
