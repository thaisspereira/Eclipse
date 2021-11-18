package br.com.generation.correcao;

import java.util.Scanner;

public class exercicio4 {
	//Thais Pereira 
	// 01/10/21

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int A, B = 0, C = 0;
		float D;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt()	;
		
		System.out.println("Digite o valor de B: ");
		A = leia.nextInt()	;
		
		System.out.println("Digite o valor de C: ");
		A = leia.nextInt()	;
		
		
		double R = Math.pow((A+ B),2);
		double S = Math.pow((A+ B),2 );
		D = (float) ((R + S) / 2);
		
		System.out.println("O resultado é: " + D );
		
		leia.close();
		}

}
