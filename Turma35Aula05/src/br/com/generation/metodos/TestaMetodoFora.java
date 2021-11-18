package br.com.generation.metodos;

public class TestaMetodoFora {


	public static String metodo7(int i, int f) {
	
		String numeroString = "";
		
		for(int c = i; c <= f; c++) {
			numeroString = numeroString + c + " ";
		}
		return numeroString;
	}
}