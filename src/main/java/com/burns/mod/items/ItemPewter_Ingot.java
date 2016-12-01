package com.burns.mod.items;

import com.burns.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPewter_Ingot extends Item {

	public ItemPewter_Ingot() {
		setUnlocalizedName(Reference.smItems.PEWTER_INGOT.getUnlocalizedName());
		setRegistryName(Reference.smItems.PEWTER_INGOT.getRegistryName());
		setCreativeTab(CreativeTabs.MATERIALS);
	}
}
