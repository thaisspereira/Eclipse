package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio5 {
	
	//Thais Pereira 
	// 01/01/2021 

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediaFinal;

		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextInt();
		
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextInt();
		
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextInt();
		
		mediaFinal = ((nota1*2) + (nota2*3) + (nota3*5))/10;
		System.out.println("Sua m�dia final �: " + mediaFinal);
		
		leia.close();
	}

}