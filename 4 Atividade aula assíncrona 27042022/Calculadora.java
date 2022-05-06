//ATIVIDADE PARA FAZER UMA CALCULADOR OR TABUADA 
package quarta;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		Double n1 = 0.0, n2 = 0.0, calculo = 0.0;
		char operador, continuar;
		// PODERIA EXCLUIR A VARIAVEL DE CALCULO E FAZER TUDO NO PRINT *CODIGO MAIS LIMPO		
		System.out.println("Bem vindo, deseja entrar na calculadora?");
		continuar = leia.next().charAt(0);
		char continuarLowerCase = Character.toLowerCase(continuar);
		while (continuarLowerCase != 'n') {
			System.out.println("Digite o primeiro numero: ");
			n1 = leia.useLocale(ponto).nextDouble();
			System.out.println("Digite o segundo numero: ");
			n2 = leia.useLocale(ponto).nextDouble();
			System.out.println("Digite um operador: ");
			operador = leia.next().charAt(0);
			if (operador == '+') {
				calculo = n1 + n2;
				System.out.println("O resultado é:" + calculo);
			} else if (operador == '-') {
				calculo = n1 - n2;
				System.out.println("O resultado é:" + calculo);
			} else if (operador == '*') {
				calculo = n1 * n2;
				System.out.println("O resultado é:" + calculo);
			} else if (operador == '/') {
				calculo = n1 / n2;
				System.out.println("O resultado é:" + calculo);
			} else {
				System.out.println("O operador inserido está errado!");
			}
			System.out.println("Deseja continuar?");
			continuar = leia.next().charAt(0);
			continuarLowerCase = Character.toLowerCase(continuar);
		}
		leia.close();
	}

}
