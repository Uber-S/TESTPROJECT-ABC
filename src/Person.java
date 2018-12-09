
public class Person {
	
	private final String firstName, lastName;
	private Pet animal;
	
	public Person(String firstName, String lastName, Pet animal) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.animal = animal;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void showAnimal() {
		System.out.println(firstName + " has a " + animal.getType()  + " and its name is " + animal.getName() + "." );
	}

}
