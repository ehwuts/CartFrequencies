package yeoldesoupe.cartfrequencies;

//import yeoldesoupe.cartfrequencies.client.render.RendererColoredMinecart;
//import yeoldesoupe.cartfrequencies.client.render.RendererColoredRail;
import yeoldesoupe.cartfrequencies.common.RegistryCommon;
import net.fabricmc.api.ModInitializer;
//import net.fabricmc.fabric.client.render.EntityRendererRegistry;
//import net.minecraft.entity.vehicle.AbstractMinecartEntity;

public class CartFrequencies implements ModInitializer {
	public static final String MODID = "cartfrequencies";
	
	@Override
	public void onInitialize() {
		System.out.println("HONK HONK.");
		
		RegistryCommon.init();
		
		//EntityRendererRegistry.INSTANCE.register(AbstractMinecartEntity.class, RendererColoredMinecart::new);
		//EntityRendererRegistry.INSTANCE.register(AbstractRailBlock.class, RendererColoredRail::new);
	}
}