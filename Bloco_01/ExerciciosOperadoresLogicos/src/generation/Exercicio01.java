package generation;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int anos = 0, meses = 0, dias = 0, resultado = 0;
		int anosR, mesesR;
		
		System.out.println("Olá! Insira quantos anos você tem: ");
		anos = sc.nextInt();
		System.out.println("Agora insira quanto meses: ");
		meses = sc.nextInt();
		System.out.println("E por fim, quantos dias: ");
		dias = sc.nextInt();
		
		anosR = anos * 12;
		mesesR = meses * 30;
		resultado = dias + mesesR * anosR;
		
		
		System.out.println("Você tem " + resultado + " dias de vida!");
		
		
		
		sc.close();
	}

}
