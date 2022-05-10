package atvnona3;

import java.util.Scanner;

public class AtvAnimal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Animal animal1, animal2, animal3;
		animal1 = new Animal();
		animal2 = new Animal();
		animal3 = new Animal();
		
		//primeiro animal
		System.out.print("Informe o nome do animal: ");
		animal1.nome = leia.nextLine();
		System.out.print("Informe a quantidade de patas: ");
		animal1.qntpatas = leia.nextInt();
		leia.nextLine(); //foi preciso add pois nao estava lendo a linha de baixo
		System.out.print("Informe a espécie do animal: ");		
		animal1.especie = leia.nextLine();
		//segundo animal
		System.out.print("Informe o nome do animal 2: ");
		animal2.nome = leia.nextLine();
		System.out.print("Informe a quantidade de patas: ");
		animal2.qntpatas = leia.nextInt();
		leia.nextLine(); //foi preciso add pois nao estava lendo a linha de baixo
		System.out.print("Informe a espécie do animal: ");
		animal2.especie = leia.nextLine();
		//terceiro animal
		System.out.print("Informe o nome do animal 3: ");
		animal3.nome = leia.nextLine();
		System.out.print("Informe a quantidade de patas: ");
		animal3.qntpatas = leia.nextInt();
		leia.nextLine(); //foi preciso add pois nao estava lendo a linha de baixo
		System.out.print("Informe a espécie do animal: ");
		animal3.especie = leia.nextLine();
		//1 animal
		System.out.println(animal1.nome + " tem " + animal1.qntpatas + " patas e sua espécie é " + animal1.especie);
		//2 animal
		System.out.println(animal2.nome + " tem " + animal2.qntpatas + " patas e sua espécie é " + animal2.especie);
		//3 animal
		System.out.println(animal3.nome + " tem " + animal3.qntpatas + " patas e sua espécie é " + animal3.especie);
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();
	}

}
