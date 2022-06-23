package generation.metodos;

import java.util.Scanner;

public class TesteMetodos {
	
	static int numero3, numero4, multiplicacao; //Variaveis globais

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da variavel numero3: ");
		numero3 = sc.nextInt();
		System.out.println("Digite o valor da variavel numero4: ");
		numero4 = sc.nextInt();
		
		
		metodo01();
		System.out.println("Olá, sou o método principal");
		metodo03();
		metodo04();
		
		TestaMetodoFora.metodo05();
		
		metodo06(90, 20);
	}
	
	public static void metodo01() {
		System.out.println("Olá sou o metodo01!");
		metodo02();
	}
	
	public static void metodo02() {
		//No metodo, as variaveis funcionam apenas dentro dele.
		double numero1 = 10, numero2 = 30, soma;
		
		soma = numero1 + numero2;
		
		System.out.println("Soma realizada no método02: " + soma);
	}
	
	public static void metodo03() {
		
		multiplicacao = numero3 * numero4;
	}
	
	public static void metodo04() {
		System.out.println("Metodo 04 está mostrando o calculo que foi feito o metodo 03: " + multiplicacao);
	}
	
	public static void metodo06(int numero5, int numero6) {
		
		int subtracao = numero5 - numero6;
		System.out.println("A subtração no método 06: " + subtracao);
	}

}
