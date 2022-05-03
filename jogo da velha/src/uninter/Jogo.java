package uninter;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		// Tudo que � necessario para o jogo da velha:
		// fazer a leitura do teclado
		Scanner teclado = new Scanner(System.in);

		// deve controlar a leitura das jogafas do humano
		Jogador jogador = new Jogador();

		// controlar a jogada da maquina
		Computador1 computador1 = new Computador1();
		Computador2 computador2 = new Computador2();
		Computador3 computador3 = new Computador3();

		while (true) {
			Tabuleiro tabuleiro = new Tabuleiro();
			// jogador escolhe o nivel que deseja jogar
			/// boolean checkVencedorJogador = tabuleiro.jogadorVencedor();
			int checkVencedor = tabuleiro.check();
			int nivel = choiceLevel();

			if (nivel == 1) {
				String line;
				String column;
				line = column = "";
				System.out.println("Jogo da velha:" + " voc� est� jogando no n�vel 1"
						+ " o computador sempre � o primeiro e joga com O,"
						+ "Voc� jogar� na sequ�ncia sempre com o X.");
				// jogada do usuario

				// nesse looping � possivel a partir da entrada de dado do usuario saber
				// qual nivel ele deseja jogar e assim chamar o computador de acordo
				// com o nivel escolhido
				while (checkVencedor == 2) {
					System.out.println("Vez do computador:");
					computador1.jogar(tabuleiro.desenhoTabuleiro);
					tabuleiro.mostrarTabuleiro();
					// � preciso fazer um check de vencedor aqui tamb�m pois
					// caso o computador ven�a ou exista empate antes do jogador jogar � preciso
					// imprimir isso na tela
					int isVencedorAvaliableFirstCheck = tabuleiro.check();
					if (isVencedorAvaliableFirstCheck == 4) {
						System.out.println("Voc� perdeu, o computador � o vencendor!");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();
							System.out.println("Vez do computador, o computador sempre � o primeiro e joga com O");
							computador1.jogar(tabuleiro.desenhoTabuleiro);
							tabuleiro.mostrarTabuleiro();
						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					} else if (isVencedorAvaliableFirstCheck == 1) {
						System.out.print("Sem vencedores para essa partida");
					}

					System.out.print("Sua vez, digite a linha que deseja inserir o X:");
					line = teclado.next();
					System.out.print("Sua vez, digite a coluna que deseja inserir o X:");
					column = teclado.next();
					jogador.jogar(tabuleiro.desenhoTabuleiro, line, column);
					tabuleiro.mostrarTabuleiro();
					tabuleiro.numeroJogadas++;
					int isVencedorAvaliableSecondCheck = tabuleiro.check();

					if (isVencedorAvaliableSecondCheck == 3) {
						System.out.println("Voc� ganhou, Parab�ns!");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();

						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					} else if (isVencedorAvaliableSecondCheck == 4) {
						System.out.println("Voc� perdeu, o computador � o vencendor!");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();
						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					} else if (isVencedorAvaliableSecondCheck == 1) {
						System.out.println("Sem vencedores para essa partida");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();
						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					}
				}

			} else if (nivel == 2) {
				String line;
				String column;
				line = column = "";
				System.out.println("Jogo da velha:" + " voc� est� jogando no n�vel 2"
						+ " o computador sempre � o primeiro e joga com O,"
						+ "Voc� jogar� na sequ�ncia sempre com o X.");

				// nesse looping � possivel a partir da entrada de dado do usuario chamar o
				// computador de acordo com o nivel escolhido
				while (checkVencedor == 2) {
					System.out.println("Vez do computador:");
					computador2.jogar(tabuleiro.desenhoTabuleiro);
					tabuleiro.mostrarTabuleiro();
					// � preciso fazer um check de vencedor aqui tamb�m
					// caso o computador ven�a ou exista empate antes do jogador jogar � preciso
					// imprimir isso na tela
					int isVencedorAvaliableFirstCheck = tabuleiro.check();
					if (isVencedorAvaliableFirstCheck == 4) {
						System.out.println("Voc� perdeu, o computador � o vencendor!");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();
							System.out.println("Vez do computador, o computador sempre � o primeiro e joga com O");
							computador2.jogar(tabuleiro.desenhoTabuleiro);
							tabuleiro.mostrarTabuleiro();
						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					} else if (isVencedorAvaliableFirstCheck == 1) {
						System.out.print("Sem vencedores para essa partida");
					}

					System.out.print("Sua vez, digite a linha que deseja inserir o X:");
					line = teclado.next();
					System.out.print("Sua vez, digite a coluna que deseja inserir o X:");
					column = teclado.next();
					jogador.jogar(tabuleiro.desenhoTabuleiro, line, column);
					tabuleiro.mostrarTabuleiro();
					tabuleiro.numeroJogadas++;
					int isVencedorAvaliableSecondCheck = tabuleiro.check();

					if (isVencedorAvaliableSecondCheck == 3) {
						System.out.println("Voc� ganhou, Parab�ns!");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();

						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					} else if (isVencedorAvaliableSecondCheck == 4) {
						System.out.println("Voc� perdeu, o computador � o vencendor!");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();
						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					} else if (isVencedorAvaliableSecondCheck == 1) {
						System.out.println("Sem vencedores para essa partida");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();
						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					}
				}

			} else if (nivel == 3) {

				String line;
				String column;
				line = column = "";
				System.out.println("Jogo da velha:" + " voc� est� jogando no n�vel 3"
						+ " o computador sempre � o primeiro e joga com O,"
						+ "Voc� jogar� na sequ�ncia sempre com o X.");

				// nesse looping � possivel a partir da entrada de dado do usuario chamar o
				// computador de acordo com o nivel escolhido
				while (checkVencedor == 2) {
					System.out.println("Vez do computador:");
					computador2.jogar(tabuleiro.desenhoTabuleiro);
					tabuleiro.mostrarTabuleiro();
					// � preciso fazer um check de vencedor aqui tamb�m
					// caso o computador ven�a ou exista empate antes do jogador jogar � preciso
					// imprimir isso na tela
					int isVencedorAvaliableFirstCheck = tabuleiro.check();
					if (isVencedorAvaliableFirstCheck == 4) {
						System.out.println("Voc� perdeu, o computador � o vencendor!");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();
							System.out.println("Vez do computador, o computador sempre � o primeiro e joga com O");
							computador3.jogar(tabuleiro.desenhoTabuleiro);
							tabuleiro.mostrarTabuleiro();
						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					} else if (isVencedorAvaliableFirstCheck == 1) {
						System.out.print("Sem vencedores para essa partida");
					}

					System.out.print("Sua vez, digite a linha que deseja inserir o X:");
					line = teclado.next();
					System.out.print("Sua vez, digite a coluna que deseja inserir o X:");
					column = teclado.next();
					jogador.jogar(tabuleiro.desenhoTabuleiro, line, column);
					tabuleiro.mostrarTabuleiro();
					tabuleiro.numeroJogadas++;
					int isVencedorAvaliableSecondCheck = tabuleiro.check();

					if (isVencedorAvaliableSecondCheck == 3) {
						System.out.println("Voc� ganhou, Parab�ns!");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();

						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					} else if (isVencedorAvaliableSecondCheck == 4) {
						System.out.println("Voc� perdeu, o computador � o vencendor!");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();
						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					} else if (isVencedorAvaliableSecondCheck == 1) {
						System.out.println("Sem vencedores para essa partida");
						int newGame = newGameStart();
						if (newGame == 1) {
							choiceLevel();
							tabuleiro.iniciarPosicoes();
						} else {
							System.out.print("Obrigada por jogar!");
							System.exit(0);
						}
					}
				}

			}
		}

	}

	// um metodo para que seja poss�vel saber se o jogador quer continuar jogando

	public static int newGameStart() {
		Scanner teclado = new Scanner(System.in);
		int newGameAnswer = 0;
		System.out.println("Deseja iniciar um novo jogo? Aperte 1 para SIM e 2 para N�O");
		newGameAnswer = Integer.parseInt(teclado.next());
		if (newGameAnswer == 1) {
			return 1;
		} else if (newGameAnswer == 2) {
			return 2;
		} else {
			System.out.println("Por favor, digite 1 para Sim ou 2 para N�o.");
			newGameStart();

		}
		return newGameAnswer;

	}

	// um metodo para que seja poss�vel saber qual nivel o jogador inseriu no
	// teclado

	public static int choiceLevel() {
		Scanner teclado = new Scanner(System.in);
		int nivel = 0;
		System.out.println("Escolha um dos n�veis de dificuldade, " + "sendo 1 o mais f�cil e 3 o mais d�ficil e depois"
				+ " pressione a tecla enter: ");
		nivel = Integer.parseInt(teclado.next());
		// nivel com apenas varredura horizontal, tornando o jogo mais f�cil
		if (nivel == 1) {
			return 1;
			// nivel com O sendo colocado em posi��es aleat�rias
		} else if (nivel == 2) {
			return 2;
		} else if (nivel == 3) {
			return 3;

		} else {
			System.out.println("Por favor, digite n�mero entre 1 e 3");
			choiceLevel();
		}
		return nivel;

	}

};
