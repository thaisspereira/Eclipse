package br.com.generation.exerciciosvetormatriz;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);{
			
		}
		int pont [] = new int[5];
		int maior =0;
		
		
		for(int i =0; i < pont.length; i++) {
			System.out.println(" Digite a Pomtuacao : ");
			pont[i] = ler.nextInt();
			
			if (pont[i] >maior) {
				maior = pont[i];
			}
		}
		
		
		System.out.println("O maior número digitado é: " + maior);
	

	}

}
