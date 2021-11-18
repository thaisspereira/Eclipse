package br.com.generation.repeticaoexercicios;

import java.util.Scanner;

public class Exercicio6 {
	//Thais Pereira 

	public static void main(String[] args){
		
		
		Scanner in = new Scanner(System.in);
		double soma = 0, contador = 0, num;
	
		do {
			System.out.println("Digite um número: ");
			num = in.nextDouble();
			
			if((num % 3 ==0) && (num!= 0)) {	
				soma += num;
				contador++;
			}
		}
		while(num != 0);
		System.out.println("A média dos números multiplos de 3 digitados é " + (soma/contador));
		in.close();
	}
}