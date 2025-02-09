package PrototypeDesignPattern.FinalVersion;

public class IntelStudent extends Student {

	private int iq;

	public IntelStudent() {

	}

	public IntelStudent(IntelStudent is) {
		super(is);
		this.setIq(is.iq);
	}

	@Override
	public IntelStudent clone() { // is.clone(); this -> is
		IntelStudent isCopy = new IntelStudent(this);
		return isCopy;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}
}
