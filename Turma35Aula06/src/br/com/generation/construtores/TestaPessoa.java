package br.com.generation.construtores;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.println("digite o nome:");
		nome = entrada.nextLine();
		System.out.println("Digite a idade: ");
		idade = entrada.nextInt();
		
		Pessoa p1 = new Pessoa(nome ,idade);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
	}

}
