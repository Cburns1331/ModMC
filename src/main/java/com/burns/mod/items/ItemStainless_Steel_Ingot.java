package com.burns.mod.items;

import com.burns.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemStainless_Steel_Ingot extends Item {

	public ItemStainless_Steel_Ingot() {
		setUnlocalizedName(Reference.smItems.STAINLESS_STEEL_INGOT.getUnlocalizedName());
		setRegistryName(Reference.smItems.STAINLESS_STEEL_INGOT.getRegistryName());
		setCreativeTab(CreativeTabs.MATERIALS);
	}
}
