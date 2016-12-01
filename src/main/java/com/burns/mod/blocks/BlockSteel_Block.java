package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSteel_Block extends Block {

	public BlockSteel_Block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.STEEL_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.STEEL_BLOCK.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
