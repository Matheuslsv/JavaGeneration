package generation;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char letra;
		
		System.out.println("Escreva uma letra: ");
		letra = sc.next().charAt(0);
		
		switch (letra) {
		
			case 'a', 'A':
				System.out.println("Annie");
			break;
			
			case 'b', 'B':
				System.out.println("Bruna");
			break;
			
			case'c', 'C':
				System.out.println("Carlos");
			break;
			
			default:
				System.out.println("Opção invalida");
			break;
		}
		
		
		sc.close();

	}

}
