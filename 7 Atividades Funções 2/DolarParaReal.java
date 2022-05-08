/*Faça um programa que:
- Leia a cotação do dólar
- Leia um valor em dólares
- Função que Converta esse valor para Real
- Mostre o resultado*/
package setima;

import java.util.Locale;
import java.util.Scanner;

public class DolarParaReal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");		
		double cotadolar = 0.0, dolares = 0.0;
		System.out.println("Informe a cotação do dolar no momento: ");
		cotadolar = leia.useLocale(ponto).nextDouble();		
		System.out.println("Informe quanto de Dolares deseja converter para o Real: ");
		dolares = leia.useLocale(ponto).nextDouble();		
		System.out.println(Somar(dolares,  cotadolar));
		leia.close();		
		}
	static String Somar(double a, double b) {				
		double conversao = a * b;		
		return "O valor convertido em Real é: R$" + conversao;		
	}
}