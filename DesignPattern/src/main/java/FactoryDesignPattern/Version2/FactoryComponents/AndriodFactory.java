package FactoryDesignPattern.Version2.FactoryComponents;

import FactoryDesignPattern.Version2.UIComponents.AndriodButton;
import FactoryDesignPattern.Version2.UIComponents.AndriodMenu;
import FactoryDesignPattern.Version2.UIComponents.Button;
import FactoryDesignPattern.Version2.UIComponents.Menu;

public class AndriodFactory implements UiFactory{

	@Override
	public AndriodButton createButton() {
		return new AndriodButton();
	}

	@Override
	public AndriodMenu createMenu() {
		return new AndriodMenu();
	}

}
