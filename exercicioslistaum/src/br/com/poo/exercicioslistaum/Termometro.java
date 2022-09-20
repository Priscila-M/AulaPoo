package br.com.poo.exercicioslistaum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Termometro {

	public static void main(String[] args) {
		Inicio();
	}

	public static void Inicio() {
		Scanner leia = new Scanner(System.in);
		int tempC, tempF;
		try {
			System.out.print("Temperatura em °C ");
			tempC = leia.nextInt();
			tempF = (int) ((tempC * 1.8) + 32);

			System.out.println("Temperatura em °F " + tempF);
		} catch (InputMismatchException e) {
			System.out.println("Valor inválido!!");
			Inicio();
		}
		leia.close();
	}

}
/*
 * 4. O programa “termômetro” lê uma temperatura em graus celsius, e devolve sua
 * equivalência na escala fahrenheit. (Use: F = C * 1, 8 + 32)
 */