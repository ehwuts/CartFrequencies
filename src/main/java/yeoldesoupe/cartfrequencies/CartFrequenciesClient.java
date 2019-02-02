package yeoldesoupe.cartfrequencies;

import yeoldesoupe.cartfrequencies.client.RegistryClient;
import net.fabricmc.api.ClientModInitializer;

public class CartFrequenciesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		//System.out.println("CLIENT HONK HONK.");
		
		RegistryClient.init();
	}
}