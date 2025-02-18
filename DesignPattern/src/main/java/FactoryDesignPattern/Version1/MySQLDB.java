package FactoryDesignPattern.Version1;

public class MySQLDB implements DataBase {

	@Override
	public MySQLQuery createQuery() {
		System.out.println("Creating My SQL Query");
		return new MySQLQuery();
	}

}
