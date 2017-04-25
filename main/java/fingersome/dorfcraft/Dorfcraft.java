package fingersome.dorfcraft;

import fingersome.dorfcraft.client.DorfTab;
import fingersome.dorfcraft.common.items.DorfcraftItems;
import fingersome.dorfcraft.proxy.ClientProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = Dorfcraft.MODID, version = Dorfcraft.VERSION)
public class Dorfcraft
{
	
    public static final String MODID = "dorfcraft";
    public static final String VERSION = "1.0";
    
	@Mod.Instance(MODID)
	public static Dorfcraft instance;
	
    
@SidedProxy
(clientSide="fingersome.dorfcraft.proxy.ClientProxy", serverSide="fingersome.dorfcraft.proxy.ServerProxy")
public static ClientProxy proxy;
    
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event) {
	this.proxy.preInit(event);
	System.out.println(MODID + " is loading!");
	DorfcraftItems.init();
	DorfcraftItems.registerItems();
}

@EventHandler
public void init(FMLInitializationEvent event) {
    this.proxy.init(event);
}

@EventHandler
public void postInit(FMLPostInitializationEvent event) {
    this.proxy.postInit(event);
}






}
