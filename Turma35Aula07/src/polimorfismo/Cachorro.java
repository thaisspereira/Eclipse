package polimorfismo;

public class Cachorro extends Animal{

	//Polimorfismo --> � o principio pelo qual duas ou mais classes
	// derivadas de uma superClasse(Classe mais gen�rica) podem invocar
	// m�todos que tem a mesma ASSINATURAS....mas comportamentos distintos
	public void comer() {
		System.out.println("Cachorro comendo ra��o....");
	}
}
