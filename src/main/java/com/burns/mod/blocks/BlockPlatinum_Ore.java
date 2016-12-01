package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPlatinum_Ore extends Block {

	public BlockPlatinum_Ore() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.PLATINUM_ORE.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.PLATINUM_ORE.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
