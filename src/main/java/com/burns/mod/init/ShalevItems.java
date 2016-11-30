package com.burns.mod.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashSet;
import java.util.Set;

public class ShalevItems {
	public static final Set<Item> items = new HashSet<>();
	
	public static Item copper_ore;
	
	public static void init(){
		copper_ore = new Item().setUnlocalizedName("copper_ore");
	}
	
	public static void register(){
		cooper_ore = registerItem(new )
	}
	
	public static void registerRenders(){
		
	}
	
	private static <T extends Item> T registerItem(T item) {
		GameRegistry.register(item);
		items.add(item);

		return item;
	}
}
