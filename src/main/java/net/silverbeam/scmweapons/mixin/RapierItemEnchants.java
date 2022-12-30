package net.silverbeam.scmweapons.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.silverbeam.scmweapons.item.custom.RapierItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class RapierItemEnchants {


    public void isAcceptableItem(ItemStack stack, CallbackInfoReturnable<Boolean> info) {
        // Note by default, all trident enchantments will be enabled.
        if (stack.getItem() instanceof RapierItem) {

            if (((Object) this == Enchantments.MENDING )) {
                info.setReturnValue(true);
            }

            if ((Object) this == Enchantments.SWEEPING) {
                info.setReturnValue(false);
            }
        }
    }
}

