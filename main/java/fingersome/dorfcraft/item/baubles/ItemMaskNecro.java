package fingersome.dorfcraft.item.baubles;

import java.util.List;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import fingersome.dorfcraft.item.ItemInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMaskNecro extends ItemBaublesHead {

	 public ItemMaskNecro(String name, boolean addToTab) {
		super(name, addToTab);
        setUnlocalizedName(name);
        setCreativeTab(Dorfcraft.tab);
	    
	}

	@Override
	    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
			tooltip.add("Fetid energies pour from its surface...");
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

		public static void registerRender(Item item) {

	        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ItemInfo.ITEM_MASK_NECRO_UNLOCALIZED, "inventory"));		
		}

}
