package atvnona1;

import java.util.Scanner;

public class AtvPessoa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		Pessoa pessoa1, pessoa2;
		pessoa1 = new Pessoa();
		pessoa2 = new Pessoa();
		//INFORMANDO O NOME
		System.out.println("Entre com a pessoa: ");
		pessoa1.nome = leia.nextLine();
		System.out.println("Entre com a segunda pessoa: ");
		pessoa2.nome = leia.nextLine();
		//INFORMANDO O PESO
		System.out.println("Informe o peso da primera pessoa: ");
		pessoa1.peso = leia.nextDouble();
		System.out.println("Informe o peso da segunda pessoa: ");
		pessoa2.peso = leia.nextDouble();
		//INFORMANDO A ALTURA
		System.out.println("Informe a altura da primera pessoa: ");
		pessoa1.altura = leia.nextDouble();
		System.out.println("Informe a altura da segunda pessoa: ");
		pessoa2.altura = leia.nextDouble();
		//INFORMANDO A IDADE
		System.out.println("Informe a idade da primera pessoa: ");
		pessoa1.idade = leia.nextInt();
		System.out.println("Informe a idade da segunda pessoa: ");
		pessoa2.idade = leia.nextInt();
		//ESTRUTURA DE COMPARAÇÃO
		if (pessoa1.peso > pessoa2.peso) {
			System.out.println(pessoa1.nome + " é mais pesado que a pessoa: " + pessoa2.nome );
		}else {
			System.out.println(pessoa2.nome + " é mais pesado que a pessoa: " + pessoa1.nome );
		} if (pessoa1.idade > pessoa2.idade) {
			System.out.println(pessoa1.nome + " é mais velha que a pessoa: " + pessoa2.nome );
		}else {
			System.out.println(pessoa2.nome + " é mais velha que a pessoa: " + pessoa1.nome );
		}
		leia.close();
	}
}
