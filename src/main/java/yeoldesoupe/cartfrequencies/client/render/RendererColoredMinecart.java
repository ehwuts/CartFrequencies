package yeoldesoupe.cartfrequencies.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.model.MinecartEntityModel;
import net.minecraft.entity.Entity;

@Environment(EnvType.CLIENT)
public class RendererColoredMinecart<T extends Entity> extends MinecartEntityModel<T> {
	public RendererColoredMinecart() {
		super();
	}
	
    @Override
    public void render(T var1, float var2, float var3, float var4, float var5, float var6, float var7) {
        super.render(var1, var2, var3, var4, var5, var6, var7);
    }
}