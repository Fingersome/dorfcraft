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
        return "commandtest"; 
	}

	@Override
	public String getUsage(ICommandSender sender) {

        return "commandtest <text>"; 
	}

	@Override
	public List<String> getAliases() {
        return this.aliases;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		
		int moonPhase = Minecraft.getMinecraft().world.getMoonPhase();
		String phaseString;
		String nightDay = "other";
		
		if (Minecraft.getMinecraft().world.getWorldTime() > 1200) {
			nightDay = "night";
		}
		else if (Minecraft.getMinecraft().world.getWorldTime() < 1200) { 
			nightDay = "day";
		}

			if (moonPhase == 0) {
				phaseString = "Full Moon";
				sender.sendMessage(new TextComponentString((TextFormatting.LIGHT_PURPLE) + "It is the " + nightDay + " of the " + phaseString + "."));
			}
			else if (moonPhase == 1) {
				phaseString = " 5th ";
				sender.sendMessage(new TextComponentString((TextFormatting.GRAY) + "It is the"  + phaseString + nightDay + "."));
			}
			else if (moonPhase == 2) {
				phaseString = " 6th ";
				sender.sendMessage(new TextComponentString((TextFormatting.GRAY) + "It is the"  + phaseString + nightDay + "."));
			}
			else if (moonPhase == 3) {
				phaseString = " 7th ";
				sender.sendMessage(new TextComponentString((TextFormatting.GRAY) + "It is the"  + phaseString + nightDay + "."));
			}
			else if (moonPhase == 4) {
				phaseString = "New Moon";
				sender.sendMessage(new TextComponentString((TextFormatting.GOLD) + "It is the " + nightDay + " of the " + phaseString + "."));
			}
			else if (moonPhase == 5) {
				phaseString = " 1st ";
				sender.sendMessage(new TextComponentString((TextFormatting.GRAY) + "It is the"  + phaseString + nightDay + "."));
			}
			else if (moonPhase == 6) {
				phaseString = " 2nd ";
				sender.sendMessage(new TextComponentString((TextFormatting.GRAY) + "It is the"  + phaseString + nightDay + "."));
			}
			else if (moonPhase == 7) {
				phaseString = " 3rd ";
				sender.sendMessage(new TextComponentString((TextFormatting.GRAY) + "It is the"  + phaseString + nightDay + "."));
			}
		
		/*
		World world = Minecraft.getMinecraft().world;
		int moonCheck = 0;
		long worldTime = world.getWorldTime();
		if(world.getCurrentMoonPhaseFactor() > 0 && moonCheck == 0) {
			worldTime ++;
		}
		else moonCheck = 1;
		*/
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

