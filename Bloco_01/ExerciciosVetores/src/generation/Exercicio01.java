package generation;

import java.util.Scanner;

public class Exercicio01 {
	
	//1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] valor = new int[5];
		int maior = 0;
		
		System.out.println("Digite um valor: ");
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Valor: ");
			valor[i] = sc.nextInt();
			
			if(maior < valor[i] || i == 0) {
				maior = valor[i];
			}
		}
		System.out.println();
		System.out.println("O maior valor do vetor é: " + maior);
		
		sc.close();

	}

}
