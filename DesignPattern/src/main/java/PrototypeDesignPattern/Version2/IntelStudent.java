package PrototypeDesignPattern.Version2;

public class IntelStudent extends Student {

	int iq;

	public IntelStudent() {
	};

	public IntelStudent copy() {

		IntelStudent is = new IntelStudent();
		is.name = this.name;
		is.age = this.age;
		is.iq = this.iq;
		return is;
	}
}
