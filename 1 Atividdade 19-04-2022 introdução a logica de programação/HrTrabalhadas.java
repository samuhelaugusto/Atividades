package primeira;

import java.util.Scanner;

public class HrTrabalhadas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double horas;
		double horasmes;
		double salario;
		System.out.print("Informa o quanto voc� ganha por hora: ");
		horas = leia.nextDouble();
		System.out.print("Informe n�mero de horas trabalhadas no m�s: ");
		horasmes = leia.nextDouble();
		salario = horas * horasmes;
		System.out.print("O seu salario por n�mero de horas trabalhadas no m�s � R$" + salario);
		leia.close();

	}

}
