/*1.Fa�a
um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem caso o
valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor
v�lido.*/
package terceira;

import java.util.Locale;
import java.util.Scanner;

public class ZeroEdez {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		double nota = 0.0;
		do {
			if (nota > 10.0);
			{
				System.out.println("Insira uma nota entre 0 e 10 para sair do programa");
			}
			System.out.print("Entre com a nota (1 a 10): ");
			nota = leia.useLocale(ponto).nextDouble();
		} while (nota > 10);
		System.out.println("O programa foi finalisado");
		leia.close();
	}
}
