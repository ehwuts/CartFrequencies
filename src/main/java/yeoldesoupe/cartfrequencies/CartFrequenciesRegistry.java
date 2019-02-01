package yeoldesoupe.cartfrequencies;

import yeoldesoupe.cartfrequencies.common.item.TuningFork;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CartFrequenciesRegistry {
	public static Item TUNINGFORK = new TuningFork();
	
	public static void init() {
		Registry.register(Registry.ITEM, new Identifier(CartFrequencies.MODID, "tuning_fork"), TUNINGFORK);
	}
}