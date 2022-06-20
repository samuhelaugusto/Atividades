package atvlistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecebeDadosUsuarioNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Integer> numero = new ArrayList<>();
		char continuar = 0;
		char continuarLowerCase = Character.toLowerCase(continuar);
		
		do {
			System.out.println("Informe a quantidade de numeros que deseja adicionar: ");
			int quant = leia.nextInt();
			
			for (int i = 0; i < quant; i++) {
				System.out.println("Informe o número que deseja adicionar na Lista: "); 
				numero.add(leia.nextInt());			
			}			
			
			System.out.println("Deseja cadastrar outro número? (s/n)");
			continuar = leia.next().charAt(0);
			continuarLowerCase = Character.toLowerCase(continuar);
		} while (continuarLowerCase == 's');
			
		for (Integer num : numero) {
			System.out.println(num);
		}
			
		leia.close();

	}

}
