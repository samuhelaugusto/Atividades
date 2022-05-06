package primeira;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double fah;
		double celsius;
		System.out.print("Informa a temperatura em graus Fahrenheit: ");
		fah = leia.nextDouble();
		celsius = (fah - 32) / 1.8;
		System.out.print("A temperatura em graus Celsius é: " + celsius + "°C");
		leia.close();

	}

}
