package poometedosti;

public class Trabalhador {
	public String nome;
	public int idade;
	public double salario;
	public double salarioatual;
	public double horastrabalhadas;
	public double resultado;
	
	public double aumentosalario() {
		if (salarioatual >= 1.500) {
			resultado = ((salarioatual * 0.05) + salarioatual);
			return (resultado);
		} else if (salarioatual <= 2.500 & salarioatual > 1.500) {
			resultado = ((salarioatual * 0.02) + salarioatual);
			return (resultado);
		} else
			return 0;
	}
	@Override
	public String toString() {
		
		return "" + nome + " rescebe um salário de: R$" + salario + " trabalha por " + horastrabalhadas + " horas " + "e teve um almento de: R$" + aumentosalario()
		+ " no seu salário";
	}
}
