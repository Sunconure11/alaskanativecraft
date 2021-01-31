package com.github.platymemo.alaskanativecraft.mixin;

import com.github.platymemo.alaskanativecraft.item.AlaskaItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.LuckEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LuckEnchantment.class)
public class LuckEnchantmentMixin extends Enchantment {

    protected LuckEnchantmentMixin(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public boolean isAcceptableItem(ItemStack itemStack) {
        if (this.type == EnchantmentTarget.DIGGER && itemStack.getItem() == AlaskaItems.ULU) {
            return true;
        }
        return super.isAcceptableItem(itemStack);
    }
}
