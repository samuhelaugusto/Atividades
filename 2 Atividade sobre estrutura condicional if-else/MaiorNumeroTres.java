//4)Faça um programa que leia 3 números e mostre o maior deles;
package segunda;

import java.util.Scanner;
import java.util.Locale;

public class MaiorNumeroTres {

	public static void main(String[] args) {
		final var ponto = new Locale("en", "us");
		Scanner leia = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		System.out.println("Insira o primeiro número: ");
		num1 = leia.useLocale(ponto).nextDouble();
		System.out.println("Insira o segundo número: ");
		num2 = leia.useLocale(ponto).nextDouble();
		System.out.println("Insira o terceiro número: ");
		num3 = leia.useLocale(ponto).nextDouble();

		if ((num1 >= num2) && (num1 >= num3)) {
			System.out.printf("%.2f é o maior número digitado", num1);
		} else if ((num1 <= num2) && (num2 >= num3)) {
			System.out.printf("%.2f é o maior número digitado", num2);
		} else {
			System.out.printf("%.2f é o maior número digitado", num3);
		}
		leia.close();

	}

}
