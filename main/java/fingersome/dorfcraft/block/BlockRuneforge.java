package fingersome.dorfcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRuneforge extends BlockBase {

	public BlockRuneforge(String name, Material material, CreativeTabs tab, float hardness, float resistance, String tool, int harvest) {
		super(tool, material, tab, resistance, resistance, tool, harvest);
	}

}
