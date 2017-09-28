package fingersome.dorfcraft.handlers;

import fingersome.dorfcraft.item.ItemInfo;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {

	public static final ArmorMaterial ARMOR_KING = EnumHelper.addArmorMaterial(ItemInfo.ITEM_HELMET_CROWN_UNLOCALIZED, "dorfcraft:armor_king.png", 0, new int[]{2, 2, 2, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2F);
	public static final ArmorMaterial ARMOR_NECRO = EnumHelper.addArmorMaterial(ItemInfo.ITEM_HELMET_NECRO_UNLOCALIZED, "dorfcraft:armor_necro.png", 0, new int[]{1, 1, 1, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0F);	
	
	public static final ToolMaterial SWORD_NECRO = EnumHelper.addToolMaterial(ItemInfo.ITEM_KNIFE_UNLOCALIZED, 1, 2, 1.0F, 4.0F, 1);
}
