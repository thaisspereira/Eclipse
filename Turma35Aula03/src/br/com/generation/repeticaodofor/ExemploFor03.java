package br.com.generation.repeticaodofor;

public class ExemploFor03 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int sobe = 1, desce = 10; sobe <=10 && desce >=1; sobe++, desce--) {
			System.out.print("\n" + sobe + " | " +desce);
			Thread.sleep(1000);
		}
		
	}

}
