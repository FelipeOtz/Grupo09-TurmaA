import java.util.Scanner;

public class Testes {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int x;
		int contador = 0;
		int num = 0;
		int contA = 0, contB = 0;
		int cc = 0;
		
		
		int [] numberLuta = new int [6];
		
		for (int i = 0; i<=5; i++) {
			do {
			numberLuta [i] = (int) (Math.random() * 3);
				} while (numberLuta[i] == 0);
		}
				
		System.out.println("Teste Arrays: ");
		for (int number : numberLuta) {
			System.out.println(number);
		}
		
		
		
		
		System.out.println("Di�logo entre morpheu e Neo\n....................");
		
		System.out.println("\n01 - Treino de Luta");
		System.out.println("Regas: PIPIPI POPOPO BLA BLA BLA\n");
		
		System.out.println("Morfeu Come�a, voc� deve se defender");
		// ADIVINHAR QUE LADO O MORPHEU DEU O SOCO
		// SE VC ACHA QUE O SOCO VEIO DA DIREITA (TRUE) ..... SE VC ACHA QUE VEIO DA ESQUERDA (TRUE) ....
		// INTELIG�NCIA... PROGRAMAR ALGO....
		
		// ATACAR
		do {
		int n = 0;
		System.out.println("Pra qual lado voc� ir� esquivar:\n1 - Esquerda\n2 - Direita");
		num = leitor.nextInt();
			if (num == numberLuta[n]) {
				System.out.println("\nVoc� Foi Atingido, Ponto para Morpheu");
				contB++;
			}else {
				System.out.println("\nMorpheu n�o conseguiu te atingir, Ponto pra Vc");
				contA++;
			}
			++n;
			
			
			System.out.println("\nPontua��o:\nNomeDoJogador: " + contA + "\nMorpheu: " + contB);
		// DEFENDER	
		System.out.println("Sua Vez: Escolha um lado para atingir Morpheu: \n1 - Esquerda\n2 - Direita");
		num = leitor.nextInt();	
		if (num == numberLuta[n]) {
			System.out.println("\nVoc� Errou, Ponto para Morpheu");
			contB++;
		}else {
			System.out.println("\nVoc� atingiu, Ponto pra Vc");
			contA++;
		}
		System.out.println("Pontua��o:\nNomeDoJogador: " + contA + "\nMorpheu: " + contB + "\n");
		
		
		
		} while (contA != 2 || contB !=2);		
		
			if (contA != 2 ) {
				System.out.println("VC GANHOU");
			}else {
				System.out.println("VC PERDEU");
			}
		
		
		
		
		
		leitor.close();
	}
}
