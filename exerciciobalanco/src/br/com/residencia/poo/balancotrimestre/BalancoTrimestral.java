package br.com.residencia.poo.balancotrimestre;

import java.text.DecimalFormat;

public class BalancoTrimestral {

	public static void main(String[] args) {

		Double gastosJaneiro = 15000.0;
		Double gastosFevereiro = 23000.0;
		Double gastosMarco = 17000.0;
		Double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("O gasto trimestral foi de R$" + df.format(gastosTrimestre));

	}

}
