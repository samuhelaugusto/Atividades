package atvlistas;

public class Pessoa {
	public String nome;
	public int idade;
	public double altura;
	
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: "+nome
				+"\nidade: "+idade
				+"\naltura: " +altura + "\n";
	}

}

