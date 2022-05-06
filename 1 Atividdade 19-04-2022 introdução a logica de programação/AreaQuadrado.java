package primeira;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base;
		double altura;
		double area;
		System.out.print("Informe a base do quadrado: ");
		base = leia.nextDouble();
		System.out.print("Informe a altura do quadrado: ");
		altura = leia.nextDouble();
		area = base * altura;
		System.out.print("O dobro da área do quadrado é: " + area * 2);
		leia.close();

	}

}
