package generation.heranca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Professor prof1 = new Professor();
		
		prof1.setNome(sc.next());
		prof1.setIdade(35);
		prof1.setEndereco("Rua das nações, 255 - SP");
		prof1.setSalario(10000.00);
		prof1.setDisciplina("Geografia");
		
		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getEndereco());
		System.out.println(prof1.getSalario());
		System.out.println(prof1.getDisciplina());
		
		System.out.println();
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Vanesssa");
		aluno1.setIdade(22);
		aluno1.setEndereco("Rua do grito, 25 - SP");
		aluno1.setSemestre("6º semestre");
		aluno1.setCurso("Ciência da computação");
		
		System.out.println("Nome do aluno: " + aluno1.getNome());
		System.out.println(aluno1.getIdade());
		System.out.println(aluno1.getEndereco());
		System.out.println(aluno1.getSemestre());
		System.out.println(aluno1.getCurso());
		
		System.out.println();
		
		FuncAdm func1 = new FuncAdm();
		
		func1.setNome("Isabel");
		func1.setIdade(45);
		func1.setEndereco("Rua Maria de Lourdes, 1543 - SP");
		func1.setSalario(10500.00);
		func1.setSetor("Secretaria");
		func1.setFuncao("Atendimento");
		
		System.out.println(func1.getNome());
		System.out.println(func1.getIdade());
		System.out.println(func1.getEndereco());
		System.out.println(func1.getSalario());
		System.out.println(func1.getSetor());
		System.out.println(func1.getFuncao());
		
		
		sc.close();
	}

}
