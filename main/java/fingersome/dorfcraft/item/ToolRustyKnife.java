package fingersome.dorfcraft.item;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.google.common.collect.Multimap;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ToolRustyKnife extends ItemSword {

   
    public ToolRustyKnife(ToolMaterial material, String name) {
	super(material);
		setUnlocalizedName(name);
        setCreativeTab(Dorfcraft.tabZombie);
        setMaxStackSize(1);
	}

	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    //Changes name colour in tooltip
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.COMMON;
    }

    //Displays enchantment glow
    @Override
    public boolean hasEffect(ItemStack stack) {
        return false;
    }

	public static void registerRender(Item item) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ItemInfo.TOOL_RUSTY_KNIFE_UNLOCALIZED, "inventory"));

	}
	
	@Override
	public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
		final Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);

		if (slot == EntityEquipmentSlot.MAINHAND) {
			replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_DAMAGE, ATTACK_DAMAGE_MODIFIER, 0.75f);
			replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_SPEED, ATTACK_SPEED_MODIFIER, 1.5f);
		}

		return modifiers;
	}

	/**
	 * Replace a modifier in the {@link Multimap} with a copy that's had {@code multiplier} applied to its value.
	 *
	 * @param modifierMultimap The MultiMap
	 * @param attribute        The attribute being modified
	 * @param id               The ID of the modifier
	 * @param multiplier       The multiplier to apply
	 */
	private void replaceModifier(Multimap<String, AttributeModifier> modifierMultimap, IAttribute attribute, UUID id, double multiplier) {
		// Get the modifiers for the specified attribute
		final Collection<AttributeModifier> modifiers = modifierMultimap.get(attribute.getName());

		// Find the modifier with the specified ID, if any
		final Optional<AttributeModifier> modifierOptional = modifiers.stream().filter(attributeModifier -> attributeModifier.getID().equals(id)).findFirst();

		if (modifierOptional.isPresent()) { // If it exists,
			final AttributeModifier modifier = modifierOptional.get();
			modifiers.remove(modifier); // Remove it
			modifiers.add(new AttributeModifier(modifier.getID(), modifier.getName(), modifier.getAmount() * multiplier, modifier.getOperation())); // Add the new modifier
		}
	}
}