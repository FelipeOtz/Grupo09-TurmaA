import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class jogo {

	static int temp_dialog = 60;

	static int leia() {
		Scanner entrada = new Scanner(System.in);
		int escolha = entrada.nextInt();
		return escolha;
	}

	static void escreva(String texto, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : texto.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}

	static void jogar() throws InterruptedException {

		escreva("Jogando", TimeUnit.MILLISECONDS, temp_dialog);
	}

	static void instrucao() throws InterruptedException {
		escreva("Instruções", TimeUnit.MILLISECONDS, temp_dialog);

	}

	static void creditos() throws InterruptedException {
		escreva("Créditos", TimeUnit.MILLISECONDS, temp_dialog);
	}

	static void sobreMatrix() throws InterruptedException {
		escreva("Sobre", TimeUnit.MILLISECONDS, temp_dialog);
	}

	public static void main(String[] args) throws InterruptedException {
		// Menu

		boolean rodar = true;

		// Menu - Estrutura
		do {
			escreva("Bem vindo(a) a Inside The Matrix \n\nEscolha uma das opções abaixo:\n" + "1 - Jogar\n"
					+ "2 - Instruções/Regras\n" + "3 - O que é Matrix?\n" + "4 - Créditos\n" + "5 - Sair",
					TimeUnit.MILLISECONDS, 0);

			switch (leia()) {

			case 1:
				jogar();
				break;

			case 2:
				instrucao();
				break;

			case 3:
				sobreMatrix();
				break;

			case 4:
				creditos();
				break;
			case 5:
				escreva("Encerrando o jogo... até mais!", TimeUnit.MILLISECONDS, temp_dialog);
				rodar = false;
				break;

			default:
				escreva("Valor inválido!!", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}

		} while (rodar);

	}

}