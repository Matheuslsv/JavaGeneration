package generation;

import java.util.Scanner;

public class Exercicio3 {
	
	//3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	//categoria ela se encontra:
	// 10-14 infantil
	// 15-17 juvenil
	// 18-25 adulto

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Insira a sua idade: ");
		idade = sc.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Sua idade é infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Sua idade é juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Sua idade é adulto");
		}
		
		
		sc.close();
		

	}

}
