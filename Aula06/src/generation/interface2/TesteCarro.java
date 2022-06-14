package generation.interface2;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro c = new Ferrari();
		c.acelerar();
		
		c = new Fusca();
		c.acelerar();

	}

}
