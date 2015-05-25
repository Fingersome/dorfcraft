package fingersome.dorfsvsgoblins.tile;

import fingersome.dorfsvsgoblins.container.ContainerDorfAnvil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class TileEntityDorfAnvil extends TileEntity
{
    
    
    /** The ItemStacks that hold the items currently being used in the anvil */
    private ItemStack[] anvilItemStacks = new ItemStack[10];
    
    /*
     * The number of ticks until another hit is allowed
     */
    private int coolDownTime;
    
    /*
     * The number of hits it takes to finish the current item being crafted
     */
    private static int totalCraftHits;

    /*
     * The number of times that the current item recipe has been hit
     */
    private static int craftProgress;
    
    public static int progressForDisplay = 28 / totalCraftHits * craftProgress;

    
    public static int getProgressForDisplay()
    {
    	return progressForDisplay;
    }
    
    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return this.anvilItemStacks.length;
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int index)
    {
        return this.anvilItemStacks[index];
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int index, int count)
    {
        if (this.anvilItemStacks[index] != null)
        {
            ItemStack itemstack;

            if (this.anvilItemStacks[index].stackSize <= count)
            {
                itemstack = this.anvilItemStacks[index];
                this.anvilItemStacks[index] = null;
                return itemstack;
            }
            else
            {
                itemstack = this.anvilItemStacks[index].splitStack(count);

                if (this.anvilItemStacks[index].stackSize == 0)
                {
                    this.anvilItemStacks[index] = null;
                }

                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int index)
    {
        if (this.anvilItemStacks[index] != null)
        {
            ItemStack itemstack = this.anvilItemStacks[index];
            this.anvilItemStacks[index] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int index, ItemStack stack)
    {
        boolean flag = stack != null && stack.isItemEqual(this.anvilItemStacks[index]) && ItemStack.areItemStackTagsEqual(stack, this.anvilItemStacks[index]);
        this.anvilItemStacks[index] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }

        if (index == 0 && !flag)
        {
            this.totalCraftHits = this.func_174904_a(stack);
            this.craftProgress = 0;
            this.markDirty();
        }
    }

    
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        NBTTagList nbttaglist = compound.getTagList("Items", 10);
        this.anvilItemStacks = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.anvilItemStacks.length)
            {
                this.anvilItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        this.coolDownTime = compound.getShort("BurnTime");
        this.craftProgress = compound.getShort("CookTime");
        this.totalCraftHits = compound.getShort("CookTimeTotal");
        
    }

    public void writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        compound.setShort("BurnTime", (short)this.coolDownTime);
        compound.setShort("CookTime", (short)this.craftProgress);
        compound.setShort("CookTimeTotal", (short)this.totalCraftHits);
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.anvilItemStacks.length; ++i)
        {
            if (this.anvilItemStacks[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.anvilItemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        
        compound.setTag("Items", nbttaglist);
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't
     * this more of a set than a get?*
     */
    public int getInventoryStackLimit()
    {
        return 1;
    }

    /**
     * Anvil isCrafting
     */
    public boolean isCrafting()
    {
        return this.coolDownTime > 0;
    }

    @SideOnly(Side.CLIENT)
    public static boolean isCrafting(IInventory inv)
    {
        return inv.getField(0) > 0;
    }


    public int func_174904_a(ItemStack stack)
    {
        return 200;
    }


    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer player)
    {
        return this.worldObj.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
    }

    public void openInventory(EntityPlayer player) {}

    public void closeInventory(EntityPlayer player) {}

   
    public String getGuiID()
    {
        return "dorfsvsgoblins:guidorfanvil";
    }

    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
    {
        return new ContainerDorfAnvil(playerInventory, this);
    }

    public int getField(int id)
    {
        switch (id)
        {
            case 0:
                return this.coolDownTime;
            case 1:
                return this.craftProgress;
            case 2:
                return this.totalCraftHits;
            default:
                return 0;
        }
    }

    public void setField(int id, int value)
    {
        switch (id)
        {
            case 0:
                this.coolDownTime = value;
                break;
            case 1:
                this.craftProgress = value;
                break;
            case 2:
                this.totalCraftHits = value;
        }
    }

    public int getFieldCount()
    {
        return 3;
    }

    public void clear()
    {
        for (int i = 0; i < this.anvilItemStacks.length; ++i)
        {
            this.anvilItemStacks[i] = null;
        }
    }
}