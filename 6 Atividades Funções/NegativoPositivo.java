//2. Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.
package sexta;

import java.util.Scanner;

public class NegativoPositivo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0;		
		System.out.println("Informe o numero que deseja saber se é positivo ou negativo: ");
		num = leia.nextInt();
		System.out.println(Somar(num));
		leia.close();
	}

	static String Somar(int x) {
		if (x > 0) {
			return "O número é positivo";
		} else if (x == 0) {
			return "Número neutro";
		} else {
			return "O número é negativo";
		}
	}

}
