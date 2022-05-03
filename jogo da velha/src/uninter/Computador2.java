package uninter;

import java.util.Random;
//importa��o da classe random do pacote java.util

public class Computador2 extends Computador {
	// instanciando um objeto da classe random
	Random numeroAleatorio = new Random();

	@Override
	public void jogar(String[][] mapa) {
		// op��o para gerar uma posi��o aleat�ria
		int x, y;
		while (true) {
			// gerando um numero interio com o valor m�ximo de 3 uma vez que existem apenas
			// 3 op��es de coordenadas
			x = numeroAleatorio.nextInt(3);
			y = numeroAleatorio.nextInt(3);
			// colocando o O em um espa�o que esteja vazio
			if (mapa[x][y].equals(" ")) {
				mapa[x][y] = "O";
				return;
			}
		}
	}

}
