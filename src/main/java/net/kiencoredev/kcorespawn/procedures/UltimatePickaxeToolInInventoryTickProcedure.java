package net.kiencoredev.kcorespawn.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class UltimatePickaxeToolInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0)) {
			itemstack.enchant(Enchantments.UNBREAKING, 5);
		}
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)) {
			itemstack.enchant(Enchantments.BLOCK_FORTUNE, 5);
		}
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY, itemstack) != 0)) {
			itemstack.enchant(Enchantments.BLOCK_EFFICIENCY, 5);
		}
	}
}
