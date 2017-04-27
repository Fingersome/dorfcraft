package fingersome.dorfcraft.event;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventManager {
    
	@SubscribeEvent
	public void onItemTossEvent(ItemTossEvent event) {
		Minecraft.getMinecraft().player.sendChatMessage("I THREW IT ON THE GROOOOOOUND~");
	}
	
	
	@SubscribeEvent
	public void onPlayerInteractEvent(PlayerInteractEvent event) {
		
		event.setCanceled(true);
		Minecraft.getMinecraft().player.sendChatMessage("Huh... That's weird...");
	}
	
	
}
