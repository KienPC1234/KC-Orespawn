package net.kiencoredev.kcorespawn.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class UltimateSwordToolInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(Enchantments.MOB_LOOTING, 6);
		itemstack.enchant(Enchantments.UNBREAKING, 6);
	}
}
