package fingersome.dorfcraft.event;

import fingersome.dorfcraft.item.ItemList;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.Sound;
import net.minecraft.client.audio.SoundEventAccessor;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.LeftClickBlock;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EventManager {
    
	//on server started event:
	//create teams
	public String playerTeam = "ghost";
	//create roles
	//create classes
	
	//Event triggered when a player logs in
	@SubscribeEvent	
	public void onPlayerJoinEvent(PlayerEvent.PlayerLoggedInEvent event) {
		event.player.setGameType(GameType.SPECTATOR);
		
		if(playerTeam == "dorf") {
			event.player.addSuffix(new TextComponentString((TextFormatting.AQUA) + " the " + playerTeam));
		}
		
		if(playerTeam == "zombie") {
			event.player.addSuffix(new TextComponentString((TextFormatting.GREEN) + " the " + playerTeam));
		}

		if(playerTeam == "ghost") {
			event.player.addSuffix(new TextComponentString((TextFormatting.GRAY) + " the " + playerTeam));
		}
	}
	

	//Events triggered by left clicking on a block
	@SubscribeEvent
	public void onPlayerLeftClickBlock(LeftClickBlock event) {
		
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		IBlockState state = world.getBlockState(pos);
		EntityPlayer player = event.getEntityPlayer();

		//Triggers when certain items are used on certain blocks

		
		if (state.getBlock() == Blocks.IRON_BLOCK && event.getEntityPlayer().getHeldItemMainhand().getItem() == ItemList.itemHammer) {
			if (world.isRemote) {
				event.getEntity().playSound(SoundEvents.BLOCK_ANVIL_PLACE, 1.0F, 1.0F);
			}
			else if(!world.isRemote) {
				event.getWorld().setBlockState(event.getPos(), Blocks.ANVIL.getDefaultState());
				state.getBlock().breakBlock(world, pos, state);
			}
		}
		
		
		if (state.getBlock() == Blocks.OBSIDIAN && event.getEntityPlayer().getHeldItemMainhand().getItem() == ItemList.itemTome) {
			if (world.isRemote) {
				event.getEntity().playSound(SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, 1.0F, 1.0F);
			}
			else if(!world.isRemote) {
				event.getWorld().setBlockState(event.getPos(), Blocks.ENCHANTING_TABLE.getDefaultState());
				state.getBlock().breakBlock(world, pos, state);
			}
		}
		
		
		if (state.getBlock() == Blocks.IRON_BARS && event.getEntityPlayer().getHeldItemMainhand().getItem() == ItemList.itemOrb) {
			if (world.isRemote) {
				event.getEntity().playSound(SoundEvents.BLOCK_BREWING_STAND_BREW, 1.0F, 1.0F);
			}
			else if(!world.isRemote) {
				event.getWorld().setBlockState(event.getPos(), Blocks.BREWING_STAND.getDefaultState());
				state.getBlock().breakBlock(world, pos, state);
			}
		}
	}
		
		
	//Events triggered by right clicking on a block
	@SubscribeEvent
	public void onPlayerRightClick(RightClickBlock event) {
		
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		IBlockState state = world.getBlockState(pos);
		EntityPlayer player = event.getEntityPlayer();
				
			if (state.getBlock() == Blocks.ANVIL && event.getEntityPlayer().getHeldItemMainhand().getItem() != ItemList.itemHammer) {
				event.setUseBlock(Result.DENY);	
				if (!world.isRemote) {
				//Minecraft.getMinecraft().player.sendChatMessage("You're not a Blackmith.");
				}
			}
		
			if (state.getBlock() == Blocks.BREWING_STAND && event.getEntityPlayer().getHeldItemMainhand().getItem() != ItemList.itemOrb) {
				event.setUseBlock(Result.DENY);	
				if (!world.isRemote) {
				//Minecraft.getMinecraft().player.sendChatMessage("You're not an Alchemist.");
				}
			}
			
			if (state.getBlock() == Blocks.ENCHANTING_TABLE && event.getEntityPlayer().getHeldItemMainhand().getItem() != ItemList.itemTome) {
				event.setUseBlock(Result.DENY);	
				if (!world.isRemote) {
				//Minecraft.getMinecraft().player.sendChatMessage("You're not a Enchanter.");
			}
		
		}
	}
	
}
