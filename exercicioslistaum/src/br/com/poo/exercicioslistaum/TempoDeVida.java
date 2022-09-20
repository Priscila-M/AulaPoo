package br.com.poo.exercicioslistaum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TempoDeVida {

	public static void main(String[] args) {
		Inicio();
	}

	public static void Inicio() {
		Scanner leia = new Scanner(System.in);
		int idade = 0, minhaIdade = 0, totalIdade = 0;
		try {
			for (int cont = 1; cont <= 5; cont++) {
				System.out.println("Qual é a idade do colega " + cont + "?");
				idade = leia.nextInt();
				totalIdade += idade;

			}
			System.out.println("Qual é a minha idade? ");
			minhaIdade = leia.nextInt();

			totalIdade += minhaIdade;

			System.out.println("O tempo de vida meu e dos meus colegas é " + totalIdade + ".");
		} catch (InputMismatchException e) {
			System.out.println("Valor inválido!!");
			Inicio();

		}
		leia.close();
	}

}
/*
 * 2. O programa “Tempo de vida” irá imprimir a soma das idades de todos os
 * colegas da sua equipe (6 pessoas). Pergunte a cada um a idade e não esqueça a
 * sua! Depois faça a atribuição direta da expressão em uma variável inteira.
 */