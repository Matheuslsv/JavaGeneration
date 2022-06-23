package generation.testeunitario;

public class Calculadora {
	
	public int somar(int numero1, int numero2) {
		System.out.println("Valores inteiros");
		return numero1 + numero2;
	}
	
	public double somar(double numero1, double numero2) {
		System.out.println("Ponto flutuante");
		return numero1 + numero2;
	}

}
