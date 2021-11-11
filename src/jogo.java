import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class jogo {

	// Variável para delay no texto
	static int timer = 50;

	// Variável para entrada de dados
	static Scanner entrada = new Scanner(System.in);

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

	// Função para jogar
	static boolean jogar() throws InterruptedException {

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

		escreva("\n\nOlá jogador. Bem-vindo(a) a Inside the Matrix.\n", TimeUnit.MILLISECONDS, timer);

		escreva("\nAntes de continuar, poderia me dizer seu nome?\n", TimeUnit.MILLISECONDS, timer);

		nome = entrada.next();

		escreva("\n" + nome + ", que tal saber saber mais sobre o jogo e sobre Matrix?", TimeUnit.MILLISECONDS, timer);

		escreva("\n1 - Sim.", TimeUnit.MILLISECONDS, timer);
		escreva("\n2 - Não, seguir jogo.\n", TimeUnit.MILLISECONDS, timer);
		switch (leia()) {
		case 1:
			sobreMatrix();
			break;
		case 2:
			break;

		default:
		}

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

		escreva("\n*Você se levanta e vai até a porta para atender*\n",
				TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": Ué?! não tem ninguém...\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*Você olha para os lados e não vê ninguém*",
				TimeUnit.MILLISECONDS, timer);
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

		escreva("\n\n ///DESAFIO 1///\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": Agora que sei o endereço correto, o que devo fazer?\n", TimeUnit.MILLISECONDS, timer);

		escreva("\n1 - Ir do endereço indicado", TimeUnit.MILLISECONDS, timer);
		escreva("\n2 - Fingir que isso nunca aconteceu, e rasgar a carta.\n", TimeUnit.MILLISECONDS, timer);

		switch (leia()) {
		case 2:

			escreva("\nVocê decidiu ignorar o aviso que lhe foi dado, e viveu sua vida normalmente. "
					+ "\nMas o peso na sua consciência vai poder te deixar seguir em frente?", TimeUnit.MILLISECONDS,
					timer);

			escreva("Game  over", TimeUnit.MILLISECONDS, timer);
			break;
		// return 0;

		case 1:
			break;
		}
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
		escreva("\n@*%###*: Olá, você se chama " + nome + "?\n\n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ":", TimeUnit.MILLISECONDS, timer);
		escreva("\n1 - Sim, sou eu mesmo(a). ", TimeUnit.MILLISECONDS, timer);
		escreva("\n2 - Não, você deve estar se confundindo.\n", TimeUnit.MILLISECONDS, timer);

		switch (leia()) {
		case 1:
			escreva("\n\n@*%###*: Ótimo era ", TimeUnit.MILLISECONDS, timer);
			break;
		case 2:
			escreva("\n\n@*%###*: Não precisa mentir para mim.", TimeUnit.MILLISECONDS, timer);
			escreva("\n Era ", TimeUnit.MILLISECONDS, timer);
			break;
		}
		escreva("você mesmo que estava procurando \n\n", TimeUnit.MILLISECONDS, timer);

		escreva("@*%###*: Você não consegue ver meu rosto, né?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": Não, de algum jeito não enxergo seu rosto,\n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": Minha vista está toda embaçada. Como você fez isso?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("@*%###*: Não é algo tão simples de explicar\n\n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": Não importa, quero saber o que está acontecendo! \n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": Foi você que hackeu meu computador né? \n\n", TimeUnit.MILLISECONDS, timer);

		escreva("@*%###*: Sim fui eu\n", TimeUnit.MILLISECONDS, timer);
		escreva("@*%###*: Mas preciso que você se acalme\n", TimeUnit.MILLISECONDS, timer);
		escreva("@*%###*: Eu sei muito sobre você. Estamos te observando há muito tempo\n\n", TimeUnit.MILLISECONDS,
				timer);
		escreva(nome + ": Como assim estamos? Você e mais quem?\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("@*%###*: Sei que está confuso. E sei que você está tentando “sair da caverna”,\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("@*%###*: Está procurando coisas que ninguém mais vê\n", TimeUnit.MILLISECONDS, timer);

		escreva("@*%###*: Se quiser descobrir a verdade, venha comigo!\n\n", TimeUnit.MILLISECONDS, timer);
		escreva(nome + ": Me diga pelo menos por que não consigo ver seu rosto\n\n\n", TimeUnit.MILLISECONDS, timer);

		// Desafioooooooooooooooooooooooooooo

		escreva("\n\n\n@*%###*: Antes que eu me esqueça meu nome é Trinity\n", TimeUnit.MILLISECONDS, timer);
		escreva("Trinity*: Agora que sabe quem sou eu, tenho que te apresentar a uma pessoa \n\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("*Trinity se levante e vai até a porta*\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Esta é sua última chance de desistir, deseja seguir trinity?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("1 - Continuar e seguir Trinity\n", TimeUnit.MILLISECONDS, timer);

		escreva("2 - Desistir e seguir com sua vida chata e sem graça\n", TimeUnit.MILLISECONDS, timer);

		switch (leia()) {
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

			// return true;
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
		escreva("\n" + nome + ": não aceita a ideia de não estar " + "no controle das coisas. \n",
				TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: sei que dentro de você, você sente que há "
				+ "algo de errado no mundo, e de fato há, vivemos em uma matrix.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nvocê a vê em todos os lugares e em tudo que você faz, "
				+ "é o mundo que impede que você veja a verdade.\r\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n" + nome + ": Que verdade ?\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nMorpheus: que você é um escravo da matrix, como todo "
				+ "mundo você nasceu em uma prisão que não pode sentir, " + "ver ou tocar.\n"
				+ "infelizmente não posso \nexplicar o que " + "realmente é matrix. é preciso que veja por si mesmo:\n",
				TimeUnit.MILLISECONDS, timer);
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

		escreva("1 - tomar pílula Azul.", TimeUnit.MILLISECONDS, timer);
		escreva(" 2 - Tomar pílula Vermelha.", TimeUnit.MILLISECONDS, timer);
		switch (leia()) {
		case 1:
			escreva("Você acorda em sua cama, aparentemente, só mais um dia normal como os outros.",
					TimeUnit.MILLISECONDS, timer);
			creditos();
			return true;
		case 2:
			escreva("\n*Você se sente tonto e começa adormecer lentamente*\n", TimeUnit.MILLISECONDS, timer);
			break;

		default:
		}

		escreva("\nDe repente você acorda e sente o seu corpo todo dolorido, como se nunca tivesse usado ele,"
				+ " então nota que em seu corpo\n" + "há vários cabos que estão conectados "
				+ "a uma máquina, ao olhar ao redor vê outras\n", TimeUnit.MILLISECONDS, timer);
		escreva("\ncápsulas igual a sua, há inúmeros humanos conectados a "
				+ "ela, se assusta com tudo que está vendo e cai de sua cápsula.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\n*Você desmaia novamente*\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nNo dia seguinte acorda em uma uma estrutura "
				+ "metálica estranha (que aparenta e alguém bate à porta. ( TOC TOC)\n", TimeUnit.MILLISECONDS, timer);
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
		escreva("\nMorpheus: Dentro da Matrix podemos alterar qualquer coisa em nós mesmos, seja intelectualmente"
				+ " ou fisicamente, você quer ter super força?\n" + "você terá, ou talvez super velocidade? você terá. "
				+ "Este é Tank, um dos nossos modificadores, ele vai te ajudar a aprimorar todas suas \n"
				+ "habilidades " + "e adquirir novas, fique a vontade para escolher.\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nTank: Prazer grande escolhido, vamos ao que interessa?\n", TimeUnit.MILLISECONDS, timer);
		escreva("\nTank: temos as seguintes habilidades que podemos fazer update, fique a vontade para escolher "
				+ "uma para  aprimorar, mas essas modificações\n"
				+ "não podem ser feitas em qualquer um, por isso preciso" + " que você faça o seguinte :\n",
				TimeUnit.MILLISECONDS, timer);
		// DESAFIOOOOOOOOOOOOOOOO 4

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
		escreva("\n///DESAFIO 5///\n", TimeUnit.MILLISECONDS, timer);

		escreva("Morpheus: sabia que você não ia nos desapontar, essa etapa que estamos é importante para que consigamos\n"
				+ "vencer a matrix de uma vez por todas.\r\n\n" + "", TimeUnit.MILLISECONDS, timer);

		escreva("Triniti: Bom trabalho nomedousuario, conseguiu descobrir a localização do oraculo, já  fizemos muito por hoje, vamos\n",
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
		escreva("Junto a Triniti, você vai ao comando central da nave e se depara com o Tank, manuseando uma grande \n",
				TimeUnit.MILLISECONDS, timer);
		escreva("máquina cheia de cabos.\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("Tank: sente-se, fiquem a vontade, estou preparando a máquina para levá los de volta ao paraiso.\n\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("**Tank coloca um capacete estranho em você**\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("****Após os preparos, Tank liga a máquina e você começa a adormecer***\n\n", TimeUnit.MILLISECONDS,
				timer);

		escreva("***você abre o olho e percebe que está de volta à Matrix***\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("Ao entrar na matrix Morpheus e Nomedousuario se surpreende com uma casa cheia de crianças,\n",
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

		escreva("Garoto: Viu? Nada daquilo que você pensa que é real é real.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Garoto: Me siga, sei quem você está procurando….\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Ao chegar na cozinha da casa, você encontra uma senhora fazendo um chá, sua\n", TimeUnit.MILLISECONDS,
				timer);
		escreva("aparência é simples e humilde.", TimeUnit.MILLISECONDS, timer);

		escreva("Senhora: senta-se garoto, já conversamos primeiro irei terminar de fazer o meu chá…\n\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("Senhora: diga me garoto, o que realmente você quer  ?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": eu realmente sou aquele que todos dizem, o escolhido, aquele que acabará matrix ?\n\n",
				TimeUnit.MILLISECONDS, timer);

		escreva("Oraculo: eu não sei, você se sente preparado para isso ?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": você não sabe ou não quer dizer ?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Oraculo: ninguém pode ver além daquilo que não compreende. \n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": então é hora de eu descobrir algumas verdades..\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Oraculo: não se esqueça que muito em breve o agente Smith terá o poder de prender todos dentro da matrix.\n\n",
				TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": quem é o agente smith ?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Oráculo: ele é o sentinela senciente, que é responsável pela proteção da matrix, e fará de tudo para que\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("ninguém saia dela, você deve pará lo antes que não haja nada mais que seja real\n\n",
				TimeUnit.MILLISECONDS, timer);

		escreva("Oraculo: de um jeito ou de outro, essa guerra terá um fim nesta noite, e o futuro dos dois mundos\n",
				TimeUnit.MILLISECONDS, timer);
		escreva(" mundos (real e matrix) estará em suas mãos.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Você sai da casa e percebe que Morpheus não está lá.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Trinity:ainda bem que te achei, pensamos que você também havia sido sequestrado.\n\n",
				TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": Como assim ? quem foi sequestrado ?\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Trinity: enquanto você estava conversando com o Oráculo, Os sentinelas estavam aqui e para eles\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("não desconfiarem que você estava por perto, Morpheus lutou com eles,  mas ele não resistiu e os\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("sentinelas levaram ele.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva(nome + ": mas por que o morpheus e não eu?\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("Trinity: Anda! não há  tempo para isso. Tank está rastreando eles. Parece ser um prédio\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("abandonado no centro da cidade. Vamos até lá.\n\n", TimeUnit.MILLISECONDS, timer);

		escreva("Chegando ao local\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("**Você vê morpheus acorrentado em uma mesa***\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("Agente Smith: estava te esperando, finalmente teremos esse momento tão aguardado por todos.\n\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("Morpheus:  " + nome + " não se distraia com ele, lembra- se que este é um momento importante para\n\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("todas vidas existentes dentro e fora da matrix.\n\n", TimeUnit.MILLISECONDS, timer);
		escreva("Trinity: " + nome
				+ " lembre-se do que treinamos antes, seja (variável do tipo de treinamento escolhido pelo usuário)\n",
				TimeUnit.MILLISECONDS, timer);
		escreva("Jogando", TimeUnit.MILLISECONDS, timer);

		return false;

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
		escreva("Sobre", TimeUnit.MILLISECONDS, timer);
	}

	// Função para Menu
	public static void main(String[] args) throws InterruptedException {
		// Menu

		boolean rodar = true;

		// Menu - Estrutura
		do {
			escreva("Bem vindo(a) a Inside The Matrix \n\n",
					TimeUnit.MILLISECONDS, 30);
			escreva("Escolha uma das opções abaixo:\n" + "1 - Jogar\n"
					+ "2 - Instruções/Regras\n" + "3 - O que é Matrix?\n" + "4 - Créditos\n" + "5 - Sair\n",
					TimeUnit.MILLISECONDS, 10);

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