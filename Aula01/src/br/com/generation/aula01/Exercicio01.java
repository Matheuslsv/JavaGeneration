package br.com.generation.aula01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));
		
		double galoes, litros;
		
		System.out.println("Informe o número de galões: ");
		galoes = sc.nextDouble();
		
		litros = galoes * 3.7854;
		
		System.out.println(galoes + " Galões americanos são: " + litros + " Litros.");
		
		
		sc.close();

	}

}
