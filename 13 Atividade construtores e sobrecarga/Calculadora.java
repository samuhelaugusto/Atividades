package atvconstrutores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Entre com o primeiro número: ");
		double n1 = leia.nextDouble();
		System.out.print("Entre com o segundo número: ");
		double n2 = leia.nextDouble();
		System.out.print("Entre com o terceiro número: ");
		double n3 = leia.nextDouble();
		System.out.print("Entre com o quarto número: ");
		double n4 = leia.nextDouble();
		System.out.print("Entre com o operador: ");
		char operador = leia.next().charAt(0);
		Calculo num = new Calculo(n1, n2, n3, n4, operador);
			
		System.out.println("O resultado dos dois primeiros números é: " + num.Calcular(n1, n2, operador));
		System.out.println("O resultado dos quatro números é: " + num.Calcular(n1, n2, n3, n4, operador));
		
		leia.close();
	}

}
