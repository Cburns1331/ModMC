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
	
}
