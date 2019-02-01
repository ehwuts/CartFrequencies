package yeoldesoupe.cartfrequencies.mixincommon;

//import net.minecraft.entity.Entity;
//import net.minecraft.entity.EquipmentSlot;
//import net.minecraft.entity.LivingEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.entity.vehicle.AbstractMinecartEntity;
//import net.minecraft.util.DyeColor;
//import net.minecraft.item.DyeItem;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.Hand;
//import net.minecraft.util.Nameable;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//
//@Mixin(AbstractMinecartEntity.class)
//public class MixinAbstractMinecartEntity {
//	private boolean dyed = false;
//	
//    @Inject(at = @At("RETURN"), method = "interact", cancellable = true)
//    private void interact(PlayerEntity player, Hand hand, CallbackInfoReturnable ret) {
//		boolean returnValue = ret.getReturnValue();
//		ItemStack held = player.getStackInHand(hand);
//		
//		if (!returnValue && !held.isEmpty() && held.getItem() instanceof DyeItem) {
//			dyed = true;
//			this.setColor(held.getItem().getColor());
//			
//			if (!player.isCreative()) {
//				ItemStack heldResult = held.copy();
//				heldResult.subtractAmount(1);
//				
//				player.setStackInHand(hand, heldResult.isEmpty() ? ItemStack.EMPTY : heldResult);
//			}
//			
//			returnValue = true;
//		}
//		//ret.setReturnValue(returnValue);
//    }
//	
//	public boolean isDyed() {
//		return dyed;
//	}
//	
//	public void setColor(DyeColor color) {
//		dyed = true;
//		System.out.println("MixinAbstractMinecartEntity" + color);
//		//byte var2 = (Byte)this.dataTracker.get(COLOR);
//		//this.dataTracker.set(COLOR, (byte)(var2 & 240 | var1.getId() & 15));
//	}
//}
