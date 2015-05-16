package fingersome.dorfsvsgoblins;

import fingersome.dorfsvsgoblins.item.ItemDorfSkull;
import fingersome.dorfsvsgoblins.item.ItemMug;
import fingersome.dorfsvsgoblins.item.ItemBeer;
import fingersome.dorfsvsgoblins.item.ItemList;
import fingersome.dorfsvsgoblins.proxy.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ModInfo.MODID, version = ModInfo.VERSION)
public class DorfsVsGoblins
{
	@SidedProxy(clientSide = "fingersome.dorfsvsgoblins.proxy.ClientProxy", 
				serverSide = "fingersome.dorfsvsgoblins.proxy.CommonProxy")     
	
	public static CommonProxy proxy;
	public static ItemList items;
	//public static BlockList blocks;
	
	public static CreativeTabs tabDvG = new CreativeTabDvG(CreativeTabs.getNextID(), "dvgtab");
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
		items.Init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    //Render item renders	
    	if(event.getSide() == Side.CLIENT)
    	{
    	    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	    
    	    	renderItem.getItemModelMesher().register(items.itemMug, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemMug) items.itemMug).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(items.itemBeer, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemBeer) items.itemBeer).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(items.itemDorfSkull, 0, new ModelResourceLocation(ModInfo.MODID + ":" + ((ItemDorfSkull) items.itemDorfSkull).getName(), "inventory"));
    	    	
    	}
    } 
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
		
    }
}
