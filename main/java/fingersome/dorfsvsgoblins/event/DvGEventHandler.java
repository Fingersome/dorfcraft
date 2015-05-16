package fingersome.dorfsvsgoblins.event;

import fingersome.dorfsvsgoblins.entitiy.ExtendedPropertiesDvG;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
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

	@SideOnly(Side.CLIENT)
    @SubscribeEvent(priority=EventPriority.HIGHEST, receiveCanceled=true)
    public void onEvent(LivingJumpEvent event)
    {
        // DEBUG
        if (event.entity instanceof EntityPlayer)
        {
            System.out.println("Boing");   
        }
    }
}
