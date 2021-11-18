package br.com.generation.exercioPolimorfismo;



public class TestaAnimal {
	
	public static void infoAnimal (Animal animal) {
		animal.nomeA();
		animal.idadeA();
		animal.somA();
		animal.correA();
		animal.subirArvore();
	}
		
	
			
		public static void main(String[] args) {
			infoAnimal(new Cachorro());
			infoAnimal(new Cavalo());
			infoAnimal(new Preguica());
			
			
		}
	

}
