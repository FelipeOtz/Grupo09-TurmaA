import java.util.Scanner;


public class TestesJogo {
	public static void main(String[] args) {/*
		Scanner leitor = new Scanner(System.in);
		System.out.println("uoifhoufyhiaustyiuoastyfitguasiuhgads8tasy8tda");
		int x;
		int contador = 0;
		int num = 0;
		
		int cc = 0;
//
//		int[] numberLuta = new int[6];
//
//		for (int i = 0; i <= 5; i++) {
//			do {
//				numberLuta[i] = (int) (Math.random() * 3);
//			} while (numberLuta[i] == 0);
//		}
//
//		System.out.println("Teste Arrays: ");
//		for (int number : numberLuta) {
//			System.out.println(number);
//		}
//
//		System.out.println("Diálogo entre morpheu e Neo\n....................");
//
//		System.out.println("\n01 - Treino de Luta");
//		System.out.println("Regas: PIPIPI POPOPO BLA BLA BLA\n");
//
//		System.out.println("Morfeu Começa, você deve se defender");
		// ADIVINHAR QUE LADO O MORPHEU DEU O SOCO
		// SE VC ACHA QUE O SOCO VEIO DA DIREITA (TRUE) ..... SE VC ACHA QUE VEIO DA
		// ESQUERDA (TRUE) ....
		// INTELIGÊNCIA... PROGRAMAR ALGO....

		// ATACAR
		int contA = 0, contB = 0;
		do {
			System.out.println(" ") ;
			int morpheusEscolhe = 1 + (int) (Math.random() * 2);
			int escolhaJogador = 0;

			System.out.println("Moprheus escolhe: " + morpheusEscolhe);

			System.out.println("Pra qual lado você irá esquivar:\n1 - Esquerda\n2 - Direita");
			escolhaJogador = leitor.nextInt();

			if (escolhaJogador == morpheusEscolhe) {
				System.out.println("\nVocÊ atingiu, Ponto pra Vc");

				contA++;
			} else {
				System.out.println("\nVocê Errou, Ponto para Morpheu");
				contB++;
			}

			System.out.println("Você fez " + contA + " pontos");
			System.out.println("Morpheus fez " + contB + " pontos");

		} while (contA < 3 && contB < 3);

		if (contA > contB) {
			System.out.println("VC GANHOU");
			System.out.println("\nVocê fez " + contA + " pontos");
		} else {
			System.out.println("VC PERDEU");
			System.out.println("\nMorpheus fez " + contB + " pontos");
		}

		leitor.close();
		*/
		// DESAFIO 01
		
		
		Scanner leitor = new Scanner(System.in);
		String r1, r2;
		
		
		
		System.out.println("\n/* DICA: UMA VARIÁVEL BOOLEANA DECLARADA SEM VALOR ATRIBUÍDO SE INICIA COM VALOR FALSE */\n");
		System.out.println(" ________________________________________________________");	
		System.out.println("|1    public static void main(String[] args) {           |");
		System.out.println("|2    int name = " + "Trinity" + ";                                |");
		System.out.println("|3    boolean rosto;                                     |\n"
				+ "|4                                                       |\n"
				+ "|5                                                       |\n"
				+ "|6                                                       |");
		System.out.println("|7    System.out.println(______);                        |");
		System.out.println("|8    rosto =_____;                                      |" +
		 "                                                       |");
		System.out.println("|9                                                       |");
		System.out.println("|________________________________________________________|");
		System.out.println("\n\n");
		
		System.out.print("Qual o Comando faltante na linha 7 ?\nR: ");
		r1 = leitor.next();
		
		System.out.print("Qual o Comando faltante na linha 8 ?\nR: ");
		r2 = leitor.next();
		
		System.out.println("88 Fingers Louie");
		
		
		

	}
}
