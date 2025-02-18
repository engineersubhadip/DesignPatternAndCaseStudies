package FactoryDesignPattern.Version2.FactoryComponents;

import FactoryDesignPattern.Version2.UIComponents.Button;
import FactoryDesignPattern.Version2.UIComponents.Menu;

public interface UiFactory {
	Button createButton();

	Menu createMenu();
}
