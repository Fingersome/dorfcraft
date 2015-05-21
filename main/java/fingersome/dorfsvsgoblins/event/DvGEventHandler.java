package fingersome.dorfsvsgoblins.event;

import fingersome.dorfsvsgoblins.ModInfo;
import fingersome.dorfsvsgoblins.client.entitiy.ExtendedPropertiesDvG;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
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
        // Register extended entity properties
        if (event.entity instanceof EntityPlayer)
        {
            event.entity.registerExtendedProperties("ExtendedPropertiesDvG", new ExtendedPropertiesDvG());
        }
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
    	    event.displayname = event.username + " the Great and Powerful";
    	} 
    }
}
