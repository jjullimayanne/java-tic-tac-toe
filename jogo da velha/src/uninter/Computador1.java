package uninter;

public class Computador1 extends Computador {
	@Override
	public void jogar(String mapa[][]) {
		// Aqui o computador vai apenas procurar pelo primeiro espaçõ não marcado
		// Sempre procurando de maneira horizontal
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (mapa[i][j].equals(" ")) {
					mapa[i][j] = "O";
					return;
				}
			}
		}
	}

}
