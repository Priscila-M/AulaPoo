package br.com.poo.exercicioslistaum;

import java.util.Scanner;

public class NomeSobrenome {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nome, sobrenome;

		System.out.println("Qual o seu nome?");
		nome = leia.nextLine();
		System.out.println("E sobrenome?");
		sobrenome = leia.nextLine();
		System.out.println("Olá " + nome + " " + sobrenome + ", seja bem vindo(a) ao universo da programação!!!");
		leia.close();
	}

}

//1. O programa “bem-vindo” pergunta seu nome e sobrenome, e depois gentilmente te cumprimenta.