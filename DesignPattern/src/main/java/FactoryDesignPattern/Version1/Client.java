package FactoryDesignPattern.Version1;

public class Client {

	public static void main(String[] args) {
		DataBase db = new OracleDB();
		Query q = db.createQuery();
		q.insertIntoDB();
		q.fetchDetails();
	}

}
