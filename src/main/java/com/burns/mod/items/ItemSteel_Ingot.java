package com.burns.mod.items;

import com.burns.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSteel_Ingot extends Item {

	public ItemSteel_Ingot() {
		setUnlocalizedName(Reference.smItems.STEEL_INGOT.getUnlocalizedName());
		setRegistryName(Reference.smItems.STEEL_INGOT.getRegistryName());
		setCreativeTab(CreativeTabs.MATERIALS);
	}
}
