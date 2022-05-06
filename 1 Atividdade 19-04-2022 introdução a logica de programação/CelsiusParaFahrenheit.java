package primeira;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double fah;
		double celsius;
		System.out.print("Informa a temperatura em graus Celsius: ");
		celsius = leia.nextDouble();
		fah = (celsius * 1.8) + 32;
		System.out.print("A temperatura em graus Fahrenheit é: " + fah + "°F");
		leia.close();

	}

}
