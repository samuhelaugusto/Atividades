package atvconstrutores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Entre com o primeiro n�mero: ");
		double n1 = leia.nextDouble();
		System.out.print("Entre com o segundo n�mero: ");
		double n2 = leia.nextDouble();
		System.out.print("Entre com o terceiro n�mero: ");
		double n3 = leia.nextDouble();
		System.out.print("Entre com o quarto n�mero: ");
		double n4 = leia.nextDouble();
		System.out.print("Entre com o operador: ");
		char operador = leia.next().charAt(0);
		Calculo num = new Calculo(n1, n2, n3, n4, operador);
			
		System.out.println("O resultado dos dois primeiros n�meros �: " + num.Calcular(n1, n2, operador));
		System.out.println("O resultado dos quatro n�meros �: " + num.Calcular(n1, n2, n3, n4, operador));
		
		leia.close();
	}

}
