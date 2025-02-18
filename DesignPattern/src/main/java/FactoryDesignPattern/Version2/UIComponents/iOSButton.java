package FactoryDesignPattern.Version2.UIComponents;

public class iOSButton implements Button {

	@Override
	public void showButton() {
		System.out.println("Showing iOS Button");
	}
}
