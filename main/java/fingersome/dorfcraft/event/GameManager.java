package fingersome.dorfcraft.event;

import fingersome.dorfcraft.entity.capability.ITeam;
import fingersome.dorfcraft.entity.capability.TeamProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class GameManager

{

	 @SubscribeEvent
	 public void onPlayerDeathEvent(LivingDeathEvent event) {
	
		 Entity entity = event.getEntity();
		 if (entity.world.isRemote || !(entity instanceof EntityPlayerMP)) return;
		 EntityPlayer player = (EntityPlayer) entity;
		 ITeam iTeam = player.getCapability(TeamProvider.PLAYER_TEAM, null);
		 int teamID = iTeam.getTeam();
		 String label = iTeam.getTeamName();
		 
		 if (teamID == 0) {

			 iTeam.setTeam(1);
			 String message = String.format("Looks like you've become a " );
			 player.sendMessage(new TextComponentString(message + (TextFormatting.GRAY) +  label + "!"));
			 player.setGameType(GameType.SPECTATOR);
			 event.setCanceled(true);
		
		 }	 
		 
		 else if (teamID == 1) {
			 
			 iTeam.setTeam(2);
			 String message = String.format("Looks like you've become a ");
			 player.sendMessage(new TextComponentString(message + (TextFormatting.AQUA) +  label + "!"));
			 player.setGameType(GameType.SURVIVAL);
			 event.setCanceled(true);
		
		 }
		 
		 else { 

			 iTeam.setTeam(0);
			 String message = String.format("Looks like you've become a ");
			 player.sendMessage(new TextComponentString(message + (TextFormatting.GREEN) +  label + "!"));
			 player.setGameType(GameType.SPECTATOR);
			 event.setCanceled(true);
	 	}
		 
	
	 }
	 
	 /**

	 * Copy data from dead player to the new player

	 **/

	@SubscribeEvent
	public void onPlayerClone(PlayerEvent.Clone event) {
		
		EntityPlayer player = event.getEntityPlayer();
		ITeam iTeam = player.getCapability(TeamProvider.PLAYER_TEAM, null);
		ITeam oldITeam = event.getOriginal().getCapability(TeamProvider.PLAYER_TEAM, null);
		iTeam.setTeam((int) oldITeam.getTeam());

	}

}