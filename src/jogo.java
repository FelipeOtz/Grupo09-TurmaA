import java.util.Scanner;

public class jogo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeroMenu;

		boolean rodar = true;

		System.out.println(
				"Escolha uma das opções abaixo:\n\n" + "1- Instruções\n" + 
														"2- Jogar\n" + 
														"3- Créditos\n" + 
														"4- Sair");

		do {

			numeroMenu = entrada.nextInt();

			switch (numeroMenu) {

			case 1:
				System.out.println("Aguardando instruções...");
				break;

			case 2:
				System.out.println("Aguardando o jogo iniciar...");
				break;

			case 3:
				System.out.println("Aguardando créditos...");
				break;

			case 4:
				System.out.println("Encerrando o menu... até mais!");
				rodar = false;
				break;

			default:
				System.out.println("Valor inválido.");
				break;
			}

		} while (rodar);

		entrada.close();
	}

}