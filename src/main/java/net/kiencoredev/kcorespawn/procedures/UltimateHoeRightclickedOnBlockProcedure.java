package net.kiencoredev.kcorespawn.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class UltimateHoeRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.GRASS.defaultBlockState(), 3);
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:dirt")))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:dirt")))) {
				world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:dirt")))) {
				world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:dirt")))) {
				world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.FARMLAND.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:dirt")))) {
				world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.FARMLAND.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:dirt")))) {
				world.setBlock(BlockPos.containing(x + 1, y, z + 1), Blocks.FARMLAND.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:dirt")))) {
				world.setBlock(BlockPos.containing(x - 1, y, z - 1), Blocks.FARMLAND.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:dirt")))) {
				world.setBlock(BlockPos.containing(x - 1, y, z + 1), Blocks.FARMLAND.defaultBlockState(), 3);
			}
		}
		world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
