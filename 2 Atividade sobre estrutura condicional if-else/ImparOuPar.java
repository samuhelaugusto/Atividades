//2)Fa�a um programa que entre com um n�mero e indique se ele � impar ou par;
package segunda;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		int num1;
		Scanner num = new Scanner(System.in);
		System.out.println("Informe o n�mero que deseja saber se � impar ou par: ");
		num1 = num.nextInt();
		if (num1 % 2 == 0) {
			System.out.printf("O n�mero %s � par", num1);
		} else {
			System.out.printf("O n�mero %s � impar", num1);
		}
		num.close();

	}

}
