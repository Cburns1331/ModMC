package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockChromium_Block extends Block {

	public BlockChromium_Block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.CHROMIUM_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.CHROMIUM_BLOCK.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
