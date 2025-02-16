package AdapterDesignPattern;

import AdapterDesignPattern.Adapters.HDFCAdapter;
import AdapterDesignPattern.Adapters.SBIAdapter;

public class PhonePe {
	BankAPI api = new SBIAdapter();
	
	public void sendMoney(String from, String to, double amount) {
		api.sendMoney(from, to, amount);
	}
	
	public void checkBalance(String accountNumber) {
		api.checkBalance(accountNumber);
	}
}
