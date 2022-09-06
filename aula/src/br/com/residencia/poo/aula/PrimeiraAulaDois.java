package br.com.residencia.poo.aula;

import java.util.Scanner;

public class PrimeiraAulaDois {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String nome;
		int idade;
		
		System.out.println("Qual é o seu nome? ");
		nome = leia.nextLine();
		System.out.println("Qual é a sua idade? ");
		idade = leia.nextInt();
		System.out.println("Seu nome é " + nome + " e sua idade é " + idade + ".");
		
		leia.close();
		
	}

}
