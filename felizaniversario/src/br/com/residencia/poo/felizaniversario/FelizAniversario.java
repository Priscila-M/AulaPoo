package br.com.residencia.poo.felizaniversario;

import java.util.Scanner;

public class FelizAniversario {

	public static void main(String[] args) {
			
			String nome;
			Scanner leia = new Scanner (System.in);
			
		    
			System.out.println("Olá, escreva o seu nome: ");
			nome = leia.nextLine();
			

			System.out.println("\n\t         * * *\n");
			System.out.println("\t         | | |\n");
			System.out.println("\t    ***************\n");
			System.out.println("\t    ***************\n");
			System.out.println("\t    ***************\n");
			System.out.println("\t *********************\n");
			System.out.println("\t *********************\n");
				
			System.out.println("\n\tFELÍZ ANIVERSÁRIO " + nome + "!!!\n");
			leia.close();


	}

}
