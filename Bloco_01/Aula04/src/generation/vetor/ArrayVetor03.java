package generation.vetor;

import java.util.Scanner;

public class ArrayVetor03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tamanhoVetor = 1;
		
		System.out.println("Digite o tamanho do vetor: ");
		tamanhoVetor = sc.nextInt();
		
		int[] vetor = new int[tamanhoVetor];
		
		System.out.println("Tamanho do vetor: " + vetor.length);
		System.out.println();
		
		for(int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Digite os conteúdos do vetor: ");
			vetor[i] = sc.nextInt();
		}
		
		for(int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Posição: " + (i+1) + " conteúdo: " + vetor[i]);
		}
		
		sc.close();

	}

}
