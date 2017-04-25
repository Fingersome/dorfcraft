package fingersome.dorfcraft.network;

import fingersome.dorfcraft.network.DorfcraftPacketHandler.MyMessage;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;


// The params of the IMessageHandler are <REQ, REPLY>
// This means that the first param is the packet you are receiving, and the second is the packet you are returning.
// The returned packet can be used as a "response" from a sent packet.
public class DorfcraftMessageHandler implements IMessageHandler<MyMessage, IMessage> {
  // Do note that the default constructor is required, but implicitly defined in this case

  @Override public IMessage onMessage(MyMessage message, MessageContext ctx) {
    // This is the player the packet was sent to the server from
    EntityPlayerMP serverPlayer = ctx.getServerHandler().playerEntity;
    // The value that was sent
    int amount = message.toSend;
    serverPlayer.inventory.addItemStackToInventory(new ItemStack(Items.DIAMOND, amount));
    // No response packet
    return null;
  }
}	
