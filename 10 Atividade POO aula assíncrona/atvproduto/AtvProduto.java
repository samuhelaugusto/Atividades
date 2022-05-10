package atvpooassincrona;

import java.util.Locale;
import java.util.Scanner;

public class AtvProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		final var ponto = new Locale("en", "us");
		Produto1 produto1;
		produto1 = new Produto1();		
		System.out.println("Informe o nome do produto: ");
		produto1.nomedoproduto = leia.nextLine();
		System.out.println("Informe o preço de venda do produto: ");
		produto1.precodevenda = leia.useLocale(ponto).nextDouble();	
		System.out.println("Informe a quantidade em estoque: ");
		produto1.qntestoque = leia.nextInt();									
		System.out.println("O produto: " + produto1.nomedoproduto + " tem o preço de venda de: R$" + produto1.precodevenda + " e possui " + produto1.qntestoque + " no estoque");				
		leia.close();

	}

}
