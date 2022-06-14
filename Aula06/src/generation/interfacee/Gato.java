package generation.interfacee;

public class Gato implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("O som do Gato: Miau Miau");
		
	}

	@Override
	public void dormir() {
		System.out.println("O gato dormindo...");
		
	}

}
