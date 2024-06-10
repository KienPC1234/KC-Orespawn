
package net.kiencoredev.kcorespawn.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;

import net.kiencoredev.kcorespawn.procedures.UltimatePickaxeToolInInventoryTickProcedure;
import net.kiencoredev.kcorespawn.procedures.UltimateHoeRightclickedOnBlockProcedure;
import net.kiencoredev.kcorespawn.init.KcOrespawnModItems;

public class UltimateHoeItem extends HoeItem {
	public UltimateHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 40000;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 37f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KcOrespawnModItems.URANIUMINGOT.get()), new ItemStack(KcOrespawnModItems.TITANIUM_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		UltimateHoeRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		UltimatePickaxeToolInInventoryTickProcedure.execute(itemstack);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
