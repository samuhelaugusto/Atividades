package poometedosti;

import java.util.Scanner;

public class AtvTrabalhador {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Trabalhador salario1 = new Trabalhador();
		System.out.println("Informe o nome do trabalhador: ");
		salario1.nome = leia.nextLine();
		System.out.println("Informe a idade do trabalhador: ");
		salario1.idade = leia.nextInt();
		System.out.println("Informe o salário do trabalhador: ");
		salario1.salario = leia.nextDouble();
		System.out.println("Informe o salário atual do trabalhador: ");
		salario1.salarioatual = leia.nextDouble();
		System.out.println("Informe as horas trabalhadas do trabalhador: ");
		salario1.horastrabalhadas = leia.nextDouble();		
		System.out.println(salario1);
		leia.close();
	}

}
