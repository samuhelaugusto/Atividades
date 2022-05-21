package atvassicronaarray;

import java.util.Scanner;

public class BarracaDoSeuChico {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String[] lanches = new String[3];
		String[] bebidas = new String[3];
		String[] porcoes = new String[3];
		String[] pratosexe = new String[3];
		int opcao;
		char continuar = 0;
		char continuarLowerCase = Character.toLowerCase(continuar);
		
		do {
			System.out.println("Qual lanche voce deseja inserir: 1 lanches / 2 porcoes / 3 bebidas / 4 pratos executivos: "); 
			opcao = leia.nextInt();
			leia.nextLine();
			switch (opcao) {
			case 1:
				for(int i = 0; i < lanches.length; i++) {
				System.out.println("Informe o lanche que deseja inserir: ");
				lanches[i] = leia.nextLine();
				System.out.println();
				}
				break;
			case 2:
				for(int i = 0; i < porcoes.length; i++) {
				System.out.println("Informe a porção que deseja inserir: ");
				porcoes[i] = leia.nextLine();
				System.out.println();
				}
				break;
			case 3:
				for(int i = 0; i < bebidas.length; i++) {
				System.out.println("Informe a bebida que deseja inserir: ");
				bebidas[i] = leia.nextLine();
				System.out.println();
				}
				break;
			case 4:
				for(int i = 0; i < pratosexe.length; i++) {
				System.out.println("Informe o prato executivo que deseja inserir: ");
				pratosexe[i] = leia.nextLine();
				}
				System.out.println();
				break;
			default:
				System.out.println("Opção inserida foi invalida!!");
				break;
			}
			System.out.println("Deseja cadastrar outro item? (s/n)");
			continuar = leia.next().charAt(0);
			continuarLowerCase = Character.toLowerCase(continuar);
		}while(continuarLowerCase == 's');
		System.out.println("Os itens cadastrados foram: ");
		System.out.println("Pratos: ----------------------------");
		for (String prato : pratosexe) {
			System.out.println("Prato: " + prato);
		}
		System.out.println("Porções: ----------------------------");
		for (String porcao : porcoes) {
			System.out.println("Porção: " + porcao);
		}	
		System.out.println("Bebidas: ----------------------------");
		for (String bebida : bebidas) {
			System.out.println("Bebida: " + bebida);
		}
		System.out.println("Lanches: ----------------------------");
		for (String lanche : lanches) {
			System.out.println("Lanche: " + lanche);
		}
		leia.close();

}

}
