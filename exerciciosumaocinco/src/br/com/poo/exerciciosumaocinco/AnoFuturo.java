package br.com.poo.exerciciosumaocinco;

import java.util.Scanner;

public class AnoFuturo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int anoNascimento, anoFuturo, resultado;
		String nome;

		System.out.println("Por favor, digite o seu nome:");
		nome = leia.nextLine();
		System.out.println("Por favor, digite o ano do seu nascimento: ");
		anoNascimento = leia.nextInt();

		anoFuturo = 2035;
		resultado = anoFuturo - anoNascimento;

		System.out.println("Olá, " + nome + ", em 2035 você terá " + resultado + " anos.");
		leia.close();

	}

}
