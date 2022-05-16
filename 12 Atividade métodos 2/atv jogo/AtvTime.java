package atvpoometodos2ti;

import java.util.Scanner;

public class AtvTime {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Jogo placar = new Jogo();
		System.out.println("Informe o nome do time da casa: ");
		placar.timedacasa = leia.nextLine();
		System.out.println("Informe o nome do time visitante: ");
		placar.timevisitante = leia.nextLine();
		System.out.println("Informe o placar do primeiro tempo do time da casa: ");
		placar.golsdotimecasapri = leia.nextInt();
		System.out.println("Informe o placar do primeiro tempo do visitante: ");
		placar.golsdotimevisipri = leia.nextInt();
		System.out.println("placar o placar do segundo tempo do time da casa: ");
		placar.golsdotimecasasegundo = leia.nextInt();	
		System.out.println("placar o placar do segundo tempo do visitante: ");
		placar.golsdotimevisisegundo = leia.nextInt();	
		System.out.println(placar);
		leia.close();
	}

}
