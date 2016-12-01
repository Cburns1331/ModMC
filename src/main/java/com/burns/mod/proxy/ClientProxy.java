package com.burns.mod.proxy;

import com.burns.mod.init.ModItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void init() {
		ModItems.registerRenders();
		super.init();
	}
}
