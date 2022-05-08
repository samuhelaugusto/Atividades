/*Faça um programa que:
- Leia o valor de um produto (valor liquido)
- Uma função Aplique uma porcentagem de imposto sobre o produto;
- Uma função que receba o valor do produto com o imposto e aplique uma margem de lucro de 40% e 
mostre para o usuário o produto com preço final 
(se conseguir fazer tudo em uma só função eu aceito também)*/
//No lugar de colocar os 40% fiz para que a pessoa possa colocar o valor de lucro que deseja retirar
package setima;

import java.util.Locale;
import java.util.Scanner;

public class ValorDeUmProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");		
		double valor = 0.0, imposto = 0.0, porcent = 0.0, lucro = 0.0, lucroconvert = 0.0;
		System.out.println("Informe o valor do produto: ");
		valor = leia.useLocale(ponto).nextDouble();		
		System.out.println("Informe quanto de imposto é cobrado: ");
		imposto = leia.useLocale(ponto).nextDouble();
		System.out.println("Informe quantos porcento de lucro voce deseja ganhar: ");
		lucro = leia.useLocale(ponto).nextDouble();
		lucroconvert = lucro / 100;
		porcent = imposto / 100;
		System.out.println(Somar(valor,  porcent, lucroconvert));
		leia.close();		
		}
	static String Somar(double a, double b, double c) {				
		double comimposto = a + (a * b);
		double lucro1 = comimposto + (comimposto * c);		
		return "O preço final do produto é: R$" + lucro1;		
	}	
}
