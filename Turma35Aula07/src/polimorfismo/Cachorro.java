package polimorfismo;

public class Cachorro extends Animal{

	//Polimorfismo --> é o principio pelo qual duas ou mais classes
	// derivadas de uma superClasse(Classe mais genérica) podem invocar
	// métodos que tem a mesma ASSINATURAS....mas comportamentos distintos
	public void comer() {
		System.out.println("Cachorro comendo ração....");
	}
}
