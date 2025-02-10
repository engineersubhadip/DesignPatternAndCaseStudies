package BuilderDesignPattern.OptionalArguments;

public class Student {

	private String name;
	private int age;
	private String uniName;

	private Student(Builder build) {
		this.name = build.name;
		this.age = build.age;
		this.uniName = build.uniName;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getUniName() {
		return uniName;
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	static class Builder {

		private String name;
		private int age;
		private String uniName;

		public Student build() {
			if (this.name == null || this.name.length() == 0) {
				throw new RuntimeException("Please enter valid Name");
			}
			if (this.age < 0 || this.age > 100) {
				throw new RuntimeException("Please enter valid Age");
			}
			Student newStudent = new Student(this);
			return newStudent;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setUniName(String uniName) {
			if (uniName == null || uniName.length() == 0) {
				throw new RuntimeException("Please enter valid University Name");
			}
			this.uniName = uniName;
			return this;
		}

	}
}
