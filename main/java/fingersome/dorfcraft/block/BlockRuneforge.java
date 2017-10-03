package fingersome.dorfcraft.block;

import java.util.Random;

import fingersome.dorfcraft.Dorfcraft;
import fingersome.dorfcraft.handlers.TabHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRuneforge extends BlockBase {
	
	public BlockRuneforge(Material material, String name) {
		super(material, name);
        setCreativeTab(CreativeTabs.DECORATIONS);
		setHardness(5f);
		setResistance(15f);
		setHarvestLevel("pickaxe", 1);
		this.needsRandomTick = true;
	}
	
	@Override
	public int tickRate(World world){
		return 1;
	}
	
	@Override
	public boolean requiresUpdates(){
		return true;
	}
	
	@Override
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random){

	}
	
}