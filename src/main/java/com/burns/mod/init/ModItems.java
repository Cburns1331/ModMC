package com.burns.mod.init;

import com.burns.mod.items.ItemBronze_Ingot;
import com.burns.mod.items.ItemChromium_Ingot;
import com.burns.mod.items.ItemCopper_Ingot;
import com.burns.mod.items.ItemPewter_Ingot;
import com.burns.mod.items.ItemPlatinum_Ingot;
import com.burns.mod.items.ItemSilver_Ingot;
import com.burns.mod.items.ItemStainless_Steel_Ingot;
import com.burns.mod.items.ItemSteel_Ingot;
import com.burns.mod.items.ItemTin_Ingot;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item copper_ingot;
	public static Item silver_ingot;
	public static Item tin_ingot;
	public static Item bronze_ingot;
	public static Item platinum_ingot;
	public static Item steel_ingot;
	public static Item chromium_ingot;
	public static Item stainless_steel_ingot;
	public static Item pewter_ingot;
	
	public static void init(){
		copper_ingot = new ItemCopper_Ingot();
		silver_ingot = new ItemSilver_Ingot();
		tin_ingot = new ItemTin_Ingot();
		bronze_ingot = new ItemBronze_Ingot();
		platinum_ingot = new ItemPlatinum_Ingot();
		steel_ingot = new ItemSteel_Ingot();
		chromium_ingot = new ItemChromium_Ingot();
		stainless_steel_ingot = new ItemStainless_Steel_Ingot();
		pewter_ingot = new ItemPewter_Ingot();
	}
	
	public static void register(){
		GameRegistry.register(copper_ingot);
		GameRegistry.register(silver_ingot);
		GameRegistry.register(tin_ingot);
		GameRegistry.register(bronze_ingot);
		GameRegistry.register(platinum_ingot);
		GameRegistry.register(steel_ingot);
		GameRegistry.register(chromium_ingot);
		GameRegistry.register(stainless_steel_ingot);
		GameRegistry.register(pewter_ingot);
	}
	
	public static void registerRenders(){
		registerRender(copper_ingot);
		registerRender(silver_ingot);
		registerRender(tin_ingot);
		registerRender(bronze_ingot);
		registerRender(platinum_ingot);
		registerRender(steel_ingot);
		registerRender(chromium_ingot);
		registerRender(stainless_steel_ingot);
		registerRender(pewter_ingot);
	}
	
	public static void registerRender(Item item){
		//ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
