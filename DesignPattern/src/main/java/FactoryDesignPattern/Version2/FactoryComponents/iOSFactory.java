package FactoryDesignPattern.Version2.FactoryComponents;

import FactoryDesignPattern.Version2.UIComponents.iOSButton;
import FactoryDesignPattern.Version2.UIComponents.iOSMenu;

public class iOSFactory implements UiFactory {

	@Override
	public iOSButton createButton() {
		return new iOSButton();
	}

	@Override
	public iOSMenu createMenu() {
		return new iOSMenu();
	}

}
