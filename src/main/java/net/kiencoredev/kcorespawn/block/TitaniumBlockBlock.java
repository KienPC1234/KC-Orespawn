
package net.kiencoredev.kcorespawn.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class TitaniumBlockBlock extends Block {
	public TitaniumBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(6f, 15f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
