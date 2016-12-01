package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPlatinum_Block extends Block {

	public BlockPlatinum_Block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.PLATINUM_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.PLATINUM_BLOCK.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
