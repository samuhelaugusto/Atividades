/*1. Crie uma fun��o para retornar o calculo da area de um triangulo formula de heron:
p = a + b + c /2;
area = raiz  (p* (p - a) * (p-b) * (p-c))*/
package oitava;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");		
		double primeriolado = 0.0, segundolado = 0.0, terceirolado = 0.0;
		System.out.println("Informe o primeiro lado do tri�ngulo: ");
		primeriolado = leia.useLocale(ponto).nextDouble();		
		System.out.println("Informe o segundo lado do tri�ngulo: ");
		segundolado = leia.useLocale(ponto).nextDouble();
		System.out.println("Informe o terceiro lado do tri�ngulo: ");
		terceirolado = leia.useLocale(ponto).nextDouble();		
		System.out.printf(Somar(primeriolado,  segundolado, terceirolado));
		leia.close();		
		}
	static String Somar(double a, double b, double c) {				
		double hp = (a + b + c) / 2;
		double ha = Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));				
		return String.format("Aproximadamente a �rea do triangulo �: %.2fcm", ha);
	}	
}