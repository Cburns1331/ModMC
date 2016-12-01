package com.burns.mod.items;

import com.burns.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCopper_Ingot extends Item {

	public ItemCopper_Ingot() {
		setUnlocalizedName(Reference.smItems.COPPER_INGOT.getUnlocalizedName());
		setRegistryName(Reference.smItems.COPPER_INGOT.getRegistryName());
		setCreativeTab(CreativeTabs.MATERIALS);
	}
}
