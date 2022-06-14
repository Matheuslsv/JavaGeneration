package generation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cachorro dog = new Cachorro();
		
		System.out.println("Escreva o nome do cachorro: ");
		dog.setNome(sc.next());
		System.out.println("Digite a idade do cachorro: ");
		dog.setIdade(sc.nextInt());
		System.out.println("Escreva a raça do cachorro: ");
		dog.setRaca(sc.next());
		
		System.out.println("O nome do cachorro é: " + dog.getNome());
		System.out.println("A idade do cachorro é: " + dog.getIdade() + " Anos");
		System.out.println("A raça do cachorro é: " + dog.getRaca());
		System.out.println("O som que o cachorro faz é: " + dog.getSom());
		System.out.println("O cachorro consegue " + dog.getAcao());
		
		System.out.println();
		
		Cavalo cavalo = new Cavalo();
		
		System.out.println("Escreva o nome do cavalo: ");
		cavalo.setNome(sc.next());
		//Max 30 anos
		System.out.println("Digite a idade do cavalo: ");
		cavalo.setIdade(sc.nextInt());
		//Azerbaijano; Azteca; Baixadeiro; Frisio
		System.out.println("Escreva a raça do cavalo: ");
		cavalo.setRaca(sc.next());
		
		System.out.println("O nome do cavalo é: " + cavalo.getNome());
		System.out.println("A idade do cavalo é: " + cavalo.getIdade() + " Anos");
		System.out.println("A raça do cavalo é: " + cavalo.getRaca());
		System.out.println("O som que o cavalo faz é: " + cavalo.getSom());
		System.out.println("O cavalo consegue " + cavalo.getAcao());
		
		System.out.println();
		
		Preguica preguica = new Preguica();
		
		System.out.println("Escreva o nome da preguica: ");
		preguica.setNome(sc.next());
		//Max 50 anos
		System.out.println("Digite a idade da preguica: ");
		preguica.setIdade(sc.nextInt());
		//preguica-comum; preguica-de-coleira; preguica-bentinho
		System.out.println("Escreva a raça da preguica: ");
		preguica.setRaca(sc.next());
		
		System.out.println("O nome da preguica é: " + preguica.getNome());
		System.out.println("A idade da preguica é: " + preguica.getIdade() + " Anos");
		System.out.println("A raça da preguica é: " + preguica.getRaca());
		System.out.println("O som que a preguica faz é: " + preguica.getSom());
		System.out.println("A preguica consegue " + preguica.getAcao());
		
		sc.close();

	}

}
