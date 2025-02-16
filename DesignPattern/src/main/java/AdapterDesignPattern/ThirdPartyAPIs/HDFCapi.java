package AdapterDesignPattern.ThirdPartyAPIs;

public class HDFCapi {
	
	public void transferMoney(String to, double amount, String from) {
		System.out.println("HDFC From: "+from+" to: "+to+" amount: "+amount);
	}
	
	public void getBalance(String acNumber) {
		System.out.println("HDFC AccountNumber: "+acNumber+ "Balance: "+26453);
	}
}
