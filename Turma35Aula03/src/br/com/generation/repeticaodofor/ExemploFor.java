package br.com.generation.repeticaodofor;

public class ExemploFor {

	public static void main(String[] args) throws InterruptedException {
		//laço de repetição terá essas etapa: variavel startada, condicional, incremento ou decremento.
		for (int i = 0; i <=21; i+= 3){
			
		
			System.out.println("Repetição...." + i);
			Thread.sleep(1000);
		}

	}

}
