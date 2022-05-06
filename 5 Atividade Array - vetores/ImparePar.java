//IMPAR OU PAR
package quinta;

//import java.util.Arrays;
//import java.util.Locale;
import java.util.Scanner;

public class ImparePar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//final var ponto = new Locale("en", "us");
		int[] notas = new int[4];
		int[] par = new int[4];
		int[] impar = new int[4];

		for (int i = 0; i < notas.length; i++) {

			System.out.println("Entre com o numero " + i + ":");
			notas[i] = leia.nextInt();

			if (notas[i] % 2 == 0) {
				par[i] = notas[i];
			} else {
				impar[i] = notas[i];
			}
			
		}
		//SEMPRE CRIAR UM FOR PARA EXIBIR OQ TEM DENTRO DO ARRAY
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + "\t ");
			
		}
		System.out.println();
		for (int i = 0; i < notas.length; i++) {
			System.out.print(par[i] + "\t ");
			
		}
		System.out.println();
		for (int i = 0; i < notas.length; i++) {
			System.out.print(impar[i] + "\t ");
		}
		leia.close();
		
/*		//achei mais facil dessa maneira
		System.out.println("\nOs numeros inseridos foram: ");
		System.out.println(Arrays.toString(notas));
		System.out.println("\nOs NUMEROS PARES SÃO: ");
		System.out.println(Arrays.toString(par));
		System.out.println("\nOs NUMEROS IMPARES SÃO: ");
		System.out.println(Arrays.toString(impar));*/
	}

}
