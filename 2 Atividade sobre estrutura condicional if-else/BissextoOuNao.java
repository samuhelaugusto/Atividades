//1)Faça um programa que peça para o usuário entrar com um ano e dizer se esse ano é bissexto ou não;
package segunda;

import java.util.Scanner;

public class BissextoOuNao {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int ano;
		System.out.println("Digite um ano para saber se é bissexto");
		ano = ent.nextInt();
		// se o ano for maior que 400
		if (ano % 400 == 0) {
			System.out.println(ano + " é bissexto.");
			// se o ano for menor que 400
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é bissexto.");
		} else {
			System.out.println(ano + " não é bissexto.");
		}
	}
}
