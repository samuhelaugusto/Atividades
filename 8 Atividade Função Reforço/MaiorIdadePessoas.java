//3. Criar uma fun��o que retorne o valor da maior idade entre 3 pessoas;
package oitava;

import java.util.Scanner;

public class MaiorIdadePessoas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int id1 = 0, id2 = 0, id3 = 0;		
		System.out.println("Informe a idade 1: ");
		id1 = leia.nextInt();
		System.out.println("Informe a idade 2: ");
		id2 = leia.nextInt();
		System.out.println("Informe a idade 3: ");
		id3 = leia.nextInt();		
		System.out.println(IdadeMaior(id1, id2, id3));			
		leia.close();
	}	
	static String IdadeMaior(int a, int b, int c) {
		if (a == b & a == c) {
			return "Todos tem a mesma idade";
		} else if (a >= b & a >= c){
			return "A primeria idade � a maior";
		}else if (b >= a & b >= c){
			return "A segunda idade � a maior";
		} else {
			return "A terceira idade � a maior";
		}
	}
}
