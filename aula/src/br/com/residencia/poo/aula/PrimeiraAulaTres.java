package br.com.residencia.poo.aula;

import java.util.Scanner;

public class PrimeiraAulaTres {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in); 
		double nota, media = 0.0, totalNotas = 0.0; 
		String nome, disciplina;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite sua disciplina: ");
		disciplina = leia.nextLine();
		
		/*for (int cont = 1; cont<= 3; cont++) {
			System.out.println("Insira a nota " + cont +" :");
			nota = leia.nextDouble();
			totalNotas += nota;
		}*/
		
		int cont = 1;
		while (cont <= 3) {
			System.out.println("Insira a nota " + cont + ":");
			nota = leia.nextDouble();
			totalNotas += nota;
			cont++;
		}
		
		/*int cont = 1;
		do {
			System.out.println("Insira a nota " + cont + ":");
			nota = leia.nextDouble();
			totalNotas += nota;
			cont++;
		}while(cont <= 3);*/
		
		media = totalNotas / 3;
		System.out.println("Olá, " + nome);
		System.out.println("Na disciplina " + disciplina + " a média é " + media + ".");
		
		leia.close();
	}

}
