package br.com.residencia.poo.exerciciobalanco;

import java.text.DecimalFormat;

public class BalancoTrimestralSemestralEAnual {

	public static void main(String[] args) {

		Double gastosJaneiro = 15000.0;
		Double gastosFevereiro = 23000.0;
		Double gastosMarco = 17000.0;
		Double gastosAbril = 10000.0;
		Double gastosMaio = 22000.0;
		Double gastosJunho = 25000.0;
		Double gastosJulho = 18000.0;
		Double gastosAgosto = 20000.0;
		Double gastosSetembro = 28000.0;
		Double gastosOutubro = 30000.0;
		Double gastosNovembro = 23000.0;
		Double gastosDezembro = 35000.0;

		Double gastosPrimeiroTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		Double gastosSegundoTrimestre = gastosAbril + gastosMaio + gastosJunho;
		Double gastosTerceiroTrimestre = gastosJulho + gastosAgosto + gastosSetembro;
		Double gastosQuartoTrimestre = gastosOutubro + gastosNovembro + gastosDezembro;

		Double gastosPrimeiroSemestre = gastosPrimeiroTrimestre + gastosSegundoTrimestre;
		Double gastosSegundoSemestre = gastosTerceiroTrimestre + gastosQuartoTrimestre;

		Double gastosAnual = gastosPrimeiroSemestre + gastosSegundoSemestre;

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("O gasto do primeiro trimeste foi de R$" + df.format(gastosPrimeiroTrimestre));
		System.out.println("O gasto do segundo trimeste foi de R$" + df.format(gastosSegundoTrimestre));
		System.out.println("O gasto do terceiro trimeste foi de R$" + df.format(gastosTerceiroTrimestre));
		System.out.println("O gasto do quarto trimeste foi de R$" + df.format(gastosQuartoTrimestre));
		System.out.println("*****************************************************************************");
		System.out.println("O gasto do primeiro semestre foi de R$" + df.format(gastosPrimeiroSemestre));
		System.out.println("O gasto do segundo semestre foi de R$" + df.format(gastosSegundoSemestre));
		System.out.println("*****************************************************************************");
		System.out.println("O gasto anual foi de R$" + df.format(gastosAnual));

	}

}