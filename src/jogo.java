import java.util.Scanner;

public class jogo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeroMenu;

		boolean rodar = true;

		System.out.println(
				"Escolha uma das op��es abaixo:\n\n" + "1- Instru��es\n" + 
														"2- Jogar\n" + 
														"3- Cr�ditos\n" + 
														"4- Sair");

		do {

			numeroMenu = entrada.nextInt();

			switch (numeroMenu) {

			case 1:
				System.out.println("Aguardando instru��es...");
				break;

			case 2:
				System.out.println("Aguardando o jogo iniciar...");
				break;

			case 3:
				System.out.println("Aguardando cr�ditos...");
				break;

			case 4:
				System.out.println("Encerrando o menu... at� mais!");
				rodar = false;
				break;

			default:
				System.out.println("Valor inv�lido.");
				break;
			}

		} while (rodar);

		entrada.close();
	}

}