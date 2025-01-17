package com.github.platymemo.alaskanativecraft.block;

import com.github.platymemo.alaskanativecraft.item.AlaskaItems;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.random.RandomGenerator;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class LabradorTeaBlock extends FlowerBlock implements Fertilizable {
	public LabradorTeaBlock(StatusEffect suspiciousStewEffect, int effectDuration, AbstractBlock.Settings settings) {
		super(suspiciousStewEffect, effectDuration, settings);
	}

	@Override
	public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
		return AlaskaItems.LABRADOR_TEA.getDefaultStack();
	}

	@Override
	public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
		return true;
	}

	@Override
	public boolean canGrow(World world, RandomGenerator random, BlockPos pos, BlockState state) {
		return true;
	}

	@Override
	public void grow(ServerWorld world, RandomGenerator random, BlockPos pos, BlockState state) {
		dropStack(world, pos, new ItemStack(this));
	}
}
