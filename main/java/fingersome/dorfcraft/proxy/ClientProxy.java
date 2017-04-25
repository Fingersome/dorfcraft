package fingersome.dorfcraft.proxy;

import fingersome.dorfcraft.Dorfcraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

 public void registerItemRenderer(Item item, int meta, String id) {
	 
 ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Dorfcraft.MODID + ":" + id, "inventory"));
 }

	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
