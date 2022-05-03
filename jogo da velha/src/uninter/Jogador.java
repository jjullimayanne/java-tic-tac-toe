package uninter;

public class Jogador {
	
	public boolean jogar(String mapa[][], String linha, String coluna) {

		// Se a posicao estiver vaga o X � inscrito 
		try {
			int x = Integer.parseInt(linha);
			int y = Integer.parseInt(coluna);
			if (mapa[x - 1][y - 1].equals(" ")) {
				mapa[x - 1][y - 1] = "X";
				return true;
			} else {
				// Caso nao exista uma posi��o vazia � exibida essa mensagem
				// A jogada � passada para o computador 
				System.out.println("Essa posi��o ja foi preechida, voc� perdeu a vez!");
				return false;
			}
		} catch (Exception error) {
			System.out.println("Escolha um valor que dentro das possibilidades");
			return false;
		}
	}

}
