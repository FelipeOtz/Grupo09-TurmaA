import java.util.Scanner;


public class Testes {
	public static void main(String[] args) {
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
//		System.out.println("Di�logo entre morpheu e Neo\n....................");
//
//		System.out.println("\n01 - Treino de Luta");
//		System.out.println("Regas: PIPIPI POPOPO BLA BLA BLA\n");
//
//		System.out.println("Morfeu Come�a, voc� deve se defender");
		// ADIVINHAR QUE LADO O MORPHEU DEU O SOCO
		// SE VC ACHA QUE O SOCO VEIO DA DIREITA (TRUE) ..... SE VC ACHA QUE VEIO DA
		// ESQUERDA (TRUE) ....
		// INTELIG�NCIA... PROGRAMAR ALGO....

		// ATACAR
		int contA = 0, contB = 0;
		do {
			System.out.println(" ") ;
			int morpheusEscolhe = 1 + (int) (Math.random() * 2);
			int escolhaJogador = 0;

			System.out.println("Moprheus escolhe: " + morpheusEscolhe);

			System.out.println("Pra qual lado voc� ir� esquivar:\n1 - Esquerda\n2 - Direita");
			escolhaJogador = leitor.nextInt();

			if (escolhaJogador == morpheusEscolhe) {
				System.out.println("\nVoc� atingiu, Ponto pra Vc");

				contA++;
			} else {
				System.out.println("\nVoc� Errou, Ponto para Morpheu");
				contB++;
			}

			System.out.println("Voc� fez " + contA + " pontos");
			System.out.println("Morpheus fez " + contB + " pontos");

		} while (contA < 3 && contB < 3);

		if (contA > contB) {
			System.out.println("VC GANHOU");
			System.out.println("\nVoc� fez " + contA + " pontos");
		} else {
			System.out.println("VC PERDEU");
			System.out.println("\nMorpheus fez " + contB + " pontos");
		}

		leitor.close();
		
		// DESAFIO 01
		
		System.out.println("\n/* DICA: UMA VARI�VEL BOOLEANA DECLARADA SEM VALOR ATRIBU�DO SE INICIA COM VALOR FALSE */\n");
		System.out.println(" _______________________________________________________");	
		System.out.println("|    public static void main(String[] args) {           |");
		System.out.println("|    int name = " + "Trinity" + ";                                |");
		System.out.println("|    boolean rosto;                                     |\n"
				+ "|                                                       |\n"
				+ "|                                                       |\n"
				+ "|                                                       |");
		System.out.println("|    System.out.println(______);                        |");
		System.out.println("|    rosto =_____;                                      |" +
		 "                                                       |");
		System.out.println("|                                                       |");
		System.out.println("|_______________________________________________________|");
		System.out.println("\n\n");
		System.out.println("Qual o Comando faltante na primeira linha?");
		System.out.print("R: ");
		System.out.println("Qual o Comando faltante na segunda linha?");
		System.out.print("R: ");
		
		
		
		
		
		
		
		

	}
}
