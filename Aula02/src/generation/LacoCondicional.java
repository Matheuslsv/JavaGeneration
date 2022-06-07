package generation;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media < 5) {
			System.out.println("Aluno reprovado!");
		}
		else if(media >= 5 && media < 8) {
			System.out.println("Aluno aprovado!");
		}
		else {
			System.out.println();
			System.out.println("Aluno aprovadissimo!");
		}
		
		System.out.println("A média do aluno é: " + media);
		
		
		sc.close();

	}

}
