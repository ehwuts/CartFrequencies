package yeoldesoupe.cartfrequencies.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.client.render.block.BlockModelRenderer;

@Environment(EnvType.CLIENT)
public class RendererColoredRail extends BlockModelRenderer {
   public void renderBlockModel(Block var1, float var2) {
      super.renderBlockModel(var1, var2);
   }	
}