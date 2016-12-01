package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCopper_Ore extends Block {

	public BlockCopper_Ore() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.COPPER_ORE.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.COPPER_ORE.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
