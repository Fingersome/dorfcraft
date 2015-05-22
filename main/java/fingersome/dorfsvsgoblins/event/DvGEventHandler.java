package fingersome.dorfsvsgoblins.event;

import fingersome.dorfsvsgoblins.ModInfo;
import fingersome.dorfsvsgoblins.client.entitiy.ExtendedPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings.GameType;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.NameFormat;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DvGEventHandler 
{
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEntityConstructing(EntityConstructing event)
	{
	/*
	Checks to see if the entity being constructed is the correct type for the extended properties to be added 
	The null check is used to make sure properties are only registered once per entity
	*/
	if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer) event.entity) == null)
	ExtendedPlayer.register((EntityPlayer) event.entity);

	}

    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onLogInEvent(PlayerLoggedInEvent event)
    {	
    //event.player.openGui(ModInfo.MODID, 0, null, 0, 0, 0);
      System.out.println(event.player.getName() + " just logged in.");
    }
    
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void nameEvent(NameFormat event)
    {	
    	if (event.username == "fingersome") 
    	{
    	    event.displayname = "High King Uric McFingersmith";
    	} 
    }
    
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void respawnEvent(PlayerEvent.PlayerRespawnEvent event)
    {
    	//if (event.player.getExtendedProperties() etc)
    	{
    		event.player.setGameType(GameType.SPECTATOR);
    	}
    }
}
