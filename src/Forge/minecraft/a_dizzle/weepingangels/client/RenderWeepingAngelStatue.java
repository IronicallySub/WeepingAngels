package a_dizzle.weepingangels.client;


import a_dizzle.weepingangels.client.ModelWeepingAngel;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;

@SideOnly(Side.CLIENT)
public class RenderWeepingAngelStatue extends RenderLiving{

	public RenderWeepingAngelStatue()
	{
		super(new ModelWeepingAngel(), 0.5f);
	}
}
