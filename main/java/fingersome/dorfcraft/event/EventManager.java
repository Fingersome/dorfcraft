package fingersome.dorfcraft.event;

import java.util.Random;

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
	
	public static float randFloat(float min, float max) {
		Random rand = new Random();
		float randomNum = rand.nextFloat() * (max - min) + 0.5F + min;

	    return randomNum;
	}
	
	//Event triggered when a player logs in
	@SubscribeEvent	
	public void onPlayerJoinEvent(PlayerEvent.PlayerLoggedInEvent event) {
		//event.player.setGameType(GameType.SPECTATOR);
		
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
	

	//Events triggered by breaking a block
	@SubscribeEvent
	public void onBlockBrokenEvent(BlockEvent.BreakEvent event) {
		
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		IBlockState state = world.getBlockState(pos);
		EntityPlayer player = event.getPlayer();
		
		
	}
	
	//Events triggered by left clicking on a block
	@SubscribeEvent
	public void onPlayerLeftClickBlock(LeftClickBlock event) {
		
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		IBlockState state = world.getBlockState(pos);
		EntityPlayer player = event.getEntityPlayer();

		//Triggers when certain items are used on certain blocks

			if (state.getBlock() == Blocks.STONE && player.getHeldItemMainhand().getItem() == ItemList.itemHandpick) {
				if (world.isRemote) {
				player.playSound(SoundEvents.BLOCK_STONE_HIT, 1.0F, 1.0F);
				}
			}
				
			if (state.getBlock() == Blocks.COAL_ORE && player.getHeldItemMainhand().getItem() == ItemList.itemHandpick) {
				if (world.isRemote) {
				player.playSound(SoundEvents.BLOCK_STONE_BREAK, 1.0F, 1.75F);
				}
			}		
		
			if (state.getBlock() == Blocks.STONEBRICK && player.getHeldItemMainhand().getItem() == ItemList.itemChisel) {
				if (world.isRemote) {
				player.playSound(SoundEvents.BLOCK_STONE_HIT, 1.0F, 1.0F);
				}
				else if(!world.isRemote) {
				event.getWorld().setBlockState(event.getPos(), Blocks.STONEBRICK.getStateFromMeta(3));
				state.getBlock().breakBlock(world, pos, state);
				}
			}		
			
			if (state.getBlock() == Blocks.IRON_BLOCK && player.getHeldItemMainhand().getItem() == ItemList.itemHammer) {
				if (world.isRemote) {
				player.playSound(SoundEvents.BLOCK_ANVIL_PLACE, 1, randFloat(0.0F, 1F));
				}
			}
			
			if (state.getBlock() == Blocks.ANVIL && player.getHeldItemMainhand().getItem() == ItemList.itemHammer) {

				float random = (float)Math.random();
				
				if (world.isRemote) {
				player.playSound(SoundEvents.BLOCK_ANVIL_PLACE, 1.0F, random + 0.8F);
				}
				else if(!world.isRemote) {
				event.getWorld().setBlockState(event.getPos(), Blocks.ANVIL.getDefaultState());
				state.getBlock().breakBlock(world, pos, state);
				}
			}
			
			if (state.getBlock() == Blocks.COBBLESTONE && player.getHeldItemMainhand().getItem() == ItemList.itemHammer) {
				if (world.isRemote) {
				player.playSound(SoundEvents.BLOCK_STONE_PLACE, 1.0F, 1.0F);
				}
				else if(!world.isRemote) {
				event.getWorld().setBlockState(event.getPos(), Blocks.FURNACE.getDefaultState());
				state.getBlock().breakBlock(world, pos, state);
				}
			}
		
		
			if (state.getBlock() == Blocks.IRON_BARS && event.getEntityPlayer().getHeldItemMainhand().getItem() == ItemList.itemOrb) {
				if (world.isRemote) {
				player.playSound(SoundEvents.BLOCK_BREWING_STAND_BREW, 1.0F, 1.0F);
			}
				else if(!world.isRemote) {
				event.getWorld().setBlockState(event.getPos(), Blocks.BREWING_STAND.getDefaultState());
				state.getBlock().breakBlock(world, pos, state);
				}
			}
		
			if (state.getBlock() == Blocks.IRON_BLOCK && event.getEntityPlayer().getHeldItemMainhand().getItem() == ItemList.itemOrb) {
				if (world.isRemote) {
				player.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
				}
				else if(!world.isRemote) {
				event.getWorld().setBlockState(event.getPos(), Blocks.CAULDRON.getDefaultState());
				state.getBlock().breakBlock(world, pos, state);
				}
			}		
			
			if (state.getBlock() == Blocks.COBBLESTONE && player.getHeldItemMainhand().getItem() == ItemList.itemQuill) {
				if (world.isRemote) {
				player.playSound(SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, 1.0F, 1.0F);
				}
				else if(!world.isRemote) {
				event.getWorld().setBlockState(event.getPos(), Blocks.DISPENSER.getDefaultState());
				state.getBlock().breakBlock(world, pos, state);
				}
			}
		
			if (state.getBlock() == Blocks.OBSIDIAN && player.getHeldItemMainhand().getItem() == ItemList.itemQuill) {
				if (world.isRemote) {
				player.playSound(SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, 1.0F, 1.0F);
				}
				else if(!world.isRemote) {
				event.getWorld().setBlockState(event.getPos(), Blocks.ENCHANTING_TABLE.getDefaultState());
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
			
			if (state.getBlock() == Blocks.ENCHANTING_TABLE && event.getEntityPlayer().getHeldItemMainhand().getItem() != ItemList.itemQuill) {
				event.setUseBlock(Result.DENY);	
				if (!world.isRemote) {
				//Minecraft.getMinecraft().player.sendChatMessage("You're not a Enchanter.");
			}
		
		}
	}
	
}
