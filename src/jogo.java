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
				System.out.println("Fa�a os desafios, e a cada erro os desafios chag� um agente e se chegar a 5 � game over.");
				break;

			case 2:
				System.out.println("Aguardando o jogo iniciar...");
				break;

			case 3:
				System.out.println("Este jogo foi feito por: Felipe ortiz, Julia mangabeira, melqui vieira, Rafael Ramos, Roberto Jos�."
						+ "\n agradecimentos ao takeo por nos proporcionar essa experi�ncia incrivel em fazer um jogo rpg textual." );
				break;

			case 4:
				System.out.println("Encerrando o jogo... at� mais!");
				rodar = false;
				break;

			default:
				System.out.println("Valor inv�lido.");
				break;
			}

		} while (rodar);
		
		System.out.println("teste rafa");

		entrada.close();
	}

}