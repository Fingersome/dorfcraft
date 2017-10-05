package fingersome.dorfcraft.item;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemArmorBase extends ItemArmor  {

	public ItemArmorBase(String name, CreativeTabs tab, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		  super(materialIn, renderIndexIn, equipmentSlotIn);
		  setUnlocalizedName(name);
		  setRegistryName(name);
		  setCreativeTab(tab);
		 }

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return null;
	}
}