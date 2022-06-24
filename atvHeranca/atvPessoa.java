package atvHeranca;

import java.util.Scanner;

public class atvPessoa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();

		System.out.print("Entre com o nome: ");
		pessoa.setNome(leia.nextLine());
		System.out.print("Entre com o cpf: ");
		pessoa.setCpf(leia.nextLong());
		System.out.print("Entre com a idade: ");
		pessoa.setIdade(leia.nextInt());
		System.out.print("Entre com a data de nascimento (dd/mm/aaaa): ");
		leia.nextLine();
		pessoa.setDataDeNascimento(leia.nextLine());
		System.out.print("Entre com o sexo: ");
		pessoa.setSexo(leia.next().charAt(0));
		System.out.print("Entre com a cidade de nascimento: ");
		leia.nextLine();
		pessoa.setCidadeDeNascimento(leia.nextLine());

		System.out.println(pessoa);

		System.out.print("Entre com o nome: ");
		aluno.setNome(leia.nextLine());
		System.out.print("Entre com o cpf: ");
		aluno.setCpf(leia.nextLong());
		System.out.print("Entre com a idade: ");
		aluno.setIdade(leia.nextInt());
		System.out.print("Entre com a data de nascimento (dd/mm/aaaa): ");
		leia.nextLine();
		aluno.setDataDeNascimento(leia.nextLine());
		System.out.print("Entre com o sexo: ");
		aluno.setSexo(leia.next().charAt(0));
		System.out.print("Entre com a cidade de nascimento: ");
		leia.nextLine();
		aluno.setCidadeDeNascimento(leia.nextLine());

		System.out.println(aluno);

		leia.close();

	}

}
