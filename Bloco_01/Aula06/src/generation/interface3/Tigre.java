package generation.interface3;

public class Tigre extends Animal{
	
	Tigre(String nome){
		System.out.println(nome);
	}
	
	@Override
	public void comer() {
		System.out.println("Tigre comendo...");
	}

}
