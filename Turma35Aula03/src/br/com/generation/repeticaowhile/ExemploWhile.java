package br.com.generation.repeticaowhile;

public class ExemploWhile {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0;
		
		while(contador <=10) {
			
			System.out.println("Repeti��o....nr:" + contador);
			contador++;
			Thread.sleep(1000); // 1000 milisegundos = 1 segundo 
		}

	}

}
