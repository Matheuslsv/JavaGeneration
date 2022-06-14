package generation.interfacee;

public class Cachorro implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("O som do cachorro: Au au");
		
	}

	@Override
	public void dormir() {
		System.out.println("O cachorro dormindo...");
		
	}

}
