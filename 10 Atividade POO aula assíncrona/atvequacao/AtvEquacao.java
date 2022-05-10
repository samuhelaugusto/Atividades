package atvpooassincrona1;

import java.util.Scanner;

public class AtvEquacao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Equacao num1;
		num1 = new Equacao();

		System.out.println("Informe o primeiro número: ");
		num1.a = leia.nextInt();
		System.out.println("Informe o segundo número: ");
		num1.b = leia.nextInt();
		System.out.println("Informe o terceiro número: ");
		num1.c = leia.nextInt();

		double delta = ((num1.b * num1.b) - (4 * num1.a * num1.c));
		double x1 = 0.0;
		double x2 = 0.0;
		if (delta >= 0) {
			x1 = ((-num1.b + (Math.sqrt(delta))) / (2 * num1.a));
			x2 = ((-num1.b - (Math.sqrt(delta))) / (2 * num1.a));
			System.out.println("x1 vale: " + x1);
			System.out.println("x2 vale: " + x2);
		} else {
			System.out.println("Delta menor que 0");
		}
		leia.close();
	}
}
