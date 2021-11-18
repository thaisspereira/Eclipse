package br.com.generation.exception;

public class TestaException {

	public static void main(String[] args) {
		
		int [] vetor= new int [4];
		System.out.println("Antes do Erro");
		try {
			vetor[4] = 10;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Esse vetor esta com valor errado na posição !");
			System.out.println(e);
		}
		
		

	}

}
