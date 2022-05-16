package atvpoometodos2;

import java.util.Locale;
import java.util.Scanner;

public class AtvJogador {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		Jogador atributos = new Jogador();
		
		System.out.println("Informe o nome do jogador: ");
		atributos.nome = leia.nextLine();
		System.out.println("Informe o peso do jogador: ");
		atributos.peso = leia.useLocale(ponto).nextDouble();
		System.out.println("Informe a idade do jogador: ");
		atributos.idade = leia.nextInt();
		System.out.println("Informe a quantidade de cartões: ");
		atributos.qntcartoes = leia.nextInt();
		System.out.println("Informe a quantidade de gols na temporada: ");
		atributos.qntgols = leia.nextInt();
		System.out.println("Informe o salário do jogador: ");
		atributos.salario = leia.useLocale(ponto).nextDouble();
		System.out.println(atributos);
		leia.close();
	}

}
