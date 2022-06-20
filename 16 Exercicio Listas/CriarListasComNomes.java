package atvlistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriarListasComNomes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Meu codigo

		List<String> nomes = new ArrayList<>();

		nomes.add("Luan"); // USADO PARA ADD DADOS NAS LISTAS
		nomes.add("Samuhel");
		nomes.add("Raquel");
		nomes.add("Katia");
		nomes.add("Edvan");
		nomes.add("João");
		nomes.add("Pedro");

		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("---------------------------------------------------");
		// VAI REMOVER OS DADOS QUE TEM OS CARACTERES MENORES QUE 6
		nomes.removeIf(x -> x.length() < 6);
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("---------------------------------------------------");

		// -----------------------------------------------------------------------------------------
		// codigo do professor
		List<String> nomes1 = new ArrayList<>();
		char opcao;

		do {
			System.out.print("Entre com o nome: ");
			String nome = leia.nextLine();

			nomes.add(nome);

			System.out.print("Deseja cadastrar mais um nome?(s/n)");
			opcao = leia.next().charAt(0);
			leia.nextLine();
		} while (opcao == 's');

		System.out.println("Os nomes cadastrados foram: ");
		for (String nome : nomes1) {
			System.out.println(nome);
		}

		System.out.println("Entre com o nome que deseja deletar: ");
		String nomeExcluido = leia.nextLine();

		nomes.remove(nomeExcluido);

		System.out.println("O nome foi removido da lista, lista atualizada: ");
		for (String nome : nomes1) {
			System.out.println(nome);

		}

		leia.close();

	}

}
