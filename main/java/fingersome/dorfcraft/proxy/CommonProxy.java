package fingersome.dorfcraft.proxy;

import fingersome.dorfcraft.entity.capability.ITeam;
import fingersome.dorfcraft.entity.capability.Team;
import fingersome.dorfcraft.entity.capability.TeamStorage;
import fingersome.dorfcraft.network.PacketHandler;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{

	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Proxy PreInit");
		
		//RegisterUtil.registerAll(event);
		CapabilityManager.INSTANCE.register(ITeam.class, new TeamStorage(), Team.class);

		PacketHandler.registerMessages();
	}

	public void init(FMLInitializationEvent event) {
		
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
