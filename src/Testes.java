import java.util.Scanner;

public class Testes {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
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

		System.out.println("lsdfhjiosdfhodigiuwjahgfjioaioujfhaiopudhaiojshdoa8iushdoauisyhdoiaujhdui");
		System.out.println("lsdfhjiosdfhodigiuwjahgfjioaioujfhaiopudhaiojshdoa8iushdoauisyhdoiaujhdui");
		leitor.close();

	}
}
