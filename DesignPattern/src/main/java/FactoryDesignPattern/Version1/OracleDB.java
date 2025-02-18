package FactoryDesignPattern.Version1;

public class OracleDB implements DataBase{
	@Override
	public OracleQuery createQuery() {
		System.out.println("Creating Oracle Query");
		return new OracleQuery();
	}
}
