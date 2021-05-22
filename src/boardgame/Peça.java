package boardgame;

public class Peça {
	protected Position position;
	private Tabuleiro tabuleiro;
	
	public Peça(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		position = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
}
