package br.com.generation.condicional;

import java.util.Scanner;

public class ExercicioLacoCondicional {

	   public static void main(String[] args) {

	        try (Scanner ler = new Scanner(System.in)) {
				int numero[] = new int[3];
				int i;
				int maior = 0;



				for(i=0; i<3; i++) {
				    System.out.println("Digite um número inteiro: ");
				    numero[i] = ler.nextInt();

				    if(numero[i] > maior) {
				        maior = numero[i]; 
				    }
				}
				System.out.println("O maior número digitado é: " + maior);
			}

	    }
	}