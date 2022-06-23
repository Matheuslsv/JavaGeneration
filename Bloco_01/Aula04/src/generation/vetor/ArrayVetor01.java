package generation.vetor;

public class ArrayVetor01 {

	public static void main(String[] args) {
		
		//vetor --> um array com 1 dimensao
		//matriz --> um array com mais de 1 dimensao
		
		int[] arrayVetor = new int[10];
		
		arrayVetor[5] = 653;
		
		for(int i  = 0; i < 10; i ++) {
			System.out.println("Indice do vetor: " + i + " -> " + arrayVetor[i]);
			
		}
	}

}
