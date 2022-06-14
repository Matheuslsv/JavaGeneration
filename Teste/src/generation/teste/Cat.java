package generation.teste;

import java.util.Scanner;

public class Cat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sabor;
		String continuar;
		
		System.out.println("======CATALOGO======");
		System.out.println("Escolha o sabor da sua pizza!");
		
		System.out.println("1. Mussarela");
		System.out.println("2. Calabresa");
		System.out.println("3. Moda da casa");
		System.out.println("4. Frango c/ Catupiry");
		System.out.println("5. Portuguesa");
		
		sabor = sc.nextInt();
		
		System.out.println("Deseja mais alguma pizza? (S ou N)");
		continuar = sc.next();
		
		/*
		switch(continuar){
		
		case "s", "S":
			System.out.println("Voltando");
		break;
		
		case "n", "N":
			System.out.println("Continuando");
		break;
			
		}
		*/
		
		if(continuar == "s" || continuar == "S") {
			System.out.println("Voltando");
		}
		else if(continuar == "n" || continuar == "N") {
			System.out.println("Continuando");
		}
		else {
			System.out.println("Errado! Voltando");
		}
		
		
	}

}
