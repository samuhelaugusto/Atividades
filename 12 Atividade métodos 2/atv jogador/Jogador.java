package atvpoometodos2;

public class Jogador {
	public String nome;
	public double peso;		
	public int idade;
	public int qntcartoes;
	public int qntgols;
	public double salario;
	
	@Override
	public String toString() {
		
		return "O jogador " + nome
				+ " pesa " + peso
				+ " tem " + idade + " anos"
				+ " tem " + qntcartoes + " cart�es"
				+ " fez " + qntgols + " na temporada"
				+ " e tem um sal�rio de R$" + salario;
	}
}
