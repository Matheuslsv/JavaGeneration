package generation.forr;

public class Exemplo03 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int sobe = 1, desce = 9; sobe <= 9 && desce >= 1; sobe ++, desce --) {
			
			System.out.println(sobe + " | " + desce);
			Thread.sleep(500);
		}
		

	}

}
