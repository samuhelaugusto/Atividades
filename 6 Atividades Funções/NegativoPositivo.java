//2. Fa�a um programa, com uma fun��o que necessite de um argumento. A fun��o retorna o valor de caractere �P�, se seu argumento for positivo, e �N�, se seu argumento for zero ou negativo.
package sexta;

import java.util.Scanner;

public class NegativoPositivo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0;		
		System.out.println("Informe o numero que deseja saber se � positivo ou negativo: ");
		num = leia.nextInt();
		System.out.println(Somar(num));
		leia.close();
	}

	static String Somar(int x) {
		if (x > 0) {
			return "O n�mero � positivo";
		} else if (x == 0) {
			return "N�mero neutro";
		} else {
			return "O n�mero � negativo";
		}
	}

}
