//3)Faça um programa que leia dois números e imprima o maior deles;
package segunda;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Insira o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Insira o segundo número: ");
		num2 = leia.nextInt();

		if (num1 > num2) {
			System.out.printf("%d é maior que %d", num1, num2);
		} else {
			System.out.printf("%d é maior do que %d", num2, num1);
		}
		leia.close();

	}

}
