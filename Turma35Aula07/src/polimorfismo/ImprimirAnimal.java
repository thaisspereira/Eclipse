package polimorfismo;

public class ImprimirAnimal {

	public static void main(String[] args) {
		
		TestaAnimal t = new TestaAnimal();
			
		t.fazerAnimalComer(new Cachorro());
		t.fazerAnimalComer(new Tigre());
	}
}
