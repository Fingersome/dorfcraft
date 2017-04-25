package fingersome.dorfcraft.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class DorfcraftPacketHandler {
	
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("dorfcraft");
	
	public class MyMessage implements IMessage {
		  // A default constructor is always required
		  public MyMessage(){}

		  int toSend;
		  public MyMessage(int toSend) {
		    this.toSend = toSend;
		  }

		  @Override public void toBytes(ByteBuf buf) {
		    // Writes the int into the buf
		    buf.writeInt(toSend);
		  }

		  @Override public void fromBytes(ByteBuf buf) {
		    // Reads the int back from the buf. Note that if you have multiple values, you must read in the same order you wrote.
		    toSend = buf.readInt();
		  }
		}
}
