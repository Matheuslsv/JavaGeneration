package br.com.generation.aula01;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVariavel04 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		double a, b, soma;
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		
		soma = a + b;
		
		System.out.println("A soma dos valores é: " + soma);
		
		
		
		sc.close();
	}

}
