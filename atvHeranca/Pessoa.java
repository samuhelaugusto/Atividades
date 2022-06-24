package atvHeranca;

public class Pessoa {

	public String nome;
	public long cpf;
	public int idade;
	public String dataDeNascimento;
	public char sexo;
	public String cidadeDeNascimento;

	public Pessoa() {

	}

	public Pessoa(String nome, long cpf, int idade, String dataDeNascimento, char sexo, String cidadeDeNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.cidadeDeNascimento = cidadeDeNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCidadeDeNascimento() {
		return cidadeDeNascimento;
	}

	public void setCidadeDeNascimento(String cidadeDeNascimento) {
		this.cidadeDeNascimento = cidadeDeNascimento;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "\ncpf: " + cpf + "\nidade " + idade + "\ndata nascimento: " + dataDeNascimento
				+ "\ncidade nascimento: " + cidadeDeNascimento + "\nsexo: " + sexo;
	}
	
	
}
