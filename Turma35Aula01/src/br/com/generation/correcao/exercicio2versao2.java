package br.com.generation.correcao;

import java.util.Scanner;

public class exercicio2versao2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int idadeDias, idadeMeses, idadeAnos, totalDias;
		System.out.println("Digite quantos dias voc� j� viveu:");
		totalDias =leia.nextInt();
		
		idadeAnos = totalDias/365;
		idadeMeses = (totalDias%365)/30;
		idadeDias = (totalDias%365)% 30;
		System.out.println("A idade �: "+ idadeAnos);
		System.out.println("Meses �: "+ idadeMeses);
		System.out.println("Dias �: "+ idadeDias);
		
		leia.close();
		
		
		
	}
}
