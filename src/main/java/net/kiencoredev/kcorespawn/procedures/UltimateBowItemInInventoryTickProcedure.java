package net.kiencoredev.kcorespawn.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class UltimateBowItemInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS, itemstack) != 0)) {
			itemstack.enchant(Enchantments.FLAMING_ARROWS, 1);
		}
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, itemstack) != 0)) {
			itemstack.enchant(Enchantments.INFINITY_ARROWS, 1);
		}
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, itemstack) != 0)) {
			itemstack.enchant(Enchantments.POWER_ARROWS, 5);
		}
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0)) {
			itemstack.enchant(Enchantments.UNBREAKING, 5);
		}
	}
}
