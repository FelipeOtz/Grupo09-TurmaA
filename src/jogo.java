import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class jogo {

	static int timer = 15;
	static Scanner entrada = new Scanner(System.in);

	static int leia() {

		int escolha = entrada.nextInt();
		return escolha;
	}

	static void escreva(String texto, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : texto.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}

	// Função para jogar
	static void jogar() throws InterruptedException {
		final JDialog dialog = new JDialog();
		dialog.setAlwaysOnTop(true);
		ImageIcon teste = new ImageIcon("images/coelho.png");
		JOptionPane.showMessageDialog(dialog, " Siga o coelho branco", "WARNING!", JOptionPane.WARNING_MESSAGE, teste);
		escreva("Jogando", TimeUnit.MILLISECONDS, timer);

		escreva("\n\nOlá jogador. Bem-vindo(a) a Inside the Matrix.\n", TimeUnit.MILLISECONDS, timer
				);

		escreva("\nAntes de continuar pode me dizer seu nome?\n", TimeUnit.MILLISECONDS, timer);

		String nome = entrada.next();

		escreva("\n" + nome + ", que tal saber saber mais sobre o jogo e sobre a Matrix? ", TimeUnit.MILLISECONDS,
				timer);

		escreva("1 - Sim.", TimeUnit.MILLISECONDS, timer);
		escreva("2 - Não, seguir jogo.", TimeUnit.MILLISECONDS, timer);
		switch (leia()) {
		case 1:
			sobreMatrix();
			break;
		case 2:
			break;

		default:
		}

		escreva("\n*Você se levanta e segue ela* \n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*você se depara com uma mansão antiga e luxuosa* \n", TimeUnit.MILLISECONDS, timer);
		escreva("\nAo entrar na mansão, você segue a trinity até a porta do salão "
				+ "principal (A porta está fechada)\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nTrinity: Vou te dar só uma dica, seja sincero.\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*trinity abre a porta*\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*Ao adentrar a sala, você percebe que tem mais alguém na sala "
				+ "com você, porém essa pessoa está virada de costas para você,\r\n"
				+ "aos poucos você começa a se aproximar e percebe "
				+ "caracteristcas da pessoa, se trata de um homem negro, calvo, " + "alto, usando óculos escuro.* \r\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("\n*Ele então vira e se apresenta a você*\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nPersonagem desconhecido: Finalmente!!! Você não "
				+ "precisa se apresentar, eu já sei tudo sobre você.\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nPersonagem desconhecido: Primeiramente meu nome "
				+ "é Morpheus, por favor, sente-se aqui, agora você tem " + "uma decisão a fazer.\r\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: você deve estar se sentindo como a Aline, "
				+ "escorregando pela toca do coelho. você é um homem que aceita o que vê, pois pensa estar\nsonhando, "
				+ "ironicamente você está longe da verdade. Você acredita em destino?\r\n", TimeUnit.MILLISECONDS,
				timer);
		escreva("\n"+ nome +": não aceita a ideia de não estar " + "no controle das coisas. \n",
				TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: sei que dentro de você, você sente que há "
				+ "algo de errado no mundo, e de fato há, vivemos em uma matrix.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nvocê a vê em todos os lugares e em tudo que você faz, "
				+ "é o mundo que impede que você veja a verdade.\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n"+ nome +": Que verdade ?\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: que você é um escravo da matrix, como todo "
				+ "mundo você nasceu em uma prisão que não pode sentir, "
				+ "ver ou tocar.\n"
				+ "infelizmente não posso \nexplicar o que "
				+ "realmente é matrix. é preciso que veja por si mesmo:\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*morpheus fecha as suas mãos e ergue seu braço em sua "
				+ "direção(aparentando estar segurando algo)*\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: você tem sua última escolha, em minha mão tenho"
				+ " duas pílulas, se você tomar a pílula azul você vai voltar a sua vida normal"
				+ "\ne esquecerá de tudo isso. \n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: Antes de continuar, preciso que você "
				+ "resolva o seguinte desafio, para saber se você está pronto para decidir " + "o rumo da sua vida.",
				TimeUnit.MILLISECONDS, timer);
		// DESAFIOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO 3

		escreva("\nse escolher a pílula vermelha você vai para o país das maravilhas "
				+ "e vou te mostrar até onde vai a toca do coelho.\n", TimeUnit.MILLISECONDS, timer);

		// Escolha do jogador pilula azul e vermelha, E game over

		escreva("\nDe repente você acorda e sente o seu corpo todo dolorido, como se nunca tivesse usado ele,"
				+ " então nota que em seu corpo\n"
				+ "há vários cabos que estão conectados "
				+ "a uma máquina, ao olhar ao redor vê outras\n", TimeUnit.MILLISECONDS, timer);
		escreva("\ncápsulas igual a sua, há inúmeros humanos conectados a "
				+ "ela, se assusta com tudo que está vendo e cai de sua cápsula.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*Você desmaia novamente*\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nNo dia seguinte acorda em uma uma estrutura "
				+ "metálica estranha (que aparenta e alguém bate à porta. ( TOC TOC)\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n"+ nome +": Meus olhos doem !\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: É porque você nunca os usou, pronto para começarmos?\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n" + nome + ": onde estamos?\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: A pergunta não é onde mas quando. você acha\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: Matrix é uma realidade simulada, criada por máquinas sencientes"
				+ " para subjugar a população humana, enquanto o calor\n"
				+ "e a atividade elétrica "
				+ "de seus corpos são usados ​como fonte de energia.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: Estamos a muito tempo à procura de você, finalmente encontramos"
				+ " o escolhido, que nos ajudará a acabar \n"
				+ "com a Matrix de uma vez por todas e "
				+ "para isso precisamos começar a te preparar para isso, por favor\n"
				+ "me acompanhe que vou"
				+ " te apresentar ao seu treinador.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: Dentro da Matrix podemos alterar qualquer coisa em nós mesmos, seja intelectualmente"
				+ " ou fisicamente, você quer ter super força?\n"
				+ "você terá, ou talvez super velocidade? você terá. "
				+ "Este é Tank, um dos nossos modificadores, ele vai te ajudar a aprimorar todas suas \n"
				+ "habilidades "
				+ "e adquirir novas, fique a vontade para escolher.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nTank: Prazer grande escolhido, vamos ao que interessa?\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nTank: temos as seguintes habilidades que podemos fazer update, fique a vontade para escolher "
				+ "uma para  aprimorar, mas essas modificações\n"
				+ " não podem ser feitas em qualquer um, por isso preciso"
				+ " que você faça o seguinte :\n", TimeUnit.MILLISECONDS, timer);
		// DESAFIOOOOOOOOOOOOOOOO 4

		// MINIGAME

	}

	// Função para mostrar
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
		escreva("Sobre", TimeUnit.MILLISECONDS, timer);
	}

	public static void main(String[] args) throws InterruptedException {
		// Menu

		boolean rodar = true;

		// Menu - Estrutura
		do {
			escreva("Bem vindo(a) a Inside The Matrix \n\nEscolha uma das opções abaixo:\n" + "1 - Jogar\n"
					+ "2 - Instruções/Regras\n" + "3 - O que é Matrix?\n" + "4 - Créditos\n" + "5 - Sair\n",
					TimeUnit.MILLISECONDS, 15);

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
				escreva("Valor inválido!!", TimeUnit.MILLISECONDS, timer);
				break;
			}

		} while (rodar);

	}

}