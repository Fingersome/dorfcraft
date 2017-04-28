package fingersome.dorfcraft.item.baubles;

import java.util.List;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import fingersome.dorfcraft.item.ItemInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class ItemMaskKing extends ItemBaublesHead {

	 public ItemMaskKing(String name, boolean addToTab) {
		super(name, addToTab);
        setUnlocalizedName(name);
        setCreativeTab(Dorfcraft.tab);
        setMaxStackSize(1);
	}

	 	@Override
	    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
	        tooltip.add("A glittering crown, fit for a king.");
	        super.addInformation(stack, playerIn, tooltip, advanced);
	    }

	    //Changes name colour in tooltip
	    @Override
	    public EnumRarity getRarity(ItemStack stack) {
	        return EnumRarity.EPIC;
	    }

	    //Displays enchantment glow
	    @Override
	    public boolean hasEffect(ItemStack stack) {
	        return false;
	    }

	    //Decides what the bauble does when equipped / loaded
	    @Override
	    public void onEquippedOrLoadedIntoWorld(ItemStack stack, EntityLivingBase player) {
			
		}
	    
	    //Decided what the bauble does when the player ticks whilst wearing it
		@Override
		public void onWornTick(ItemStack stack, EntityLivingBase player) {
			super.onWornTick(stack, player);

			if(player instanceof EntityPlayer && !player.world.isRemote) {
				if(	player.getActivePotionEffect(MobEffects.RESISTANCE) != null)
					player.removePotionEffect(MobEffects.RESISTANCE);

					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 22, 0, true, false));
				}
		}

		@Override
		public void onUnequipped(ItemStack stack, EntityLivingBase player) {
			PotionEffect effect = player.getActivePotionEffect(MobEffects.RESISTANCE);
			if(effect != null && effect.getAmplifier() == 1)
				player.removePotionEffect(MobEffects.RESISTANCE);
		}
	    
		public static void registerRender(Item item) {

	        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ItemInfo.ITEM_MASK_KING_UNLOCALIZED, "inventory"));		
		}

}
