package lesson4.homeWork;

public class Dog {

	public enum Breed {
		Bulldog("Bulldog"), FrenchBulldog("French Bulldog"), Rottweilers("Rottweiler"), Boxer("Boxer"),
		SiberianHuskie("Siberian Huskie");

		private final String dog;

		private Breed(String dog) {
			this.dog = dog;
		}

		public String getBreed() {
			return dog;
		}
	}

	private String name;
	private Breed dogBreed;
	private int age;

	public Dog() {
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(Breed dogBreed) {
		this.dogBreed = dogBreed;
	}

	public Breed getBreed() {
		return dogBreed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + dogBreed + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name.toLowerCase() == null) {
			if (other.name.toLowerCase() != null)
				return false;
		} else if (!name.toLowerCase().equals(other.name.toLowerCase()))
			return false;
		return true;
	}
}
