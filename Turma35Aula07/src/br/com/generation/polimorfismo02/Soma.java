package br.com.generation.polimorfismo02;

public class Soma extends OperacaoMatematica{

	public double calcular(double x, double y) {
		System.out.print("Soma: " );
		return x + y;
	}
}
