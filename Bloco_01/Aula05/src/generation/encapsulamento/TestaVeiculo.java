package generation.encapsulamento;

import java.util.Scanner;

public class TestaVeiculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Veiculo carro = new Veiculo();
		
		System.out.println("Digite a cor do veículo: ");
		carro.setCor(sc.next());
		System.out.println("Digite o ano do veículo: ");
		carro.setAno(sc.nextInt());
		System.out.println("Digite a marca do veículo: ");
		carro.setMarca(sc.next());
		System.out.println("Digite o modelo do veículo: ");
		carro.setModelo(sc.next());
		
		System.out.println("Cor do veículo: " + carro.getCor());
		System.out.println("Ano do veículo: " + carro.getAno());
		System.out.println("Marca do veículo: " + carro.getMarca());
		System.out.println("Modelo do veículo: " + carro.getModelo());
		
		
		
		
		
		sc.close();

	}

}
