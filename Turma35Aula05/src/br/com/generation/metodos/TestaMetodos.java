package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodos {

static int num1 = 10, num2 = 3, subtracao, soma;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n3, n4;
		System.out.println("Digite o n�mero 3:");
		n3 = entrada.nextInt();
		System.out.println("Digite o n�mero 4:");
		n4 = entrada.nextInt();
		
		metodo1();
		metodo2();
		metodo3();
		metodo4();
		metodo6();
		metodo8();
		System.out.println(TestaMetodoFora.metodo7(n3, n4));

	}
	public static void metodo1() {
		System.out.println("Ol� eu sou o m�todo 1");
	}
	public static void metodo2() {
		double numero1 = 5, numero2 = 3, soma;
		soma = numero1 + numero2;
		System.out.println("A soma �: " + soma);
		soma = num1 + num2;
		System.out.println("Soma 2: " + soma);
	}
	public static void metodo3(){
		subtracao = num1 - num2;
	}
	public static void metodo4(){
		System.out.println("A subtra��o �: " + subtracao);
	}	
	public static void metodo5(int n1, int n2) {
		soma = n1 + n2;
		System.out.println(soma);
	}
	public static void metodo6() {
		metodo5(800, 2500);
	}
	public static void metodo8() {
		System.out.println(TestaMetodoFora.metodo7(0, 20));
	}
	
}


