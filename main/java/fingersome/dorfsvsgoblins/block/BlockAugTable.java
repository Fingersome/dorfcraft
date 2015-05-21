package fingersome.dorfsvsgoblins.block;
 
import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class BlockAugTable extends Block
{
private final String name = "blockAugTable";

	public BlockAugTable()
	{
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(ModInfo.MODID + "." + name);
		setCreativeTab(DorfsVsGoblins.tabDvG);
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
}