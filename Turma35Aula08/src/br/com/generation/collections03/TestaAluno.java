package br.com.generation.collections03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		System.out.println("Quantos Alunos voc� desseja add: ");
		int numeroAlunos = sc.nextInt();
		sc.nextLine();
		
		for(int i =0;i < numeroAlunos; i++) {
			
			System.out.println("Idade do Aluno: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nome do Aluno");
			String nome = sc.nextLine();
			
			alunos.add(new Aluno(idade,nome));
			
		
		}
		for(Aluno i: alunos) {
			System.out.println(i);
			
		}
		sc.close();
		
	}

}
