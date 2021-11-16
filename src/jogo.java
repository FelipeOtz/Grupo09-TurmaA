import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class jogo {

	// Variável para delay no texto
	static int timer = 1;

	// Variável para entrada de dados
	static Scanner entrada = new Scanner(System.in);

	// Variavel Global de agente

	static int agentes = 0;

	// Verificar agentes

	static boolean verAgente(int agentes) throws InterruptedException {

		if (agentes < 3) {

			escreva("\n\nCuidado!\n" + agentes + " agentes estão atrás de você!" + "\nChegando a 3 acabará o jogo\n\n",
					TimeUnit.MILLISECONDS, timer);
			return true;

		} else {

			escreva("...", TimeUnit.MILLISECONDS, 400);
			final JDialog dialog = new JDialog();

			// Criar ícone com a imagem do smith
			ImageIcon smith = new ImageIcon("images/smith.png");
			UIManager.put("OptionPane.okButtonText", "Game Over");
			dialog.setAlwaysOnTop(true);
			JOptionPane.showMessageDialog(dialog, "Um grupo de agentes encontra você e te executa", "",
					JOptionPane.WARNING_MESSAGE, smith);

			escreva("\n\nVocê chegou a " + agentes + " agentes\n" + "\nInfelizmente o jogo acabou para você\n"
					+ "\nDê seu melhor da próxima\n\n", TimeUnit.MILLISECONDS, timer);
			return false;

		}

	}

	// Função para leitura de dados
	static int leia() {

		int escolha = entrada.nextInt();
		return escolha;
	}

	// Função para Escrever na tela
	static void escreva(String texto, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : texto.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}

	// Desafio
	static void desafio01() throws InterruptedException {
		boolean liberado = false;
		
		do {		
		
		int ordem;
		escreva("Levando em consideração a informação abaixo, qual a ordem do vetor é a correta para mostrar o endereço? \n\n", TimeUnit.MILLISECONDS, timer);


		System.out.println("0 - endereço.add(Jurubatuba);");
		System.out.println("1 - endereço.add(São Paulo);");
		System.out.println("2 - endereço.add(04696-000);");
		System.out.println("3 - endereço.add(4003);");
		System.out.println("4 - endereço.add(Av Eng.Eusébio Stevaux);");
		System.out.println("5 - endereço.add(SP);\n");

		escreva("\nDigite a ordem correta:\n", TimeUnit.MILLISECONDS, timer);
		ordem = entrada.nextInt();
	

		if (ordem == 430152) {
			escreva("Parabéns você ", TimeUnit.MILLISECONDS, timer);
			liberado = true;
		} else {

			escreva("Você errou, os agentes estão atrás de você, tome cuidado.", TimeUnit.MILLISECONDS, timer);
			agentes++;
			if (!verAgente(agentes)) {
				return;

			}
		}
		} while(!liberado);
		
	}

	static void desafio02() throws InterruptedException {

		String r1, r2;
		boolean liberado = false;
		escreva("\n\nUse seus conhecimentos em declaração de variáveis para resolver o desafio e\n"
				+ "ter acesso ao nome e rosto da personagem: ", TimeUnit.MILLISECONDS, timer);
		escreva("\n\n/* DICA: UMA VARIÁVEL BOOLEANA DECLARADA SEM VALOR ATRIBUÍDO SE INICIA COM VALOR FALSE */\n", // TEXTO
																													// EXPLICATIVO
				TimeUnit.MILLISECONDS, timer);
		// NO QUADRADO NÃO SUBSTITUIR O PRINT
		System.out.print("\n ________________________________________________________");
		System.out.print("\n|1    public static void main(String[] args) {           |");
		System.out.print("\n|2    int nome = " + "\"" + "Trinity" + "\"" + ";                              |");// ERRO
																												// CORRIGIDO
		System.out.print("\n|3    boolean rosto;                                     |\n"
				+ "|4                                                       |\n"
				+ "|5                                                       |\n"
				+ "|6                                                       |");
		System.out.print("\n|7    System.out.println(______);                        |");
		System.out.print("\n|8    rosto =_____;                                      |");
		System.out.print("\n|9                                                       |");
		System.out.print("\n|________________________________________________________|");
		System.out.print("\n\n\n");

		do {
			escreva("1 - Qual o Comando faltante na linha 7 ?\nR: ", TimeUnit.MILLISECONDS, timer);
			r1 = entrada.next();
			escreva("2 - Qual o Comando faltante na linha 8 ?\nR: ", TimeUnit.MILLISECONDS, timer);
			r2 = entrada.next();

			if (r1.equalsIgnoreCase("nome") && (r2.equalsIgnoreCase("true"))) {
				escreva("\nMuito Bem, você acertou", TimeUnit.MILLISECONDS, timer);
				liberado = true;
			} else {
				escreva("\n\nINCORRETO!", TimeUnit.MILLISECONDS, timer);
				liberado = false;
				agentes++;

				if (!verAgente(agentes)) {
					return;

				}
			}

		} while (!liberado);

	}

	static void desafio03(String nome) throws InterruptedException {

		escreva("\nMorpheus: Quando eu era jovem, eu desenvolvi um código e preciso saber se você é digno para resolvê-lo \n"
				+ "Morpheus: A Matrix tem formato circular, o código que eu desenvolvi é para calcular seu tamanho é esse: \n",
				TimeUnit.MILLISECONDS, timer);

		escreva("\nDica 1 : A área de um Circulo é calculada através da fórmula:  (A = π r²)\n", TimeUnit.MILLISECONDS,
				timer);

		escreva("\nMorpheus: Hoje, eu sei que esse código pode ser melhorado de duas formas: Saberia dizer como?? \n"
				+ "1- Sim \n" + "2- Não\n", TimeUnit.MILLISECONDS, timer);

		int respostaSelecionada = 0;
		String resposta = "";
		boolean rodar = true;

		respostaSelecionada = leia();

		do {

			while (respostaSelecionada != 1 && respostaSelecionada != 2) {
				escreva("\nEscolha 1 para Sim, ou 2 para não.", TimeUnit.MILLISECONDS, timer);
				respostaSelecionada = entrada.nextInt();
			}
			if (respostaSelecionada == 1) {

			} else {
				escreva("\nExplicação: O número de PI é ≅3,14. Em java, temos uma função que retorna este valor...\n"
						+ "Também temos uma função para fazer potenciação. ", TimeUnit.MILLISECONDS, timer);
			}
			escreva("\n1 - Qual função da classe Math pode substituir o valor de PI?\n", TimeUnit.MILLISECONDS, timer);
			resposta = entrada.next();
			if (resposta.equalsIgnoreCase("Math.pi")) {
				escreva("\nNada mal hein, " + nome + "!\n", TimeUnit.MILLISECONDS, timer);
			} else {
				escreva("\n\nINCORRETO! ", TimeUnit.MILLISECONDS, timer);

				agentes++;
				if (!verAgente(agentes)) {
					return;
				}

			}
			escreva("\n2 - Qual função da classe Math pode substituir o valor raio * raio (raio² ou raio ^2)\n\n",
					TimeUnit.MILLISECONDS, timer);
			resposta = entrada.next();
			if (resposta.equalsIgnoreCase("Math.pow")) {
				escreva(nome + ", parabéns, você concluiu o desafio! ", TimeUnit.MILLISECONDS, timer);
				rodar = false;
			} else {
				escreva("\n\n INCORRETO! ", TimeUnit.MILLISECONDS, timer);
				agentes++;
				if (!verAgente(agentes)) {
					return;
				}

			}
		}

		while (rodar);

	}

	static void desafio04(String nome) throws InterruptedException {

		escreva("Tank: ao decorrer da sua jornada dentro da matrix, você irá precisar de senhas seguras para"
				+ "descriptografar e ter acesso a suas informações. Para isso qual linha de código deve ser utilizada aqui:\n",
				TimeUnit.MILLISECONDS, timer);

		System.out.println(
				"		String senha[] = new String[4];\r\n" + "		String aleatório[] = new String[20];\r\n"
						+ "		aleatório[0] = \"@\";\r\n" + "		aleatório[1] = \"2\";\r\n"
						+ "		aleatório[2] = \"5\";\r\n" + "		aleatório[3] = \"B\";\r\n"
						+ "		aleatório[4] = \"d\";\r\n" + "		aleatório[5] = \"6\";\r\n"
						+ "		aleatório[6] = \"G\";\r\n" + "		aleatório[7] = \"9\";\r\n"
						+ "		aleatório[8] = \"10\";\r\n" + "		aleatório[9] = \"P\";\r\n"
						+ "		aleatório[10] = \"%\";\r\n" + "		aleatório[11] = \"&\";\r\n"
						+ "		aleatório[12] = \"9\";\r\n" + "		aleatório[13] = \"6\";\r\n"
						+ "		aleatório[14] = \"F\";\r\n" + "		aleatório[15] = \"*\";\r\n"
						+ "		aleatório[16] = \"L\";\r\n" + "		aleatório[17] = \"Y\";\r\n"
						+ "		aleatório[18] = \"b\";\r\n" + "		aleatório[19] = \"P\";\r\n");

		System.out.println("for (int i = 0; i < senha.length; i++) {\r\n" + "	___________________________\r\n"
				+ "	System.out.print(senha[i]);\r\n" + "}\r\n");

		ArrayList<String> alternativas = new ArrayList<String>();

		alternativas.add("senha[i] = aleatorio[(int) (Math.random() * 19)];"); // originalmente a
		alternativas.add("senha[i] = aleatório[0];"); // originalmente b
		alternativas.add("senha[i] = 0983;"); // originalmente c
		alternativas.add("senha = 0983;"); // originalmente d

		boolean acertou = false;

		do {
			Collections.shuffle(alternativas);

			// Vetor de alternativas que correesponde as respostas
			String vetorAlternativas[] = { "1", "2", "3", "4" };

			// Variável auxiliar para jogar na constante posteriormente
			String respostaCorreta = "";

			// Encontrar a resposta correta no meio das alternativas embaralhadass
			for (int i = 0; i < alternativas.size(); i++) {
				if (alternativas.get(i) == "senha[i] = aleatorio[(int) (Math.random() * 19)];") {
					respostaCorreta = vetorAlternativas[i];
					break;
				}
			}

			// Constante com resposta correta
			// final String respostaCorreta = auxiliar;

			escreva("Qual linha deve ser colocada aqui para completar o código e gerar uma senha aleatória "
					+ "de 4 de dígitos: \n", TimeUnit.MILLISECONDS, timer);

			System.out.println("1) " + alternativas.get(0) + "\n2) " + alternativas.get(1) + "\n3) "
					+ alternativas.get(2) + "\n4) " + alternativas.get(3) + "\n");

			String respostaSelecionada = entrada.next();

			if (respostaCorreta.equals(respostaSelecionada)) {
				escreva("\nBoaaa! Resposta correta, " + nome, TimeUnit.MILLISECONDS, timer);
				acertou = true;
			} else {
				escreva("Errou!", TimeUnit.MILLISECONDS, timer);
				agentes++;
				if (!verAgente(agentes)) {
					return;
				}
			}
		} while (acertou == false);

	}

	static void desafio05(String nome) throws InterruptedException {
				
		System.out.print("___________________________________________\n");
		System.out.print("String endereco = \"Atlanta\";     \r\n"
						+ "		\r\n"
						+ "int stringLength = endereco.length();\r\n"
						+ "		\r\n"
						+ "System.out.println(stringLength);\n");
		System.out.print("___________________________________________\n");
					 
				

				ArrayList<String> alternativas = new ArrayList<String>();

				alternativas.add("Número de caracteres do endereço"); // originalmente a
				alternativas.add("Nome do endereço"); // originalmente b
				alternativas.add("Tipo da variável do endereço"); // originalmente c
				alternativas.add("Número do endereço"); // originalmente d
				
				boolean acertou = false;

				do {
					Collections.shuffle(alternativas);

					String vetorAlternativas[] = { "1", "2", "3", "4"};

					String respostaCorreta = "";

					for (int i = 0; i < alternativas.size(); i++) {
						if (alternativas.get(i) == "Número de caracteres do endereço") {
							respostaCorreta = vetorAlternativas[i];
							break;
						}
					}

					escreva("De acordo com o código acima, o que ele retornará?\n", TimeUnit.MILLISECONDS, timer);

					System.out.println("1) " + alternativas.get(0) + 
							"\n2) " + alternativas.get(1) + 
							"\n3) " + alternativas.get(2) + 
							"\n4) " + alternativas.get(3) + "\n");

					String respostaSelecionada = entrada.next();

					if (respostaCorreta.equals(respostaSelecionada)) {
						escreva("\nBoaaa! Resposta correta,"+ nome, TimeUnit.MILLISECONDS, timer);
						acertou = true;
					} else {
						escreva ("Errou!", TimeUnit.MILLISECONDS, timer);
						agentes++;
						if (!verAgente(agentes)) {
							return;
						}
						
						
					}
				} while (acertou == false);
				
			}
	
		static void desafio06() throws InterruptedException {
			int laco;
			
			escreva("\nPara entortar a colher, e copiar a habilidade do garoto, resolva este desafio de repetição.\r\n", TimeUnit.MILLISECONDS, timer);
			escreva("\nO Garoto pode entortar a colher porque tem a habilidade de telecinesia em seu nível máximo (100)\n", TimeUnit.MILLISECONDS, timer);
			escreva("\nPara adquirir essa habilidade (que agora está em zero) você deve usar um determinado laço de repetição\n", TimeUnit.MILLISECONDS, timer);
			escreva("\nDentro das alternativas abaixo escolha o laço de repetição mais apropriado para esta situação\n", TimeUnit.MILLISECONDS, timer);
			
			do {
				
				escreva("1 - While\n", TimeUnit.MILLISECONDS, timer);
				escreva("2 - Do-While\n", TimeUnit.MILLISECONDS, timer);
				escreva("3 - For\n", TimeUnit.MILLISECONDS, timer);
				escreva("4 - Enhanced-For\n", TimeUnit.MILLISECONDS, timer);
				
				escreva("\nDigite a opção correta: ", TimeUnit.MILLISECONDS, timer);
				laco = entrada.nextInt();
				while (laco < 1 || laco >4) {
					escreva("\nOPÇÃO INCORRETA\n", TimeUnit.MILLISECONDS, timer);
					escreva("\nDigite a opção correta: \n", TimeUnit.MILLISECONDS, timer);
					laco = entrada.nextInt();
				}
				switch (laco) {
				case 3:
					escreva("\nEscolha correta, você conseguiu entortar a colher!\n", TimeUnit.MILLISECONDS, timer);
					escreva("\nParabéns", TimeUnit.MILLISECONDS, timer);
					break;
				default:
					escreva("\nLaço de repetição errado\n", TimeUnit.MILLISECONDS, timer);
						agentes++;
						if(!verAgente(agentes)) {
							return;
						}
						break;
					}
			} while (laco != 3);
		}

	

	static void desafio07() {

	}

	// Função para jogar
	static void jogar() throws InterruptedException {

		// Janela de diálogo para colocar JOptionPane
		final JDialog dialog = new JDialog();

		// Criar ícone com a imagem do coelho
		ImageIcon coelho = new ImageIcon("images/coelho.png");

		// Criar ícone com a imagem de matrix
		ImageIcon matrix = new ImageIcon("images/matrix.gif");

		// Criar ícone com a imagem da carta
		ImageIcon carta = new ImageIcon("images/carta.png");

		// Criar ícone com a imagem dafolha
		ImageIcon folha = new ImageIcon("images/folha.png");

		// String para receber nome do jogador
		String nome;

		// Int para receber escolha do jogador
		int escolha = 1;

		// Senha criptografada
		String senhaCriptografada = "L*%b";

		escreva("\n\nOlá jogador. Bem-vindo(a) a Inside the Matrix.\n", TimeUnit.MILLISECONDS, timer);

		escreva("\nAntes de continuar, poderia me dizer seu nome?\n", TimeUnit.MILLISECONDS, timer);

		nome = entrada.next();
		
		desafio06();
		if (agentes == 3) {
			return;
		}
		

		do {
			escreva("\n" + nome + ", que tal saber saber mais sobre o jogo e sobre Matrix?", TimeUnit.MILLISECONDS,
					timer);

			escreva("\n1 - Sim.", TimeUnit.MILLISECONDS, timer);
			escreva("\n2 - Não, seguir jogo.\n", TimeUnit.MILLISECONDS, timer);
			escolha = leia();
			switch (escolha) {
			case 1:
				sobreMatrix();
				break;
			case 2:
				break;

			default:
				escreva("\nVALOR INVALIDO!\n", TimeUnit.MILLISECONDS, timer);

			}

		} while (!(escolha <= 2));
		escreva("\n\nEntão vamos lá! Prepare-se para se aventurar pela MATRIX:  \n\n", TimeUnit.MILLISECONDS, timer);
		escreva("...", TimeUnit.MILLISECONDS, 300);
		escreva("\n\nDepois de um dia cansativo de trabalho...", TimeUnit.MILLISECONDS, timer);
		escreva("\n\n*Você chega em casa e liga seu computador*\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": Ah! Não posso esquecer de terminar aquela aplicação em Java que eu estava desenvolvendo\n",
				TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": Será muito impotante para meu portifólio\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("*Você começa a desenvolver sua nova aplicação*\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Até então, parecia ser só mais um fim de tarde como qualquer outro", TimeUnit.MILLISECONDS, timer);
		escreva("...", TimeUnit.MILLISECONDS, 100);

		escreva("\n\nMas algo inesperado acontece:\n\n", TimeUnit.MILLISECONDS, timer);

		// Fixar JDialog na frente de todas as janelas
		dialog.setAlwaysOnTop(true);

		escreva("...", TimeUnit.MILLISECONDS, 600);

		// Trocar texto no botão
		UIManager.put("OptionPane.okButtonText", "Espera!?... O que é isso?? ");

		// Mostrar JOptionPane matrix
		JOptionPane.showMessageDialog(dialog, "", "CUIDADO, " + nome.toUpperCase() + "! RISCO DE VÍRUS!!",
				JOptionPane.WARNING_MESSAGE, matrix);

		// Trocar texto no botão
		UIManager.put("OptionPane.okButtonText", "O que está acontecendo????");
		escreva("\n", TimeUnit.MILLISECONDS, 600);
		escreva("...", TimeUnit.MILLISECONDS, 500);

		// Mostrar JOptionPane coelho
		JOptionPane.showMessageDialog(dialog, "Siga ocoelho branco!!!",
				"CUIDADO, " + nome.toUpperCase() + "! RISCO DE VÍRUS!!", JOptionPane.WARNING_MESSAGE, coelho);
		escreva("\n\n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": Espera", TimeUnit.MILLISECONDS, timer);
		escreva("...", TimeUnit.MILLISECONDS, 400);
		escreva("\n\n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": O que acabou ", TimeUnit.MILLISECONDS, timer);
		escreva("de-de-de...", TimeUnit.MILLISECONDS, 200);
		escreva(" acontecer? O que foi isso?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": Será que fui hackeado?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("\nAlgum tempo depois", TimeUnit.MILLISECONDS, timer);
		escreva("...", TimeUnit.MILLISECONDS, 500);
		escreva("\n\nAlguém bate à sua porta:", TimeUnit.MILLISECONDS, timer);

		escreva("\n*Toc*", TimeUnit.MILLISECONDS, 100);
		escreva("\n*Toc*\n", TimeUnit.MILLISECONDS, 100);

		escreva("\n*Você se levanta e vai até a porta para atender*\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": Ué?! não tem ninguém...\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*Você olha para os lados e não vê ninguém*", TimeUnit.MILLISECONDS, timer);
		escreva("\n*Antes de fechar a porta você vê uma carta no chão*\n\n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": Que estranho... Por que alguém deixaria uma carta jogada no chão assim?\n\n",
				TimeUnit.MILLISECONDS, timer);

		// Validador de resposta
		do {
			escreva("Digite 1 para pegar a carta\n\n", TimeUnit.MILLISECONDS, timer);
			escolha = leia();

			if (escolha != 1) {
				escreva("\nValor inválido!\n", TimeUnit.MILLISECONDS, timer);
			}
		} while (escolha != 1);

		escreva("...", TimeUnit.MILLISECONDS, 500);

		// Mostrar JOptionPane carta

		UIManager.put("OptionPane.okButtonText", "Abrir carta");
		JOptionPane.showMessageDialog(dialog, "", "", JOptionPane.WARNING_MESSAGE, carta);

		// Mostrar JOptionPane folha

		UIManager.put("OptionPane.okButtonText", "O que isso significa?");
		JOptionPane.showMessageDialog(dialog, "", "", JOptionPane.WARNING_MESSAGE, folha);

		escreva("\n\n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": O que isso significa? \n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": Me parece que este endereço está embaralhado\n\n", TimeUnit.MILLISECONDS, timer);

		// Desafio 01

		desafio01();
		if (agentes == 3) {
			return;
		}
		
		escreva("\n\n", TimeUnit.MILLISECONDS, timer);

		do {
			escreva(nome + ": Agora que sei o endereço correto, o que devo fazer?\n", TimeUnit.MILLISECONDS, timer);

			escreva("\n1 - Ir do endereço indicado", TimeUnit.MILLISECONDS, timer);
			escreva("\n2 - Fingir que isso nunca aconteceu, e rasgar a carta.\n", TimeUnit.MILLISECONDS, timer);

			escolha = leia();
			switch (escolha) {
			case 2:

				escreva("\nVocê decidiu ignorar o aviso que lhe foi dado, e viveu sua vida normalmente. "
						+ "\nMas o peso na sua consciência vai poder te deixar seguir em frente?",
						TimeUnit.MILLISECONDS, timer);

				escreva("Game  over", TimeUnit.MILLISECONDS, timer);
				break;
			// return 0;

			case 1:
				break;
			default:
				escreva("VALOR INVÁLIDO!", TimeUnit.MILLISECONDS, timer);
				break;
			}
		} while (!(escolha <= 2));
		escreva("\n\n*Você vai até o local*\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("...", TimeUnit.MILLISECONDS, 300);

		escreva("\n\nChegando lá, você se depara com um bar. "
				+ "\nAparentemente pouco movimentado, a música é agradável.", TimeUnit.MILLISECONDS, timer);

		escreva("\n\n*Você se senta em um banquinho*", TimeUnit.MILLISECONDS, timer);
		// variavel para receber o nome do drink
		String drink;

		do {
			escreva("\n\nTakêdo, o barman: Olá amigo, gostaria de um drink?\n\n", TimeUnit.MILLISECONDS, timer);
			escreva(nome + ":", TimeUnit.MILLISECONDS, timer);
			escreva("\n1 - Não, to de boa\n", TimeUnit.MILLISECONDS, timer);
			escreva("\n2 - Opa, claro!\n\n", TimeUnit.MILLISECONDS, timer);
			escolha = leia();
			switch (escolha) {
			case 1:
				escreva("Ao olhar ao redor todas as pessoas têm de alguma forma um símbolo de coelho.\n"
						+ "Com isso você se questiona se o coelho é algum tipo de símbolo de identificação.\n\n",
						TimeUnit.MILLISECONDS, timer);

				break;
			case 2:
				escreva("\n\nTakêdo, o barman: Qual drink você quer? (Digite o nome da sua bebida preferida)\n",
						TimeUnit.MILLISECONDS, timer);
				drink = entrada.next();
				escreva("\n*Você recebe um copo de " + drink + "*\n", TimeUnit.MILLISECONDS, timer);
				escreva("\nAo pegar o copo, você percebe que estranhamente há um símbolo de coelho no uniforme do barman.\n"
						+ "Com isso você se questiona se o coelho é algum tipo de símbolo de identificação.\n\n",
						TimeUnit.MILLISECONDS, timer);
				break;

			default:
				escreva("\nValor inválido!\n", TimeUnit.MILLISECONDS, timer);

			}

		} while (escolha != 1 && escolha != 2);

		escreva("Algum tempo depois\n", TimeUnit.MILLISECONDS, timer);
		escreva("...", TimeUnit.MILLISECONDS, 500);

		escreva("\n\nUma pesssoa estranha senta ao seu lado: \n", TimeUnit.MILLISECONDS, timer);

		do {

			escreva("\n@*%###*: Olá, você se chama " + nome + "?\n\n", TimeUnit.MILLISECONDS, timer);
			escreva(nome + ":", TimeUnit.MILLISECONDS, timer);
			escreva("\n1 - Sim, sou eu mesmo(a). ", TimeUnit.MILLISECONDS, timer);
			escreva("\n2 - Não, você deve estar se confundindo.\n", TimeUnit.MILLISECONDS, timer);

			escolha = leia();
			switch (escolha) {
			case 1:
				escreva("\n\n@*%#*#*: Ótimo era ", TimeUnit.MILLISECONDS, timer);
				break;
			case 2:
				escreva("\n\n$@*%##*: Não precisa mentir para mim.", TimeUnit.MILLISECONDS, timer);
				escreva("\n Era ", TimeUnit.MILLISECONDS, timer);
				break;
			default:
				escreva("VALOR INVÁLIDO!", TimeUnit.MILLISECONDS, timer);
			}

		} while (!(escolha <= 2));
		escreva("você mesmo que estava procurando \n\n", TimeUnit.MILLISECONDS, timer);

		escreva("!@*%##¨*: Você não consegue ver meu rosto, né?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": Não, de algum jeito não enxergo seu rosto,\n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": Minha vista está toda embaçada. Como você fez isso?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("@*%#!%*: Não é algo tão simples de explicar\n\n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": Não importa, quero saber o que está acontecendo! \n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": Foi você que hackeou meu computador né? \n\n", TimeUnit.MILLISECONDS, timer);

		escreva("$#*%$!@*: Sim fui eu\n", TimeUnit.MILLISECONDS, timer);
		escreva("@*¨$#@*: Mas preciso que você se acalme\n", TimeUnit.MILLISECONDS, timer);
		escreva("@*%@!#*: Eu sei muito sobre você. Estamos te observando há muito tempo\n\n", TimeUnit.MILLISECONDS,
				timer);
		escreva(nome + ": Como assim estamos? Você e mais quem?\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("¨&@!*%%#$*: Sei que está confuso. E sei que você está tentando “sair da caverna”,\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("#*%@#$¨*: Está procurando coisas que ninguém mais vê\n", TimeUnit.MILLISECONDS, timer);

		escreva("$@@*!#*: Se quiser descobrir a verdade, venha comigo!\n\n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": Me diga pelo menos por que não consigo ver seu rosto\n", TimeUnit.MILLISECONDS, timer);

		// Desafio 2

		desafio02();
		if (agentes == 3) {
			return;
		}

		escreva("\n!*%@#!*: Antes que eu me esqueça meu nome é Trinity\n", TimeUnit.MILLISECONDS, timer);
		escreva("Trinity*: Agora que sabe quem sou eu, tenho que te apresentar a uma pessoa \n\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("*Trinity se levante e vai até a porta*\n\n", TimeUnit.MILLISECONDS, timer);

		do {

			escreva("Esta é sua última chance de desistir, deseja seguir Trinity?\n\n", TimeUnit.MILLISECONDS, timer);

			escreva("1 - Continuar e seguir Trinity\n", TimeUnit.MILLISECONDS, timer);

			escreva("2 - Desistir e seguir com sua vida chata e sem graça\n", TimeUnit.MILLISECONDS, timer);

			escolha = leia();
			switch (escolha) {
			case 1:
				break;
			case 2:
				escreva("*Você fica sentado*\n\n", TimeUnit.MILLISECONDS, timer);
				escreva("*Trinity vai embora e você nunca mais a vê*\n\n", TimeUnit.MILLISECONDS, timer);

				escreva("Acredita mesmo que fez a escolha certa? Talvez seguir o coelho pela toca não seria uma má ideia\n",
						TimeUnit.MILLISECONDS, timer);
				escreva("...", TimeUnit.MILLISECONDS, 500);
				escreva("\n\nFim de Jogo!\n\n\n", TimeUnit.MILLISECONDS, timer);
				creditos();

			default:
				escreva("VALOR INVALIDO!", TimeUnit.MILLISECONDS, timer);
				// return true;
			}
		} while (!(escolha <= 2));

		escreva("\n*Você se levanta e segue ela* \n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*você se depara com uma mansão antiga e luxuosa* \n", TimeUnit.MILLISECONDS, timer);
		escreva("\nAo entrar na mansão, você segue a Trinity até a porta do salão "
				+ "principal (A porta está fechada)\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nTrinity: Vou te dar só uma dica, seja sincero.\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*Trinity abre a porta*\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*Ao adentrar a sala, você percebe que tem mais alguém na sala "
				+ "com você, porém\n essa pessoa está virada de costas para você,\r\n"
				+ "aos poucos você começa a se aproximar e percebe "
				+ "caracteristcas da\n pessoa, se trata de um homem negro, calvo, "
				+ "alto, usando óculos escuro.* \r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*Ele então vira e se apresenta a você*\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nPersonagem desconhecido: Finalmente!!! Você não "
				+ "precisa se apresentar, eu já sei tudo sobre você.\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nPersonagem desconhecido: Primeiramente meu nome "
				+ "é Morpheus, por favor, sente-se aqui, agora \n você tem " + "uma decisão a fazer.\r\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: você deve estar se sentindo como a Aline, "
				+ "escorregando pela toca do coelho.\nvocê é um homem que aceita o que vê, pois pensa estar\nsonhando, "
				+ "ironicamente você está longe da verdade. Você acredita em destino?\r\n", TimeUnit.MILLISECONDS,
				timer);
		escreva("\n" + nome + ": não aceita a ideia de não estar " + "no controle das coisas. \n",
				TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: sei que dentro de você, você sente que há "
				+ "algo de errado\nno mundo, e de fato há, vivemos em uma matrix.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nvocê a vê em todos os lugares e em tudo que você faz, "
				+ "é o mundo que impede que você veja a verdade.\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n" + nome + ": Que verdade ?\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: que você é um escravo da matrix, como todo "
				+ "mundo você nasceu em uma\nprisão que não pode sentir, " + "ver ou tocar.\n"
				+ "infelizmente não posso explicar o que " + "realmente é matrix.\né preciso que veja por si mesmo:\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("\n*Morpheus fecha as suas mãos e ergue seu braço em sua "
				+ "direção(aparentando estar segurando algo)*\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: você tem sua última escolha, em minha mão tenho"
				+ " duas pílulas, se você tomar \n a pílula azul você vai voltar a sua vida normal"
				+ "e esquecerá de tudo isso. \n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: Antes de continuar, preciso que você "
				+ "resolva o seguinte desafio, para saber \n se você está pronto para decidir " + "o rumo da sua vida.",
				TimeUnit.MILLISECONDS, timer);
		// DESAFIO 3

		desafio03(nome);
		if (agentes == 3) {
			return;
		}

		do {

			escreva("\nse escolher a pílula vermelha você vai para o país das maravilhas "
					+ "e vou te mostrar até onde vai a toca do coelho.\n", TimeUnit.MILLISECONDS, timer);

			escreva("1 - tomar pílula Azul.", TimeUnit.MILLISECONDS, timer);
			escreva(" 2 - Tomar pílula Vermelha.", TimeUnit.MILLISECONDS, timer);

			escolha = leia();
			switch (escolha) {
			case 1:
				escreva("Você acorda em sua cama, aparentemente, só mais um dia normal como os outros.",
						TimeUnit.MILLISECONDS, timer);
				creditos();
				return;
			case 2:
				escreva("\n*Você se sente tonto e começa adormecer lentamente*\n", TimeUnit.MILLISECONDS, timer);
				break;

			default:
				escreva("VALOR INVÁLIDO!", TimeUnit.MILLISECONDS, timer);
			}

		} while (!(escolha <= 2));

		escreva("\nDe repente você acorda e sente o seu corpo todo dolorido, como se nunca tivesse usado ele,"
				+ " então\nnota que em seu corpo" + "há vários cabos que estão conectados "
				+ "a uma máquina, ao olhar\nao redor vê outras\n", TimeUnit.MILLISECONDS, timer);
		escreva("\ncápsulas igual a sua, há inúmeros humanos conectados a "
				+ "ela, se assusta com tudo\nque está vendo e cai de sua cápsula.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*Você desmaia novamente*\n", TimeUnit.MILLISECONDS, timer);
		escreva("...", TimeUnit.MILLISECONDS, 300);
		escreva("\nNo dia seguinte você acorda em uma uma estrutura " + "metálica estranha, e alguém bate na porta.\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("*TOK TOK*", TimeUnit.MILLISECONDS, timer);
		escreva("\n" + nome + ": Meus olhos doem !\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: É porque você nunca os usou, pronto para começarmos?\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n" + nome + ": onde estamos?\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: A pergunta não é onde mas quando. você acha\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: Matrix é uma realidade simulada, criada por máquinas sencientes"
				+ " para subjugar a população humana, enquanto o calor\n" + "e a atividade elétrica "
				+ "de seus corpos são usados ​como fonte de energia.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: Estamos a muito tempo à procura de você, finalmente encontramos"
				+ " o escolhido, que nos ajudará a acabar \n" + "com a Matrix de uma vez por todas e "
				+ "para isso precisamos começar a te preparar para isso, por favor\n" + "me acompanhe que vou"
				+ " te apresentar ao seu treinador.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: Dentro da Matrix podemos alterar qualquer coisa em nós mesmos, sejaintelectualmente"
				+ "\nou fisicamente, você quer ter super força?"
				+ "você terá, ou talvez super velocidade? você terá.\n "
				+ "Este é Tank, um dosnossos modificadores, ele vai te ajudar a aprimorar todas suas \n"
				+ "habilidades " + "e adquirir novas, fique a vontade para escolher.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nTank: Prazer grande escolhido, vamos ao que interessa?\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nTank: temos as seguintes habilidades que podemos fazer update, fique a vontade para escolher "
				+ "uma para\naprimorar, mas essas modificações"
				+ "não podem ser feitas em qualquer um, por\nisso preciso" + " que você faça o seguinte :\n",
				TimeUnit.MILLISECONDS, timer);
		// DESAFIO 4

		desafio04(nome);
		if (agentes == 3) {
			return;
		}

		// MINIGAME

		// PARTE MELQUI
		escreva("\n. . . . . . . . . .\nDesafio da Senha 4 Acabou Aki \n Em seguida desafio da habilidade\n"
				+ ". . . . . . . . . . . . .\n\n", TimeUnit.MILLISECONDS, timer);
		// DESAFIO 4

		escreva("Tank: agora você está pronto !\n", TimeUnit.MILLISECONDS, timer);
		escreva("Trinity: Ei Tank, acho que ele ainda não está pronto. Deixa eu ver"
				+ " do você é capaz. \nO que acha de testar suas novas habilidades comigo?\n", TimeUnit.MILLISECONDS,
				timer);
		escreva("\nEscolha: Treinar com a Trinity ou seguir com a história\n", TimeUnit.MILLISECONDS, timer);
		escreva("Treinar Trinity: \n", TimeUnit.MILLISECONDS, timer);
		escreva("\nOBS:Treinar com a Trinity vai potencializar suas habilidades ao máximo.\n\n", TimeUnit.MILLISECONDS,
				timer);

		escreva("Morpheus: " + nome + ", vamos precisar entrar na Matrix novamente para encontrar o Oráculo\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("só que temos um pequeno problema: Ninguém, até o momento, conseguiu encontrar a localização\n",
				TimeUnit.MILLISECONDS, timer);

		escreva("dela dentro da Matrix. Você é o escolhido, por isso preciso que você encontre ela, por ",
				TimeUnit.MILLISECONDS, timer);
		escreva("\neste computador você conseguirá achar-lá, com isso vamos até ela para saber se você realmente \né nosso escolhido, ",
				TimeUnit.MILLISECONDS, timer);
		escreva("aquele que acabará com o sofrimento daqueles dentro da matrix.\n\n\n" + "", TimeUnit.MILLISECONDS,
				timer);

		escreva("**Você se senta em frente ao computador e começa a codificar, faz tudo de forma rápida como\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("se já tivesse visto isso antes. Em meio a tantos códigos, você encontra um arquivo criptografado,\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("para descriptografar o arquivo é necessário, que você faça o seguinte:\n", TimeUnit.MILLISECONDS,
				timer);
		escreva("\nTank: deixa eu te ajudar novato \n\n ///DICA SOBRE o desafio////\n", TimeUnit.MILLISECONDS, timer);

		// DESAFIO 5
		
		desafio05(nome);
		if (agentes == 3) {
			return;
		}
		
		escreva("Morpheus: sabia que você não ia nos desapontar, essa etapa que estamos é importante para que consigamos\n"
				+ "vencer a matrix de uma vez por todas.\r\n\n" + "", TimeUnit.MILLISECONDS, timer);

		escreva("Trinity: Bom trabalho, " + nome
				+ " conseguiu descobrir a localização do Oráculo, já  fizemos muito por hoje,\n vamos\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("descansar porque amanhã vai ser um grande dia para todos nós.\n\n" + "", TimeUnit.MILLISECONDS, timer);

		escreva("** Você vai dormir **\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nNo dia seguinte…\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Você abre olho e sente que há algo de errado com o seu corpo, ao se levantar e olhar no espelho,\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("percebe que seu rosto está se desfazendo e se espanta com isso. Você ouve a Trinity gritando de\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("longe e cada vez ficando mais alto, como se estivesse se aproximando.\n\n", TimeUnit.MILLISECONDS,
				timer);
		escreva("De repente você abre o olho novamente, Trinity está na sua frente, e percebe que tudo não\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("se passava de um pesadelo.\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("Junto a Trinity, você vai ao comando central da nave e se depara com o Tank, manuseando uma grande \n",
				TimeUnit.MILLISECONDS, timer);
		escreva("máquina cheia de cabos.\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("Tank: sente-se, fiquem a vontade, estou preparando a máquina para levá los de volta ao paraiso.\n\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("**Tank coloca um capacete estranho em você**\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("****Após os preparos, Tank liga a máquina e você começa a adormecer***\n\n", TimeUnit.MILLISECONDS,
				timer);

		escreva("***você abre o olho e percebe que está de volta à Matrix***\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("Ao entrar na matrix Morpheus e " + nome + " se surpreende com uma casa cheia de crianças,\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("onde essas crianças não tinham brilho no olhar que geralmente as crianças têm, todas pareciam\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("cansadas e descontentes com sua vida.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Um garoto se aproxima de você, logo de cara você percebe que ele não é igual aos outros, a fisionomia\n",
				TimeUnit.MILLISECONDS, timer);

		escreva("do seu rosto é serena e então ele pega uma colher e sem dizer uma palavra e nem mexer um dedo,\n ",
				TimeUnit.MILLISECONDS, timer);
		escreva("de repente ele a entorta.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Garoto: você sabe fazer isso ?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + " : Não, nunca tentei.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Garoto: basta você pensar que a colher não é real e modificá-la da forma que quiser\n\n",
				TimeUnit.MILLISECONDS, timer);

		System.err.println("///DESAFIO ENTORTAR COLHER/// \n\n");
		do {
			escreva("\n" + nome + ", que tal saber saber mais sobre o que é Psicocinesi", TimeUnit.MILLISECONDS,
					timer);

			escreva("\n2 - Sim.", TimeUnit.MILLISECONDS, timer);
			escreva("\n1 - Não, seguir com desafio.\n", TimeUnit.MILLISECONDS, timer);
			escolha = leia();
			switch (escolha) {
			case 2:
				Psicocinese();
				break;
			case 1:
				break;

			default:
				escreva("\nVALOR INVALIDO!\n", TimeUnit.MILLISECONDS, timer);

			}
		} while (!(escolha <= 2));

		escreva("Garoto: Viu? Nada daquilo que você pensa que é real é real.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Garoto: Me siga, sei quem você está procurando….\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Ao chegar na cozinha da casa, você encontra uma Senhora fazendo um chá, sua\n", TimeUnit.MILLISECONDS,
				timer);
		escreva("aparência é simples e humilde.", TimeUnit.MILLISECONDS, timer);

		escreva("Senhora: sente-se garoto, já conversamos primeiro irei terminar de fazer o meu chá…\n\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("Senhora: diga me garoto, o que realmente você quer  ?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": eu realmente sou aquele que todos dizem, o escolhido, aquele que acabará matrix ?\n\n",
				TimeUnit.MILLISECONDS, timer);

		escreva("Oráculo: eu não sei, você se sente preparado para isso ?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": você não sabe ou não quer dizer ?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Oráculo: ninguém pode ver além daquilo que não compreende. \n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": então é hora de eu descobrir algumas verdades..\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Oráculo: não se esqueça que muito em breve o agente Smith terá o poder de prender todos dentro da matrix.\n\n",
				TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": quem é o agente smith ?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Oráculo: ele é o sentinela senciente, que é responsável pela proteção da matrix, e fará de tudo para que\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("ninguém saia dela, você deve pará lo antes que não haja nada mais que seja real\n\n",
				TimeUnit.MILLISECONDS, timer);

		escreva("Oráculo: de um jeito ou de outro, essa guerra terá um fim nesta noite, e o futuro dos dois mundos\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("mundos (real e matrix) estará em suas mãos.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Você sai da casa e percebe que Morpheus não está lá.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Trinity: ainda bem que te achei, pensamos que você também havia sido sequestrado.\n\n",
				TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": Como assim ? quem foi sequestrado ?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Trinity: enquanto você estava conversando com o Oráculo, Os sentinelas estavam aqui e para eles\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("não desconfiarem que você estava por perto, Morpheus lutou com eles,  mas ele não resistiu e os\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("sentinelas levaram ele.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": mas por que o Morpheus e não eu?\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("Trinity: Anda! não há  tempo para isso. Tank está rastreando eles. Parece ser um prédio\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("abandonado no centro da cidade. Vamos até lá.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Chegando ao local\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("*Você vê Morpheus acorrentado em uma mesa*\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("Agente Smith: estava te esperando, finalmente teremos esse momento tão aguardado por todos.\n\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("Morpheus:  " + nome + " não se distraia com ele, lembra-se que este é um momento importante para\n\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("todas vidas existentes dentro e fora da matrix.\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("Trinity: " + nome
				+ " lembre-se do que treinamos antes, seja (variável do tipo de treinamento escolhido pelo usuário)\n",
				TimeUnit.MILLISECONDS, timer);

		return;

	}
	static void Psicocinese() throws InterruptedException {
		escreva("A psicocinese (movimento mental), telecinesia [...]  descreve o suposto fenômeno ou capacidade de uma pessoa\nmovimentar, "
				+ "manipular, abalar ou exercer força sobre um sistema físico sem interação física,"
				+ " apenas usando a mente.\nO termo psicocinese foi criado em 1914 pelo autor "
				+ "estadunidense Henry Holte popularizado pelo\nparapsicólogo estadunidense  J.B. Rhine nos anos 30."
				+ " Já o termo telecinesia foi criado em 1890 pelo parapsicólogo\nrusso Alexandre Aksakof.", TimeUnit.MILLISECONDS, timer);
		
		
	}

	// Função para mostrar instruções
	static void instrucao() throws InterruptedException {
		escreva("Instruções", TimeUnit.MILLISECONDS, timer);
		escreva("O jogo é tem como base o filme matrix, terá multiplas escolhas, Completar o código, então aproveite, \n O * indica uma ação do personagem."
				+ "\n e Siga o coelho.. ", TimeUnit.MILLISECONDS, timer);
	}

	// Função para mostrar créditos
	static void creditos() throws InterruptedException {
		escreva("\nCréditos\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("O jogo foi feito pelos integrantes do Grupo 9 da Turma A, de TADS Senac, \nOs integrantes são: \nFelipe Ortiz, \nJulia Mangabeira, \nMelqui Vieira, \nRafael Ramos e Roberto José.\n\n",
				TimeUnit.MILLISECONDS, timer);
	}

	// Função para mostrar sobre
	static void sobreMatrix() throws InterruptedException {
		escreva("\nO jogo se passa em um futuro onde as maquinas dominaram o mundo e escravizaram a raça humana sem que eles soubessem,\nDeixando eles "
				+ "presos dentro de uma matrix.\n"
				+ "Matrix é uma realidade simulada, criada por máquinas sencientes para subjugar a população humana, enquanto o calor\ne a atividade"
				+ " elétrica de seus corpos são usados"
				+ " ​como fonte de energia. O Escolhido, também conhecido\ncomo o Programa Prime, é uma característica sistêmica da Matrix, "
				+ "na qual um código especial é carregado\npor um ser humano selecionado aleatoriamente, esse código lhe dará vastas habilidades "
				+ "sobre-humanas ao\nseu avatar dentro da Matrix, além de alguns poderes extraordinários no mundo real. O código mencionado tem a função"
				+ " de\nanexar a pessoaque o transporta à todas as anomalias (humanos que estão rejeitando a Matrix) dentro da Matrix,\nessencialmente "
				+ "fazendo dela uma \"Anomalia Integral\",\na soma de todas as anomalias. Os poderes do Escolhido, que são derivados da Fonte e dados de "
				+ "propósito pelas\nMáquinas para tornar seu papel como um/uma Messias crível, se manifestam no seu personagem enquanto ele é introduzido \nna Matrix,"
				+ " o incluem: consciência extra-sensorial de mudanças dentro de o código da Matrix\nforça, velocidade e resistência super-humanas e inigualáveis; "
				+ "o poder de voo; invulnerabilidade prática a danos físicos;\nclarividência telecinese, e, eventualmente, se torna poderoso o suficiente para "
				+ "manipular a vontade quase\nqualquer aspecto da Matrix.\n\n", TimeUnit.MILLISECONDS, timer);
	}

	// Função para Menu
	public static void main(String[] args) throws InterruptedException {
		// Menu

		boolean rodar = true;

		// Menu - Estrutura
		do {
			escreva("Bem vindo(a) a Inside The Matrix \n\n", TimeUnit.MILLISECONDS, 30);
			escreva("Escolha uma das opções abaixo:\n" + "1 - Jogar\n" + "2 - Instruções/Regras\n"
					+ "3 - O que é Matrix?\n" + "4 - Créditos\n" + "5 - Sair\n", TimeUnit.MILLISECONDS, 10);

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
				escreva("Encerrando o jogo... até mais!", TimeUnit.MILLISECONDS, timer);
				rodar = false;
				break;

			default:
				escreva("Valor inválido!! \n", TimeUnit.MILLISECONDS, timer);
				break;
			}

		} while (rodar);

	}

}