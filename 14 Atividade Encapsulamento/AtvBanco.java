package atvencapsulamento;

import java.util.Scanner;


public class AtvBanco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Conta conta = new Conta();
		double valor;
		System.out.println("Entre com o nome do titular da conta: ");
		String nome = leia.nextLine();
		conta.SetNome(nome);
		System.out.println("Informe o número da conta: ");
		int nrmConta = leia.nextInt();
		conta.setNroConta(nrmConta);
		System.out.println("Digite (s) para depositar: ");
		char opcao = leia.next().charAt(0);
		char opcaoLowerCase = Character.toLowerCase(opcao);
		while (opcaoLowerCase == 's') {
			System.out.println("Voce deseja depositar quanto: ");
			valor = leia.nextDouble();
			conta.Depositar(valor);
			System.out.println("Se Deseja continuar a depositar digite (s): ");
			opcao = leia.next().charAt(0);
			opcaoLowerCase = Character.toLowerCase(opcao);
		}
		System.out.println("Digite (s) para sacar: ");
		opcao = leia.next().charAt(0);
		opcaoLowerCase = Character.toLowerCase(opcao);
		while (opcaoLowerCase == 's') {
			System.out.println("Voce deseja sacar quanto: ");
			valor = leia.nextDouble();
			conta.Sacar(valor);
			System.out.println("Se Deseja continuar a sacar digite (s): ");
			opcao = leia.next().charAt(0);
			opcaoLowerCase = Character.toLowerCase(opcao);
		}				
		//conta.SetNome("samuhel");
		//System.out.println(conta.GetNome());
		System.out.println("Nome do titular " + conta.GetNome()
		+"\nNúmero da conta: " + conta.getNroConta()
		+ "\nSaldo: " + conta.getSaldo());						
		leia.close();
	}
}


