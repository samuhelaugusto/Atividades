//2)Faça um programa que entre com um número e indique se ele é impar ou par;
package segunda;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		int num1;
		Scanner num = new Scanner(System.in);
		System.out.println("Informe o número que deseja saber se é impar ou par: ");
		num1 = num.nextInt();
		if (num1 % 2 == 0) {
			System.out.printf("O número %s é par", num1);
		} else {
			System.out.printf("O número %s é impar", num1);
		}
		num.close();

	}

}
