package fingersome.dorfcraft.entity.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

/**

 * This class is responsible for saving and reading mana data from or to server

 */

public class TeamStorage implements IStorage<ITeam>

{

 @Override

 public NBTBase writeNBT(Capability<ITeam> capability, ITeam instance, EnumFacing side)

 {

 return new NBTTagFloat(instance.getTeam());

 }



 @Override

 public void readNBT(Capability<ITeam> capability, ITeam instance, EnumFacing side, NBTBase nbt)

 {

 instance.setTeam(((NBTPrimitive) nbt).getInt());

 }

}