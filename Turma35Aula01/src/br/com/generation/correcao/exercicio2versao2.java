package br.com.generation.correcao;

import java.util.Scanner;

public class exercicio2versao2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int idadeDias, idadeMeses, idadeAnos, totalDias;
		System.out.println("Digite quantos dias você já viveu:");
		totalDias =leia.nextInt();
		
		idadeAnos = totalDias/365;
		idadeMeses = (totalDias%365)/30;
		idadeDias = (totalDias%365)% 30;
		System.out.println("A idade é: "+ idadeAnos);
		System.out.println("Meses é: "+ idadeMeses);
		System.out.println("Dias é: "+ idadeDias);
		
		leia.close();
		
		
		
	}
}
