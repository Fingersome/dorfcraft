package fingersome.dorfcraft.item;

import java.util.List;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemHelmetCrown extends ItemArmorBase {

	 
	public ItemHelmetCrown(String name, CreativeTabs tab, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, tab, materialIn, renderIndexIn, equipmentSlotIn);
	}

		@Override
	    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
	        tooltip.add("A glittering crown, fit for a king.");
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
	    
		public static void registerRender(Item item) {

	        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ItemInfo.ITEM_HELMET_CROWN_UNLOCALIZED, "inventory"));		
		}
		
		@Override
		public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 100, 0));

		}

}
