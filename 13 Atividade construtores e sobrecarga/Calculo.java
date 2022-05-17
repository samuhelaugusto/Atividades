package atvconstrutores;

public class Calculo {
	// nao precisava criar
	public double n1;
	public double n2;
	public double n3;
	public double n4;
	public char operador;

	public Calculo(double n1, double n2, double n3, double n4, char operador) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.operador = operador;
	}

	public double Calcular(double n1, double n2, char operador) {
		if (operador == '+') {			
			return n1 + n2;
		} else if (operador == '-') {
			return n1 - n2;
		} else if (operador == '*') {
			return n1 * n2;
		} else if (operador == '/') {
			if (n2 == 0) {
				System.out.println("Não é possivel dividir, foi inserido 0");
				return 0;
			} else {
				return n1 / n2;
			}
		} else {
			System.out.println("O operador inserido está errado!");
			return 0;
		}
		
	}

	public double Calcular(double n1, double n2, double n3, double n4, char operador) {
		if (operador == '+') {			
			return n1 + n2 + n3 + n4;
		} else if (operador == '-') {
			return n1 - n2 - n3 - n4;
		} else if (operador == '*') {
			return n1 * n2 * n3 * n4;
		} else if (operador == '/') {
			if (n2 == 0 & n4 == 0) {
				System.out.println("Não é possivel dividir, foi inserido 0");
				return 0;
			} else {
				return (n1 / n2) / (n3 / n4);
			}
		} else {
			System.out.println("O operador inserido está errado!");
			return 0;
		}		
	}

	

}
