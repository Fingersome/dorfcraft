package fingersome.dorfcraft.network;

import fingersome.dorfcraft.ModInfo;
import fingersome.dorfcraft.network.message.MessageDummy;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class PacketHandler {
	public static SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(ModInfo.MODID);

    private static int id = 0;

    public static void registerMessages(){
    	
        INSTANCE.registerMessage(MessageDummy.MessageHolder.class,MessageDummy.class,id ++,Side.SERVER);
        
    }
}