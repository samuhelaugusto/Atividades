//1)Fa�a um programa que pe�a para o usu�rio entrar com um ano e dizer se esse ano � bissexto ou n�o;
package segunda;

import java.util.Scanner;

public class BissextoOuNao {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int ano;
		System.out.println("Digite um ano para saber se � bissexto");
		ano = ent.nextInt();
		// se o ano for maior que 400
		if (ano % 400 == 0) {
			System.out.println(ano + " � bissexto.");
			// se o ano for menor que 400
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " � bissexto.");
		} else {
			System.out.println(ano + " n�o � bissexto.");
		}
	}
}
