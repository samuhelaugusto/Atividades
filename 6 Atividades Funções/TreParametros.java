//1. Fa�a um programa, com uma fun��o que necessite de tr�s argumentos(par�metros), e que forne�a a soma desses tr�s argumentos(par�metros).
package sexta;

//import java.util.Locale;
import java.util.Scanner;

public class TreParametros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//final var ponto = new Locale("en", "us");
		int n1 = 0, n2 = 0, n3 = 0;
		System.out.println("INSIRA O NUMERO QUE DESEJA SOMAR: ");
		n1 = leia.nextInt();
		System.out.println("INSIRA O NUMERO QUE DESEJA SOMAR: ");
		n2 = leia.nextInt();
		System.out.println("INSIRA O NUMERO QUE DESEJA SOMAR: ");
		n3 = leia.nextInt();
		System.out.println("A soma foi " + Somar(n1, n2, n3));
		Somar(n1, n2, n3);
		leia.close();
	}
	static int Somar(int a, int b, int c) {
		return a + b + c;
	}
}
