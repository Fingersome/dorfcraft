package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemArmorBase extends ItemArmor  {

	public ItemArmorBase(ArmorMaterial material, int reduction, EntityEquipmentSlot slot, String name, boolean addToTab) {
		super(material, reduction, slot);
		switch(slot){
		case CHEST: {
			setUnlocalizedName(name + "_chest");
			break;
		}
		case FEET: {
			setUnlocalizedName(name + "_boots");
			break;
		}
		case HEAD: {
			setUnlocalizedName(name + "_head");
			break;
		}
		case LEGS: {
			setUnlocalizedName(name + "_legs");
			break;
		}
		default:
			break;
		}
		
		setRegistryName(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Dorfcraft.tab);
		this.setMaxStackSize(1);

		GameRegistry.register(this);
	}
	
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}
}