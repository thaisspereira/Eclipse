package br.com.generation.repeticaoexercicios;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner entrada = new Scanner(System.in);
		int idade,contador21 = 0,contador50=0;
		System.out.println("Digite sua idade:");
		idade = entrada.nextInt();
		while(idade!= -99){
			
		if(idade<=21) {
			contador21++;
			}
		if (idade >= 50) {
			contador50++;
		}
		System.out.println("\nDigite a idade da pessoa(Para sair digite -99)");
		idade = entrada.nextInt();
	
	
		}
		System.out.println("O total de pessoas com menos de 21 anos é:  "  + contador21);
		System.out.println("O total de pessoas com mais de 50 anos é:   "  + contador50);
        Thread.sleep(1000);
		

	}
}
