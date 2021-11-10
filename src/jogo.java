import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class jogo {

	static int timer = 60;

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

	// Fun��o para jogar
	static void jogar() throws InterruptedException {
		final JDialog dialog = new JDialog();
		dialog.setAlwaysOnTop(true);
		ImageIcon teste  = new ImageIcon("images/coelho.png");
		JOptionPane.showMessageDialog(dialog, " Siga o coelho branco","WARNING!", JOptionPane.WARNING_MESSAGE, teste);
		escreva("Jogando", TimeUnit.MILLISECONDS, timer);
	}

	// Fun��o para mostrar
	static void instrucao() throws InterruptedException {
		escreva("Instru��es", TimeUnit.MILLISECONDS, timer);

	}

	// Fun��o para mostrar cr�ditos
	static void creditos() throws InterruptedException {
		escreva("Cr�ditos", TimeUnit.MILLISECONDS, timer);
		escreva("O jogo foi feito pelos integrantes do Grupo 9 da Turma A, de TADS Senac, Os integrantes s�o: Felipe Ortiz, Julia Mangabeira, Melqui Vieira, Rafael Ramos e Roberto Jos�.",TimeUnit.MILLISECONDS, timer);
	}

	// Fun��o para mostrar sobre
	static void sobreMatrix() throws InterruptedException {
		escreva("Sobre", TimeUnit.MILLISECONDS, timer);
	}

	public static void main(String[] args) throws InterruptedException {
		// Menu

		boolean rodar = true;

		// Menu - Estrutura
		do {
			escreva("Bem vindo(a) a Inside The Matrix \n\nEscolha uma das op��es abaixo:\n" + "1 - Jogar\n"
					+ "2 - Instru��es/Regras\n" + "3 - O que � Matrix?\n" + "4 - Cr�ditos\n" + "5 - Sair\n",
					TimeUnit.MILLISECONDS, 60);

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
				escreva("Encerrando o jogo... at� mais!", TimeUnit.MILLISECONDS, timer);
				rodar = false;
				break;

			default:
				escreva("Valor inv�lido!!", TimeUnit.MILLISECONDS, timer);
				break;
			}

		} while (rodar);

	}

}