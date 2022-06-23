package generation.sobrecargametodos;

import java.util.Scanner;

public class TestaCalculadora {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero1 = sc.nextDouble();
		double numero2 = sc.nextDouble();
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		//Somando dois inteiros...
		System.out.println(calc.soma(numero1, numero2));
		
		//Somando dois valores fracionários...
		//System.out.println(calc.soma(10.0, 101.8));
		
		//System.out.println(calc.soma(8.5, 9));
		
		
	}

}
