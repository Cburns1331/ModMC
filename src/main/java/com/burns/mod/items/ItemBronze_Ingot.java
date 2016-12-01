package com.burns.mod.items;

import com.burns.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBronze_Ingot extends Item {

	public ItemBronze_Ingot() {
		setUnlocalizedName(Reference.smItems.BRONZE_INGOT.getUnlocalizedName());
		setRegistryName(Reference.smItems.BRONZE_INGOT.getRegistryName());
		setCreativeTab(CreativeTabs.MATERIALS);
	}
}
