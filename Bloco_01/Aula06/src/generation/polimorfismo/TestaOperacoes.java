package generation.polimorfismo;

import java.util.Scanner;

public class TestaOperacoes {
	
	public static void calculaOperacao(OperacaoMatematica op, double x, double y) {
		System.out.println(op.calcular(x,  y));
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os valores a serem calculados: ");
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		
		
		calculaOperacao(new Soma(), x1, x2);
		calculaOperacao(new Multiplicacao(), x1, x2);
		calculaOperacao(new Divisao(), x1, x2);
		
		
		sc.close();

	}

}
