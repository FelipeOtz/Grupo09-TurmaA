import java.util.Scanner;

public class Testes {

	// Teste de agentes por Felipe
	static void testeAgentes(int quant) throws InterruptedException {
		int cont = 0;
		for (int i = 1; i <= quant; i++) {

			if (jogo.verAgente(i) && i >= 4) {
				System.out.println("Essa n�o, Temos um Erro!\n");
				break;
				
			} else {
				System.out.println("Tudo normal, por enquanto!\n");
			}
			cont++;
			System.out.println("Testes concluidos at� agora: " + cont + "\n");

		}

	}

	public static void main(String[] args) throws InterruptedException {
		//Menu de testes
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual teste deseja fazer?\n" + "1 - Agentes");
		int escolha = entrada.nextInt();
		
		
		
		switch (escolha) {
		case 1:
			System.out.println("\nQuantos testes deseja fazer?");
			System.out.println("(Obs: Acima de 3 dever� ser feito manualmente)");
			int quant = entrada.nextInt();
			testeAgentes(quant);
			break;
		default:
			
			System.out.println("Valor inv�lido!");
			break;
		}
		

	}
}