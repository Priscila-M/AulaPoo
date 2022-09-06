package br.com.poo.exerciciosumaocinco;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int num, num2, soma;
		
		System.out.print("Insira um número: ");
		num = leia.nextInt();
		System.out.print("Insira outro número: ");
		num2 = leia.nextInt();
		
		soma = num + num2;
		
		System.out.println("\nO resultado da soma é " + soma + ".");
		leia.close();

	}

}
