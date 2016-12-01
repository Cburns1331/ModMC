package com.burns.mod.blocks;

import com.burns.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockChromium_Ore extends Block {

	public BlockChromium_Ore() {
		super(Material.IRON);
		setUnlocalizedName(Reference.smBlocks.CHROMIUM_ORE.getUnlocalizedName());
		setRegistryName(Reference.smBlocks.CHROMIUM_ORE.getRegistryName());
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
