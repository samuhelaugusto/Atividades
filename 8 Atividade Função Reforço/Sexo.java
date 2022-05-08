//2. crie uma função que retorne o sexo de uma pessoa ('M', 'F') ou que retorne um erro caso não for uma das opções;
package oitava;

import java.util.Scanner;

public class Sexo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char sexo;		
		System.out.println("Informe seu sexo: ");
		sexo = leia.next().charAt(0);
		char sexoLowerCase = Character.toLowerCase(sexo);
		System.out.println(Sexo1(sexoLowerCase));			
		leia.close();
	}	
	static String Sexo1(char x) {
		if (x == 'm') {
			return String.format("Seu sexo é Masculino");

		} else if (x == 'f'){
			return String.format("Seu sexo é Feminino");
		} else {
			return String.format("Insira um sexo válido");
		}
	}
}
