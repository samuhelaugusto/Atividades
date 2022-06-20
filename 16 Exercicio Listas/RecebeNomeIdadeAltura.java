package atvlistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RecebeNomeIdadeAltura {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		char opcao;
		do {
			System.out.print("Entre com o nome da pessoa: ");
			String nome = leia.nextLine();
			System.out.print("Entre com a idade da pessoa: ");
			int idade = leia.nextInt();
			System.out.print("Entre com a altura da pessoa: ");
			double altura = leia.nextDouble();

			pessoas.add(new Pessoa(nome, idade, altura));

			System.out.print("\nDeseja cadastrar mais uma pessoa? (s/n): ");
			opcao = leia.next().charAt(0);
			leia.nextLine();
		} while (opcao == 's');

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
//Daqui pra baixo nao consegui. oq está inserido é do professor 
		
		System.out.println("Pessoas maiores de 18 anos: ");

		int qtdPessoas = 0;
		List<Pessoa> idades = pessoas.stream().filter(x -> x.idade > 18).collect(Collectors.toList());
		for (int i = 0; i < idades.size(); i++) {

			qtdPessoas++;
		}

		System.out.println(qtdPessoas);

		leia.close();
	}
}
