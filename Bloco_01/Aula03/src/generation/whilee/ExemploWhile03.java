package generation.whilee;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int numero = 1;
		
		while(numero != 10) {
			
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				numero ++;
				System.out.println(numero);
			}
			else {
				numero --;
				System.out.println(numero);
			}
			
			System.out.println("Fim...");
		}

	}

}
