package yeoldesoupe.cartfrequencies.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.Nameable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class DyeUser {
	
    @Inject(at = @At("RETURN"), method = "interact", cancellable = true)
    private void interact(Entity target, Hand hand, CallbackInfoReturnable ret) {
        if (target instanceof AbstractMinecartEntity) {
            System.out.println(((PlayerEntity)(Object)this).getStackInHand(hand).getClass().getSimpleName());
        }
    }
}
