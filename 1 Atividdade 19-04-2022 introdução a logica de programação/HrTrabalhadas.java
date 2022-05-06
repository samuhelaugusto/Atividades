package primeira;

import java.util.Scanner;

public class HrTrabalhadas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double horas;
		double horasmes;
		double salario;
		System.out.print("Informa o quanto você ganha por hora: ");
		horas = leia.nextDouble();
		System.out.print("Informe número de horas trabalhadas no mês: ");
		horasmes = leia.nextDouble();
		salario = horas * horasmes;
		System.out.print("O seu salario por número de horas trabalhadas no mês é R$" + salario);
		leia.close();

	}

}
