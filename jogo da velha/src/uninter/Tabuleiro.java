package uninter;

public class Tabuleiro {
	String desenhoTabuleiro[][] = new String[3][3];
	int numeroJogadas;
	String letraEscolhida;

	public Tabuleiro() {
		this.numeroJogadas = 0;
		iniciarPosicoes();
		this.letraEscolhida = "";
	}

	// iniciar posições vazias, utilizado para quando for começar um novo jogo
	void iniciarPosicoes() {
		System.out.println("Jogo da velha:" + " computador sempre é o primeiro e joga com O,"
				+ "Você jogará na sequência sempre com o X.");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.desenhoTabuleiro[i][j] = " ";
			}
		}
	}

	public void mostrarTabuleiro() {
		// colocando "|" e "-" em cada espaço do tabuleiro para facilitar a visualização
		// do jogo
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(this.desenhoTabuleiro[i][j]);
				if (j < 2) {
					System.out.print("|");
				}
			}
			if (i < 2) {
				System.out.println("\n-|-|-");
			}
		}
		System.out.println("\n");
	}

	public boolean temVencedor() {

		for (int i = 0; i < 3; i++) {
			// verificar se onde o X é colocado é igual as linhas e colunas de cima ou de
			// baixo dele
			// dessa forma é possivel eliminar uma maneira mais complexa que seria comparar
			// linha por linha e coluna por coluna
			// isso seria feito por muitos ifs e elses de modo que quando a linha e a coluna
			// igual ao valor de "X" se caracterizaria fim fo game
			if (desenhoTabuleiro[i][0].equals(desenhoTabuleiro[i][1])
					&& desenhoTabuleiro[i][1].equals(desenhoTabuleiro[i][2]) && !(desenhoTabuleiro[i][1].equals(" "))) {
				this.letraEscolhida = desenhoTabuleiro[i][0];
				return true;
			}
			if (desenhoTabuleiro[0][i].equals(desenhoTabuleiro[1][i])
					&& desenhoTabuleiro[1][i].equals(desenhoTabuleiro[2][i]) && !(desenhoTabuleiro[1][i].equals(" "))) {
				this.letraEscolhida = desenhoTabuleiro[0][i];
				return true;
			}
		}

		// faz a varredura para ver se existe sequencia de X ou O no desenho do
		// tabuleiro
		// isso permite saber se houve vencedor

		for (int i = 0; i < 3; i++) {
			if (desenhoTabuleiro[i][0].equals(desenhoTabuleiro[i][1])
					&& desenhoTabuleiro[i][1].equals(desenhoTabuleiro[i][2]) && !(desenhoTabuleiro[i][1].equals(" "))) {
				this.letraEscolhida = desenhoTabuleiro[i][0];
				return true;
			}
			if (desenhoTabuleiro[0][i].equals(desenhoTabuleiro[1][i])
					&& desenhoTabuleiro[1][i].equals(desenhoTabuleiro[2][i]) && !(desenhoTabuleiro[1][i].equals(" "))) {
				this.letraEscolhida = desenhoTabuleiro[0][i];
				return true;
			}
		}
		return false;

	}

	// resposta se o jogo deu empate ou se teve um vencedor

	public int check() {
		// opcção que mostra o status da partida
		boolean statusVitoria = temVencedor();
		if (statusVitoria == false && numeroJogadas == 9) {
			// sem vencedor
			return 1;
		} else if (statusVitoria == false) {
			// partida continua
			return 2;
		} else {
			if (this.letraEscolhida == "X") {
				// venceu jogador
				return 3;
			} else {
				// venceu maquina
				return 4;
			}
		}
	}

}
