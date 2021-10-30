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
				System.out.println("Faça os desafios, e a cada erro os desafios chagá um agente e se chegar a 5 é game over.");
				break;

			case 2:
				System.out.println("Aguardando o jogo iniciar...");
				break;

			case 3:
				System.out.println("Este jogo foi feito por: Felipe ortiz, Julia mangabeira, melqui vieira, Rafael Ramos, Roberto José."
						+ "\n agradecimentos ao takeo por nos proporcionar essa experiência incrivel em fazer um jogo rpg textual." );
				break;

			case 4:
				System.out.println("Encerrando o jogo... até mais!");
				rodar = false;
				break;

			default:
				System.out.println("Valor inválido.");
				break;
			}

		} while (rodar);
		
		System.out.println("teste rafa");

		entrada.close();
	}

}