package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTin_Block extends Block {
	
	public BlockTin_Block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.TIN_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.TIN_BLOCK.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
}
