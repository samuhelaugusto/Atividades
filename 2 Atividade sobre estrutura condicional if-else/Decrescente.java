//5)Faça um programa que leia 3 números e imprima-os em ordem decrescente;
package segunda;

import java.util.Locale;
import java.util.Scanner;

public class Decrescente {

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

		if ((num1 >= num2) && (num1 >= num3) && (num2 >= num3)) {
			System.out.printf("%1f, %1f, %1f", num1, num2, num3);
		} else if ((num1 >= num2) && (num1 >= num3) && (num3 >= num2)) {
			System.out.printf("%1f, %1f, %1f", num1, num3, num2);
		} else if ((num2 >= num1) && (num2 >= num3) && (num1 >= num3)) {
			System.out.printf("%1f, %1f, %1f", num2, num1, num3);
		} else if ((num2 >= num1) && (num2 >= num3) && (num3 >= num1)) {
			System.out.printf("%1f, %1f, %1f", num2, num3, num1);
		} else if ((num3 >= num2) && (num3 >= num1) && (num1 >= num2)) {
			System.out.printf("%1f, %1f, %1f", num3, num1, num2);
		} else if ((num3 >= num2) && (num3 >= num1) && (num2 >= num1)) {
			System.out.printf("%1f, %1f, %1f", num3, num2, num1);
		} else {
			System.out.printf("errou");
		}
		leia.close();

	}

}
