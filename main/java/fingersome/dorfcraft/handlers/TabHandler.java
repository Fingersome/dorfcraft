package fingersome.dorfcraft.handlers;

import fingersome.dorfcraft.item.ItemList;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TabHandler {

	public void init() {
		
		CreativeTabs tabCommand = new CreativeTabs("tab_command") {
			@Override
			public String getTabLabel() {
				return "tab_command";
			}
			
			@Override
			@SideOnly(Side.CLIENT)
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemList.itemHelmetCrown,1);
			}
		};
	
		CreativeTabs tabDorf = new CreativeTabs("tab_dorf") {
			@Override
			public String getTabLabel() {
				return "tab_dorf";
			}
			
			@Override
			@SideOnly(Side.CLIENT)
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemList.itemHammer,1);
			}
		};
		
		CreativeTabs tabZombie = new CreativeTabs("tab_zombie") {
			@Override
			public String getTabLabel() {
				return "tab_zombie";
			}
			
			@Override
			@SideOnly(Side.CLIENT)
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemList.itemKnife,1);
			}
		};
	}
	
}
