package primeira;

import java.util.Scanner;

public class InformeNum {

	public static void main(String[] args) {
		double numero;
		Scanner leia = new Scanner(System.in);
		System.out.print("Insira algum n�mero: ");
		numero = leia.nextDouble();
		System.out.print("O n�mero digitado foi: " + numero);
		leia.close();
	}
}
