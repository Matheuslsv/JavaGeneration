package generation.whilee;

public class ExemploWhile01 {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0;
		
		while(contador <= 10) {
			
			System.out.println("Repetição:" + contador);
			contador ++;
			
			//Adiciona uma pausa na execução do código para ir mais devagar;
			Thread.sleep(1000);
		}

	}

}
