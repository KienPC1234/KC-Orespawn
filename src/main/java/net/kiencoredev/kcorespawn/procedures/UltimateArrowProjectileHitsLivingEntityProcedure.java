package net.kiencoredev.kcorespawn.procedures;

import net.minecraft.world.entity.Entity;

public class UltimateArrowProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
