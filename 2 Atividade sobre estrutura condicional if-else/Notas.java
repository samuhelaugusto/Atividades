//7)Fa�a um programa que leia 4 notas de um aluno e retorne a media;
package segunda;

import java.util.Locale;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		final var ponto = new Locale("en", "us");
		Scanner leia = new Scanner(System.in);
		double nt1 = 0;
		double nt2 = 0;
		double nt3 = 0;
		double nt4 = 0;
		double media = 0;
		System.out.println("Informe sua primeria nota: ");
		nt1 = leia.useLocale(ponto).nextDouble();
		System.out.println("Informe sua segunda nota: ");
		nt2 = leia.useLocale(ponto).nextDouble();
		System.out.println("Informe sua terceira nota: ");
		nt3 = leia.useLocale(ponto).nextDouble();
		System.out.println("Informe sua quarta nota: ");
		nt4 = leia.useLocale(ponto).nextDouble();
		media = (nt1 + nt2 + nt3 + nt4) / 4;
		if (media > 60) {
			System.out.printf("Vo�e foi APROVADO com m�dia %.1f", media);
		} else {
			System.out.printf("Vo�e foi REPROVADO pois sua m�dia foi %.1f", media);
		}
		leia.close();

	}

}
