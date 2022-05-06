//1 Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

package quinta;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ler5numeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		
		int numero [] = { 6, 10, 90, 35, 41 };
		System.out.println("Numeros do vetor:" + Arrays.toString(numero));
		Arrays.stream(numero).forEach(System.out::println);
		
		leia.close();
		ponto.clone();
/*inserindo dados 
		System.out.println("Enter com a quantidade de numeros que deseja armazenar");
		int recebe = leia.nextInt();
		int[] numero = new int[recebe];
		for (int cont = 0; cont < numero.length; cont++) {
			System.out.println("entre com o " + cont + " numero: ");
			numero[cont] = leia.nextInt();
		}
		for (int cont = 0; cont < numero.length; cont++) {
			System.out.println("numero no indice " + cont + ": " + numero[cont]);
		} */
	}

}
