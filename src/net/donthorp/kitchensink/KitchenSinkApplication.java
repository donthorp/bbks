/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */


package net.donthorp.kitchensink;

import org.appcelerator.titanium.TiApplication;

import ti.modules.titanium.api.APIModule;


public class KitchenSinkApplication extends TiApplication 
{
	public KitchenSinkApplication() 
	{
		super();
		
		appInfo = new KitchenSinkAppInfo(this);
		
		APIModule apiModule = new APIModule();
		apiModule.equals(apiModule);
	}

	public static void main(String[] args) {
		KitchenSinkApplication instance = new KitchenSinkApplication();
		instance.enterEventDispatcher();
	}
}
