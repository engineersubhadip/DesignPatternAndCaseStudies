package AdapterDesignPattern.Adapters;

import AdapterDesignPattern.BankAPI;
import AdapterDesignPattern.ThirdPartyAPIs.HDFCapi;

public class HDFCAdapter implements BankAPI {
	
	private HDFCapi api = new HDFCapi();
	
	@Override
	public void sendMoney(String from, String to, double amount) {
		api.transferMoney(to, amount, from);
	}

	@Override
	public void checkBalance(String accountNumber) {
		api.getBalance(accountNumber);
	}

}
