package xadrez;

import boardgame.Peça;
import boardgame.Tabuleiro;

public class XadrezPeça extends Peça {

	private Cor cor;

	public XadrezPeça(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
}
