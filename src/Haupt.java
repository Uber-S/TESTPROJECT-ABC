
public class Haupt {

	public static void main(String[] args) {
		
		Pet cat = new Pet("Lisa", "Katze");
		Pet dog = new Pet("Wuffi", "Hund");
				
		Person seb = new Person("Sebastian", "Uber", cat);		
		Person han = new Person("Hans", "Uber", dog);
		
		System.out.println("Sohn: " + seb.getFirstName() + " " + seb.getLastName() + ".");
		System.out.println("Vater: " + han.getFirstName() + " " + han.getLastName() + ".");
		
		System.out.println("Haustier Nummer 1: " + cat.getName() + ", Typ: " + cat.getType() + ".");
		System.out.println("Haustier Nummer 2: " + dog.getName() + ", Typ:  " + dog.getType() + ".");
		
		seb.showAnimal();
		han.showAnimal();

	}

}
