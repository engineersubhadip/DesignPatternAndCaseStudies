package AdapterDesignPattern;

public interface BankAPI {
	void sendMoney(String from, String to, double amount);
	void checkBalance(String accountNumber);
}
