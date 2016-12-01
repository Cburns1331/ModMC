package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCopper_Block extends Block {
	
	public BlockCopper_Block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.COPPER_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.COPPER_BLOCK.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
