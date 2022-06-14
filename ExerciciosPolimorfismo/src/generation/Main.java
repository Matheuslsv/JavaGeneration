package generation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		Produtos produto1 = new Produtos("Arroz");
		Produtos produto2 = new Produtos("Feijao");
		Produtos produto3 = new Produtos("Carne");
		Produtos produto4 = new Produtos("Frango");
		Produtos produto5 = new Produtos("Açucar");
		
		ArrayList<Produtos> produtos = new ArrayList<>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		
		System.out.println("Os produtos em estoque são: " + produtos + "\n");
		
		produtos.remove(produto1);
		produtos.remove(produto4);
		
		System.out.println("Produtos removidos! O novo estoque é: " + produtos + "\n");
		
		Produtos produto6 = new Produtos("Batata");
		Produtos produto7 = new Produtos("Refrigerante");
		
		produtos.set(0, produto6);
		produtos.set(0, produto7);
		
		System.out.println("Produtos substituidos! O novo estoque é: " + produtos + "\n");
		
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto5);
		
		
		System.out.println("O estoque atual é: " + produtos + "\n");
		

	}

}
