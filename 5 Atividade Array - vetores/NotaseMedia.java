//2.Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
package quinta;

import java.util.Locale;
import java.util.Scanner;

public class NotaseMedia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		
		double[] notas = new double[5];
		double media = 0.0;
		
		for(int i = 1; i < notas.length; i++) {
			System.out.println("Entre com a nota " +i + ":");
			notas[i] = leia.useLocale(ponto).nextDouble();
			
			media += notas[i];
		}
		
		System.out.println("As notas foram: ");
		for(int i = 1; i < notas.length; i++) {
			System.out.print("\t "+ notas[i]);
		}
		
		System.out.println("\n A media é: " + media / 4);

		leia.close();


		

	}

}
