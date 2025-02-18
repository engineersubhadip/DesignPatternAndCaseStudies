package FactoryDesignPattern.Version2;

import FactoryDesignPattern.Version2.FactoryComponents.AndriodFactory;
import FactoryDesignPattern.Version2.FactoryComponents.UiFactory;
import FactoryDesignPattern.Version2.FactoryComponents.iOSFactory;

public class Flutter {
	
	void setRefreshRate() {
		System.out.println("Setting the Refresh Rate...");
	}

	void setTheme() {
		System.out.println("Setting the theme...");
	}
	
	UiFactory setFactory(String platform) {
		if (platform.equalsIgnoreCase("Andriod")) {
			return new AndriodFactory();
		} else if (platform.equalsIgnoreCase("iOS")) {
			return new iOSFactory();
		} else {
			throw new RuntimeException("Platform not supported");
		}
	}
}
