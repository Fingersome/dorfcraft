package fingersome.dorfcraft.item;

import java.util.List;

import fingersome.dorfcraft.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentBindingCurse;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemHelmetNecro extends ItemArmorBase {

	 	public ItemHelmetNecro(String name, CreativeTabs tab, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, tab, materialIn, renderIndexIn, equipmentSlotIn);
	}

		@Override
	    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
	        tooltip.add("Cloak yourself in the shadows...");
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
		public boolean hasEffect(ItemStack stack) {
			return false;
		}

		@Override
		public EnumRarity getRarity(ItemStack stack) {
			return EnumRarity.EPIC;
		}
		
		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
		    return ModInfo.MODID + ":textures/models/armor/" + ItemInfo.ARMOR_NECRO_UNLOCALIZED;
		}

		public static void registerRender(Item item) {

	        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ItemInfo.ITEM_HELMET_NECRO_UNLOCALIZED, "inventory"));		
		}
		
		@Override
		public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

		}
		
}
