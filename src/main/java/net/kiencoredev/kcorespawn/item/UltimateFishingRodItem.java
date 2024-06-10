
package net.kiencoredev.kcorespawn.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.kiencoredev.kcorespawn.procedures.UltimateFishingRodToolInInventoryTickProcedure;
import net.kiencoredev.kcorespawn.procedures.UltimateFishingRodRightclickedProcedure;
import net.kiencoredev.kcorespawn.init.KcOrespawnModItems;

import java.util.List;

public class UltimateFishingRodItem extends FishingRodItem {
	public UltimateFishingRodItem() {
		super(new Item.Properties().durability(100).fireResistant());
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(KcOrespawnModItems.TITANIUM_INGOT.get()), new ItemStack(KcOrespawnModItems.URANIUMINGOT.get())).test(repairitem);
	}

	@Override
	public int getEnchantmentValue() {
		return 15;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		super.use(world, entity, hand);
		ItemStack itemstack = entity.getItemInHand(hand);
		UltimateFishingRodRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return InteractionResultHolder.sidedSuccess(itemstack, world.isClientSide());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Keep Right Clicking To Get Fish!!!"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		UltimateFishingRodToolInInventoryTickProcedure.execute(itemstack);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
