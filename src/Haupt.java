
public class Haupt {

	public static void main(String[] args) {
		
		Person seb = new Person("Sebastian", "Uber");
		
		Person han = new Person("Hans", "Uber");
		
		System.out.println("Sohn: " + seb.getFirstName() + " " + seb.getLastName() + ".");
		System.out.println("Vater: " + han.getFirstName() + " " + han.getLastName() + ".");

	}

}
