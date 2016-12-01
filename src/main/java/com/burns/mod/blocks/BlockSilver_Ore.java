package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSilver_Ore extends Block {

	public BlockSilver_Ore() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.SILVER_ORE.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.SILVER_ORE.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
