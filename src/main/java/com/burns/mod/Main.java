package com.burns.mod;

import com.burns.mod.init.ModItems;
import com.burns.mod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main {

    @Instance
    public static Main instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy; 
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	System.out.println("Pre Init");
    	
    	ModItems.init();
    	ModItems.register();
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	System.out.println("Init");
    	
    	proxy.init();
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	System.out.println("Post Init");
    }
}