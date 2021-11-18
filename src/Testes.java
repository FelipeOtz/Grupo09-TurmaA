import java.util.Scanner;

public class Testes {

	// Verifica Senha
	static void testeSenha(int quant) throws InterruptedException {

		for (int i = 1; i <= quant; i++) {

			if (jogo.senhaAleatoria().length() != 4) {
				System.out.println("Ocorreu um erro");
			} else {
				System.out.println("\nSenha de 4 Dígitos conforme esperado\n");
			}

		}
		System.out.println("Teste concluído");

	}

	// Teste de agentes
	static void testeAgentes(int quant) throws InterruptedException {
		int cont = 0;
		for (int i = 1; i <= quant; i++) {

			if (jogo.verAgente(i) && i >= 4) {
				System.out.println("Essa não, Temos um Erro!\n");
				break;

			} else {
				System.out.println("Tudo normal, por enquanto!\n");
			}
			cont++;
			System.out.println("Testes concluidos até agora: " + cont + "\n");

		}

	}

	public static void main(String[] args) throws InterruptedException {
		// Menu de testes
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual teste deseja fazer?\n" + "1 - Agentes" + "\n2 - Senha");
		int escolha = entrada.nextInt();
		int quant;

		switch (escolha) {
		case 1:
			System.out.println("\nQuantos testes deseja fazer?");
			System.out.println("(Obs: Acima de 3 deverá ser feito manualmente)");
			quant = entrada.nextInt();
			testeAgentes(quant);
			break;

		case 2:
			System.out.println("Teste de Senha: ");
			System.out.println("\nQuantos testes deseja fazer?");
			quant = entrada.nextInt();
			testeSenha(quant);
			break;

		default:

			System.out.println("Valor inválido!");
			break;
		}

	}
}