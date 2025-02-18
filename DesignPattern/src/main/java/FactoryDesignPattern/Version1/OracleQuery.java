package FactoryDesignPattern.Version1;

public class OracleQuery implements Query {
	
	@Override
	public void insertIntoDB() {
		System.out.println("Inserting into Oracle DB");

	}

	@Override
	public void fetchDetails() {
		System.out.println("Fetching from Oracle DB");

	}
}
