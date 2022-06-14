package generation.teste;

import java.util.Scanner;

public class Catalogo {
	
	public static String teste (int escolha) {
		
		switch (escolha) {
		case 1: {
			return "\nVocê escolheu a pizza de mussarela!";
		}
		case 2: {
			return "\nVocê escolheu a pizza de Calabresa";
		}
		default: {
			return "\nOpção inválida";
		}
		
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String resposta;
		String mensagem;
		
		System.out.println("======CATALOGO======");
		System.out.println("Escolha o sabor da sua pizza!");
		
		System.out.println("1. Mussarela");
		System.out.println("2. Calabresa");
		System.out.println("3. Moda da casa");
		System.out.println("4. Frango c/ Catupiry");
		System.out.println("5. Portuguesa");
		
		do {
			resposta = sc.next();
			mensagem = teste(resposta);
			System.out.println(mensagem);
		}
		while (mensagem == "\nOpção inválida");

	}

}
