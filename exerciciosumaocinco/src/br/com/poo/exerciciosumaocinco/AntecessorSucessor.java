package br.com.poo.exerciciosumaocinco;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num, antecessor, sucessor;

		System.out.print("Informe um número: ");
		num = leia.nextInt();

		antecessor = num - 1;
		sucessor = num + 1;

		System.out.println("Antecessor: " + antecessor + "\nSucessor: " + sucessor);
		leia.close();
	}

}
