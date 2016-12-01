package com.burns.mod.items;

import com.burns.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTin_Ingot extends Item {

	public ItemTin_Ingot() {
		setUnlocalizedName(Reference.smItems.TIN_INGOT.getUnlocalizedName());
		setRegistryName(Reference.smItems.TIN_INGOT.getRegistryName());
		setCreativeTab(CreativeTabs.MATERIALS);
	}
}