/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */


package net.donthorp.kitchensink;

import org.appcelerator.titanium.ITiAppInfo;
import org.appcelerator.titanium.TiApplication;


public class KitchenSinkAppInfo implements ITiAppInfo 
{

	public KitchenSinkAppInfo(TiApplication app) 
	{
		//TODO add TiProperties
	}
	
	public String getCopyright() {
		return "Copyright 2010 by Appcelerator, Inc.";
	}

	public String getDescription() {
		return "Blackberry Test App";
	}

	public String getGUID() {
		return "abc12333fd1f4e95a06d2d217170866d";
	}

	public String getIcon() {
		return "default_app_logo.png";
	}

	public String getId() {
		return "org.appcelerator.bbapp";
	}

	public String getName() {
		return "BBApp";
	}

	public String getPublisher() {
		return "Appcelerator, Inc.";
	}

	public String getUrl() {
		return "http://appcelerator.com";
	}

	public String getVersion() {
		return "1.0";
	}

	public boolean isAnalyticsEnabled() {
		return false;
	}

	public boolean isFullscreen() {
		return false;
	}

	public boolean isNavBarHidden() {
		return false;
	}
}
