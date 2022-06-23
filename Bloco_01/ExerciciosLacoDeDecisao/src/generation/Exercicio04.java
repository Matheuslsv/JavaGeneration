package generation;

import java.util.Scanner;

public class Exercicio04 {
	
	//4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
	//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	//ímpar exiba o número elevado ao quadrado.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero = 0, divisao = 0;
		
		System.out.println("Digite um número: ");
		numero = sc.nextDouble();
		
		divisao = numero % 2;
		
		if(divisao == 0) {
			System.out.println("Este número é par!");
			numero = Math.sqrt(numero);
			System.out.println("A raiz quadrada desse número é: " + numero);
		}
		else if(divisao != 0) {
			System.out.println("Este número é ímpar!");
			numero = Math.pow(numero, 2);
			System.out.println("Esse número ao quadrado é: " + numero);
		}
		
		sc.close();

	}

}
