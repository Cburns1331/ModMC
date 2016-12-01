package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBronze_Block extends Block {

	public BlockBronze_Block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.BRONZE_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.BRONZE_BLOCK.getRegistryName());
		//setHardness(2.0F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
