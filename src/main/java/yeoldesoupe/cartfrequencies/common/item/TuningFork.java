package yeoldesoupe.cartfrequencies.common.item;

import yeoldesoupe.cartfrequencies.common.util.CompoundUtils;
import net.minecraft.client.item.TooltipOptions;
import net.minecraft.client.render.item.ItemColorMapper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.text.StringTextComponent;
import net.minecraft.text.TextComponent;
import net.minecraft.text.TranslatableTextComponent;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import java.lang.Math;
import java.util.List;

public class TuningFork extends Item {
	private static final String TUNING_COLOR = "tuning_color";
	
	public TuningFork () {
		super(new Item.Settings().itemGroup(ItemGroup.TRANSPORTATION).stackSize(1));
	}

    @Environment(EnvType.CLIENT)
	public static class ColorHandler implements ItemColorMapper {
		@Override
		public int getColor(ItemStack stack, int layer) {
			switch (layer) {
				case 1:
					return TuningFork.getColor(stack);
				default:
					return -1;
			}
		}
	}
	
	public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
		ItemStack stack = player.getStackInHand(hand);
		
		if (player.isSneaking()) {
			prevColorIndex(stack);
		} else {
			nextColorIndex(stack);
		}
		
		return new TypedActionResult(ActionResult.SUCCESS, stack);
	}
	
	private static void prevColorIndex(ItemStack stack) {
		int current = getColorIndex(stack);		
		setColorIndex(stack, current > 1 ? current - 1 : DyeColor.values().length - 1);
	}
	
	private static void nextColorIndex(ItemStack stack) {
		setColorIndex(stack, (getColorIndex(stack) + 1) % DyeColor.values().length);
	}
	
	private static int getColorIndex(ItemStack stack) {
		return (int)CompoundUtils.getLong(stack, TUNING_COLOR, 0);
	}
	
	private static void setColorIndex(ItemStack stack, int index) {
		CompoundUtils.setLong(stack, TUNING_COLOR, (long)index);
	}
	
	public static int getColor(ItemStack stack) {
		float[] components = getDyeColor(stack).getColorComponents();
		
		return (((int)(components[0] * 255.0F)) << 16) + (((int)(components[1] * 255.0F)) << 8) + ((int)(components[2] * 255.0F));
	}
	
	public static DyeColor getDyeColor(ItemStack stack) {
		return DyeColor.values()[Math.min(DyeColor.values().length, Math.max(0, getColorIndex(stack)))];
	}
	
	public static DyeItem getDyeItem(ItemStack stack) {
		return DyeItem.fromColor(getDyeColor(stack));
	}

	@Override
    @Environment(EnvType.CLIENT)
    public void buildTooltip(ItemStack stack, World world, List<TextComponent> text, TooltipOptions tooltip) {
        text.add(new TranslatableTextComponent(getDyeItem(stack).getTranslationKey()));
    }
}