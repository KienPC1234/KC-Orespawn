package net.kiencoredev.kcorespawn.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class UltimateHoeRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIRT) {
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y, z + 1), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y, z - 1), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y, z - 1), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y, z + 1), Blocks.FARMLAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y, z + 1), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y, z - 1), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y, z - 1), Blocks.FARMLAND.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y, z + 1), Blocks.FARMLAND.defaultBlockState(), 3);
		}
	}
}
