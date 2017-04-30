package fingersome.dorfcraft.command;

import java.util.ArrayList;
import java.util.List;

import fingersome.dorfcraft.entity.capability.ITeam;
import fingersome.dorfcraft.entity.capability.TeamProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class CommandTeamQuery implements ICommand {

    ArrayList aliases = new ArrayList(); 
    
    public CommandTeamQuery() 
    { 
        aliases.add("teamquery"); 
        aliases.add("teamq"); 
    } 

	@Override
	public int compareTo(ICommand o) {
		return 0;
	}

	@Override
	public String getName() {
		return "teamquery";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "/teamquery";
	}

	@Override
	public List<String> getAliases() {
		return aliases;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {

		 World world = server.getEntityWorld();	 
		 EntityPlayer player = Minecraft.getMinecraft().player;
		 ITeam iTeam = player.getCapability(TeamProvider.PLAYER_TEAM, null);
		 int fetchTeam = (int) iTeam.getTeam();
		 
		 if (fetchTeam == 0) {
			 
			 String message = String.format("You are a Ghost!");
			 player.sendMessage(new TextComponentString((TextFormatting.GRAY) + message));
		
		 }	 

		 else if (fetchTeam == 1) {
			 
			 String message = String.format("You are a Dorf!");
			 player.sendMessage(new TextComponentString((TextFormatting.BLUE) + message));
		
		 }
		 
		 else if (fetchTeam == 2) {
			 
			 String message = String.format("You are a Zombie!");
			 player.sendMessage(new TextComponentString((TextFormatting.GREEN) + message));
		
		 }
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		return true;
	}

	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,	BlockPos targetPos) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}

}
