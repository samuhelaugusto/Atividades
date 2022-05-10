//GOSTARIA DE TER FEITO COM VERTO, MAS N DEI CONTA DE CONCATENAR 
package atvnona2;

import java.util.Locale;
import java.util.Scanner;

public class AtvProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		final var ponto = new Locale("en", "us");
		Produto produto1, produto2;
		produto1 = new Produto();
		produto2 = new Produto();
		
		//primeiro produto
		
		System.out.println("Informe o nome do primeiro produto: ");
		produto1.nomedoproduto = leia.nextLine();
		System.out.println("Informe o preço de custo do primeiro produto: ");
		produto1.precodecusto = leia.useLocale(ponto).nextDouble();	
		System.out.println("Informe o preço de venda do primeiro produto: ");
		produto1.precodevenda = leia.useLocale(ponto).nextDouble();	
		
		//Segundo produto
				
		System.out.println("Informe o nome do segundo produto: ");
		produto2.nomedoproduto = leia.nextLine();				
		System.out.println("Informe o preço de custo do segundo produto: ");
		produto2.precodecusto = leia.useLocale(ponto).nextDouble();					
		System.out.println("Informe o preço de venda do segundo produto: ");
		produto2.precodevenda = leia.useLocale(ponto).nextDouble();	
		
		//Primerio produto
		System.out.println("O produto: " + produto1.nomedoproduto + " tem o preço de custo de: R$" + produto1.precodecusto + " e o preço de venda de: R$" + produto1.precodevenda);
		//segundo produto
		System.out.println("O produto: " + produto2.nomedoproduto + " tem o preço de custo de: R$" + produto2.precodecusto + " e o preço de venda de: R$" + produto2.precodevenda);
		
		leia.close();
	}
}
