package AdapterDesignPattern.Adapters;

import AdapterDesignPattern.BankAPI;
import AdapterDesignPattern.ThirdPartyAPIs.SBIapi;

public class SBIAdapter implements BankAPI {
	
	private SBIapi api = new SBIapi();
	
	@Override
	public void sendMoney(String from, String to, double amount) {
		api.transferBalance(amount, from, to);
	}

	@Override
	public void checkBalance(String accountNumber) {
		api.receiveBalance(accountNumber);
	}

}
