package br.com.poo.exercicioslistaum;

import java.util.Scanner;

public class MiniCalculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int num, num2, soma, sub, mult, div, op;
		
		System.out.println("Insira o primeiro número: ");
		num = leia.nextInt();
		System.out.println("Insira o segundo número :");
		num2 = leia.nextInt();
		
		soma = num +num2;
		sub = num -num2;
		mult = num * num2;
		div = num / num2;
		
		//System.out.println("A soma é " + soma + "\nA subtração é " + sub + "\nA multiplicação é " + mult + "\nA divesão é " + div);
		
		System.out.println("Qual operação você deseja realizar? \n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
		op = leia.nextInt();
		
		switch(op) {
			case 1:
				System.out.println("O resultado da soma é " + soma);
				break;
			case 2:
				System.out.println("O resultado da subtração é " + sub);
				break;
			case 3:
				System.out.println("O resultado da multiplicação é " + mult);
				break;
			case 4:
				System.out.println("O resultado da divesão é " + div);
				break;
			default:
				System.out.println("Operação inválida!!");
		
		}
		
		leia.close();
	}

}
/*3. Crie o programa “mini calculadora”, que após ler dois números inteiros
apresenta as operações de soma, subtração, multiplicação e divisão com eles.*/
