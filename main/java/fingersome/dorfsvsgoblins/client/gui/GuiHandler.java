package fingersome.dorfsvsgoblins.client.gui;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.container.ContainerDorfAnvil;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

        @Override
        public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
        { 
        	/*
        	 	if (ID == DorfsVsGoblins.guiIDAugTable)
        	 	{
                     return new ContainerAugTable(player.inventory, world, x, y, z);
        	 	}
			
	            else*/ if (ID == DorfsVsGoblins.guiIDDorfAnvil)
                {
                        return new ContainerDorfAnvil(player.inventory, world, x, y, z);
                }

                return null;
        }

        @Override
        public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
        {
        	/*
		    	if (ID == DorfsVsGoblins.guiIDAugTable)
		    	{
		    		return new GuiAugTable(player.inventory, world, x, y, z);
		    	}
			
               	else*/ if (ID == DorfsVsGoblins.guiIDDorfAnvil)
                {
                        return new GuiDorfAnvil(player.inventory, world, x, y, z);
                }

                return null;
        }
}