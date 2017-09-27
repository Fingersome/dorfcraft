package fingersome.dorfcraft.handlers;

import fingersome.dorfcraft.item.ItemInfo;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {

	public static final ArmorMaterial ARMOR_KING = EnumHelper.addArmorMaterial(ItemInfo.ITEM_HELMET_CROWN_UNLOCALIZED, "dorfcraft:textures/models/armor/armor_king", 0, new int[]{2, 2, 2, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2F);
	public static final ArmorMaterial ARMOR_NECRO = EnumHelper.addArmorMaterial(ItemInfo.ITEM_HELMET_NECRO_UNLOCALIZED, "dorfcraft:textures/models/armor/armor_necro", 0, new int[]{1, 1, 1, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0F);	
	
}
