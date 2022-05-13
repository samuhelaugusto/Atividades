package atvpoometodos;

import java.util.Locale;
import java.util.Scanner;

public class AtvCalculo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		Calculo calcular = new Calculo();
		
		System.out.println("Digite o primeiro numero: ");
		calcular.num1 = leia.useLocale(ponto).nextDouble();
		System.out.println("Digite o segundo numero: ");
		calcular.num2 = leia.useLocale(ponto).nextDouble();
		System.out.println("Digite um operador: ");
		calcular.operador1 = leia.next().charAt(0);		
		System.out.println(calcular);		
		leia.close();
	}

}
