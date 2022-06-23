package generation;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int impar = 0, par = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Escreva um numero: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				par ++;
			}
			else{
				impar ++;
			}
		}
		
		System.out.println("O total de números par: " + par);
		System.out.println("O total de números impar: " + impar);
		
		
		sc.close();

	}

}
