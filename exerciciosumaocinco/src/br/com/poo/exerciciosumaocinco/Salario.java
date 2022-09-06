package br.com.poo.exerciciosumaocinco;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		int horaNormal, horaExtra, resultado, resultado2, salarioAnual;
		String nome;
		

		System.out.println("Funcionário: ");
		nome = leia.nextLine();
		System.out.println("Horas normais trabalhadas: ");
		horaNormal = leia.nextInt();
		System.out.println("Horas extras trabalhadas: ");
		horaExtra = leia.nextInt();

		resultado = horaNormal * 10;
		resultado2 = horaExtra * 15;
		salarioAnual = resultado + resultado2;

		System.out.println("O salário anual de " + nome + " é de R$" + salarioAnual + ",00.\n");
		leia.close();
	}

}
