package primeira;

import java.util.Scanner;

public class DoisNumPrint {

	public static void main(String[] args) {
		double numero1;
		double numero2;
		/* double soma; */
		Scanner leia = new Scanner(System.in);
		System.out.println("informe o primerio numero que deseja somar: ");
		numero1 = leia.nextDouble();
		System.out.print("informe o segundo numero que deseja somar: ");
		numero2 = leia.nextDouble();
		/*
		 * OU PODE SER SOMADO DE OUTRA FORMA CRIANDO UNMA VARIAVEL SOMENTE PARA SOMA
		 * soma = numero1 + numero2; System.out.println("A soma desses números é: " +
		 * soma);
		 */
		System.out.println("A soma desses números é: " + (numero1 + numero2));
		leia.close();
	}
}
