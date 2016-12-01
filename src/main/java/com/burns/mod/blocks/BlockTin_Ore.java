package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTin_Ore extends Block {

	public BlockTin_Ore() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.TIN_ORE.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.TIN_ORE.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
