package generation.cliente;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		String sexo = null;
		
		System.out.println("Digite o nome do cliente: ");
		cliente.setNome(sc.next());
		System.out.println("Digite o sobrenome do cliente: ");
		cliente.setSobreNome(sc.next());
		System.out.println("Qual o sexo do cliente: m = masculino/ f = feminino / o = outros");
		cliente.setSexo(sc.next().charAt(0));
		
		switch(cliente.getSexo()) {
			
		case 'm':
			sexo = "Masculino";
		break;
		
		case 'f':
			sexo = "Feminino";
		break;
		
		case 'o':
			sexo = "Outros";
		break;
		
		default:
			System.out.println("Opção inválida!");
		
		}
		
		
		System.out.println("Digite a idade do cliente: ");
		cliente.setIdade(sc.nextInt());
		
		
		System.out.println("O nome do cliente é: " + cliente.getNome() + " " + cliente.getSobreNome());
		System.out.println("O sexo do cliente é: " + sexo);
		System.out.println("A idade do cliente é: " + cliente.getIdade());
		
		
		sc.close();

	}

}
