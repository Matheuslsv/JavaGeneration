package generation;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio01 {
	
	//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		//System.out.println("Olá, digite um número inteiro: ");
		//n1 = sc.nextInt();
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		
		//System.out.println("Agora digite outro número inteiro: ");
		//n2 = sc.nextInt();
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		
		//System.out.println("Digite mais um número inteiro: ");
		//n3 = sc.nextInt();
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		
		if(n1 > n2 && n1 > n3) {
			//System.out.println("O maior número é: " + n1);
			JOptionPane.showMessageDialog(null, "Os números inseridos foram:\n" + n1 + "\n" + n2 + "\n" + n3 + 
					"\n" + "O maior número entre eles é: " + n1);
		}
		else if(n2 > n1 && n2 > n3) {
			//System.out.println("O maior número é: " + n2);
			JOptionPane.showMessageDialog(null, "Os números inseridos foram:\n" + n1 + "\n" + n2 + "\n" + n3 + 
					"\n" + "O maior número entre eles é: " + n2);
		}
		else if(n3 > n1 && n3 > n2) {
			//System.out.println("O maior número é: " + n3);
			JOptionPane.showMessageDialog(null, "Os números inseridos foram:\n" + n1 + "\n" + n2 + "\n" + n3 + 
					"\n" + "O maior número entre eles é: " + n3);
		}
		
		sc.close();

	}

}
