package br.com.generation.repeticaoexercicios;

public class Exercicio2 {

	public static void main(String[] args) throws InterruptedException {
	int cont =0;
		for(int i = 1000; i < 2000;i++) {
			if (i % 11 == 5) {
				System.out.println(i + " ");
				if (++cont >20) {
					System.out.println(" ");
				}
				Thread.sleep(i);
			}
		}
	}

}
