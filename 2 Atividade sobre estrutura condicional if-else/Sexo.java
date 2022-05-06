//6)Faça um programa que receba o sexo de uma pessoa e imprima na tela o sexo digitado, o programa não pode distinguir de maiúsculas e minúsculas;
package segunda;

import java.util.Scanner;

public class Sexo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String sexo;
		
		System.out.println("Informe seu sexo: ");
		sexo = leia.nextLine();
		switch (sexo) {
		case "M":
			System.out.println("Seu sexo é masculino");
			break;
		case "m":
			System.out.println("Seu sexo é masculino");
			break;
		case "F":
			System.out.println("Seu sexo é feminino");
			break;
		case "f":
			System.out.println("Seu sexo é feminino");
			break;
		default:
			System.out.println("Sexo digitado incorreto, informe o sexo com apenas M ou F");
		}
		/*
		char sexo1;
		System.out.println("Entre com o sexo: ");
		sexo1 = leia.next().charAt(0);
		if(sexo1 == 'f' || sexo1 == 'F') {
			System.out.println("O sexo digitado foi o feminino");
		}else if(sexo1 == 'm' || sexo1 == 'M'){
			System.out.println("O sexo digitado foi o Masculino");
		}else {
			System.out.println("O dado inserido esta incorreto!");
		}
		*/
		leia.close();
		
	}

}
