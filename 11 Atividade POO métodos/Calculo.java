package atvpoometodos;

public class Calculo {
	public double num1;
	public double num2;
	public char operador1;

	public double calculo1() {
		if (operador1 == '+') {
			double calculo = num1 + num2;
			return calculo;
		} else if (operador1 == '-') {
			return num1 - num2;
		} else if (operador1 == '*') {
			return num1 * num2;
		} else if (operador1 == '/') {
			if (num2 == 0) {
				System.out.println("Não é possivel dividir, foi inserido 0");
				return 0;
			} else {
				return num1 / num2;
			}
		} else {
			System.out.println("O operador inserido está errado!");
			return 0;
		}
	}

	@Override
	public String toString() {
		return "O resultado é: " + calculo1();
	}
}
