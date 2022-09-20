package br.com.residencia.poo.dataehora;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataEHora {

	public static void main(String[] args) {

		LocalDate data = LocalDate.now();
		System.out.println("LocalDate antes de formatar " + data);

		DateTimeFormatter formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		/*
		 * String dataFormatada = data.format(formatada);
		 * System.out.println(dataFormatada);
		 */
		System.out.println("LocalDate após formatação " + data.format(formatada));
		System.out.println("Dia da semana " + data.getDayOfWeek().name());
		System.out.println("Dia da semana " + data.getDayOfWeek().getValue());
		System.out.println("Dia da semana " + data.getDayOfWeek().ordinal());
		System.out.println("Mês " + data.getMonth().name());
		System.out.println("Mês " + data.getMonthValue());
		System.out.println("Ano " + data.getYear());

		LocalDate dataAniversario = LocalDate.of(1994, 07, 02);
		Period idade = Period.between(dataAniversario, data);
		System.out.println("A sua idade é: " + idade.getYears() + " anos e " + idade.getMonths() + " meses");

	}

}
