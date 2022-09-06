package br.com.poo.sistemabancario.principal;

import br.com.poo.sistemabancario.conta.Conta;

public class Principal {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		Conta minhaContaDois = new Conta();
		
		minhaConta.titular = "Bernardo";
		minhaConta.saldo = 1000.0;
		minhaConta.numero = 123;
		minhaConta.sacar(0);
		minhaConta.depositar(0);
		
		
		minhaContaDois.titular = "Priscila";
		minhaContaDois.saldo = 1000.0;
		minhaContaDois.numero = 456;
		minhaContaDois.sacar(0);
		minhaContaDois.depositar(0);
		
		minhaConta.transferir(minhaContaDois, 0);
		minhaContaDois.transferir(minhaConta, 500);
		
		System.out.println("Saldo atual: " + minhaConta.saldo 
				+ "\nNome do titular: " + minhaConta.titular
				+ "\nNumero da conta: " + minhaConta.numero);
		
		System.out.println("Saldo atual: " + minhaContaDois.saldo 
				+ "\nNome do titular: " + minhaContaDois.titular
				+ "\nNumero da conta: " + minhaContaDois.numero);
			
	}

}
