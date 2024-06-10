package net.kiencoredev.kcorespawn.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class UltimateFishingRodToolInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0)) {
			itemstack.enchant(Enchantments.UNBREAKING, 5);
		}
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_LUCK, itemstack) != 0)) {
			itemstack.enchant(Enchantments.FISHING_LUCK, 5);
		}
	}
}
