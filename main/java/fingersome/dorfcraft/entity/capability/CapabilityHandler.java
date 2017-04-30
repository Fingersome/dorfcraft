package fingersome.dorfcraft.entity.capability;

import fingersome.dorfcraft.ModInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**

 * Capability handler

 *

 * This class is responsible for attaching our capabilities

 */

public class CapabilityHandler

{

	public static final ResourceLocation PLAYER_TEAM = new ResourceLocation(ModInfo.MODID, "team");

	@SubscribeEvent
	public void attachCapability(AttachCapabilitiesEvent.Entity event) {

	 if (!(event.getEntity() instanceof EntityPlayer)) return;
	
	 	event.addCapability(PLAYER_TEAM, new TeamProvider());
	
	 }

}