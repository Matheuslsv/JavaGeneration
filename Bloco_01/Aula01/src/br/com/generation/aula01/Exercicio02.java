package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n1 = 0, n2 = 0, resultado = 0;
		String operacao;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		n2 = sc.nextDouble();
		
		System.out.println("Digite a operação: ");
		operacao = sc.next();
		
		switch(operacao) {
			case "+" :
				resultado = n1 + n2;
			break;
				
			case "-":
				resultado = n1 - n2;
			break;
			
			case "*":
				resultado = n1 * n2;
			break;
			
			case "/":
				resultado = n1 / n2;
			break;
			
			default:
				System.out.println("Opção inválida!!");
						
		}
		
		System.out.println("O resultado é: " + resultado);
		
		
		sc.close();

	}

}
