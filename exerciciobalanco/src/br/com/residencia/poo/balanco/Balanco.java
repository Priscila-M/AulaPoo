package br.com.residencia.poo.balanco;

import java.text.DecimalFormat;

public class Balanco {

	private Double gastosJaneiro = 15000.0;
	private Double gastosFevereiro = 23000.0;
	private Double gastosMarco = 17000.0;
	private Double gastosAbril = 10000.0;
	private Double gastosMaio = 22000.0;
	private Double gastosJunho = 25000.0;
	private Double gastosJulho = 18000.0;
	private Double gastosAgosto = 20000.0;
	private Double gastosSetembro = 28000.0;
	private Double gastosOutubro = 30000.0;
	private Double gastosNovembro = 23000.0;
	private Double gastosDezembro = 35000.0;

	private Double primeiroTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
	private Double segundoTrimestre = gastosAbril + gastosMaio + gastosJunho;
	private Double terceiroTrimestre = gastosJulho + gastosAgosto + gastosSetembro;
	private Double quartoTrimestre = gastosOutubro + gastosNovembro + gastosDezembro;

	private Double primeiroSemestre = primeiroTrimestre + segundoTrimestre;
	private Double segundoSemestre = terceiroTrimestre + quartoTrimestre;

	private Double gastosAnual = primeiroSemestre + segundoSemestre;

	public Double soma() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O balanço do primeiro trimestre é R$ " + df.format(primeiroTrimestre));
		return primeiroTrimestre;
	}

	public Double soma1() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O balanço do segundo trimestre é R$ " + df.format(segundoTrimestre));
		return segundoTrimestre;
	}

	public Double soma2() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O balanço do terceiro trimestre é R$ " + df.format(terceiroTrimestre));
		return terceiroTrimestre;
	}

	public Double soma3() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O balanço do quarto trimestre é R$ " + df.format(quartoTrimestre));
		return quartoTrimestre;
	}

	public Double soma4() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O balanço do primeiro semestre é R$ " + df.format(primeiroSemestre));
		return primeiroSemestre;
	}

	public Double soma5() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O balanço do segundo semestre é R$ " + df.format(segundoSemestre));
		return segundoSemestre;
	}

	public Double soma6() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O balanço anual total é R$ " + df.format(gastosAnual));
		return gastosAnual;
	}
}
