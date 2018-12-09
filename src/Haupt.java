
public class Haupt {

	public static void main(String[] args) {
		
		Person seb = new Person("Sebastian", "Uber");		
		Person han = new Person("Hans", "Uber");
		
		Pet cat = new Pet("Lisa", "Katze");
		Pet dog = new Pet("Wuffi", "Hund");
		
		System.out.println("Sohn: " + seb.getFirstName() + " " + seb.getLastName() + ".");
		System.out.println("Vater: " + han.getFirstName() + " " + han.getLastName() + ".");
		
		System.out.println("Haustier Nummer 1: " + cat.getName() + ", Typ: " + cat.getType() + ".");
		System.out.println("Haustier Nummer 2: " + dog.getName() + ", Typ:  " + dog.getType() + ".");

	}

}
