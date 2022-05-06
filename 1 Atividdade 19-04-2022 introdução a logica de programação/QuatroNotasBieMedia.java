package primeira;

import java.util.Scanner;

public class QuatroNotasBieMedia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		System.out.print("Entre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.print("Entre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.print("Entre com a terceira nota: ");
		nota3 = leia.nextDouble();
		System.out.print("Entre com a quarta nota: ");
		nota4 = leia.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("Sua média foi: " + media);
		leia.close();
	}
}
