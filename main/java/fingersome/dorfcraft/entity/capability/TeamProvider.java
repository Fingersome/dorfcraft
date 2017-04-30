package fingersome.dorfcraft.entity.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

/**

 * Team provider

 *

 * This class is responsible for providing a capability. Other modders may

 * attach their own provider with implementation that returns another

 * implementation of ITeama to the target's (Entity, TE, ItemStack, etc.) disposal.

 */

public class TeamProvider implements ICapabilitySerializable<NBTBase>

{

 @CapabilityInject(ITeam.class)
 public static final Capability<ITeam> PLAYER_TEAM = null;
 private ITeam instance = PLAYER_TEAM.getDefaultInstance();

	 @Override
	 public boolean hasCapability(Capability<?> capability, EnumFacing facing) {

		 return capability == PLAYER_TEAM;
	
	 }

	 @Override
	 public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
	
		 return capability == PLAYER_TEAM ? PLAYER_TEAM.<T> cast(this.instance) : null;
	
	 }
	 
	 @Override
	 public NBTBase serializeNBT() {

		 return PLAYER_TEAM.getStorage().writeNBT(PLAYER_TEAM, this.instance, null);

	 }

	 @Override
	 public void deserializeNBT(NBTBase nbt) {

		 PLAYER_TEAM.getStorage().readNBT(PLAYER_TEAM, this.instance, null, nbt);

	 }

}