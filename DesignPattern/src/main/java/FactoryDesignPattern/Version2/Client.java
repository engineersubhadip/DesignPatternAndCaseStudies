package FactoryDesignPattern.Version2;

import FactoryDesignPattern.Version2.FactoryComponents.UiFactory;
import FactoryDesignPattern.Version2.UIComponents.Button;
import FactoryDesignPattern.Version2.UIComponents.Menu;

public class Client {

	public static void main(String[] args) {
		
		Flutter f = new Flutter();
		UiFactory ui = f.setFactory("iOS");
		
		Button b = ui.createButton();
		b.showButton();
		
		Menu m = ui.createMenu();
		m.showMenu();
	}

}
