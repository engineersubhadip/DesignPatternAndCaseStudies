package AdapterDesignPattern.ThirdPartyAPIs;

public class SBIapi {
	
	public void transferBalance(double amount, String from, String to) {
		System.out.println("SBI Amount: " + amount + " to: " + to + " From: " + from);
	}

	public void receiveBalance(String accountNum) {
		System.out.println("SBI AccountNumber: " + accountNum + "Balance: " + 26453);
	}
}
