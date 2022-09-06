package br.com.residencia.poo.aula;

import java.util.Scanner;

public class PrimeiraAulaUm {

	public static void main(String[] args) {
	 
		Scanner leia = new Scanner (System.in);
		String nome;
		
		System.out.println("Diga o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Olá, " + nome + "!!");
		leia.close();
		
	}

}
