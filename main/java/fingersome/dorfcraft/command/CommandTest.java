package fingersome.dorfcraft.command;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class CommandTest implements ICommand {

    ArrayList aliases = new ArrayList(); 
    
    public CommandTest() 
    { 
        aliases.add("commandtest"); 
        aliases.add("test"); 
    } 

	@Override
	public int compareTo(ICommand o) {

		return 0;
	}

	@Override
	public String getName() {
        return "test"; 
	}

	@Override
	public String getUsage(ICommandSender sender) {

        return "commandtest"; 
	}

	@Override
	public List<String> getAliases() {
        return this.aliases;
	}

	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		
		int moonCheck = 0;
		World world = server.getEntityWorld();
		long worldTime = world.getWorldTime();
		
		if(world.getMoonPhase() != 5) {
			sender.sendMessage(new TextComponentString((TextFormatting.WHITE) + "Setting moon phase to 5."));
			}
		
		else {
			moonCheck = 1;
			sender.sendMessage(new TextComponentString((TextFormatting.GRAY) + "It's already the first night."));
		}
		
		while(world.getMoonPhase() != 5 && moonCheck == 0) {
			world.setWorldTime(worldTime++);
		}
		
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
       return true;
	}

	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos targetPos) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}


	
}

