package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPewter_Block extends Block {

	public BlockPewter_Block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.PEWTER_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.PEWTER_BLOCK.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
