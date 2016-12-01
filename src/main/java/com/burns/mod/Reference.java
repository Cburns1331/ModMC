package com.burns.mod;

public class Reference {
	public static final String MOD_ID = "sm";
	public static final String NAME = "Shalev Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.burns.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.burns.mod.proxy.ServerProxy";
	
	public static enum smItems{
		COPPER_INGOT("copper_ingot", "ItemCopper_Ingot"),
		SILVER_INGOT("silver_ingot", "ItemSilver_Ingot"),
		TIN_INGOT("tin_ingot", "ItemTin_Ingot"),
		BRONZE_INGOT("bronze_ingot", "ItemBronze_Ingot"),
		PLATINUM_INGOT("platinum_ingot", "ItemPlatinum_Ingot"),
		STEEL_INGOT("steel_ingot", "ItemSteel_Ingot"),
		CHROMIUM_INGOT("chromium_ingot", "ItemChromium_Ingot"),
		STAINLESS_STEEL_INGOT("stainless_steel_ingot", "ItemStainless_Steel_Ingot"),
		PEWTER_INGOT("pewter_ingot", "ItemPewter_Ingot");
		
		private String unlocalizedName;
		private String registryName;
		
		smItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum smBlocks{
		COPPER_BLOCK("copper_block", "BlockCopper_Block"),
		SILVER_BLOCK("silver_block", "BlockSilver_Block"),
		TIN_BLOCK("tin_block", "BlockTin_Block"),
		BRONZE_BLOCK("bronze_block", "BlockBronze_Block"),
		PLATINUM_BLOCK("platinum_block", "BlockPlatinum_Block"),
		STEEL_BLOCK("steel_block", "BlockSteel_Block"),
		CHROMIUM_BLOCK("chromium_block", "BlockChromium_Block"),
		STAINLESS_STEEL_BLOCK("stainless_steel_block", "BlockStainless_Steel_Block"),
		PEWTER_BLOCK("pewter_block", "BlockPewter_Block"),
		SILVER_ORE("silver_ore", "BlockSilver_Ore"),
		TIN_ORE("tin_ore", "BlockTin_Ore"),
		COPPER_ORE("copper_ore", "BlockCopper_Ore"),
		PLATINUM_ORE("platinum_ore", "BlockPlatinum_Ore"),
		CHROMIUM_ORE("chromium_ore", "BlockChromium_Ore");
		
		
		private String unlocalizedName;
		private String registryName;
		
		smBlocks(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
}
