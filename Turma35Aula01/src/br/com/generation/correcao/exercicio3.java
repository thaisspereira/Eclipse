package br.com.generation.correcao;

import java.util.Scanner;

public class exercicio3 {
	//Thais Pereira
	// 01/01/21
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int horas = 0, minutos = 0, segundos = 0, totalSegundos,tempo = 0,sobraH = 0;

		System.out.println("Digite a hora: " );
		horas = leia.nextInt();
		System.out.println("Digite os minutos : ");
		minutos = leia.nextInt();
		System.out.println("Digite os segundos: ");
		segundos = leia.nextInt();
		
	 
		
		totalSegundos = 3600 * horas + 60 * minutos + segundos; 
		horas = (tempo / 3600);
		sobraH = (tempo %360);
		
		
		minutos = (horas/ 60);

		segundos = (sobraH % 60);
		
		System.out.println("O tempo de duração do evento em segundo é:  " + totalSegundos);
	 	totalSegundos = leia.nextInt();
		leia.close();
	}

}
