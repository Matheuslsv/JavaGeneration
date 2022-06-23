package generation.polimorfismo;

public class Multiplicacao extends OperacaoMatematica{
	
	@Override
	public double calcular(double x, double y) {
		System.out.print("Multiplicaco: ");
		return x * y;
	}

}
