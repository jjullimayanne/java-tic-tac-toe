package uninter;

import java.util.Random;

public class Computador3 extends Computador {

	Random numeroAleatorio = new Random();

	@Override
	public void jogar(String[][] mapa) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (mapa[i][j].equals("X")) {
					// faz a verificação se as horizontais ja foram preenchidass
					try {
						if (mapa[i + 1][j].equals(" ")) {
							mapa[i + 1][j] = "O";
							return;
						}
					} catch (Exception e) {
					}
					try {
						if (mapa[i - 1][j].equals(" ")) {
							mapa[i - 1][j] = "O";
							return;
						}
					} catch (Exception e) {
					}

					// faz a verificação se as verticais ja foram preenchidas
					try {
						if (mapa[i][j + 1].equals(" ")) {
							mapa[i][j + 1] = "o";
							return;
						}
					} catch (Exception e) {
					}
					try {
						if (mapa[i][j - 1].equals(" ")) {
							mapa[i][j - 1] = "O";
							return;
						}
					} catch (Exception e) {
					}
				}
			}
		}
		// caso não funcione usa se essa alternativa
		int x;
		while (true) {
			x = numeroAleatorio.nextInt(3);
			for (int j = 0; j < 3; j++) {
				if (mapa[x][j].equals(" ")) {
					mapa[x][j] = "O";
					return;
				}
			}
		}

	}
}
