package primeira;

import java.util.Scanner;

public class InformeNum {

	public static void main(String[] args) {
		double numero;
		Scanner leia = new Scanner(System.in);
		System.out.print("Insira algum número: ");
		numero = leia.nextDouble();
		System.out.print("O número digitado foi: " + numero);
		leia.close();
	}
}
