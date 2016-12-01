package com.burns.mod.init;

import com.burns.mod.blocks.BlockBronze_Block;
import com.burns.mod.blocks.BlockChromium_Block;
import com.burns.mod.blocks.BlockChromium_Ore;
import com.burns.mod.blocks.BlockCopper_Block;
import com.burns.mod.blocks.BlockCopper_Ore;
import com.burns.mod.blocks.BlockPewter_Block;
import com.burns.mod.blocks.BlockPlatinum_Block;
import com.burns.mod.blocks.BlockPlatinum_Ore;
import com.burns.mod.blocks.BlockSilver_Block;
import com.burns.mod.blocks.BlockSilver_Ore;
import com.burns.mod.blocks.BlockStainless_Steel_Block;
import com.burns.mod.blocks.BlockSteel_Block;
import com.burns.mod.blocks.BlockTin_Block;
import com.burns.mod.blocks.BlockTin_Ore;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block silver_block;
	public static Block tin_block;
	public static Block copper_block;
	public static Block bronze_block;
	public static Block platinum_block;
	public static Block steel_block;
	public static Block chromium_block;
	public static Block stainless_steel_block;
	public static Block pewter_block;
	public static Block silver_ore;
	public static Block tin_ore;
	public static Block copper_ore;
	public static Block platinum_ore;
	public static Block chromium_ore;
	
	public static void init(){
		silver_block = new BlockSilver_Block();
		tin_block = new BlockTin_Block();
		copper_block = new BlockCopper_Block();
		bronze_block = new BlockBronze_Block();
		platinum_block = new BlockPlatinum_Block();
		steel_block = new BlockSteel_Block();
		chromium_block = new BlockChromium_Block();
		stainless_steel_block = new BlockStainless_Steel_Block();
		pewter_block = new BlockPewter_Block();
		silver_ore = new BlockSilver_Ore();
		tin_ore = new BlockTin_Ore();
		copper_ore = new BlockCopper_Ore();
		platinum_ore = new BlockPlatinum_Ore();
		chromium_ore = new BlockChromium_Ore();
	}
	
	public static void register(){
		registerBlock(silver_block);
		registerBlock(tin_block);
		registerBlock(copper_block);
		registerBlock(bronze_block);
		registerBlock(platinum_block);
		registerBlock(steel_block);
		registerBlock(chromium_block);
		registerBlock(stainless_steel_block);
		registerBlock(pewter_block);
		registerBlock(silver_ore);
		registerBlock(tin_ore);
		registerBlock(copper_ore);
		registerBlock(platinum_ore);
		registerBlock(chromium_ore);
	}
	
	private static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders(){
		registerRender(silver_block);
		registerRender(tin_block);
		registerRender(copper_block);
		registerRender(bronze_block);
		registerRender(platinum_block);
		registerRender(steel_block);
		registerRender(chromium_block);
		registerRender(stainless_steel_block);
		registerRender(pewter_block);
		registerRender(silver_ore);
		registerRender(tin_ore);
		registerRender(copper_ore);
		registerRender(platinum_ore);
		registerRender(chromium_ore);
	}
	
	public static void registerRender(Block block){
		//ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
