package net.kiencoredev.kcorespawn.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.kiencoredev.kcorespawn.network.KcOrespawnModVariables;

public class UltimateFishingRodRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean fishingfist = false;
		double LookX = 0;
		double LookY = 0;
		double LookZ = 0;
		double disafter = 0;
		if ((entity.getCapability(KcOrespawnModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KcOrespawnModVariables.PlayerVariables())).fishingstate == 2) {
			disafter = 1;
			for (int index0 = 0; index0 < 10; index0++) {
				LookX = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(disafter)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				LookY = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(disafter)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
				LookZ = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(disafter)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
				if ((world.getFluidState(BlockPos.containing(LookX, LookY, LookZ)).createLegacyBlock()).getBlock() == Blocks.LAVA) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"loot spawn ~ ~ ~ loot kc_orespawn:gameplay/lava_fishing");
				} else if ((world.getFluidState(BlockPos.containing(LookX, LookY, LookZ)).createLegacyBlock()).getBlock() == Blocks.WATER) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"loot spawn ~ ~ ~ loot kc_orespawn:gameplay/fishing");
				}
				disafter = disafter + 1;
			}
			{
				double _setval = 1;
				entity.getCapability(KcOrespawnModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fishingstate = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(KcOrespawnModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KcOrespawnModVariables.PlayerVariables())).fishingstate == 1) {
			{
				double _setval = 2;
				entity.getCapability(KcOrespawnModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fishingstate = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
