package xadrez;

import boardgame.Pe�a;
import boardgame.Tabuleiro;

public class XadrezPe�a extends Pe�a {

	private Cor cor;

	public XadrezPe�a(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
}
