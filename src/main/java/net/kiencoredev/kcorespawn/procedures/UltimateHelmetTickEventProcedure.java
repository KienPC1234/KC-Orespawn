package net.kiencoredev.kcorespawn.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class UltimateHelmetTickEventProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.ALL_DAMAGE_PROTECTION, itemstack) != 0)) {
			itemstack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
		}
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0)) {
			itemstack.enchant(Enchantments.UNBREAKING, 5);
		}
	}
}
