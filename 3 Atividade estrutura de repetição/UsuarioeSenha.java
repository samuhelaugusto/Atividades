//2.Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao nome do usu�rio, mostrando uma mensagem de erro e voltando a pedir as informa��es.
package terceira;

import java.util.Scanner;

public class UsuarioeSenha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			
		String login;
		String senha;
		System.out.println("Digite seu login: ");
		login = leia.nextLine();
		System.out.print("Senha: ");
		senha = leia.nextLine();
		while (login.equals(senha)) {
			System.out.println("Insira uma senha diferente do login");
			System.out.print("Senha: ");
			senha = leia.nextLine();
		}
		System.out.println("Senha aceita!");
		leia.close();
	}
}
/*
		String login;
		String senha;
		System.out.println("Digite seu login: ");
		login = leia.nextLine();
		System.out.print("Senha: ");
		senha = leia.nextLine();
		do {
			if (senha.equals(login)) {
				System.out.println("A senha nao pode ser igual ao login.");
				System.out.println("Digite novamente a senha: ");
				senha = leia.nextLine();
			}
		} while (login.equals(senha));
		System.out.println("Senha aceita!");
		leia.close();	
		*/