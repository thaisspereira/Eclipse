package br.com.generation.matriz;

public class ExemploMatriz01 {

	public static void main(String[] args) {
		
		double [][] notasAlunos =  new double [2][4];
		
		notasAlunos[0][0] = 8.5;
		notasAlunos[0][1] = 9.6;
		notasAlunos[0][2] = 10.0;
		notasAlunos[0][3] = 5.3;
		
		notasAlunos[1][0] = 5.8;
		notasAlunos[1][1] = 6.9;
		notasAlunos[1][2] = 10.0;
		notasAlunos[1][3] = 3.5;
		
		
		double soma;
		
		for(int l = 0; l < notasAlunos.length;l++) {
			soma =0;
			for (int c = 0; c< notasAlunos[l].length; c++) {
			soma +=notasAlunos[l][c];
			}
			System.out.println("M�dia: "+  l  +  "�"  +   (soma/4));
		}
		
				

	}

}
