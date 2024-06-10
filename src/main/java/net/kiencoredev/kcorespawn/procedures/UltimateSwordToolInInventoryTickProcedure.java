package net.kiencoredev.kcorespawn.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class UltimateSwordToolInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, itemstack) != 0)) {
			itemstack.enchant(Enchantments.MOB_LOOTING, 6);
		}
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0)) {
			itemstack.enchant(Enchantments.UNBREAKING, 6);
		}
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) != 0)) {
			itemstack.enchant(Enchantments.SHARPNESS, 6);
		}
	}
}
