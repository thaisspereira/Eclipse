package br.com.generation.repeticaodofor;

public class ExemploFor {

	public static void main(String[] args) throws InterruptedException {
		//la�o de repeti��o ter� essas etapa: variavel startada, condicional, incremento ou decremento.
		for (int i = 0; i <=21; i+= 3){
			
		
			System.out.println("Repeti��o...." + i);
			Thread.sleep(1000);
		}

	}

}
