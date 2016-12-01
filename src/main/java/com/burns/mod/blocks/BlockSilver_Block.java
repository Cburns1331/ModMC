package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSilver_Block extends Block {

	public BlockSilver_Block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.SILVER_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.SILVER_BLOCK.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
