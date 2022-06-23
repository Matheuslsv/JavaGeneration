package generation;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor[][] = new int[3][3];
		int soma = 0, somaD = 0;
		
		System.out.println("Digite os valores: ");
		
		for(int l = 0; l < 3; l ++) {
			for(int c = 0; c < 3; c ++) {
			
				System.out.print("Valores: ");
				valor[l][c] = sc.nextInt();
				
				soma = valor[0][0] + valor[0][1] + valor[0][2] + valor[1][0] + valor[1][1] + valor[1][2] + 
						valor[2][0] + valor[2][1] + valor[2][2];
				
				somaD = valor[0][0] + valor[1][1] + valor[2][2];
				
				
			}
		}
		System.out.println("A soma total do valores é: " + soma);
		System.out.println();
		System.out.println("E a soma dos valores na primeira diagonal é: " + somaD);
		
		sc.close();
	}

}
