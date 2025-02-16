package AdapterDesignPattern;

public class Client {

	public static void main(String[] args) {
		PhonePe p = new PhonePe();
		p.sendMoney("Subhadip", "State Medical Hosp", 2500);
		p.checkBalance("123ABC");
	}
}
