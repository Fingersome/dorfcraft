package fingersome.dorfcraft.event;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EventManager {
    
	@SubscribeEvent
	public void onItemTossEvent(ItemTossEvent event) {
		Minecraft.getMinecraft().player.sendChatMessage("I THREW IT ON THE GROOOOOOUND~");
	}

	@SubscribeEvent
	public void onPlayerRightClickBlock(RightClickBlock event) {
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		IBlockState state = world.getBlockState(pos);

		if (state.getBlock() == Blocks.ANVIL) {
			event.setUseBlock(Result.DENY);	
			if (world.isRemote) {
			Minecraft.getMinecraft().player.sendChatMessage("You're no Smith...");
			}
		}
		else if (state.getBlock() == Blocks.ENCHANTING_TABLE) {
			event.setUseBlock(Result.DENY);
			if (world.isRemote) {
			Minecraft.getMinecraft().player.sendChatMessage("You're no Enchanter...");
			}
		}
		else if (state.getBlock() == Blocks.BREWING_STAND) {
			event.setUseBlock(Result.DENY);
			if (world.isRemote) {
			Minecraft.getMinecraft().player.sendChatMessage("You're no Alchemist...");
			}
		}
		
	}
	
	
}
