/*3.  Faça um programa que leia e valide as seguintes informações: A.Nome: maior que 3 caracteres; B.Idade: entre 0 e 150; C.Salário: maior que zero; D.Sexo:'f' ou 'm';
E.Estado Civil: 's', 'c', 'v', ‘d’; */
package terceira;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaodeInformacoes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");		
		String nome;
		Double idade = 0.0, salario = 0.0;
		char sexo, estado;
				
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();		
		while (nome.length() <= 3) {
			System.out.println("Seu nome deve conter mais de 3 caracteres!");
			System.out.println("Digite novamente seu nome: ");
			nome = leia.nextLine();	
			}
		System.out.println("Digite sua idade: ");
		idade = leia.useLocale(ponto).nextDouble();
		
		while ((idade == 0) || (idade < 0) || (idade > 150)) {
			System.out.println("Idade incorreta");
			System.out.println("Digite novamente sua idade: ");
			idade = leia.nextDouble();
		}
		
		System.out.println("Digite seu salario: ");
		salario = leia.useLocale(ponto).nextDouble();
		while (salario <= 0) {
 			System.out.println("Seu salario nao pode ser 0, informe novamente seu salario");
			System.out.println("Digite seu salario: ");
			salario = leia.useLocale(ponto).nextDouble();
		}
		System.out.println("Digite seu sexo: ");
		sexo = leia.next().charAt(0);
		char sexoLowerCase = Character.toLowerCase(sexo);
		while (sexoLowerCase != 'f' && sexoLowerCase != 'F' && sexoLowerCase != 'M' && sexoLowerCase != 'm') {
			System.out.println("O sexo inserido está incorreto");
			System.out.println("Insira novamente o sexo: ");
			sexo = leia.next().charAt(0);
			sexoLowerCase = Character.toLowerCase(sexo);
		}
		
		System.out.println("Digite seu estado civil: ");
		estado = leia.next().charAt(0);
		char estadoLowerCase = Character.toLowerCase(estado);
		while (estadoLowerCase != 's' && estadoLowerCase != 'c' && estadoLowerCase != 'v' && estadoLowerCase != 'd') {
			System.out.println("O estado civil inserido está incorreto");
			System.out.println("Insira novamente o estado civil: ");
			estado = leia.next().charAt(0);
			estadoLowerCase =  Character.toLowerCase(estado);
		
		}
		leia.close();
	}
}
