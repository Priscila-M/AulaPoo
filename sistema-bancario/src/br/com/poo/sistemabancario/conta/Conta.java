package br.com.poo.sistemabancario.conta;

public class Conta {
	// declaracao de variaveis
	public int numero;
	public String titular;
	private double saldo;

	// metodo de saque com tratamento parcial
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente!!");
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}

	// metodo para efetuar um deposito com tratamentoparcial
	public boolean depositar(double valor) {
		if (valor < 0) {
			System.out.println("Valor inválido!");
			return false;
		} else {
			this.saldo += valor;
			return true;
		}

	}

	public boolean transferir(Conta destino, double valor) {
		boolean retirou = this.sacar(valor);
		if (retirou == false) {
			System.out.println("Saldo insuficiente!!");
			return false;
		} else {
			destino.depositar(valor);
			return true;
		}
		
	}
	/*
	 * boolean transfere (double valor, saldo c2){ if (valor > 0){ boolean retirou =
	 * this.saque(valor); if (retirou == false){ return false; }else{
	 * c2.deposita(valor); return true; } }else{
	 * System.out.println("Valor abaixo de zero!!"); return false; } }
	 */

	// acoes da conta

	// metodo de saque sem tratamento
//		public void sacar (double valor) {
//			double novoSaldo = this.saldo - valor;
//			this.saldo = novoSaldo;
//		}

	// metodo para efetuar um deposito sem tratamento
	// public void depositar(double valor) {
//			double novoSaldo = this.saldo + valor;
//			this.saldo = novoSaldo;

	// this.saldo += valor;
	// }
}

//public -> publico
//->a partir da mesma classe
//->qualquer classe do mesmo pacote
//->qualquer classe filha do mesmo pacote
//->qualquer classe filha em pacote diferente
//->qualquer classe em pacote diferente

//protected ->protegido
//->a partir da mesma classe
//->qualquer classe do mesmo pacote
//->qualquer classe filha do mesmo pacote
//->qualquer classe filha em pacote diferente

//default -> padrao
//->a partir da mesma classe
//->qualquer classe do mesmo pacote
//->qualquer classe filha do mesmo pacote

//private-> privado
//->a partir da mesma classe
