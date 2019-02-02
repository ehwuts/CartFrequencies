package yeoldesoupe.cartfrequencies.client;

import yeoldesoupe.cartfrequencies.common.RegistryCommon;
import yeoldesoupe.cartfrequencies.common.item.TuningFork;
import net.fabricmc.fabric.api.client.render.ColorProviderRegistry;

public class RegistryClient {
	public static void init() {
		ColorProviderRegistry.ITEM.register(new TuningFork.ColorHandler(), RegistryCommon.TUNINGFORK);
		//MinecraftClient.getMinecraft().getItemColors().registerItemColorHandler(new TuningFork.ColorHandler(), RegistryCommon.TUNINGFORK);
		//MinecraftClient.getInstance().getItemRenderer()
		//<ItemColorMap>.register(new TuningFork.ColorHandler(), RegistryCommon.TUNINGFORK);
	}
}