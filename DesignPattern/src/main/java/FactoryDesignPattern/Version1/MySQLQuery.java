package FactoryDesignPattern.Version1;

public class MySQLQuery implements Query{

	@Override
	public void insertIntoDB() {
		System.out.println("Inserting into My SQL DB");
		
	}

	@Override
	public void fetchDetails() {
		System.out.println("Fetching from My SQL DB");
		
	}

}
