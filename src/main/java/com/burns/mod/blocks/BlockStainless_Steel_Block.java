package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStainless_Steel_Block extends Block {

	public BlockStainless_Steel_Block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.STAINLESS_STEEL_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.STAINLESS_STEEL_BLOCK.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
