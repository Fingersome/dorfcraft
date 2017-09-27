package fingersome.dorfcraft.item;

import java.util.List;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemRodKing extends Item {

    public ItemRodKing(String name) {
        setUnlocalizedName(name);
        setCreativeTab(Dorfcraft.tab);
        setMaxStackSize(1);
    }   

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        //tooltip.add("Used for smithing arms and armor");
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

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ItemInfo.ITEM_ROD_KING_UNLOCALIZED, "inventory"));

	}
}