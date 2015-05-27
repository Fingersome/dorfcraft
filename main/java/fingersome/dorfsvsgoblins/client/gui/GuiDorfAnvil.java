package fingersome.dorfsvsgoblins.client.gui;

import org.lwjgl.opengl.GL11;

import fingersome.dorfsvsgoblins.ModInfo;
import fingersome.dorfsvsgoblins.container.ContainerDorfAnvil;
import fingersome.dorfsvsgoblins.tile.TileEntityDorfAnvil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiDorfAnvil extends GuiContainer
{
	private ResourceLocation texture = new ResourceLocation(ModInfo.MODID + ":" + "textures/gui/guiDorfAnvil.png");
	public TileEntityDorfAnvil tileDorfAnvil;
	
	public GuiDorfAnvil(InventoryPlayer invPlayer, World world, int x, int y, int z) 
	{
		super(new ContainerDorfAnvil(invPlayer, world, x, y, z));
		
		this.xSize = 176;
		this.ySize = 166;
		
		
	}

	public void onGuiClosed()
	{
		super.onGuiClosed();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) 
	{
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Dwarven Anvil"), 100, 5, 0x000000);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) 
	{
		GL11.glColor4f(1F, 1F, 1F, 1F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
	    int l = (this.height - this.ySize) / 2;
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		int progressBarWidth = TileEntityDorfAnvil.getProgressForDisplay();
		drawTexturedModalRect(guiLeft + 88, guiTop + 30, 176, 0, 10, 20);
	}
	
}