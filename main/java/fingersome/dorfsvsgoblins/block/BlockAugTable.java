package fingersome.dorfsvsgoblins.block;
 
import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class BlockAugTable extends Block
{
private final String name = "blockAugTable";

	public BlockAugTable()
	{
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(ModInfo.MODID + "." + name);
		setBlockBounds(0, 0, 0, 1, (float) 0.75f, 1);
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isFullCube()
    {
        return false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (world.isRemote)
        {
        	player.openGui(ModInfo.MODID, DorfsVsGoblins.guiIDAugTable, world, (int)player.posX, (int)player.posY, (int)player.posZ);
			System.out.println("augmentation table clicked");
        }

        return true;
    }
}