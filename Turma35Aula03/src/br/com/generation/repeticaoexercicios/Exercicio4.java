package br.com.generation.repeticaoexercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int pes = 0, idade, sexo, humor, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0;
			
		while(pes < 3) {		
		 System.out.println("Digite a idade: ");
		 idade = in.nextInt();
		 System.out.println("Digite o n�mero do sexo [1]Feminino - [2]Masculino - [3]Outros : ");
		 sexo = in.nextInt();
		 System.out.println("Digite o estado mental [1]Calma - [2]Nervosa - [3]Agressiva: ");
		 humor = in.nextInt();
		 if(humor == 1) {
			 p1++;
		 }
		 if ((sexo == 1) && (humor == 2)) {
			 p2++;
		 }
		 if ((sexo == 2) && (humor == 3)) {
			 p3++;
		 }
		 if ((sexo == 3) && (humor == 1)) {
			 p4++;
		 }
		 if ((idade > 40) && (humor == 2)) {
			 p5++;
		 }
		 if ((idade < 18) && (humor == 1)) {
			 p6++;
		 }
		 pes++;
		}
		System.out.println("O n�mero de pessoas calmas � " + p1);
		System.out.println("O n�mero de mulheres nervosas � " + p2);
		System.out.println("O n�mero de homens agressivos � " + p3);
		System.out.println("O n�mero de outros calmos � " + p4);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos � " + p5);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos � " + p6);
		in.close();
	}


	}

