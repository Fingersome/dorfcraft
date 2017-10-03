package fingersome.dorfcraft.block;

import fingersome.dorfcraft.Dorfcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockList {

	public static Block blockRuneforge;

	public static void init() {
		
		Block blockRuneForge = new BlockRuneforge(Material.ROCK, BlockInfo.BLOCK_RUNEFORGE_UNLOCALIZED);

	}
	
}
