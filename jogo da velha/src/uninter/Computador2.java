package uninter;

import java.util.Random;
//importação da classe random do pacote java.util

public class Computador2 extends Computador {
	// instanciando um objeto da classe random
	Random numeroAleatorio = new Random();

	@Override
	public void jogar(String[][] mapa) {
		// opção para gerar uma posição aleatória
		int x, y;
		while (true) {
			// gerando um numero interio com o valor máximo de 3 uma vez que existem apenas
			// 3 opções de coordenadas
			x = numeroAleatorio.nextInt(3);
			y = numeroAleatorio.nextInt(3);
			// colocando o O em um espaço que esteja vazio
			if (mapa[x][y].equals(" ")) {
				mapa[x][y] = "O";
				return;
			}
		}
	}

}
