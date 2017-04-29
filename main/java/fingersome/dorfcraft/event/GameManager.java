package fingersome.dorfcraft.event;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class GameManager {

	public static boolean gameStarted;
	public static boolean dorfChosen;
	public static boolean zombieChosen;
	public static int gameTimer;
	public static int gamePlayers;
	public static int gameDorfs;
	
	public static int gameTeam;
	public static int gameRole;
	public static int gameClass;
	public static int gameVictory;
	
	
	
// game start method
	public void startGame(EntityPlayer player, World world) {
		player.setGameType(GameType.SURVIVAL);
		gameTeam = 0;
	}
	
// set players game-mode to survival
// set players team to dorf
// give players random class and tools
// give one random player the role of king and kingly items
// set time of day
// set phase of moon
// display title

// game phase 2 method
// on night of the full moon, set random player role to necromancer
// if number of dead dorfs == 0 && timer > night 5 zombies lose, dorfs win
// on player death, set team to zombie
// on player respawn, if team == zombie, then check timer. if timer > night 5 then respawn
// else: set gamemode to spectator
// if number of dead dorfs == number of players -1 zombies win, dorfs lose
// if number of dorfs == 1 then highlight dorf
	
// victory method
// if timer < 9 && dead dorfs == number of players -1, zombie victory
// if timer > 9 && dead dorfs != number of players -1, dorf victory



}
